package Vjezba5B_dodatniZadatak;

/**
 * The Jacket class represents a jacket item in a web-shop.
 * It extends the Item class and provides methods to manage jacket properties.
 */
public class Jacket extends Item {

    /**
     * The static counter for generating unique item IDs.
     */
    private static int cntID = 1000;

    /**
     * Constructs a new jacket with the specified initial price, quantity, and description.
     *
     * @param initPrice   the initial price of the jacket
     * @param quantity    the quantity of the jacket in stock
     * @param description the description of the jacket
     */
    public Jacket(float initPrice, int quantity, String description) {
        this.itemID = cntID++;
        this.itemInitPrice = initPrice;
        this.currentPrice = initPrice;
        this.quantity = quantity;
        this.itemDescription = description;
        this.inStock = true;
    }

    /**
     * Changes the description of the jacket to a new description.
     *
     * @param newDescription the new description of the jacket
     */
    @Override
    protected void changeItemDescription(String newDescription) {
        this.itemDescription = newDescription;
    }

    /**
     * Sets the price of the jacket based on a percentage change.
     *
     * @param percentage the percentage change in price
     */
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

    /**
     * Returns a string representation of the jacket.
     *
     * @return a string representation of the jacket
     */
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
