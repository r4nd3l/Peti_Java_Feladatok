import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class NegyKeret {

  public static void main(String[] args) {
    // SwingUtilities a Java sming könyvtárából meghívva
    SwingUtilities.invokeLater(() -> {
      // Beállítjuk a keretek méretét mint valós értékek
      createFrame("Elso keret", 0, 0, 0.5, 0.5);
      createFrame("Masodik keret", 0, 0, 0.5, 0.5);
      createFrame("Harmadik keret", 0, 0, 0.5, 0.5);
      createFrame("Negyedik keret", 0, 0, 0.5, 0.5);
    });
  }

  // Átrakjuk a paraméterekre értve az értékeket
  private static void createFrame(
    String title,
    double x,
    double y,
    double width,
    double height
  ) {
    JFrame frame = new JFrame(title); // Megadjuk a címét az ablknak/ablakoknak

    // kikalkuláljuk a pozicíókatés a méretket a képrnyeőnknek
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int) screensize.getWidth();
    int screenHeight = (int) screensize.getHeight();
    int frameWidth = (int) (screenWidth * width);
    int frameHeight = (int) (screenHeight * height);
    int frameX = (int) (screenWidth * x);
    int frameY = (int) (screenHeight * y);

    // Megnyitva az ablkaot a képernyő széleségét átadva
    frame.setBounds(frameX, frameY, frameWidth, frameHeight);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // show() function helyett inkább event-et használva nyutjuk meg az ablakokat
    frame.addWindowListener(
      new WindowAdapter() {
        // Force-olt típus átugrás @Override
        @Override
        public void windowClosed(WindowEvent e) {
          // Ablak bezárásnál méretet is kivesszük
          if (JFrame.getFrames().length == 0) {
            System.exit(0);
          }
        }
      }
    );

    // ellenkezőleg pedig megnyitjuk az ablakokat
    frame.setVisible(true);
  }
}
