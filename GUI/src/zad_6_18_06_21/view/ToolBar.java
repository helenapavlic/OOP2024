package zad_6_18_06_21.view;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
    private JButton subscribe;
    private JButton cancel;
    private JButton showInfo;

    public ToolBar(){
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {

    }

    private void layoutComponents() {


        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 20,0);
        add(subscribe);
        add(cancel);
        add(showInfo);
    }

    private void initComponents() {
        subscribe = new JButton("Subscribe");
        cancel = new JButton("Cancel");
        showInfo = new JButton("Show info");
        showInfo.setEnabled(false);
    }
}
