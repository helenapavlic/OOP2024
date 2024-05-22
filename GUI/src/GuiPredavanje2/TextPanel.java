package GuiPredavanje2;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public TextPanel() {
        setLayout(new BorderLayout());
        createComponents();
        add(scrollPane, BorderLayout.CENTER);
        textArea.setMargin(new Insets(10,10,10,10)); // added padding
    }

    private void createComponents() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
    }

    public void writeText(String text) {
        textArea.append(text);
        textArea.append("\n");
    }

    public void clearTextArea() {
        textArea.selectAll();
        textArea.replaceSelection(null);
    }
}
