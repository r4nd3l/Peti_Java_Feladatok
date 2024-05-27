public class Main {

  public static void main(String[] args) {
    Radio radio = new Radio(false, "Sony");
    radio.switchOn();
    radio.ListenRadio();

    TV tv = new TV(false, "Samsung");
    tv.switchOn();
    tv.WatchTV();
  }
}
