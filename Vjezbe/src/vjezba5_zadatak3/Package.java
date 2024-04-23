package vjezba5_zadatak3;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Package {
    private static final float MINI = 1.0f;
    private static final float MAXI = 100.0f;
    private static final int KOMS = 10;
    private static int cntPckg = 100;
    private int idPackage;
    private String destination;
    private Customer customer;
    private float pricePackage;
    private int totalKom;
    private String webShop;
    private String destination4Package;
    private Scanner sc;
    private List<Item> items;

    public Package(String webShop, Customer customer, String destination4Package, Scanner sc) {
        this.idPackage = cntPckg++;
        this.webShop = webShop;
        this.customer = customer;
        this.destination4Package = destination4Package;
        this.sc = sc;
    }

    private float randFloatPrice() {
        Random rand = new Random();
        return MINI + rand.nextFloat() * (MAXI - MINI);
    }

    private int randIntKom() {
        return ThreadLocalRandom.current().nextInt(1, KOMS);
    }

//    public void putContent() {
//        int choice;
//        while (true) {
//            System.out.println("1 - T_Shirt\n2 - Pant\n3 - Helmet\n4 - Sneakers");
//            System.out.println("Please enter your choice:");
//            switch (sc.nextInt()) {
//                case 1:
//                    items.add(new T_Shirt(randFloatPrice(), randIntKom()));
//                    System.out.println("T-Shirt is ordered!");
//                    break;
//                case 2:
//                    items.add(new Pants(randFloatPrice(), randIntKom()));
//                    System.out.println("Some pants are ordered!");
//                    break;
//                case 3:
//                    items.add(new Helmet(randFloatPrice(), randIntKom()));
//                    System.out.println("Helmet is ordered!");
//                    break;
//                case 4:
//                    items.add(new Sneakers(randFloatPrice(), randIntKom()));
//                    System.out.println("Sneakers are ordered!");
//                    break;
//                default:
//                    System.out.println("Wrong menu input!");
//            }
//            sc.nextLine();
//            System.out.println("To continue shopping press 'y' - any other to exit!");
//            String cont = sc.nextLine();
//            if (!cont.toLowerCase().equals("y")) {
//                System.out.println("-------------------------------------------------");
//                System.out.println("Finished shopping - payment need to be defined!");
//                if (checkPaymentPackage()) {
//                    System.out.println("All is completed for this purchase...");
//                    System.out.println("See package info for order details!");
//                }
//                break;
//            } else {
//                System.out.println("You have choose to continue shopping!");
//            }
//        }
//
//    }
}

