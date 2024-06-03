package gui_swing;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    private LeftPanel leftPanel;
    private RightPanel rightPanel;
    private FormPanelListener formPanelListener;

    public FormPanel() {
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();

    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
        leftPanel.setFormPanelListener(formPanelListener);
        rightPanel.setFormPanelListener(formPanelListener);
    }
}
