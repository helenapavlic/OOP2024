package GuiVjezba10Zadatak1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JButton send;
    private JButton reset;

    private JLabel textLabel;
    private JTextField textField;
    private FormPanelListener formPanelListener;

    public FormPanel(){
        createComponents();
        positionComponents();
        setBorder();
        activateForm();
    }

    private void activateForm() {
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                FormEvent formEvent = new FormEvent(this);
                formEvent.setText(text);
                System.out.println("action performed in form panel");
            }
        });
    }

    private void setBorder() {
        Border border = BorderFactory.createTitledBorder("Form");
        setBorder(border);
    }

    private void positionComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // label for text field
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(textLabel,gbc);

        gbc.gridy++;
        add(textField,gbc);

        // empty row
        gbc.gridy++;
        Component bx = Box.createVerticalStrut(30);
        add(bx, gbc);
        // now button
        gbc.gridy++;
        gbc.weighty = 0.45;
        add(send, gbc);
        // now reset button
        gbc.gridy++;
        gbc.weighty = 0.45;
        add(reset,gbc);
    }


    private void createComponents() {
        send = new JButton("Send");
        reset = new JButton("reset");
        reset.setEnabled(false);
        textLabel = new JLabel("Text: ");
        textField = new JTextField(10);
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }
}
