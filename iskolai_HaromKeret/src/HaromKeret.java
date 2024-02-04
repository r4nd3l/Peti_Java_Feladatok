import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class HaromKeret {

  // main-ben meghívunk példakomponenseket
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      createFrame("Első keret");
      createFrame("Második keret");
      createFrame("Harmadik keret");
    });
  }

  private static void createFrame(String title) {
    JFrame frame = new JFrame(title);
    JPanel panel = new JPanel(new GridLayout());

    // Tetszőleges komponensek hozzáadása a kerethez
    panel.add(new JButton("Button 1"));
    panel.add(new JLabel("Label 2"));
    panel.add(new JTextField("Text Field 3"));
    panel.add(new JCheckBox("CheckBox 4"));
    panel.add(new JTextArea("Textarea 5"));

    frame.add(panel);
    frame.setSize(400, 300);
    // Be lehet csukni
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    frame.addWindowListener(
      new WindowAdapter() {
        @Override
        public void windowClosed(WindowEvent e) {
          if (JFrame.getFrames().length == 0) {
            // Ha az utolsó keretet csujkák be, akkor a program futása befejeződött!!!!
            System.exit(0);
          }
        }
      }
    );

    frame.setVisible(true);
  }
}
