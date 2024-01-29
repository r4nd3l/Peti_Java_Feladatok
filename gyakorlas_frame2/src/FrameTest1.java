import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;

public class FrameTest1 {

  public static void main(String args[]) {
    // Graphical User Interface
    createAndShowGUI();
  }

  private static void createAndShowGUI() {
    // Komponensek deklarálása:
    JFrame fr;
    JLabel lbInfo;
    JButton btOk, btNemOk;
    JTextField tfLink;

    // A csupasz keret létrehozása:
    fr = new JFrame();

    // Cím, pozíció és méret megadása:
    fr.setTitle("Frame-teszt");
    fr.setBounds(100, 50, 300, 100);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Tartalompanel kikérése:
    Container cp = fr.getContentPane();

    // Tartalompanel elrendezésmenedzserének beállítása:
    cp.setLayout(new FlowLayout());

    // Komponensek létrehozása:
    lbInfo = new JLabel("Döntsd el:");
    btOk = new JButton("OK");
    btNemOk = new JButton("Nem OK");
    tfLink = new JTextField(20);
    JButton btOpenLink = new JButton("Link megnyitása");

    // Esemény figyelése a leink megnyitására
    btOpenLink.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          openLink(tfLink.getText());
        }
      }
    );

    // Komponensek beillesztése a tartalompanelbe:
    cp.add(lbInfo);
    cp.add(btOk);
    cp.add(btNemOk);
    cp.add(tfLink);
    cp.add(btOpenLink);

    // A keret láthatóvá tétele:
    fr.setVisible(true);
  }

  private static void openLink(String link) {
    try {
      Desktop.getDesktop().browse(new URI(link));
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(
        null,
        "Hiba történt a link megnyitása közben!"
      );
    }
  }
}
