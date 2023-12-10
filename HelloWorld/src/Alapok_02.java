// Java fájlnak az alap / meglévő osztálya és annak megnevezése
public class Alapok_02 {

    // Muszáj, hogy legyne egy alap "main" osztálynak, amivel dolgozunk
    public static void main(String[] args){

        String password = "Alma";
        // System.out.println(password.toUpperCase());
        feedback(password);
    }

    // egy alap sima osztály szerkezete
    // Ez most már egy metódus/funckió
    public static void feedback(String x){
        System.out.println(x + " a Te jelszavad!");
    }
}
