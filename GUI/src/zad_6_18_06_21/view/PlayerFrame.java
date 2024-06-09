package zad_6_18_06_21.view;

import javax.swing.*;
import java.awt.*;

public class PlayerFrame extends JFrame {
//    kao main frame
    BasicInfoPanel basicInfoPanel;
    GamesPanel gamesPanel;
    ToolBar toolBar;

    public PlayerFrame(){
        super("Player");
        initMainFrame();
        initComponents();
        layoutComponents();
        activateFrame();
    }

    private void activateFrame() {
//        zadnje, postavlja listenere za svaki gumb koristeci anonimnu klasu

    }

    private void layoutComponents() {
//        layout panele na ekranu
        setLayout(new BorderLayout());

        add(basicInfoPanel,BorderLayout.CENTER);
        add(gamesPanel,BorderLayout.LINE_END);
        add(toolBar,BorderLayout.SOUTH);
    }

    private void initComponents() {
        basicInfoPanel = new BasicInfoPanel();
        gamesPanel = new GamesPanel();
        toolBar = new ToolBar();
    }

    private void initMainFrame() {
        setSize(700, 580);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
