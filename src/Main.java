import javax.swing.*;

public class Main {
    public static Window window = new Window();
    public static label_and_text label_and_text = new label_and_text();
    public static void main(String[] args) {
        label_and_text.Help_gui(window);
        label_and_text.Text(window);
        window.create_window();
    }
}
