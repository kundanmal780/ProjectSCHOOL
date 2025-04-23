import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {

    public MyGUI() {
        setTitle("ProjectSCHOOL");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("Name:");
        JLabel label2 = new JLabel("Age:");

        JTextField nameField = new JTextField(20);
        JTextField ageField = new JTextField(10);

        panel.add(label1);
        panel.add(nameField);
        panel.add(label2);
        panel.add(ageField);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyGUI().setVisible(true));
    }
}
