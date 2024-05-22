package GuiVjezba10Zadatak1;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;

    public TextPanel(){
        Dimension dimension = getPreferredSize();
        dimension.width = 450;
        setPreferredSize(dimension);
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
        textArea.setMargin(new Insets(10,10,10,10));
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
