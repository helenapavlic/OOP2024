package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class WebShop {
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

    public void updateItemOfferQuantity(Item item, int addedQuantity) {
        item.setAdditionalQuantity(addedQuantity);
        System.out.println("updated quantity for item: " + item);
        System.out.println("new quantity: " + item.getQuantity());
    }

    public void reduceNumberOffersAfterSuccessfulPurchase(Item item, int quantity) {
        //todo: Only after successful payment quantities of chosen items needs to be reduced.

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

//        todo: payment...
    }

    public void finnishAndPay() {
//        todo: The method finishAndPay finalizes payment using inner class Payment. This method provides
//         info on package and customer, and updates items quantities in web shop inventory.
    }

    public void updateQuantitiesAfterSuccessfulPayment() {

    }

//    todo: method shopping that goes trough all steps of shop after the items are added
//    todo: add method that goes trough process of adding items (parameter num of items or void)... maybe add a new class WebShopAdmin?


    private class Payment {
        final String CREDIT_CARD = "CC";
        final String PAY_PAL = "PP";
        final String CASH_ON_DELIVERY = "COD";
        private boolean successfulPayment = false;

        public Payment() {
        }

        private void possiblePaymentMethods() {
            System.out.println("possible payment methods are:");
            System.out.println("1 - credit card payment");
            System.out.println("2 - Pay Pal Service");
            System.out.println("3 - Cash On Delivery");
        }

        private void payPackage() {
            System.out.println("please select desired payment method, or cancel purchase");
            possiblePaymentMethods();
            System.out.println("for cancelling purchase press any other number");
            //todo: finnish payment
//            pitat za input korisnika
//            provjeriti je li input int, ako je možemo dalje, ako nije ponovi input

//            todo: check input (try, catch)
            int unos;
            do {
                System.out.println("please enter a num before preferred payment method (for cancellation enter any other num): ");
                unos = scanner.nextInt();
            } while (!scanner.hasNextInt());

            if (unos == 1) {
                System.out.println(CREDIT_CARD);
                successfulPayment = true;
            } else if (unos == 2) {
                System.out.println(PAY_PAL);
                successfulPayment = true;
            } else if (unos == 3) {
                System.out.println(CASH_ON_DELIVERY);
                successfulPayment = true;
            } else {
                System.out.println("cancelled package!");
            }

        }

        //        added parameter successful payment
        public boolean isSuccessfulPayment() {
            return successfulPayment;
        }
//        todo: canceled package?
    }
}
