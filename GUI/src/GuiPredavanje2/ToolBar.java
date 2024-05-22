package GuiPredavanje2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ToolBar extends JPanel implements ActionListener {
    ToolBarListener toolBarListener;
    private JButton clearButton;
    private JButton readButton;

    public ToolBar() {

        createComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clearButton);
        add(readButton);
        activateComponents();

    }

    private void activateComponents() {
        clearButton.addActionListener(this);
        readButton.addActionListener(this);

    }

    private void createComponents() {
        clearButton = new JButton("Clear");
        readButton = new JButton("read from file");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BufferedReader br;
        StringBuilder sb;

        if (e.getSource() == clearButton) {

            toolBarListener.clearAllText();

        } else if (e.getSource() == readButton) {

            JFileChooser fc = new JFileChooser();
            int val = fc.showOpenDialog(this);

            if (val == JFileChooser.APPROVE_OPTION) {

                File file = fc.getSelectedFile();

                try {
                    br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                    sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line);
                        sb.append("\n");
                    }

                    br.close();

                    toolBarListener.setTextFromFile(sb.toString());

                } catch (UnsupportedEncodingException | FileNotFoundException ev) {
                    ev.printStackTrace();
                } catch (IOException ev) {
                    ev.printStackTrace();
                }

            } else {
                System.out.println("Cancelled by User ...");
            }

        }
    }



    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }
}
