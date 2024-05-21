package GuiPredavanje2;

import java.util.EventObject;

public class RightFormEvent extends EventObject {
    private int productCat;
    private boolean giftCard;
    private boolean decorativePack;
    private boolean NewsLetter;
    private String payment;
    private String gcText;
    private String delivery;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public RightFormEvent(Object source) {
        super(source);
    }


    public int getProductCat() {
        return productCat;
    }

    public void setProductCat(int productCat) {
        this.productCat = productCat;
    }

    public boolean isGiftCard() {
        return giftCard;
    }

    public void setGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
    }

    public boolean isDecorativePack() {
        return decorativePack;
    }

    public void setDecorativePack(boolean decorativePack) {
        this.decorativePack = decorativePack;
    }

    public boolean isNewsLetter() {
        return NewsLetter;
    }

    public void setNewsLetter(boolean newsLetter) {
        NewsLetter = newsLetter;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getGcText() {
        return gcText;
    }

    public void setGcText(String gcText) {
        this.gcText = gcText;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}
