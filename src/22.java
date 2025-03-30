import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JPanel implements ActionListener {
    private JButton button1 = new JButton("Click Me!");
    private JTextArea textBox = new JTextArea();

    public SimpleGUI() {
        this.setLayout(new BorderLayout());
        this.add(button1, BorderLayout.SOUTH);
        this.add(textBox, BorderLayout.CENTER);

        button1.addActionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.button1.draw(g);
        this.textArea.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String message = "You clicked the button!";
            textBox.setText(message);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        SimpleGUI gui = new SimpleGUI();
        frame.add(gui);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
