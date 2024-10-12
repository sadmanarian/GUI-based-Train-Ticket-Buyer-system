import javax.swing.*;

public class TransactionHistory {
    public TransactionHistory() {
        JFrame frame = new JFrame("Transaction History");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Transaction History");
        label.setBounds(120, 20, 200, 30);

        JTextArea historyArea = new JTextArea("Payment: $100 - Train 1\nPayment: $50 - Train 2");
        historyArea.setBounds(50, 60, 300, 150);
        historyArea.setEditable(false);

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 220, 100, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(historyArea);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
