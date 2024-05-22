package GuiPredavanje2;

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

    public void writeText(String text) {
        textArea.append(text);
        textArea.append("\n");
    }

    public void clearTextArea() {
        textArea.selectAll();
        textArea.replaceSelection(" ");
    }
}
