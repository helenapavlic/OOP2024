package Vjezba5B_dodatniZadatak;

/**
 * The Sneakers class represents a pair of sneakers in a web-shop.
 * It extends the Item class and provides methods to manage sneakers properties.
 */
public class Sneakers extends Item {

    /**
     * The static counter for generating unique item IDs.
     */
    private static int cntID = 2000;

    /**
     * Constructs a new pair of sneakers with the specified initial price, quantity, and description.
     *
     * @param initPrice   the initial price of the sneakers
     * @param quantity    the quantity of the sneakers in stock
     * @param description the description of the sneakers
     */
    public Sneakers(float initPrice, int quantity, String description) {
        this.itemID = cntID++;
        this.itemInitPrice = initPrice;
        this.currentPrice = initPrice;
        this.quantity = quantity;
        this.itemDescription = description;
    }

    /**
     * Changes the description of the sneakers to a new description.
     *
     * @param newDescription the new description of the sneakers
     */
    @Override
    protected void changeItemDescription(String newDescription) {
        this.itemDescription = newDescription;
    }

    /**
     * Sets the price of the sneakers based on a percentage change.
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
     * Returns a string representation of the sneakers.
     *
     * @return a string representation of the sneakers
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
