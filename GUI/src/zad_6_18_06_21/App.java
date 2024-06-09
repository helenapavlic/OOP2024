package zad_6_18_06_21;

import zad_6_18_06_21.view.PlayerFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayerFrame();
            }
        });

    }
}
