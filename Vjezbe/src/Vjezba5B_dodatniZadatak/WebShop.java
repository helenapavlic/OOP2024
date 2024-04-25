package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The WebShop class represents a web shop with various functionalities.
 */
public class WebShop {

    /**
     * The static counter for generating unique web shop IDs.
     */
    private static int cntID = 1234;

    /**
     * The list of all items in the web shop.
     */
    private final ArrayList<Item> allWebShopItems;

    /**
     * The ID of the web shop.
     */
    private int id;

    /**
     * The package of items.
     */
    private Package pack;

    /**
     * The scanner object for user input.
     */
    private Scanner scanner;

    /**
     * The name of the web shop.
     */
    private String webShopName;

    /**
     * Constructs a new web shop with the specified name.
     *
     * @param name the name of the web shop
     */
    public WebShop(String name) {
        this.id = cntID++;
        this.allWebShopItems = new ArrayList<>();
        this.webShopName = name;
    }

    /**
     * Adds an item to the web shop.
     *
     * @param item the item to add
     */
    public void addItemInWebShop(Item item) {
        if (!allWebShopItems.contains(item)) {
            allWebShopItems.add(item);
            System.out.println("item " + item.getClass().getSimpleName() + " successfully added to WebShop: " + webShopName);
        } else {
            System.out.println("Item " + item.getClass().getSimpleName() + " is already added!");
        }
    }

    /**
     * Updates the quantity of an item in the web shop inventory.
     *
     * @param item     the item to update
     * @param quantity the new quantity of the item
     */
    public void updateItemOfferQuantity(Item item, int quantity) {
        System.out.println(item);
        System.out.println("changing quantity for: " + quantity);
        if (quantity > 0) {
            item.setAdditionalQuantity(quantity);
            System.out.println("new quantity: " + item.getQuantity());
        } else if (quantity < 0) {
            item.decreaseQuantity(Math.abs(quantity));
            System.out.println("new quantity: " + item.getQuantity());
        } else {
            System.out.println("there is no change in quantity");
        }
    }

    /**
     * Lists all items available in the web shop.
     */
    public void listAllItems() {
        System.out.println("---------------------------- " + webShopName + " ---------------------------------------------------");
        for (Item item : allWebShopItems) {
            System.out.println(item);
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Puts items in a package for a customer.
     *
     * @param customer the customer
     */
    public void putItemsInPackage(Customer customer) {
        scanner = customer.getScanner();
        pack = new Package(customer);
        for (Item allWebShopItem : allWebShopItems) {
            if (allWebShopItem.isInStock()){
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
            } else {
                System.out.println("Item: " + allWebShopItem + " is currently out of stock");
            }

        }
        pack.listAllItemsInPackage();
        if (!pack.getPackageItems().isEmpty()) {
            finnishAndPay();
        } else {
            System.out.println("There is no items in package");
        }
    }


    /**
     * Finalizes payment and updates items quantities after a successful payment.
     */
    public void finnishAndPay() {
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

    /**
     * Updates the quantities of items after a successful payment.
     */
    public void updateQuantitiesAfterSuccessfulPayment() {
//        todo: check stock of items?
        for (int i = 0; i < pack.getPackageItems().size(); i++) {
            Item item = pack.getPackageItems().get(i);
            int quantity = pack.getItemsQuantities().get(i);
            item.decreaseQuantity(quantity);
            System.out.println("Decreasing num of available items for item: " + item + " for: " + quantity);
        }
    }


    /**
     * The inner class Payment handles the payment process.
     */
    private class Payment {
        final String CREDIT_CARD = "CC";
        final String PAY_PAL = "PP";
        final String CASH_ON_DELIVERY = "COD";
        private boolean successfulPayment = false;

        public Payment() {
        }

        /**
         * Displays the possible payment methods.
         */
        private void possiblePaymentMethods() {
            System.out.println("possible payment methods are:");
            System.out.println(CREDIT_CARD + " - credit card payment");
            System.out.println(PAY_PAL + " - Pay Pal Service");
            System.out.println(CASH_ON_DELIVERY + " - Cash On Delivery");
        }

        /**
         * Performs the payment process.
         */
        private void payPackage() {
            scanner = new Scanner(System.in);
            System.out.println("please enter a correct code before preferred payment method " +
                    "(for cancellation enter any other input): ");
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

        /**
         * Checks if the payment was successful.
         *
         * @return true if the payment was successful, otherwise false
         */
        public boolean isSuccessfulPayment() {
            return successfulPayment;
        }
    }
}
