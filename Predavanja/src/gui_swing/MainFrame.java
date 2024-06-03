package gui_swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ToolBarPanel toolBar;
    private ViewPanel viewPanel;
    private FormPanel formPanel;


    public MainFrame() {
        super("simple form app");
        initMainFrame();
        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void activateMainFrame() {
        //aktivira main frame
//        anonimna klasa
        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void ToolBarEventOccurred(ToolBarEvent toolBarEvent) {
                String someString = toolBarEvent.getSomeString();
                if (someString.equals("SET TEXT")) {
                    viewPanel.setText(someString);
                }
                if (someString.equals("RESET")) {
                    viewPanel.resetViewPanel();
                }
            }
        });
    }

    private void layoutComponents() {
        //poreda komponente na mainFrameu
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void initComponents() {
        //inicjalizija elemenata
        toolBar = new ToolBarPanel();
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

    private void initMainFrame() {
//        osnovni elementi
        setSize(680, 580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

}
