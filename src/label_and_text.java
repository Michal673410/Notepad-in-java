import javax.swing.*;
import java.awt.*;

public class label_and_text {
    public JTextArea text = new JTextArea();
    public JLabel Help = new JLabel("^X - exit | ^S - save | ^O - color");

    public void Help_gui(Window window)
    {

        Help.setOpaque(true);
        Help.setForeground(Color.yellow);
        Help.setBackground(Color.black);
        Help.setBounds(0, -131, 600, 300);
        window.frame.add(Help);
    }
    public void Text(Window window)
    {

        text.setOpaque(true);
        text.setBackground(Color.black);
        text.setForeground(Color.yellow);
        text.setCaretColor(Color.red);
        text.setFont(new Font("Serif", Font.PLAIN, 25));
        text.setBounds(0, 50 , 2000, 1620);
        window.frame.add(text);
    }
}
