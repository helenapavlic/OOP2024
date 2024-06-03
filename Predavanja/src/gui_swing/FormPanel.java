package gui_swing;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    private LeftPanel leftPanel;
    private RightPanel rightPanel;

    public FormPanel() {
        initComponents();
        layoutComponents();
        activateComponents();
    }

    private void initComponents() {
        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();

    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(leftPanel,BorderLayout.WEST);
        add(rightPanel,BorderLayout.CENTER);
    }

    private void activateComponents() {

    }


}
