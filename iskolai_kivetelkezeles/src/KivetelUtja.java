// KivetelUtja.java

public class KivetelUtja{ // App.java

    // Ez a default/gyári beállítás azaz main objektum
    public static void main(String[] args){
        m1();
    }

    // custom objektum
    static void m1(){

        // ez a "Masik.java" fájl kéne, hogy legyen, amit ez előző példánkból mutattam By Mate :D
        // Masik a = new Masik();

        // itt a "Masi." ez az alatta lévő osztály(class)-ból van behívva!
        Masik.m2();
        // Masik.m3();
    }

}


// másik osztály
class Masik {
    static void m2() {
        // java.lang.RuntimeException: Rosszalkodás
        throw new RuntimeException("Rosszalkodás");

        // Java RuntimeException default mindenféle paraméter nélkül! Tehát semmit sincs a "" között
        // throw new RuntimeException();


    }

    // static void m3() {
    //     throw new RuntimeException("B*meg!");
    // }
}


