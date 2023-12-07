// Java fájlnak az alap / meglévő osztálya és annak megnevezése
public class Alapok_03 {
    
    // Muszáj, hogy legyne egy alap "main" osztálynak, amivel dolgozunk
    public static void main(String[] args){

        String password = feedback("Alma");
        System.out.println(password); // Alma a Te jelszavad!
    }

    // egy alap sima osztály szerkezete
    // Ez most már egy metódus/funckió
    public static String feedback(String x){
        return x + " a Te jelszavad!";
    }
}
