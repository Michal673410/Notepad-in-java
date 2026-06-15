import javax.swing.*;
import java.awt.*;

public class label_and_text {
    public static void Help_gui(Window window)
    {
        JLabel Help = new JLabel("^X - exit | ^S - save");
        Help.setOpaque(true);
        Help.setForeground(Color.yellow);
        Help.setBackground(Color.black);
        Help.setBounds(0, -131, 600, 300);
        window.frame.add(Help);
    }
    public static void Text(Window window)
    {
        JTextArea text = new JTextArea();
        text.setOpaque(true);
        text.setBackground(Color.black);
        text.setForeground(Color.yellow);
        text.setCaretColor(Color.red);
        text.setBounds(0, 50 , 1080, 1620);
        window.frame.add(text);
    }
}
