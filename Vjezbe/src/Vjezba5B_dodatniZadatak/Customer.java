package Vjezba5B_dodatniZadatak;

import java.util.Scanner;

/**
 * The Customer class represents a customer in a web-shop.
 * It provides methods to manage customer information.
 */
public class Customer {

    /**
     * The static counter for generating unique customer IDs.
     */
    private static int cntID = 1;
    /**
     * The name of the customer.
     */
    private final String customer;
    /**
     * The address of the customer.
     */
    protected String address;
    /**
     * The ID of the customer.
     */
    protected int id;
    /**
     * Scanner object for user input.
     */
    private Scanner scanner;

    /**
     * Constructs a new customer with the specified address.
     *
     * @param address the address of the customer
     */
    public Customer(String address) {
        this.address = address;
        this.id = cntID++;
        this.customer = toString();
        scanner = new Scanner(System.in);
    }

    /**
     * Returns the scanner object.
     *
     * @return the scanner object
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * Returns the address of the customer.
     *
     * @return the address of the customer
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns the ID of the customer.
     *
     * @return the ID of the customer
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the customer.
     *
     * @return the name of the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Returns a string representation of the customer.
     *
     * @return a string representation of the customer
     */
    @Override
    public String toString() {
        return "Customer | id: " + id + " | address: " + address;
    }
}
