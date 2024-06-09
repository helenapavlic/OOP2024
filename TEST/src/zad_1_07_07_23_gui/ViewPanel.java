package zad_1_07_07_23_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ViewPanel extends JPanel {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel() {
        initViewPanel();
        initComponents();
        layoutComponents();
        Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(border);
    }

    private void layoutComponents() {
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    private void initComponents() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void initViewPanel() {
        Dimension dimension = getPreferredSize();
        dimension.height = 230;
        setPreferredSize(dimension);
    }

    public void setText(String someString) {
        textArea.append(someString + "\n");
    }

    public void resetViewPanel() {
        textArea.selectAll();
        textArea.replaceSelection(null);
        textArea.requestFocus();
    }
}

