package gui_swing;

public class PurchaseData {
    private String category;
    private String payment;
    private String delivery;
    private boolean giftBox;
    private boolean giftCard;
    private boolean specialGift;

    public PurchaseData(String category, String payment, String delivery, boolean giftBox, boolean giftCard, boolean specialGift) {
        this.category = category;
        this.payment = payment;
        this.delivery = delivery;
        this.giftBox = giftBox;
        this.giftCard = giftCard;
        this.specialGift = specialGift;
    }

    @Override
    public String toString() {
        return "PurchaseData{" +
                "category='" + category + '\'' +
                ", payment='" + payment + '\'' +
                ", delivery='" + delivery + '\'' +
                ", giftBox=" + giftBox +
                ", giftCard=" + giftCard +
                ", specialGift=" + specialGift +
                '}';
    }
}
