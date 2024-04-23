package vjezba5_zadatak3;

public class Customer {
    private String name;
    private int idCustomer;
    private static int cntCustomer = 100;

    public Customer(String name){
        this.name = name;
        this.idCustomer = cntCustomer++;
    }

    public int customerID(){
        return idCustomer;
    }

    public void customerInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
