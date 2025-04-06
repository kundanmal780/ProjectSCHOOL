import javax.swing.*;
import java.awt.*;

public class ProjectSCHOOL extends JFrame {
    public static void main(String[] args) {
        // Set up the frame
        setTitle("ProjectSCHOOL");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a JPanel for the user interface
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        // Create a JButton and add it to the panel
        JButton button = new JButton("Click me");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "You clicked the button!");
        });

        // Add the button to the panel
        panel.add(button);

        // Create a JTextField and set its text field
        JTextField textField = new JTextField(20);
        textField.setText("Enter some text here...");
        textField.addActionListener((e) -> {
            String input = textField.getText();
            System.out.println("You entered: " + input);
        });

        // Add the JTextFields to the panel
        panel.add(textField);

        // Create a JLabel and add it to the panel
        JLabel label = new JLabel("Here is some text:");
        panel.add(label);

        // Set up the frame content pane and add the panel and label
        this.getContentPane().add(panel);
        this.getContentPane().add(label, BorderLayout.SOUTH);

        // Make the window visible
        setVisible(true);
    }
}
