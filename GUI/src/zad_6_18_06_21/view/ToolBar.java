package zad_6_18_06_21.view;

import zad_6_18_06_21.model.FormListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel {
    private JButton subscribe;
    private JButton cancel;
    private JButton showInfo;
    private FormListener formListener;

    public ToolBar(){
        initComponents();
        layoutComponents();
        activateToolBar();
    }

    private void activateToolBar() {
        subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

    private void layoutComponents() {


        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 20,0);
        add(subscribe);
        add(cancel);
        add(showInfo);
    }

    private void initComponents() {
        subscribe = new JButton("Subscribe");
        cancel = new JButton("Cancel");
        showInfo = new JButton("Show info");
        showInfo.setEnabled(false);
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }
}
