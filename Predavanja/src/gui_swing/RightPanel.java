package gui_swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RightPanel extends JPanel {

    private JList<String> categoryList;
    private JComboBox<String> paymentCombo;

    private JCheckBox decorateCheckBox;
    private JCheckBox giftCheckBox;
    private JCheckBox specialGiftCheckBox;

    private JRadioButton expressDelivery;
    private JRadioButton normalDelivery;
    private ButtonGroup radioButtonGroup;

    private JButton confirmButton;

    private JScrollPane listScrollPane;

    public RightPanel() {
        decorate();
        initComps();
        layoutComps();
        activatePanel();
    }

    private void activatePanel() {

    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;

        add(new JLabel("Product category: "), gridBagConstraints);
        gridBagConstraints.gridy++;
        add(listScrollPane, gridBagConstraints);

        gridBagConstraints.gridy++;
        add(Box.createVerticalStrut(35), gridBagConstraints);


        gridBagConstraints.gridy++;
        add(giftCheckBox, gridBagConstraints);
        gridBagConstraints.gridy++;
        add(specialGiftCheckBox, gridBagConstraints);
        gridBagConstraints.gridy++;
        add(decorateCheckBox, gridBagConstraints);


        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx++;

        add(Box.createHorizontalStrut(20));
        gridBagConstraints.gridx++;
        add(new JLabel("Payment method: "));

        gridBagConstraints.gridy++;
        add(paymentCombo, gridBagConstraints);

        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx++;

        add(Box.createHorizontalStrut(20));
        gridBagConstraints.gridx++;
        add(new JLabel("Delivery: "));


        gridBagConstraints.gridy++;
        add(normalDelivery, gridBagConstraints);

        gridBagConstraints.gridy++;
        add(expressDelivery, gridBagConstraints);

        gridBagConstraints.gridy+=4;
        add(confirmButton,gridBagConstraints);




    }

    private void initComps() {
        categoryList = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.add(0, "CAT-1");
        listModel.add(1, "CAT-2");
        listModel.add(2, "CAT-3");
        listModel.add(3, "CAT-4");
        listModel.add(4, "CAT-5");
        categoryList.setVisibleRowCount(3);
        categoryList.setModel(listModel);

        listScrollPane = new JScrollPane(categoryList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listScrollPane.setPreferredSize(new Dimension(100, 70));

        giftCheckBox = new JCheckBox("Gift card");
        decorateCheckBox = new JCheckBox("Decorate box");
        specialGiftCheckBox = new JCheckBox("Special gift");

        paymentCombo = new JComboBox<>();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement(null);
        comboBoxModel.addElement("Visa");
        comboBoxModel.addElement("American");
        comboBoxModel.addElement("PayPay");
        comboBoxModel.addElement("BitCoin");
        comboBoxModel.addElement("Cash");
        paymentCombo.setModel(comboBoxModel);

        expressDelivery = new JRadioButton("Express delivery");
        expressDelivery.setActionCommand("EXPRESS");

        normalDelivery = new JRadioButton("Normal delivery");
        normalDelivery.setActionCommand("NORMAL");

        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(expressDelivery);
        radioButtonGroup.add(normalDelivery);
        normalDelivery.setSelected(true);

        confirmButton = new JButton("Confirm");
//        confirmButton.setActionCommand("CONFIRM");

    }

    private void decorate() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Purchase data: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }


}
