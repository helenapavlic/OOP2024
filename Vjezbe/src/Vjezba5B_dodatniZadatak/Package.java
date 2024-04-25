package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;

/**
 * The Package class represents a package of items in a web-shop.
 * It provides methods to manage the package contents and calculate the total price.
 */
public class Package {

    /**
     * The static counter for generating unique package IDs.
     */
    private static long cntID = 5678L;

    /**
     * The customer who owns the package.
     */
    private final Customer customer;

    /**
     * The list of quantities of items in the package.
     */
    private ArrayList<Integer> itemsQuantities;

    /**
     * The ID of the package.
     */
    private long packageID;

    /**
     * The list of items in the package.
     */
    private ArrayList<Item> packageItems;

    /**
     * The total price of the package.
     */
    private float totalPrice;

    /**
     * Constructs a new package for the specified customer.
     *
     * @param customer the customer who owns the package
     */
    public Package(Customer customer) {
        this.packageID = cntID++;
        this.customer = customer;
        this.totalPrice = 0;
        packageItems = new ArrayList<>();
        itemsQuantities = new ArrayList<>();
    }

    /**
     * Returns the customer who owns the package.
     *
     * @return the customer who owns the package
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Returns the list of quantities of items in the package.
     *
     * @return the list of quantities of items in the package
     */
    public ArrayList<Integer> getItemsQuantities() {
        return itemsQuantities;
    }

    /**
     * Returns the ID of the package.
     *
     * @return the ID of the package
     */
    public long getPackageID() {
        return packageID;
    }

    /**
     * Returns the list of items in the package.
     *
     * @return the list of items in the package
     */
    public ArrayList<Item> getPackageItems() {
        return packageItems;
    }

    /**
     * Lists all items in the package along with their details.
     */
    public void listAllItemsInPackage() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("items in package [" + packageID + "]: " + getPackageItems().size());
        for (int i = 0; i < getPackageItems().size(); i++) {
            Item item = getPackageItems().get(i);
            System.out.printf("%-10s | id: %-5d | description: %-20s | price: %-4.2f | quantity: %-4d%n",
                    item.getClass().getSimpleName(),
                    item.getItemID(),
                    item.getItemDescription(),
                    item.getCurrentPrice(),
                    getItemsQuantities().get(i));
        }
        System.out.printf("TOTAL PRICE: %-4.2f\n", totalPrice);
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Adds an item to the package with the specified quantity.
     *
     * @param item the item to add to the package
     * @param col  the quantity of the item to add
     */
    public void putItem(Item item, int col) {
        if (item.getQuantity() >= col && !packageItems.contains(item)) {
            totalPrice += col * item.getCurrentPrice();
            packageItems.add(item);
            itemsQuantities.add(col);
            System.out.println("item: " + item.getClass().getSimpleName() + " | id: " + item.getItemID() +
                    " is successfully added to package number: " + getPackageID());
        } else {
            System.out.println("item is already in package or there is not enough items in stock.");
        }
    }

    /**
     * Returns a string representation of the package.
     *
     * @return a string representation of the package
     */
    @Override
    public String toString() {
        return String.format("%-5s id: %-5d | customer: \"%-20s\" | price: %-4.2f",
                getClass().getSimpleName(),
                packageID,
                customer,
                totalPrice
        );
    }
}
