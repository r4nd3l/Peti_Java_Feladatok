package feladat;

import java.awt.*;

public class Dog {
    //Eset változók
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwner, int dogYears){//Sima zárojelek közé mennek
    breed = dogBreed;
    hasOwner = dogOwner;
    age = dogYears;
    }

     public static void main(String[] args) {
    System.out.println("Main method started ");
    Dog fido = new Dog("poodle", false, 4);
    Dog Muzio = new Dog("tacsi", true, 8);
    boolean older = fido.age > Muzio.age;
    int kozos = fido.age + Muzio.age;
    System.out.println(Muzio.age);
    System.out.println(older);
    System.out.println(kozos);

   /* System.out.println(fido);
    System.out.println(fido.age);
    System.out.println(fido.breed);
    System.out.println("This dog name is: " + fido.breed + "and its age is " + fido.age  );*/

    }
}
