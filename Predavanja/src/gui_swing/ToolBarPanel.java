package gui_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBarPanel extends JPanel implements ActionListener {
    private JButton setTextButton;
    private JButton resetViewPanelButton;
    private ToolBarListener toolBarListener;

    public ToolBarPanel() {
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {
        setTextButton.addActionListener(this);
        resetViewPanelButton.addActionListener(this);
//        string naredba koja je vezana uz button
        setTextButton.setActionCommand("SET TEXT");
        resetViewPanelButton.setActionCommand("RESET");
    }

    private void layoutComponents() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(setTextButton);
        add(resetViewPanelButton);
    }

    private void initComponents() {
        setTextButton = new JButton("Set text");
        resetViewPanelButton = new JButton("Reset");

    }


    //    slusa samo sebe u ovom slucaju
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(setTextButton) && toolBarListener != null) {
            toolBarListener.ToolBarEventOccurred(new ToolBarEvent(this, setTextButton.getActionCommand()));
        }

        if (e.getSource().equals(resetViewPanelButton) && toolBarListener != null) {
            toolBarListener.ToolBarEventOccurred(new ToolBarEvent(this, resetViewPanelButton.getActionCommand()));
        }

    }

    //    setter za toolBarListener kojeg će contoller postaviti kako bi se logika mogla izvrsiti
//    koji preko njega slusa sto se dogada na toolBaru
    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }
}
