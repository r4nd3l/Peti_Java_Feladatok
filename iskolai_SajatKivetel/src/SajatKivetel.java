// SajatKivetel.java
// import extra.*;

import java.util.Scanner; // kénytelenek voltunk ezt használni, mert a Console package már outdated

// Saját kivételosztály:
class OutOfRangeException extends RuntimeException {

  OutOfRangeException(String s) {
    super(s);
  }
}

public class SajatKivetel {

  static int readSzam(int tol, int ig) {
    // mintát használ arra, hogy miként tegye feltétbe a bevitt számot
    if (tol > ig) {
      int seged = tol;
      tol = ig;
      ig = seged;
    }
    int szam;

    // try overall kellett ide mivel kellett a Scanner custom method hogy lefusson a nextLine() method a readLine() method  helyett mivel az is "lejárt"
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          // NumberFormatException keletkezhet:
          System.out.println("Szám: ");

          // itt a prase leszűri a bevitt számot hogy egyáltalán szám?
          szam = Integer.parseInt(scanner.nextLine()); //1
          if (szam < tol || szam > ig) throw new OutOfRangeException(
            tol + "-től " + ig + "-ig!"
          ); //2

          // visszadja/visszafelé a bevitt számot
          return szam;
        } catch (NumberFormatException ex) { // try
          System.out.println("Illegális karakter!");
        } catch (OutOfRangeException ex) {
          System.out.println(ex.getMessage());
        }
      } // while
    }
  }

  public static void main(String args[]) {
    int lottoSzam = readSzam(0, 90); // eredeti az 1 - 90

    System.out.println(lottoSzam); // kiegészítés
    System.out.println("OK");
  }
}
