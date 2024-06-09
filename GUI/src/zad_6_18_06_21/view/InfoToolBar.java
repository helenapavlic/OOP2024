package zad_6_18_06_21.view;

import javax.swing.*;
import java.awt.*;

public class InfoToolBar extends JPanel {
    private JButton search;
    private JButton exit;

    public InfoToolBar(){
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {

    }

    private void layoutComponents() {
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 20,0);
        setLayout(flowLayout);
        add(search);
        add(exit);
    }

    private void initComponents() {
        search = new JButton("Search");
        search.setEnabled(false);
        exit = new JButton("Exit");
    }
}
