package GuiPredavanje2;


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    FormPanel formPanel;
    TextPanel textPanel;
    ToolBar toolBar;

    public MainFrame(){
        super("kljsafdlkjasfčdlkjasdf"); // title in window

//        ----------------------------------------
//        adding components to window

        setLayout(new BorderLayout()); // using border layout
        createComponentsMainFrame(); // method for creating components -> this one just creates components, it does not display them
//        positioning elements in frame using borderLayout
        add(toolBar, BorderLayout.NORTH);
        add(textPanel,BorderLayout.CENTER);
        add(formPanel,BorderLayout.SOUTH);
        //add(button, BorderLayout.SOUTH);
        //add(textPanel, BorderLayout.CENTER);
        //toolBar.setTextPanel(textPanel);
        //toolBar.setToolBarListener(toolBarListener);

//        ----------------------------------------
//        activating components
        //activateComponents();

//        main actions

        setSize(700, 550); // dimensions of window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit on close
        setLocationRelativeTo(null); // center a window
        setVisible(true); // set visible
    }

    private void createComponentsMainFrame() {
        toolBar = new ToolBar();
        textPanel  = new TextPanel();
        formPanel = new FormPanel();

    }
}
