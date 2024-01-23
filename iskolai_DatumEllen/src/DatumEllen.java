import java.util.*;

public class DatumEllen {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int ev, ho, nap = 0; // kezdeti változók üresek

    try {
      // Év bekérése
      System.out.println("Kérek egy évszámot (1900 és 2024 között): ");
      ev = scanner.nextInt();
      if (ev < 1900 || ev > 2024) { // negált művelete (ellentétse) a return miatt
        System.out.println("Hibás évszám, a program véget ért!");
        return;
      }

      // Hónap bekérése
      System.out.println("Kérek egy hónapot (1 és 12 között): ");
      ho = scanner.nextInt();
      if (ho < 1 || ho > 12) { // negált művelete (ellentétse) a return miatt
        System.out.println("Hibás hónap, a program véget ért!");
        return;
      }

      // Nap bekérése
      System.out.println("Kérek egy napot: ");
      nap = scanner.nextInt();
      if (nap < 1 || nap > 31) { // negált művelete (ellentétse) a return miatt
        System.out.println("Hibás hónap, a program véget ért!");
        return;
      }
      // Érvényes dátum kiírása
      System.out.println("Érvényes dátum: " + ev + " - " + ho + " - " + nap);
    } catch (Exception esemeny) {
      System.out.println("Hiba keletkezett kiírásban: " + esemeny.getMessage());
    } finally {
      System.out.println("A dátum megadása végetért!");
      scanner.close();
    }
  }
}
