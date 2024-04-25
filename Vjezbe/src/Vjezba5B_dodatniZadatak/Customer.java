package Vjezba5B_dodatniZadatak;

import java.util.Scanner;

public class Customer {
    private static int cntID = 1;
    private final String customer;
    protected String address;
    protected int id;
    private Scanner scanner;
    //private static final String CUSTOMER;

    public Customer(String address) {
        this.address = address;
        this.id = cntID++;
        this.customer = toString();
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer | id: " + id + " | address: " + address;
    }
}
