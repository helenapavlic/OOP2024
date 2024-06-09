package zad_6_18_06_21.view;

import javax.swing.*;
import java.awt.*;

public class InfoFrame extends JFrame {
    ChoosePanel choosePanel;
    SelectPanel selectPanel;
    TextAreaPanel textAreaPanel;
    InfoToolBar infoToolBar;

    public InfoFrame() {
        super("Info");
        initMainFrame();
        initComponents();
        layoutComponents();
        activateMainFrame();
    }

    private void activateMainFrame() {

    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        gbc.weighty = 0.53;
        add(choosePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.53;
        add(selectPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.04;
        add(infoToolBar, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 3; // tri reda
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 1.0;
        add(textAreaPanel, gbc);

    }

    private void initComponents() {
        choosePanel = new ChoosePanel();
        selectPanel = new SelectPanel();
        textAreaPanel = new TextAreaPanel();
        infoToolBar = new InfoToolBar();
    }

    private void initMainFrame() {
        setSize(700, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
