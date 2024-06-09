package zad_6_18_06_21.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ChoosePanel extends JPanel {
    private JComboBox searchCriteria;
    private JButton activate;

    public ChoosePanel() {
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
        add(new JLabel("Search criteria: "), gridBagConstraints);

        gridBagConstraints.gridx++;
        add(searchCriteria,gridBagConstraints);

        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(35), gridBagConstraints);

//        centiranje gumba
        gridBagConstraints.gridy++;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        add(activate,gridBagConstraints);

    }

    private void initComponents() {
        searchCriteria = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Selection...");
        comboBoxModel.addElement("Player id");
        comboBoxModel.addElement("Skills level");
        searchCriteria.setModel(comboBoxModel);

        activate = new JButton("Activate");
    }

    private void decoratePanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Choose");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }
}
