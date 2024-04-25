package Vjezba5B_dodatniZadatak;

/**
 * The T_Shirt class represents a T-shirt item in a web-shop.
 * It extends the Item class and provides methods to manage T-shirt properties.
 */
public class T_Shirt extends Item {

    /**
     * The static counter for generating unique item IDs.
     */
    private static int cntID = 3000;

    /**
     * Constructs a new T-shirt with the specified initial price, quantity, and description.
     *
     * @param initPrice   the initial price of the T-shirt
     * @param quantity    the quantity of the T-shirt in stock
     * @param description the description of the T-shirt
     */
    public T_Shirt(float initPrice, int quantity, String description) {
        this.itemID = cntID++;
        this.itemInitPrice = initPrice;
        this.currentPrice = initPrice;
        this.quantity = quantity;
        this.itemDescription = description;
        this.inStock = true;
    }

    /**
     * Changes the description of the T-shirt to a new description.
     *
     * @param newDescription the new description of the T-shirt
     */
    @Override
    protected void changeItemDescription(String newDescription) {
        this.itemDescription = newDescription;
    }

    /**
     * Sets the price of the T-shirt based on a percentage change.
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
     * Returns a string representation of the T-shirt.
     *
     * @return a string representation of the T-shirt
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
