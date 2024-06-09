package zad_6_18_06_21.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextAreaPanel extends JPanel {

    private JTextArea textArea;

    public TextAreaPanel() {
        setPreferredSize(new Dimension(350, 550));
        setLayout(new BorderLayout());

        // Kreiranje JTextArea sa minimalno 10 redaka i 30 stupaca
        textArea = new JTextArea(10, 10);

        // Omogućavanje automatskog prelamanja redova
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);

        // Kreiranje JScrollPane i dodavanje JTextArea u njega
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Dodavanje JScrollPane u panel
        add(scrollPane, BorderLayout.CENTER);
        decorate();
    }

    private void decorate() {
//        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
//        Border inner = BorderFactory.createTitledBorder("Text ");
//        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(BorderFactory.createEmptyBorder(15,5,15,5));
    }

    public void setText(String text) {
        textArea.append(text + "\n");
    }


    public void clearAll() {
        textArea.selectAll();
        textArea.replaceSelection(null);
    }
}
