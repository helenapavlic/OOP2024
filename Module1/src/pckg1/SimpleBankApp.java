package pckg1;
public class SimpleBankApp {
    public static void main(String[] args) {
        Komitent kom1 = new Komitent("Paško","fizička");
        Komitent kom2 = new Komitent("Comp2","pravna");

        kom1.inspectMoneyState();
        kom2.inspectMoneyState();
        kom2.depositMoney(1000);
        kom2.inspectMoneyState();
        double money = kom2.withdrawMoney(1200);
        System.out.println(kom1);
        System.out.println(kom2);

        kom1.setName("Paskvalina");
        System.out.println(kom1);
        String type1 = kom1.getType();
        System.out.println(type1);
    }
}

