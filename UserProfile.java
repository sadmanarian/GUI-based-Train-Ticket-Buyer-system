import javax.swing.*;

public class UserProfile {
    public UserProfile() {
        JFrame frame = new JFrame("User Profile");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("User Profile");
        label.setBounds(150, 20, 200, 30);

        JTextField nameField = new JTextField("Name: John Doe");
        nameField.setBounds(100, 60, 200, 30);

        JButton updateButton = new JButton("Update Profile");
        updateButton.setBounds(150, 120, 150, 30);
        updateButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Profile Updated");
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(nameField);
        panel.add(updateButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
