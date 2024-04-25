package Vjezba5B_dodatniZadatak;

/**
 * The abstract Item class represents an item in a web-shop.
 * It provides methods to manage the properties of an item.
 */
public abstract class Item {

    /**
     * The current price of the item.
     */
    protected float currentPrice;

    /**
     * The description of the item.
     */
    protected String itemDescription;

    /**
     * The unique identifier of the item.
     */
    protected int itemID;

    /**
     * The initial price of the item.
     */
    protected float itemInitPrice;

    /**
     * The quantity of the item in stock.
     */
    protected int quantity;
    /**
     * Is item in stock.
     */
    protected boolean inStock;

    /**
     * Constructs a new Item with default values.
     */
    public Item() {
    }

    /**
     * Decreases the quantity of the item in stock by a specified number.
     * If there are not enough items in stock, prints a message.
     *
     * @param num the number by which to decrease the quantity
     */
    protected void decreaseQuantity(int num) {
        if (quantity >= num) {
            quantity -= num;
            if (quantity == 0) {
                inStock = false;
            }
        } else {
            System.out.println("unsuccessful, not enough items in stock");
        }
    }

    /**
     * Gets the current price of the item.
     *
     * @return the current price of the item
     */
    public float getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the current price of the item.
     *
     * @param currentPrice the current price of the item
     */
    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }


    /**
     * Checks if the item is in stock.
     *
     * @return true if the item is in stock, false otherwise
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * Gets the description of the item.
     *
     * @return the description of the item
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Gets the unique identifier of the item.
     *
     * @return the unique identifier of the item
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Gets the initial price of the item.
     *
     * @return the initial price of the item
     */
    public float getItemInitPrice() {
        return itemInitPrice;
    }

    /**
     * Gets the quantity of the item in stock.
     *
     * @return the quantity of the item in stock
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Adds additional quantity to the item in stock.
     *
     * @param additionalQuantity the additional quantity to add
     */
    public void setAdditionalQuantity(int additionalQuantity) {
        this.quantity = quantity + additionalQuantity;
        if (quantity > 0) {
            inStock = true;
        }
    }

    /**
     * Changes the description of the item to a new description.
     *
     * @param newDescription the new description of the item
     */
    protected abstract void changeItemDescription(String newDescription);

    /**
     * Sets the price of the item based on a percentage change.
     *
     * @param percentage the percentage change in price
     */
    protected abstract void setItemPrice(float percentage);
}
