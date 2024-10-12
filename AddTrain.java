import javax.swing.*;

public class AddTrain {
    public AddTrain() {
        JFrame frame = new JFrame("Add Train");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Add New Train");
        label.setBounds(150, 20, 200, 30);

        JTextField trainField = new JTextField("Train Name");
        trainField.setBounds(100, 60, 200, 30);

        JButton addButton = new JButton("Add Train");
        addButton.setBounds(150, 120, 100, 30);
        addButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Train Added");
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
        panel.add(trainField);
        panel.add(addButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
