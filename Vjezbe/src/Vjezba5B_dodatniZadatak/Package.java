package Vjezba5B_dodatniZadatak;

import java.util.ArrayList;
import java.util.Scanner;

public class Package {
    private static long cntID = 5678L;
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

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("items in package " + packageID + ": ");
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

    @Override
    public String toString() {
        return String.format("%-10s | id: %-5d | customer: %-20s | price: %-4.2f",
                getClass().getSimpleName(),
                packageID,
                customer,
                totalPrice
        );
    }
}

