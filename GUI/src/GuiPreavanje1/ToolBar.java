package GuiPreavanje1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ToolBar extends JPanel implements ActionListener {
    private JButton clearButton;
    private JButton loadFileButton;
    //private TextPanel textPanel;
    private ToolBarListener toolBarListener;

    public ToolBar() {
        createComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clearButton);
        add(loadFileButton);
        activateButtons();
    }

    private void activateButtons() {
        clearButton.addActionListener(this);
        loadFileButton.addActionListener(this);
    }

    private void createComponents() {
        clearButton = new JButton("Clear");
        loadFileButton = new JButton("Read file");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = null;

        if (event.getSource() == clearButton) {
//            textPanel.getTextArea().selectAll();
//            textPanel.getTextArea().replaceSelection(" ");
            toolBarListener.clearText();
        } else if (event.getSource() == loadFileButton) {
            JFileChooser fileChooser = new JFileChooser();
            int val = fileChooser.showOpenDialog(this);

            if (val == JFileChooser.APPROVE_OPTION) {

                File file = fileChooser.getSelectedFile();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                    String line = null;
                    stringBuilder = new StringBuilder();
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line);
                        stringBuilder.append("\n");
                    }

                    bufferedReader.close();

                    //textPanel.getTextArea().setText(stringBuilder.toString());
                    toolBarListener.sendTxtFileContent(stringBuilder.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("open command cancelled");
            }

        }
    }

//    public void setTextPanel(TextPanel textPanel) {
//        this.textPanel = textPanel;
//    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }
}
