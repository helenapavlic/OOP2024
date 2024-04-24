package Vjezba5B_dodatniZadatak;

public class TestWebShop {

    public static void main(String[] args) {
        WebShop webShop = new WebShop("krpice");
        Customer customer = new Customer("Ulica 1");

        T_Shirt tShirt = new T_Shirt(12,5,"majica");
        T_Shirt tShirt1 = new T_Shirt(15,7,"majica 1");
        Sneakers nike = new Sneakers(25, 20, "nike tene");
        Jacket  jacket = new Jacket(45,2,"jacket");

        webShop.addItemInWebShop(tShirt);
        webShop.addItemInWebShop(tShirt1);
        webShop.addItemInWebShop(tShirt1);
        webShop.addItemInWebShop(nike);
        webShop.addItemInWebShop(jacket);

        webShop.listAllItems();
        webShop.putItemsInPackage(customer);

    }
}
