import javax.swing.*;

public class AdminPanel {
    public AdminPanel() {
        JFrame frame = new JFrame("Admin Panel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Admin Panel");
        label.setBounds(150, 20, 200, 30);

        JButton addTrainButton = new JButton("Add Train");
        addTrainButton.setBounds(120, 80, 150, 30);
        addTrainButton.addActionListener(e -> {
            frame.dispose();
            new AddTrain();
        });

        JButton removeTrainButton = new JButton("Remove Train");
        removeTrainButton.setBounds(120, 120, 150, 30);
        removeTrainButton.addActionListener(e -> {
            frame.dispose();
            new RemoveTrain();
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 200, 100, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(addTrainButton);
        panel.add(removeTrainButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
