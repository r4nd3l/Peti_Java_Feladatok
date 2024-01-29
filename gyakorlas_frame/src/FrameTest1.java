import java.awt.*;
import javax.swing.*;

public class FrameTest1 {

  public static void main(String args[]) {
    // Komponensek deklarálása:
    JFrame fr;
    JLabel lbInfo;
    JButton btOk, btNemOk;
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
    // Komponensek beillesztése a tartalompanelbe:
    cp.add(lbInfo);
    cp.add(btOk);
    cp.add(btNemOk);
    // A keret láthatóvá tétele:
    fr.setVisible(true);
  } // main
} // FrameTest1
