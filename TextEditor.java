import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextEditor extends JFrame implements ActionListener {

    JTextArea textArea;

    public TextEditor() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(600, 700);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null); // Centers the window

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(450, 450));

        this.add(textArea);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // You can add button logic here later
    }
}
