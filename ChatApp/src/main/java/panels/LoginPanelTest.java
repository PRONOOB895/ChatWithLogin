package panels;

import javax.swing.*;

public class LoginPanelTest {
    public JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton signUpButton;
    private JPanel mainPanel;
    private JPanel loginPanel;
    private JPanel buttonsPanel;
    private JPanel passwordPanel;
    private JPanel usernamePanel;
    private JLabel passwordLabel;
    private JLabel usernameLabel;

    public LoginPanelTest(JFrame frame) {
        loginButton.addActionListener(e -> {
            
        });

        signUpButton.addActionListener(e -> {
            frame.setContentPane(new SignUpPanel().panel);
            frame.validate();
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
