import javax.swing.*;

public class ViewBookings {
    public ViewBookings() {
        JFrame frame = new JFrame("View Bookings");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Your Bookings");
        label.setBounds(150, 20, 200, 30);

        JTextArea bookingsArea = new JTextArea("Booking 1: Train 1 - Seat 23A\nBooking 2: Train 2 - Seat 14B");
        bookingsArea.setBounds(50, 60, 300, 150);
        bookingsArea.setEditable(false);

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 220, 100, 30);
        backButton.addActionListener(e -> {
            frame.dispose();
            new Dashboard();
        });

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.add(bookingsArea);
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
