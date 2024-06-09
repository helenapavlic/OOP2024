package zad_6_18_06_21.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BasicInfoPanel extends JPanel {
    private JTextField playerNameField;
    private JTextField totalGamesPlayedField;
    private JComboBox skillsLevelComboBox;

    private JRadioButton automaticallyAddRadioButton;
    private JRadioButton letMeChooseRadioButton;
    private ButtonGroup buttonGroup;

//   todo: action listenner i setters za njega!

    public BasicInfoPanel() {
//        Dimension dims = getPreferredSize();
//        dims.width = 400;
//        dims.height = 200;
//        setPreferredSize(dims);

        decoratePanel();
        initComponents();
        layoutComponents();
        activatePanel();
    }

    private void activatePanel() {

    }

    private void layoutComponents() {
//        gridBag layout
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;

        add(new JLabel("Player name: "), gridBagConstraints);
        gridBagConstraints.gridx++;
        add(playerNameField, gridBagConstraints);

//        razmak
        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(35), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(new JLabel("Total games played: "), gridBagConstraints);
        gridBagConstraints.gridx++;
        add(totalGamesPlayedField,gridBagConstraints);


        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(35), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(new JLabel("Skills level: "), gridBagConstraints);
        gridBagConstraints.gridx++;
        add(skillsLevelComboBox,gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(50), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(automaticallyAddRadioButton,gridBagConstraints);
        gridBagConstraints.gridy++;

        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(20), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(letMeChooseRadioButton,gridBagConstraints);


    }

    private void initComponents() {
        playerNameField = new JTextField(10);
        totalGamesPlayedField = new JTextField(5);

        skillsLevelComboBox = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("selection");
        comboBoxModel.addElement("skill level 1");
        comboBoxModel.addElement("skill level 2");
        skillsLevelComboBox.setModel(comboBoxModel);

        automaticallyAddRadioButton = new JRadioButton("Automatically add to MP group");
        automaticallyAddRadioButton.setActionCommand("automatically");
        letMeChooseRadioButton = new JRadioButton("Let me choose MP group");
        letMeChooseRadioButton.setActionCommand("choose");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(automaticallyAddRadioButton);
        buttonGroup.add(letMeChooseRadioButton);
        automaticallyAddRadioButton.setSelected(true);
    }

    private void decoratePanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Basic info: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

}
