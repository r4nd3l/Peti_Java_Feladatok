Ez a Java kód egy egyszerű példa arra, hogyan terjednek el a kivételek a hívási láncban. Nézzük meg részleteiben:

A `KivetelUtja` osztály tartalmazza a `main` metódust, ami a program belépési pontja. Ez a metódus hívja a `m1` statikus metódust.

```java
public class KivetelUtja {
    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        Masik.m2();
    }
}
```

A `Masik` osztályban található `m2` metódus egy `RuntimeException` kivételt dob a "Rosszalkodás" üzenettel.

```java
class Masik {
    static void m2() {
        throw new RuntimeException("Rosszalkodás");
    }
}
```

Amikor a `main` metódus meghívja a `m1` metódust, az pedig a `Masik.m2()`-t hívja, a program futása során egy `RuntimeException` kivétel keletkezik a `m2` metódusban. Mivel ezt a kivételt nem kezelik a programban, a kivétel visszakerül a hívási láncban felfelé, egészen addig, amíg valahol nem kezelik vagy a program futása megszakad.

Ebben az esetben a kivétel nem keletkezik közvetlenül a `main` metódusban, hanem a `Masik.m2()` hívás során. A kivétel terjedése a hívási láncban azt jelenti, hogy a kivétel továbbítódik azon metódusok során, ahol nincs megfelelő kezelése. Ha nem kezelik a `RuntimeException`-t a hívási lánc bármely pontján, akkor a kivétel eléri a Java futási környezetet, ami megállítja a program futását, és a hibajelentést jeleníti meg a kivétel részleteivel.

Ez a kód tehát egy példa arra, hogy hogyan keletkezik és terjed egy kivétel a hívási láncban, ha az adott kivételt nem kezelik megfelelően a programban.

Eredménye a konzolban:

```bash
java.lang.RuntimeException: Rosszalkodás
    at Masik.m2(KivetelUtja.java:4)
    at KivetelUtja.m1(KivetelUtja.java:10)
    at KivetelUtja.main(KivetelUtja.java:13)
Exception in thread "main"
```

![A kivétel útja](/images/exepction_path.png)
