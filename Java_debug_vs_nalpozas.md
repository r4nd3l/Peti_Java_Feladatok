A Java-ban a debug és a logolás (naplózás) két különböző megközelítést jelent a hibakereséshez és a program működésének nyomon követéséhez.

**Debug:**

- A debug egy olyan folyamat, amelynek során a fejlesztő lépésről lépésre követheti a program futását, megnézheti és elemezheti a változók állapotát, valamint hibákat azonosíthat a kód logikájában vagy végrehajtásában.
- A Java fejlesztők általában debuggoló eszközöket használnak, mint például az IntelliJ IDEA, Eclipse, vagy NetBeans, hogy megállítsák a program futását bizonyos pontokon, ellenőrizzék a változók értékét, lépjenek át a kódon és egyéb műveleteket végezzenek a hibakeresés során.
- A debug hasznos eszköz a konkrét hibák azonosítására, a kód hibás részeinek feltárására és javítására.

**Logolás (Naplózás):**

- A logolás egy olyan módszer, amely során üzeneteket, információkat vagy hibajelentéseket rögzítenek egy naplófájlba vagy más kimeneti csatornába a program futása közben.

  - pl: `System.out.println("valami");`
  - pl: `return "valami";`

- A Java-ban gyakran a `java.util.logging` vagy más külső logolási keretrendszereket, például a Log4j, SLF4J, vagy Logback könyvtárakat használják a naplóbejegyzések kezelésére.
- A naplóbejegyzések segítenek a fejlesztőknek nyomon követni a program működését, megérteni, mi történik a háttérben, és azonosítani a futás során fellépő eseményeket vagy hibákat (`throw` illetve `throws`).

Összefoglalva, a debug egy interaktív folyamat, amely lehetővé teszi a fejlesztők számára a kód közvetlen ellenőrzését és hibakeresését futási időben, míg a logolás egy olyan technika, amely lehetővé teszi az információk rögzítését(!) a program futása során, ami segíthet az események nyomon követésében és az esetleges hibák azonosításában! Mindkét megközelítés fontos a hatékony hibakeresés és a programfejlesztés során.

példa: `java.util.logging`

```Java
# default file output is in user's home directory.
java.util.logging.FileHandler.pattern = %h/java%u.log
java.util.logging.FileHandler.limit = 50000
java.util.logging.FileHandler.count = 1
```
