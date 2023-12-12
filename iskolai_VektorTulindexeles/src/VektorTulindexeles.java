// VektorTulindexeles.java
import java.lang.reflect.Array;
import java.util.*;

public class VektorTulindexeles {

  public static void main(String args[]) {
    good(args); // a kövi objekt példája, mint behívás

    // A "Vector" egy nyers változó név illetve típus emiatt, teljesen értelmezhetetlenné teszi a program lefutását, típus nélküi olvasás
    Vector v = new Vector();
    v.get(); // ezt ki kéne kommentelni, ahhoz, hogy a good() metódus le tudjon futni
    // Hoppá! Nincs ilyen indexű elem!

  }

  public static void good(String[] args) {
    // Declaring and defining an int array
    int a[] = { 1, 2, 3, 4, 5 };

    // Traversing the array
    for (int i = 0; i < 5; i++) {
      // Array.get method
      // Note : typecasting is essential
      // as the return type in Object.
      int x = (int) Array.get(a, i);

      // Printing the values
      System.out.print(x + " ");
    }
  }
}
