package Vjezba5B_dodatniZadatak;

public abstract class Item {

    protected float currentPrice;
    protected String itemDescription;
    protected int itemID;
    protected float itemInitPrice;
    protected int quantity;
    //todo: current quantity?
    //todo: setQuantity?

    public Item() {
    }

    protected void decreaseQuantity(int num) {
        if (quantity >= num){
            quantity -= num;
        } else {
            System.out.println("unsuccessful, not enough items in stock");
        }
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemID() {
        return itemID;
    }

    public float getItemInitPrice() {
        return itemInitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setAdditionalQuantity(int additionalQuantity) {
        this.quantity = getQuantity() + additionalQuantity;
    }

    protected abstract void changeItemDescription(String newDescription);

    protected abstract void setItemPrice(float percentage);

}
