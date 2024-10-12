import javax.swing.*;

public class Register {
    public Register() {
        JFrame frame = new JFrame("Register");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 100, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(150, 100, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 150, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 150, 150, 30);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 200, 100, 30);
        registerButton.addActionListener(e -> {
            
            JOptionPane.showMessageDialog(frame, "Registration Successful");
            frame.dispose();
            new Login();  
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 270, 80, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Login();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(registerButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
