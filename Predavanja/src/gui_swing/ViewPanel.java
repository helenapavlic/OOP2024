package gui_swing;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ViewPanel() {
        initViewPanel();
        initComponents();
        layoutComponents();
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
}
