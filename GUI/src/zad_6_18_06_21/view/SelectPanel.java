package zad_6_18_06_21.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SelectPanel extends JPanel {

    private JTextField playerIdField;
    private JComboBox skillsLevelComboBox;

    public SelectPanel(){
        Dimension dims = getPreferredSize();
        dims.width = 400;
        dims.height = 200;
        setPreferredSize(dims);

        decoratePanel();
        initComponents();
        layoutComponents();
        activatePanel();
    }

    private void activatePanel() {

    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(new JLabel("Player id: "), gridBagConstraints);

        gridBagConstraints.gridx++;
        add(playerIdField,gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(35), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(skillsLevelComboBox,gridBagConstraints);

    }

    private void initComponents() {
        playerIdField = new JTextField(10);

        skillsLevelComboBox = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("selection");
        comboBoxModel.addElement("skill level 1");
        comboBoxModel.addElement("skill level 2");
        skillsLevelComboBox.setModel(comboBoxModel);
        skillsLevelComboBox.setEnabled(false);



    }

    private void decoratePanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Select");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

    }
}
