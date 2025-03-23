import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JPanel panel;
    private JButton button1, button2;

    public MainFrame() {
        setTitle("ProjectSCHOOL");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the panel
        panel = new JPanel();
        add(panel);

        // Add buttons to the panel
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        // ActionListener for button1 action listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 clicked");
            }
        });

        // Add the buttons to the panel
        panel.add(button1);
        panel.add(button2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
