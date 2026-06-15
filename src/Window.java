import javax.swing.*;
import java.awt.*;


public class Window {
    JFrame frame = new JFrame("Notepad");

    public void create_window() {
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
