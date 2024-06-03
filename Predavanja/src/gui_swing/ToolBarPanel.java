package gui_swing;

import javax.swing.*;
import java.awt.*;

public class ToolBarPanel extends JPanel {
    private JButton setTextButton;
    private JButton resetViewPanelButton;

    public ToolBarPanel() {
        initToolBar();
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {

    }

    private void layoutComponents() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(setTextButton);
        add(resetViewPanelButton);
    }

    private void initComponents() {
        setTextButton = new JButton("Set text");
        resetViewPanelButton = new JButton("Reset");

    }

    private void initToolBar() {

    }
}
