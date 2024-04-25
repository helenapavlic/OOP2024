package Vjezba5B_dodatniZadatak;

public class TestWebShop {

    public static void main(String[] args) {
        WebShop webShop = new WebShop("zara");
        Customer customer = new Customer("ulica 22");

        System.out.println("---------------------- test adding items to webShop -----------------------------");
        testAddItemInWebShop(webShop);
        System.out.println();

        System.out.println("---------------------- test listing all items -----------------------------");
        testListingAllItems(webShop);
        System.out.println();
        System.out.println("---------------------- test shopping -----------------------------");
        testPutItemsInPackage(webShop, customer);
        System.out.println();
        System.out.println("---------------------- test changing price -----------------------------");
        testChangeItemPrice(webShop);
        System.out.println();
        System.out.println("---------------------- test updating quantity -----------------------------");
        testUpdateItemOfferQuantity(webShop);
        System.out.println();
    }

    public static void testAddItemInWebShop(WebShop webShop) {
        Jacket jacket = new Jacket(50.00F, 30, "kožna jakna");
        Jacket jacket1 = new Jacket(35.00F, 5, "zimska jakna");
        T_Shirt tShirt = new T_Shirt(12.00F, 4, "majica s printom");
        T_Shirt tShirt1 = new T_Shirt(13.00F, 5, "kratkih rukava");
        Sneakers sneakers = new Sneakers(100.00F, 2, "nike tenisice");
        Sneakers sneakers1 = new Sneakers(90.00F, 6, "starke");

        // Test adding items
        webShop.addItemInWebShop(jacket);
        webShop.addItemInWebShop(jacket); // Adding the same item should not work
        webShop.addItemInWebShop(jacket1);
        webShop.addItemInWebShop(tShirt);
        webShop.addItemInWebShop(tShirt1);
        webShop.addItemInWebShop(sneakers);
        webShop.addItemInWebShop(sneakers1);
    }

    public static void testListingAllItems(WebShop webShop){
        webShop.listAllItems();
    }

    public static void testPutItemsInPackage(WebShop webShop, Customer customer) {
        webShop.putItemsInPackage(customer);
    }

    public static void testChangeItemPrice(WebShop webShop) {

        Sneakers sneakers = new Sneakers(100.00F, 4, "puma tenisice");
        webShop.addItemInWebShop(sneakers);

        // Change price of an item
        System.out.println("Changing price of sneakers...");
        sneakers.setItemPrice(-0.2f);
        sneakers.setItemPrice(0.5f);
        webShop.listAllItems();
    }

    public static void testUpdateItemOfferQuantity(WebShop webShop) {
        Sneakers sneakers = new Sneakers(60.00F, 7, "vans");
        T_Shirt tShirt = new T_Shirt(9.00F, 40, "top");

        webShop.addItemInWebShop(sneakers);
        webShop.addItemInWebShop(tShirt);

        // Test updating item offer quantity
        webShop.updateItemOfferQuantity(sneakers, 10);
        webShop.updateItemOfferQuantity(tShirt, -20);

        // Test listing all items after updating quantities
        webShop.listAllItems();
    }
}
