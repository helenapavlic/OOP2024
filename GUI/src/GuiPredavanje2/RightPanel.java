package GuiPredavanje2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel {

    private JList lista;
    private JComboBox payCombo;
    private JCheckBox gftCard;
    private JCheckBox gftDecortiveBox;
    private JCheckBox newsLetter;
    private JTextField giftText;
    private JLabel giftTxtLabel;
    private JRadioButton rbtnExpr;
    private JRadioButton rbntNrml;
    private ButtonGroup rBtngroup;
    private JButton confirmBtn;
    private FormListener fLst;

    public RightPanel() {

        createRightComp();
        setBorders();
        setRightLayout();
        activateRightPanel();

    }

    private void setRightLayout() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        ///////////////////// First Column /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.25;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Izaberi kategoriju: "), gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JScrollPane(lista, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(gftCard, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(gftDecortiveBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(newsLetter, gbc);

        ///////////////////// Second Column /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.1;

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(new JLabel("Payment method: "), gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(payCombo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(giftTxtLabel, gbc);


        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(giftText, gbc);

        ///////////////////// Third Column /////////////////////
        gbc.weightx = 1;
        gbc.weighty = 0.1;

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(rbtnExpr, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(rbntNrml, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.insets = new Insets(0, 25, 15, 15);
        add(confirmBtn,gbc);

    }

    private void createRightComp() {

        lista = new JList();
        DefaultListModel listModel = new DefaultListModel();
        listModel.add(0, "Kategorija proizvoda 1");
        listModel.add(1, "Kategorija proizvoda 2");
        listModel.add(2, "Kategorija proizvoda 3");
        listModel.add(3, "Kategorija proizvoda 4");
        listModel.add(4, "Kategorija proizvoda 5");
        lista.setModel(listModel);
        lista.setBorder(BorderFactory.createEtchedBorder());
        lista.setVisibleRowCount(3);
        lista.setSelectedIndex(0); // Select first category by default

        payCombo = new JComboBox();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        comboModel.addElement("American");
        comboModel.addElement("Visa");
        comboModel.addElement("PayPal");
        comboModel.addElement("Google Wallet");
        comboModel.addElement("Ethereum");
        payCombo.setModel(comboModel);
        payCombo.setSelectedIndex(2); // Select PayPal by default

        gftCard = new JCheckBox("Gift Card");
        gftDecortiveBox = new JCheckBox("Decorative box");
        newsLetter = new JCheckBox("News Letters");
        giftText = new JTextField(10);
        giftTxtLabel = new JLabel("Short Gift Text:");
        giftText.setEnabled(false);
        giftTxtLabel.setEnabled(false);

        rbtnExpr = new JRadioButton("Express delivery");
        rbntNrml = new JRadioButton("Normal delivery");
        rBtngroup = new ButtonGroup();
        rBtngroup.add(rbtnExpr);
        rBtngroup.add(rbntNrml);
        rbntNrml.setSelected(true); // Select normal delivery by default

        confirmBtn = new JButton("confirm");

    }

    private void setBorders() {

        Border inner = BorderFactory.createTitledBorder("Purchase data:");
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        setBorder(BorderFactory.createCompoundBorder(outer, inner));
    }

    private void activateRightPanel() {


    }

    public void setRightFormListener(FormListener listener) {

        this.fLst = listener;
    }

}
