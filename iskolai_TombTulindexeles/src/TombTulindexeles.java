// TombTulindexeles.java
public class TombTulindexeles {

  // static int[] metodusA() {
  static void metodusA() {
    // itt az int[] egy üres tömb []
    int[] egeszek = new int[5]; // itt van egy tömböm amiben egy 5-ös van
    egeszek[5] = 12;
    // Hoppá! Túlindexelés!
    // Ide már nem jut el a vezérlés:
    // System.out.println("Minden rendben a metodusA-ban.");
    // return egeszek;
  }

  public static void main(String args[]) {
    metodusA();
    // Ide már nem jut el a vezérlés:
    System.out.println("Minden rendben a main-ben."); // azért nem lesz minden mivel az előtte lévő metodusA() nem fut le a túlindexelés miatt és már ott megakad a metódus ezért az alatt levő 16. sor már nem fut le!
  }
}
