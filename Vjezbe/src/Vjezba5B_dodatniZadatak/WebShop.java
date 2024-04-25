package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class WebShop {
    //    todo: method shopping that leads customer trough entire process!
    private static int cntID = 1234;
    private ArrayList<Item> allWebShopItems;
    private int id;
    private Package pack;
    private Scanner scanner;
    private String webShopName;

    public WebShop(String name) {
        this.id = cntID++;
        this.allWebShopItems = new ArrayList<>();
        this.webShopName = name;
    }

    public void addItemInWebShop(Item item) {
        if (!allWebShopItems.contains(item)) {
            allWebShopItems.add(item);
            System.out.println("item " + item.getClass().getSimpleName() + " successfully added to WebShop: " + webShopName);
        } else {
            System.out.println("Item " + item.getClass().getSimpleName() + " is already added!");
        }
    }

    public void updateItemOfferQuantity(Item item, int quantity) {
        System.out.println(item);
        System.out.println("changing quantity for: " + quantity);
        if (quantity > 0){
            item.setAdditionalQuantity(quantity);
            System.out.println("new quantity: " + item.getQuantity());
        } else if (quantity < 0) {
            item.decreaseQuantity(Math.abs(quantity));
            System.out.println("new quantity: " + item.getQuantity());
        } else {
            System.out.println("there is no change in quantity");
        }

    }

    public void listAllItems() {
        System.out.println("---------------------------- " + webShopName + " ---------------------------------------------------");
        for (Item item : allWebShopItems) {
            System.out.println(item);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /*
        The method putItemsInPackage use naive simulation strategy of walking through
        inventory and choosing wanted items with some quantity. All work for that is delegated
        to the object of the class Package.
    */
    public void putItemsInPackage(Customer customer) {
        scanner = customer.getScanner();
        pack = new Package(customer);
        for (Item allWebShopItem : allWebShopItems) {
            boolean isCorrectInput = false;
            while (!isCorrectInput) {
                System.out.print("choose item: " + allWebShopItem + "\nchoose num of pieces (int): ");
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    isCorrectInput = true;
                    if (input > 0 && input <= allWebShopItem.getQuantity()) {
                        pack.putItem(allWebShopItem, input);
                    } else if (input > allWebShopItem.getQuantity() || input > 0) {
                        System.out.println("there is not enough pieces in stock");
                    } else {
                        System.out.println("you have entered wrong value");
                    }
                } else {
                    System.out.println("incorrect value, try again: ");
                    scanner.next();
                }
            }
        }
        pack.listAllItemsInPackage();
        if (!pack.getPackageItems().isEmpty()) {
            finnishAndPay();
        } else {
            System.out.println("There is no items in package");
            System.out.println("closing program...");
        }
    }

    public void finnishAndPay() {
//        todo: The method finishAndPay finalizes payment using inner class Payment. This method provides
//         info on package and customer, and updates items quantities in web shop inventory.
        Payment payment = new Payment();
        payment.possiblePaymentMethods();
        payment.payPackage();

        if (payment.isSuccessfulPayment()) {
            System.out.println(pack);
            System.out.println("thanks for shopping!");
            updateQuantitiesAfterSuccessfulPayment();
        } else {
            System.out.println("Exiting the program...");
        }
    }

    public void updateQuantitiesAfterSuccessfulPayment() {
        for (int i = 0; i < pack.getPackageItems().size(); i++) {
            Item item = pack.getPackageItems().get(i);
            int quantity = pack.getItemsQuantities().get(i);
            item.decreaseQuantity(quantity);
            System.out.println("Decreasing num of available items for item: " + item + " for: " + quantity);
        }
    }


    private class Payment {
        final String CREDIT_CARD = "CC";
        final String PAY_PAL = "PP";
        final String CASH_ON_DELIVERY = "COD";
        private boolean successfulPayment = false;

        public Payment() {
        }

        private void possiblePaymentMethods() {
            System.out.println("possible payment methods are:");
            System.out.println(CREDIT_CARD + " - credit card payment");
            System.out.println(PAY_PAL + " - Pay Pal Service");
            System.out.println(CASH_ON_DELIVERY + " - Cash On Delivery");
        }

        private void payPackage() {
            scanner = new Scanner(System.in);
            System.out.println("please enter a correct code before preferred payment method " +
                    "(for cancellation enter any other num): ");
            String input = scanner.nextLine();
            input = input.toUpperCase().strip();

            switch (input) {
                case "CC":
                    System.out.println("you selected credit card payment...");
                    System.out.println("simulating transaction...");
                    System.out.println("transaction successful!");
                    successfulPayment = true;
                    break;
                case "PP":
                    System.out.println("you selected pay pal payment...");
                    System.out.println("simulating transaction...");
                    System.out.println("transaction successful!");
                    successfulPayment = true;
                    break;
                case "COD":
                    System.out.println("you selected cash on delivery payment...");
                    successfulPayment = true;
                    break;
                default:
                    System.out.println("package cancelled...");
            }
        }

        public boolean isSuccessfulPayment() {
            return successfulPayment;
        }
    }
}
