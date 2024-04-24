package Vjezba5B_dodatniZadatak;

public class TestWebShop {

    public static void main(String[] args) {
        WebShop webShop = new WebShop("krpice");
        Customer customer = new Customer("Ulica 1");
        Customer customer1 = new Customer("Ulica2");

        Jacket jacket = new Jacket(50.00F,30,"kožna jakna");
        Jacket jacket1 = new Jacket(35.00F,5,"zimska jakna");
        T_Shirt tShirt = new T_Shirt(12.00F,4,"majica s printom");
        T_Shirt tShirt1 = new T_Shirt(13.00F,5,"kratkih rukava");
        Sneakers sneakers = new Sneakers(100.00F,2,"nike tenisice");
        Sneakers sneakers1 = new Sneakers(90.00F,6,"starke");

        webShop.addItemInWebShop(jacket);
        webShop.addItemInWebShop(jacket);
        webShop.addItemInWebShop(jacket1);
        webShop.addItemInWebShop(tShirt);
        webShop.addItemInWebShop(tShirt1);
        webShop.addItemInWebShop(sneakers);
        webShop.addItemInWebShop(sneakers1);

        webShop.listAllItems();
        webShop.putItemsInPackage(customer);

        webShop.listAllItems();
        webShop.putItemsInPackage(customer1);


    }
}
