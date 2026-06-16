import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buttons {
    public void Save_file(Window window, String text)
    {
        try
        {
            int x = 1;
            String userdesktop = System.getProperty("user.home");
            File file = new File(userdesktop + File.separator + "Desktop" + File.separator + "text" + String.valueOf(x) + ".txt");
            if(file.exists()) x++;
            FileWriter filewriter = new FileWriter(userdesktop + File.separator + "Desktop" + File.separator + "text" + String.valueOf(x) + ".txt");
            filewriter.write(text);
            filewriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            System.out.println(e);
        }
    }
    public void Exit(Window window)
    {
        System.exit(0);
    }


    public void button_clicked(Window window, JTextArea jtextarea)
    {
        InputMap inputMap = jtextarea.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap actionMap = jtextarea.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("control X"), "Exit");
        actionMap.put("Exit", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Exit(window);
            }
        });

        inputMap.put(KeyStroke.getKeyStroke("control S"), "Save");
        actionMap.put("Save", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Save_file(window, jtextarea.getText());
            }
        });
    }
}
