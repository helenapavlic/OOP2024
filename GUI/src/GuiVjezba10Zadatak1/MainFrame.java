package GuiVjezba10Zadatak1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private TextPanel textPanel;
    private FormPanelListener formPanelListener;

    public MainFrame(){
        super("GUI 2"); // title in window

        setLayout(new BorderLayout()); // using border layout
        createComponents(); // method for creating components -> this one just creates components, it does not display them
//        positioning elements in frame using borderLayout
        add(textPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.WEST);
        formPanel.setFormPanelListener(formPanelListener);

//        main actions

        setSize(700, 550); // dimensions of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
        setLocationRelativeTo(null); // center a window
        setVisible(true); // set visible
        setResizable(false); // resizable
        System.out.println("successful created main frame");
    }

    private void createComponents() {
        System.out.println("creating components");
        formPanel = new FormPanel();
        textPanel = new TextPanel();

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void sendText(String text) {
                textPanel.writeText(text);
                System.out.println(text);
            }

            @Override
            public void reset() {
                textPanel.clearTextArea();
                System.out.println("clear");

            }
        });
    }
}
