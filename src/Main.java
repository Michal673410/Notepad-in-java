import javax.swing.*;

public class Main {
    public Window window = new Window();
    public label_and_text label_and_text = new label_and_text();
    public Buttons buttons = new Buttons();

    public void main(String[] args) {
        label_and_text.Help_gui(window);
        label_and_text.Text(window);
        buttons.button_clicked(window, label_and_text.text);
        window.create_window();

    }
}
