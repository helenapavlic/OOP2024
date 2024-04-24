package Vjezba5B_dodatniZadatak;

public class Customer {
    private static int cntID = 1;
    protected String address;
    protected int id;
    private final String customer;
    //private static final String CUSTOMER;

    public Customer(String address) {
        this.address = address;
        this.id = cntID++;
        this.customer = toString();
    }


    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
}
