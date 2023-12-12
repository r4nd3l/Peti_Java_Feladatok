// EllenorzottDobas.java
import java.io.*;

// "EllenorzottDobas" megnevezve fogja visszadni amint hiba helye mitn osztály
public class EllenorzottDobas {

  // 2. objektum
  // illetve ez a "metódusfej"
  static void metodusA() throws IOException { // mivel a "throws" itt dobja tovább az ősei avagy felfelé a hibát mivel kikerüli a throws
    throw new IOException();
    // throw new IOException("Számot kérek!");
  }

  // 1. objektum mivel ez a main
  public static void main(String args[]) throws IOException { // ugyan ez itt is
    metodusA();
  }
}
