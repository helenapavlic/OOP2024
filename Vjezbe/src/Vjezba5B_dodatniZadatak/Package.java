package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class Package {
    private static long cntID = 1000L;
    private final Customer customer;
    private ArrayList<Integer> itemsQuantities;
    private long packageID;
    private ArrayList<Item> packageItems;
    private float totalPrice;


    public Package(Customer customer) {
        this.packageID = cntID++;
        this.customer = customer;
        this.totalPrice = 0;
        packageItems = new ArrayList<>();
        itemsQuantities = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Integer> getItemsQuantities() {
        return itemsQuantities;
    }

    public long getPackageID() {
        return packageID;
    }

    public ArrayList<Item> getPackageItems() {
        return packageItems;
    }

    public void listAllItemsInPackage() {
//        todo: save quantities in item because they might change?
//        todo: use toString?

        for (int i = 0; i < getPackageItems().size(); i++) {
            Item item = getPackageItems().get(i);
            System.out.printf("%-10s | id: %-5d | description: %-10s | price: %-4.2f | quantity: %-4d%n",
                    item.getClass().getSimpleName(),
                    item.getItemID(),
                    item.getItemDescription(),
                    item.getCurrentPrice(),
                    getItemsQuantities().get(i));
        }
    }

    public void putItem(Item item, int col) {
//        todo: calculate total price
//        todo: check if item is already in package
        if (item.getQuantity() >= col) {
            packageItems.add(item);
            itemsQuantities.add(col);
            System.out.println("item: " + item.getClass().getSimpleName() + " | id: " + item.getItemID() +
                    " is sucessfully added to package number: " + getPackageID());
        }
    }

//    todo: format toString
    @Override
    public String toString() {
        return "Package{" +
                "customer=" + customer +
                ", items Quantities=" + itemsQuantities +
                ", package ID=" + packageID +
                ", package Items=" + packageItems +
                ", total Price=" + totalPrice +
                '}';
    }
}
