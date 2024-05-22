package GuiPredavanje2;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //    todo: Nakon svake potvrde u lijevom, odnosno desnom panelu i pripadnog ažuriranja komponente View potrebno je resetirati stanje svih komponenti
    private FormPanel formPanel;
    private TextPanel textPanel;
    private ToolBar toolBar;
    private ToolBarListener toolBarListener;

    public MainFrame() {
        super("GUI 2"); // title in window

//        ----------------------------------------
//        adding components to window

        setLayout(new BorderLayout()); // using border layout
        createComponentsMainFrame(); // method for creating components -> this one just creates components, it does not display them
//        positioning elements in frame using borderLayout
        add(toolBar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        toolBar.setToolBarListener(toolBarListener);

//        main actions

        setSize(700, 550); // dimensions of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
        setLocationRelativeTo(null); // center a window
        setVisible(true); // set visible
    }

    private void createComponentsMainFrame() {
        toolBar = new ToolBar();
        textPanel = new TextPanel();
        formPanel = new FormPanel();

        toolBarListener = new ToolBarListener() {
            @Override
            public void setTextFromFile(String text) {
                textPanel.writeText(text);
            }

            @Override
            public void clearAllText() {
                textPanel.clearTextArea();
            }
        };
        formPanel.setFormListener(new FormListener() {
            @Override
            public void leftPanelEventOccurred(LeftFormEvent lfe) {
                String city = lfe.getCity();
                String mail = lfe.getMail();
                String name = lfe.getName();

                textPanel.writeText(name + " | " + city + " | " + mail);

            }

            @Override
            public void rightPanelEventOccurred(RightFormEvent rfe) {
                int productCat = rfe.getProductCat();
                boolean giftCard = rfe.isGiftCard();
                boolean decorativeBox = rfe.isDecorativePack();
                boolean newsLetter = rfe.isNewsLetter();
                String payment = rfe.getPayment();
                String gcText = rfe.getGcText();
                String delivery = rfe.getDelivery();
                textPanel.writeText("Kategorija proizvoda: " + productCat);
                textPanel.writeText("Gift card: " + giftCard);
                textPanel.writeText("Short text for gift card: " + gcText);
                textPanel.writeText("Decorative package: " + decorativeBox);
                textPanel.writeText("Newsletters: " + newsLetter);
                textPanel.writeText("Payment method: " + payment);
                textPanel.writeText("Delivery: " + delivery);
                textPanel.writeText("-------------------------------------------");

            }
        });

    }
}
