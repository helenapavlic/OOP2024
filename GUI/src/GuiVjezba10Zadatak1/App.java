package GuiVjezba10Zadatak1;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame(); // call to main frame
            }
        });


    }
}
