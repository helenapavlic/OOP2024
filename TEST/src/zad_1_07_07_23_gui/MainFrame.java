package zad_1_07_07_23_gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private Student student;

    public MainFrame(){
        super("Simple App");
        initMainFrame();
        createComponentsMainFrame();
        layoutComponents();
        activateComponents();
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void initMainFrame() {
        setSize(680, 580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void activateComponents() {

    }

    private void createComponentsMainFrame() {
        formPanel = new FormPanel();
        viewPanel = new ViewPanel();
    }
}
