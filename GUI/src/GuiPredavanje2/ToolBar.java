package GuiPredavanje2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    ToolBarListener toolBarListener;
    private JButton clearButton;
    private JButton readButton;

    public ToolBar() {

        createComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clearButton);
        add(readButton);
        activateComponents();


    }

    private void activateComponents() {
    }

    private void createComponents() {
        clearButton = new JButton("Clear");
        readButton = new JButton("read from file");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(clearButton)) {
            toolBarListener.clearAllText();
        } else if (e.getSource().equals(readButton)) {
//            method for reading file??
            toolBarListener.setTextFromFile("test text");

        }
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }
}
