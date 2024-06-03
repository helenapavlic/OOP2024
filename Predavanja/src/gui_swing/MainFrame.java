package gui_swing;

import javax.swing.*;

public class MainFrame extends JFrame {

    private ToolBarPanel toolBar;
    private ViewPanel viewPanel;
    private FormPanel formPanel;


    public MainFrame(){
        super("simple form app");
        initMainFrame();
        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void activateMainFrame() {
        //aktivira main frame
    }

    private void layoutComponents() {
        //poreda komponente na mainFrameu
    }

    private void initComponents() {
        //inicjalizija elemenata


    }

    private void initMainFrame() {
//        osnovni elementi
        setSize(680,580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
