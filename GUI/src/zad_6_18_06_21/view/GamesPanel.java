package zad_6_18_06_21.view;

import zad_6_18_06_21.model.FormListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GamesPanel extends JPanel {
    private JList subscribeToList;

    private JCheckBox newsletter;
    private JCheckBox getMagazine;
    private JCheckBox specialOffers;

    private JTextField generatedId;
    private JScrollPane listScrollPane;
    FormListener formListener;

    public GamesPanel() {
        Dimension dims = getPreferredSize();
        dims.width = 300;
        dims.height = 300;
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
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;

        add(new JLabel("Subscribe to: "), gridBagConstraints);
        gridBagConstraints.gridx++;
        add(listScrollPane, gridBagConstraints);

        //        razmak
        gridBagConstraints.gridy++;
        gridBagConstraints.gridx = 0;
        add(Box.createVerticalStrut(35), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(newsletter,gridBagConstraints);

        gridBagConstraints.gridy++;
        add(getMagazine,gridBagConstraints);

        gridBagConstraints.gridy++;
        add(specialOffers,gridBagConstraints);

        gridBagConstraints.gridy++;
        add(Box.createVerticalStrut(35), gridBagConstraints);

        gridBagConstraints.gridy++;
        add(new JLabel("Generated id:"),gridBagConstraints);

        gridBagConstraints.gridx++;
        add(generatedId,gridBagConstraints);
    }

    private void initComponents() {
        subscribeToList = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.add(0,"Element 0");
        listModel.add(1,"Element 1");
        listModel.add(2,"Element 2");
        listModel.add(3,"Element 3");
        listModel.add(4,"Element 4");
        listModel.add(5,"Element 5");
        listModel.add(6,"Element 6");
        subscribeToList.setVisibleRowCount(3);
        subscribeToList.setModel(listModel);

        listScrollPane = new JScrollPane(subscribeToList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listScrollPane.setPreferredSize(new Dimension(100,70));

        newsletter = new JCheckBox("Send me newsletters");
        getMagazine = new JCheckBox("Get play magazine");
        specialOffers = new JCheckBox("Special offers");

        generatedId = new JTextField(5);
        generatedId.setEnabled(false);


    }

    private void decoratePanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Games panel: ");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }
}
