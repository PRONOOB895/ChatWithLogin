import panels.LoginPanelTest;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        add(new LoginPanelTest().panel);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
