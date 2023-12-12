// MestersegesNullOsztas.java
public class MestersegesNullOsztas {

  public static void main(String args[]) {
    // hasonlóképpen megy végbe a lefutás mint ha "java.lang.RuntimeException: Rosszalkodás" lenne, lecseréljük az eredeti gyári "/ by zero"
    throw new ArithmeticException("Osztogatunk nullával?"); // ez a szöveg bármi másis lehetne
  }
}
