# API a Java-ban

A Java API (Application Programming Interface) egy olyan gyűjtemény (szerkezetileg = Tömbök, Objektumok, Stringek, Integer) vagy könyvtár (ez lehet pl az Error vagy az Expections [throw illetve throws]), amely előre definiált osztályok (azaz Objektumok), interfészek, metódusok és eszközök halmaza, amelyeket a Java programozási nyelv használ. Az API-k lehetővé teszik a fejlesztők számára, hogy könnyebben és hatékonyabban fejlesszenek alkalmazásokat, mivel ezek a felületek meghatározzák, hogyan lehet kommunikálni a különböző komponensekkel és rendszerekkel.

A Java API két fő részből áll:

1. **Core API (Alap API):** Ez a Java nyelv beépített része, és tartalmazza az alapvető osztályokat és interfészeket, például a `java.lang`, `java.util`, `java.io` stb. Ezek az osztályok és interfészek segítenek a fájlok olvasásában, írásában, adatszerkezetek kezelésében, dátumok kezelésében és még sok másban (pl lenti webes példa).

2. **Extended API (Kiterjesztett API):** Ezek az API-k olyan kiegészítő funkciókat tartalmaznak, amelyek az alapvető Java könyvtárakon kívül vannak, például a Java EE (Enterprise Edition) vagy a JavaFX, amelyek specifikus funkciókat és eszközöket kínálnak az alkalmazásfejlesztéshez.

A Java API-k dokumentációval rendelkeznek, ami részletes információkat nyújt az egyes osztályok, metódusok és interfészek használatáról. A fejlesztők széles körű Java API-khoz férhetnek hozzá és használhatják ezeket az eszközöket az alkalmazásaik fejlesztéséhez, különféle funkciók és szolgáltatások megvalósításához.

> interfészek pl:

```Java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

"Webes API" .json (láncolatokkal hozzáférek)

[
"sounds": {
"wau": "dog",
}
]

animalSound(){
String wau = "" // ez a kutya hangja változó mint String
// data[0].sounds.wau
}
