// outdated a feladat és verzió, "Console.readLine()" már nem támogatott

import java.util.Scanner;

public class Kezeles {

  public static void main(String args[]) {
    int szam;
    boolean ok = false;
    Scanner scanner = new Scanner(System.in);

    do {
      try {
        System.out.print("Egész szám: ");
        String str = scanner.nextLine();
        // NumberFormatException lehetséges:
        szam = Integer.parseInt(str);
        // Ide csak siker esetén kerül a vezérlés:
        ok = true;
        System.out.println("OK");
      } catch (NumberFormatException ex) {
        System.out.println("Még egyszer! ");
      }
    } while (!ok);

    scanner.close();
  }
}
