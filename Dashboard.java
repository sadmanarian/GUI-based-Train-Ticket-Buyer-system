import javax.swing.*;

public class Dashboard {
    public Dashboard() {
        JFrame frame = new JFrame("Dashboard");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Dashboard");
        label.setBounds(150, 20, 100, 30);

        JButton viewTrainsButton = new JButton("View Trains");
        viewTrainsButton.setBounds(120, 80, 150, 30);
        viewTrainsButton.addActionListener(e -> {
            frame.dispose();
            new ViewTrains();
        });

        JButton bookTicketButton = new JButton("Book Ticket");
        bookTicketButton.setBounds(120, 120, 150, 30);
        bookTicketButton.addActionListener(e -> {
            frame.dispose();
            new BookTicket();
        });

        JButton transactionHistoryButton = new JButton("Transaction History");
        transactionHistoryButton.setBounds(120, 160, 150, 30);
        transactionHistoryButton.addActionListener(e -> {
            frame.dispose();
            new TransactionHistory();
        });

        JButton profileButton = new JButton("User Profile");
        profileButton.setBounds(120, 200, 150, 30);
        profileButton.addActionListener(e -> {
            frame.dispose();
            new UserProfile();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(viewTrainsButton);
        panel.add(bookTicketButton);
        panel.add(transactionHistoryButton);
        panel.add(profileButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
