import javax.swing.*;

public class CancelTicket {
    public CancelTicket() {
        JFrame frame = new JFrame("Cancel Ticket");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Cancel Ticket");
        label.setBounds(150, 20, 200, 30);

        JTextField ticketField = new JTextField("Ticket ID");
        ticketField.setBounds(100, 60, 200, 30);

        JButton cancelButton = new JButton("Cancel Ticket");
        cancelButton.setBounds(150, 120, 100, 30);
        cancelButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Ticket Canceled");
            frame.dispose();
            new Dashboard();
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
        panel.add(ticketField);
        panel.add(cancelButton);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
