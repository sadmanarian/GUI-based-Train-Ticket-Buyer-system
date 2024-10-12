import javax.swing.*;

public class BookTicket {
    public BookTicket() {
        JFrame frame = new JFrame("Book Ticket");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Book Your Ticket");
        label.setBounds(150, 20, 200, 30);

        JTextField nameField = new JTextField("Name");
        nameField.setBounds(100, 60, 200, 30);

        JButton bookButton = new JButton("Book");
        bookButton.setBounds(150, 120, 100, 30);
        bookButton.addActionListener(e -> {
            frame.dispose();
            new TicketConfirmation();
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
        panel.add(bookButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
