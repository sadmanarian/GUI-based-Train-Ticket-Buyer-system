import javax.swing.*;

public class RemoveTrain {
    public RemoveTrain() {
        JFrame frame = new JFrame("Remove Train");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Remove Train");
        label.setBounds(150, 20, 200, 30);

        JTextField trainIdField = new JTextField("Train ID");
        trainIdField.setBounds(100, 60, 200, 30);

        JButton removeButton = new JButton("Remove Train");
        removeButton.setBounds(150, 120, 100, 30);
        removeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Train Removed");
            frame.dispose();
            new AdminPanel();
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 220, 80, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new AdminPanel();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(trainIdField);
        panel.add(removeButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
