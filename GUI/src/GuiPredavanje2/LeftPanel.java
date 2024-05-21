package GuiPredavanje2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel {
    private FormListener leftFormListener;

    private JLabel labelName;
    private JLabel labelCity;
    private JLabel labelMail;

    private JTextField nameField;
    private JTextField cityField;
    private JTextField mailField;

    private JButton buttonSend;

    public LeftPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 220;
        setPreferredSize(dimension);
        setBorders();
        createLeftComponents();
        layoutLeft();
        activateForm();
    }

    private void layoutLeft() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        ///////////////////// First Row /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.25;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(labelName, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gbc);

        ///////////////////// Second Row /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.25;

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(labelCity, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(cityField, gbc);

        ///////////////////// Third Row /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.25;

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(labelMail, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(mailField, gbc);

        ///////////////////// Last Row /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(buttonSend, gbc);

    }

    private void createLeftComponents() {
        labelName = new JLabel("Name: ");
        labelCity = new JLabel("City: ");
        labelMail = new JLabel("Mail: ");
        nameField = new JTextField(10);
        cityField = new JTextField(10);
        mailField = new JTextField(10);
        buttonSend = new JButton("Send");
    }

    private void setBorders() {
        Border inner = BorderFactory.createTitledBorder("Customer data");
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outer,inner));

    }

    private void activateForm() {
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String city = cityField.getText();
                String mail = mailField.getText();

                //nastavi
            }
        });

    }

    public void setLeftFormListener(FormListener leftFormListener) {
        this.leftFormListener = leftFormListener;
    }
}
