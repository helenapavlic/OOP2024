package GuiPreavanje1;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;

    public TextPanel() {
        setLayout(new BorderLayout());
        createComponents();
        add(textArea, BorderLayout.CENTER);
    }

    private void createComponents() {
        textArea = new JTextArea();
    }

    public void setText(String text) {
        textArea.append(text + "\n");
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void clearAll() {
        textArea.selectAll();
        textArea.replaceSelection(null);
    }
}
