package Vjezba5B_dodatniZadatak;

public class Jacket extends Item {
    private static int cntID = 1000;

    public Jacket(float initPrice, int quantity, String description) {
        this.itemID = cntID++;
        this.itemInitPrice = initPrice;
        this.currentPrice = initPrice;
        this.quantity = quantity;
        this.itemDescription = description;
    }


    @Override
    protected void changeItemDescription(String newDescription) {
        this.itemDescription = newDescription;
    }

    @Override
    protected void setItemPrice(float percentage) {
        float currentPrice = getCurrentPrice();
        float updatedPrice;
        if (percentage != 0) {
            System.out.println(getClass().getSimpleName() + " | id: " + getItemID() + " | price change: " + percentage * 100 + "%");
            System.out.printf("Price before change: %-4.2f\n", currentPrice);
            updatedPrice = currentPrice + currentPrice * percentage;
            setCurrentPrice(updatedPrice);
            System.out.printf("Current price: %-4.2f\n", getCurrentPrice());
        } else {
            System.out.println("there is no change in price");
        }
    }

    @Override
    public String toString() {
        return String.format("%-10s | id: %-5d | description: %-20s | price: %-4.2f | quantity: %-4d",
                getClass().getSimpleName(),
                itemID,
                itemDescription,
                currentPrice,
                quantity);
    }
}
