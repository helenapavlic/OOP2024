package pckg1;

public class Komitent {
    private String name;
    private double balance;
    private String type;
    private static int cnt = 100;
    private int id;

    public Komitent(String name, double balance){

    }

    public Komitent(String name, String type){
        this.name = name;
        this.type = type;
        id = cnt++;
        balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("Success - Added " + amount + " to account.");
        System.out.println("New balance: " + balance);
    }

    public double withdrawMoney(double amount) {
        if (amount>balance){
            System.out.println("Failed transaction - transaction not possible: " + balance);
            amount = 0.0;
        } else {
            balance -= amount;
            System.out.println("Success - withdrawed amount: " + amount);
            System.out.println("new balace: " + balance);
        }
        return amount;
    }

    public void inspectMoneyState() {
        System.out.println(this.name + " Current account state: " + balance);
    }

    @Override
    public String toString() {
        return "Komitent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }
}
