public class Alapok_01 {
    public static void main(String[] args){

        String name = "Peti";
        String password = "Alma";
        System.out.println("Hello, World! Mario"); 
        System.out.println(name.toUpperCase()); 

        // buta példa arra, hogyan Ne láncold a dolgoakt, kimarad a "toLowerCase()" metódus
        System.out.println(name.toLowerCase().length());

        // másik Java-ba "intergrált" metódus "length()"
        System.out.println(name.length());

        // PL akkor lehet fontos az hogy "megszámold" karaktereket, ha kritéroum, az hogy minimum 4 karakter legyen az adott "jelszó"
        System.out.println(password.length());

    }
}
