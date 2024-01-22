public class Indexeles {

  public static void main(String[] args) {
    // Példa tömb létrehozása
    int[] tomb = { 1, 2, 3, 4, 5 };

    // Példa metódus hívása, ami kezeli az esetleges kivételt
    kezelIndexOutOfBounds(tomb, 7); // 7. indexet próbáljuk elérni, pedig csak 0-4 indexig vannak elemek
  }

  // Metódus, ami kezeli az ArrayIndexOutOfBoundsException kivételt
  private static void kezelIndexOutOfBounds(int[] tomb, int index) {
    try {
      // Próbáljuk meg elérni az adott indexű elemet a tömbben
      int elem = tomb[index];
      System.out.println("A tömb " + index + ". indexén lévő elem: " + elem);
    } catch (ArrayIndexOutOfBoundsException e) {
      // Kezeljük a kivételt, és írjuk ki a megfelelő üzenetet
      System.out.println("Ejnye-bejnye, indexelj már rendesen!");
    }

    // Ezen a ponton a program folytatódik, akár volt kivétel, akár nem
    System.out.println("A program tovább folytatódik...");
  }
}
