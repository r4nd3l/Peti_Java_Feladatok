// NullOsztas.java
public class NullOsztas {

  public static void main(String args[]) {
    int osszeg = 200;
    int darab = 0; // Ha ez 10 lnne pl: int darab = 10; akkor simán lefut de csak a szöveg mint "Minden rendben" lesz kiíratva!

    // undefined lesz mert a nulla az megakasztja!

    // tört értékkel megy
    // double darab = 0.1;
    // itt a nullával való osztás nem fog feltétlelt igazolni, mivel nullával fogsz a valósz számok halmazában kapni elbírálható eredményt!

    // nem használt direkt
    // int darakba = 10;

    // int atlag = osszeg % darab; // Maradékos osztály a % jellel
    int atlag = osszeg / darab; // Hoppá! Nullával osztás!
    // itt már meg fog akadni a throw expection vagy error miatt, a többi alatta nem fog lefutni
    // int atlag = (int) (osszeg / darab); // Hoppá! Nullával osztás!
    // Ide már nem jut el a vezérlés:
    System.out.println("Minden rendben... lenne :D");
    // System.out.println("Sima osztás: " + atlag);
    // System.out.println("Az végeredmény: " + darakba);
  }
}
