import javax.swing.*;

public class Login {
    public Login() {
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(150, 50, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(e -> {
            
            JOptionPane.showMessageDialog(frame, "Login Successful");
            frame.dispose();
            new Dashboard();
        });

        
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 200, 100, 30);
        registerButton.addActionListener(e -> {
            frame.dispose();
            new Register();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(registerButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
