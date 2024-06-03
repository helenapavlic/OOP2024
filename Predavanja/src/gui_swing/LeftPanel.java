package gui_swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel {
    private JTextField nameFiled;
    private JTextField cityField;
    private JTextField mailField;
    private JButton sendDataButton;
    private FormPanelListener formPanelListener;

    public LeftPanel() {

        Dimension dims = getPreferredSize();
        dims.width = 250;
        dims.height = 300;
        setPreferredSize(dims);


        decoratePanel();
        initComponents();
        layoutComponents();
        activatePanel();
    }

    private void activatePanel() {
        sendDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (formPanelListener != null) {
                    String name = nameFiled.getText();
                    String city = cityField.getText();
                    String mail = mailField.getText();
                    Customer customer = new Customer(name, city, mail);
//                    System.out.println(customer);

                    formPanelListener.leftPanelEventOccurred(new LeftPanelEvent(this, customer));
                    resetLeftForm();
                }
            }
        });

    }

    private void resetLeftForm() {
        nameFiled.setText(null);
        cityField.setText(null);
        mailField.setText(null);
        nameFiled.requestFocus();
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Name: "), gbc);

        gbc.gridy++;
        add(nameFiled, gbc);

        gbc.gridy++;
        add(new JLabel("City: "), gbc);

        gbc.gridy++;
        add(cityField, gbc);

        gbc.gridy++;
        add(new JLabel("Mail: "), gbc);

        gbc.gridy++;
        add(mailField, gbc);

        gbc.weighty = 0.25;
        gbc.gridy++;
        add(sendDataButton, gbc);


    }

    private void initComponents() {
        nameFiled = new JTextField(10);
        cityField = new JTextField(10);
        mailField = new JTextField(10);
        sendDataButton = new JButton("Send");

    }

    private void decoratePanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("customer data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);

    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }
}
