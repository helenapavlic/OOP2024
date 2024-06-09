package zad_2_23_06_23_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private FormListener formListener;

    private JLabel labelName;
    private JLabel labelSurname;
    private JLabel heightLabel;
//    private JLabel labelMail;

    private JTextField nameField;
    //    private JTextField cityField;
    private JTextField surnameField;

    private JButton buttonShow;
    private JButton buttonSave;
    private ButtonGroup buttonGroup;
    private JRadioButton usaRadioButton;
    private JRadioButton euRadioButton;
    private JComboBox heightComboBox;


    public FormPanel() {
//        Dimension dimension = getPreferredSize();
//        dimension.width = 220;
//        setPreferredSize(dimension);

        setBorders();
        createLeftComponents();
        layoutLeft();
        activateForm();
    }

    private void layoutLeft() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

// General settings for all components
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 5); // Optional, for padding

///////////////////// First Row /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.25;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(labelName, gbc);

        gbc.gridx = 1;
        add(nameField, gbc);

///////////////////// Second Row /////////////////////
        gbc.gridx = 0;
        gbc.gridy++;
        add(labelSurname, gbc);

        gbc.gridx = 1;
        add(surnameField, gbc);

///////////////////// Third Row /////////////////////
        gbc.gridx = 0;
        gbc.gridy++;
        add(heightLabel, gbc);

        gbc.gridx = 1;
        add(heightComboBox, gbc);

///////////////////// Last Row /////////////////////
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(usaRadioButton, gbc);

        gbc.gridy++;
        add(euRadioButton, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
//        gbc.gridwidth = 2; // Make the button span two columns
        add(buttonShow, gbc);

        gbc.gridx++;
        add(buttonSave, gbc);

    }

    private void createLeftComponents() {
        Dimension dimension = getPreferredSize();
        dimension.height = 300;
        setPreferredSize(dimension);

        labelName = new JLabel("Ime: ");
        labelSurname = new JLabel("Prezime: ");
        nameField = new JTextField(10);
        surnameField = new JTextField(10);

        heightLabel = new JLabel("Visina: ");

        heightComboBox = new JComboBox();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        comboModel.addElement("< 160");
        comboModel.addElement("160 - 170");
        comboModel.addElement("170 - 180");
        comboModel.addElement("180 - 190");
        comboModel.addElement("> 190");
        heightComboBox.setModel(comboModel);
        heightComboBox.setSelectedIndex(0);

        buttonGroup = new ButtonGroup();
        euRadioButton = new JRadioButton("EU");
        usaRadioButton = new JRadioButton("USA");
        buttonGroup.add(euRadioButton);
        buttonGroup.add(usaRadioButton);
        usaRadioButton.setSelected(true);


        buttonShow = new JButton("Prikaži");
        buttonShow.setActionCommand("SHOW");
        buttonShow.setEnabled(false);

        buttonSave = new JButton("Spremi");
        buttonSave.setActionCommand("SAVE");
    }

    private void setBorders() {
        Border inner = BorderFactory.createTitledBorder("Unos podataka");
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outer, inner));

    }

    private void activateForm() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("save button");


                String action = buttonSave.getActionCommand();
                String name = nameField.getText();
                String surname = surnameField.getText();
                String height = heightComboBox.getSelectedItem().toString();
                String country = "USA";
                if (euRadioButton.isSelected()) {
                    country = "EU";
                }
                FormEvent formEvent = new FormEvent(this, action, name, surname, height, country);

                buttonShow.setEnabled(true);
                resetForm();
                if (formListener != null) {
                    formListener.formEventOccurred(formEvent);
                }
            }
        });

        buttonShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("show button");

                String name = nameField.getText();
                String surname = surnameField.getText();
                String height = heightComboBox.getSelectedItem().toString();
                String country = "USA";
                if (euRadioButton.isSelected()) {
                    country = "EU";
                }
                String action = buttonShow.getActionCommand();
                FormEvent formEvent = new FormEvent(this, action, name, surname, height, country);

                if (formListener != null) {
                    formListener.formEventOccurred(formEvent);
                }
                buttonShow.setEnabled(false);
                resetForm();
            }

        });
    }

    public void resetForm() {
        nameField.setText(null);
        surnameField.setText(null);
        usaRadioButton.setSelected(true);
        heightComboBox.setSelectedIndex(0);

    }

    public void setLeftFormListener(FormListener leftFormListener) {
        this.formListener = leftFormListener;
    }

}
