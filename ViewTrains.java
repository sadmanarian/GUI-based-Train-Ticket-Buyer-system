import javax.swing.*;

public class ViewTrains {
    public ViewTrains() {
        JFrame frame = new JFrame("View Trains");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Available Trains");
        label.setBounds(150, 20, 200, 30);

        JTextArea trainsArea = new JTextArea("Train 1: City A to City B\nTrain 2: City C to City D");
        trainsArea.setBounds(50, 60, 300, 150);
        trainsArea.setEditable(false);

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 220, 100, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(trainsArea);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
