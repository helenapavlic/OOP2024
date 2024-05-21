package GuiPredavanje2;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    FormListener formListener;
    LeftPanel leftPanel;
    RightPanel rightPanel;

    public FormPanel() {
        setFormLayout();
        createComponents();
//        adding elements to panel
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

    }

    private void setFormLayout() {
//        layoutt of panel
        setLayout(new BorderLayout());
        Dimension dim = getPreferredSize();
        dim.height = 240;
        setPreferredSize(dim);

    }

    private void createComponents() {
        rightPanel = new RightPanel();
        leftPanel = new LeftPanel();
    }

    public void setFormListener(FormListener formListener) {
//        setting same form listener for all panels
        this.formListener = formListener;
        leftPanel.setLeftFormListener(formListener);
        rightPanel.setRightFormListener(formListener);
    }
}
