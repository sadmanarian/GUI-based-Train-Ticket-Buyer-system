import javax.swing.*;

public class Payment {
    public Payment() {
        JFrame frame = new JFrame("Payment");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Payment");
        label.setBounds(150, 20, 200, 30);

        JTextField amountField = new JTextField("Amount");
        amountField.setBounds(50, 60, 300, 30);

        JButton payButton = new JButton("Pay Now");
        payButton.setBounds(150, 140, 100, 30);
        payButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Payment Successful");
            frame.dispose();
            new TransactionHistory();
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(10, 210, 80, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(amountField);
        panel.add(payButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
