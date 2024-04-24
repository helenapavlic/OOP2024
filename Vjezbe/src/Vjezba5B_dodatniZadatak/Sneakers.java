package Vjezba5B_dodatniZadatak;

public class Sneakers extends Item {
    private static int cntID = 2000;

    public Sneakers(float initPrice, int quantity, String description) {
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
        if (percentage > 0) {
            System.out.println(getClass().getSimpleName() + " | id: " + getItemID() + " | price increased for: " + percentage * 100 + "%");
            System.out.println("price before change: " + getCurrentPrice());
            this.currentPrice = getCurrentPrice() + currentPrice * percentage;
            System.out.println("current price: " + getCurrentPrice());
        } else if (percentage < 0) {
            System.out.println(getClass().getSimpleName() + " | id: " + getItemID() + " | price decreased for: " + percentage * 100 + "%");
            System.out.println("price before change: " + getCurrentPrice());
            this.currentPrice = getCurrentPrice() - currentPrice * percentage;
            System.out.println("current price: " + getCurrentPrice());
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
