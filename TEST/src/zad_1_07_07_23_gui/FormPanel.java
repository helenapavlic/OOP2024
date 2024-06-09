package zad_1_07_07_23_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    private JTextField idField;
    private JTextField nameField;
    private JTextField surnameField;
    private ButtonGroup languageButtonGroup;
    private JRadioButton hrRadioButton;
    private JRadioButton engRadioButton;
    private JComboBox<String> coursesDropdown;
    private JButton confirmButton;
    private JButton saveButton;
    private JButton importButton;
    private JScrollPane listScrollPane;

    public FormPanel() {
        initComponents();
        layoutComponents();
        activateForm();
        decorate();
    }



    private void decorate() {
        Border inner = BorderFactory.createTitledBorder("Data");
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        setBorder(BorderFactory.createCompoundBorder(outer, inner));

    }

    private void activateForm() {

    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("ID:"), gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("STUDENT NAME:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gbc);

        // Surname
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("STUDENT SURNAME:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(surnameField, gbc);



//        RAZMAK STUPAC

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 2;
        gbc.gridy= 0;
        add(Box.createHorizontalStrut(30));

        //next col
        // Language
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Language:"), gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;

        add(hrRadioButton,gbc);
        gbc.gridy++;
        add(engRadioButton,gbc);


        // Elective Courses
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Elective Courses:"), gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(coursesDropdown, gbc);


        JPanel toolBarPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        toolBarPanel.add(confirmButton,flowLayout);
        toolBarPanel.add(saveButton,flowLayout);
        toolBarPanel.add(importButton,flowLayout);


        gbc.gridy++;
        add(toolBarPanel,gbc);
    }

    private void initComponents() {
        idField = new JTextField(10);
        idField.setEnabled(false);
        idField.setText("1");

        nameField = new JTextField(10);

        surnameField = new JTextField(10);

        hrRadioButton = new JRadioButton("HR");
        engRadioButton = new JRadioButton("ENG");
        languageButtonGroup = new ButtonGroup();
        languageButtonGroup.add(hrRadioButton);
        languageButtonGroup.add(engRadioButton);
        hrRadioButton.setSelected(true);

        coursesDropdown = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Choose");
        comboBoxModel.addElement("IZBORNI 1");
        comboBoxModel.addElement("IZBORNI 2");
        comboBoxModel.addElement("IZBORNI 3");
        comboBoxModel.addElement("IZBORNI 4");
        comboBoxModel.addElement("IZBORNI 5");
        comboBoxModel.addElement("IZBORNI 6");
        comboBoxModel.addElement("IZBORNI 7");
        comboBoxModel.addElement("IZBORNI 8");
        coursesDropdown.setModel(comboBoxModel);

        listScrollPane = new JScrollPane(coursesDropdown, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listScrollPane.setPreferredSize(new Dimension(100, 70));


        confirmButton = new JButton("Confirm");
        confirmButton.setActionCommand("confirm");

        saveButton = new JButton("Save");
        saveButton.setEnabled(false);
        saveButton.setActionCommand("Save");

        importButton = new JButton("Import");
        importButton.setEnabled(false);
        importButton.setActionCommand("Import");

    }
}
