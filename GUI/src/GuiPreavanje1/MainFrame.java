package GuiPreavanje1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
//    elements in frame
//    now we modify this code to separate textPanel from this frame in separate class
//    now we are using class TextPanel instead of object of JTextArea
    private TextPanel textPanel;
    private JButton button;

//    konstruktor
    public MainFrame(){
        super("PrvaApp"); // title in window

//        ----------------------------------------
//        adding components to window

        setLayout(new BorderLayout()); // using border layout
        createComponents(); // method for creating components -> this one just creates components, it does not display them
//        positioning elements in frame using borderLayout
        add(button,BorderLayout.SOUTH);
        add(textPanel,BorderLayout.CENTER);

//        ----------------------------------------
//        activating components
        activateComponents();


//        main actions

        setSize(700,550); // dimensions of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
        setLocationRelativeTo(null); // center a window
        setVisible(true); // set visible

    }

    private void createComponents() {
        button = new JButton("Click here");
        textPanel = new TextPanel();
    }

    private void activateComponents(){

//        anonymous class for action listener -> later this will be separate class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setText("clicked button");
            }
        });
    }
}
