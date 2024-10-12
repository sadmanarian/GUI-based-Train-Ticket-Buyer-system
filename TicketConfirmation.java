import javax.swing.*;

public class TicketConfirmation {
    public TicketConfirmation() {
        JFrame frame = new JFrame("Ticket Confirmation");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Ticket Confirmed");
        label.setBounds(150, 20, 200, 30);

        JTextArea ticketDetails = new JTextArea("Name: John Doe\nTrain: Train 1\nSeat: 23A");
        ticketDetails.setBounds(50, 60, 300, 100);
        ticketDetails.setEditable(false);

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 200, 100, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(ticketDetails);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
