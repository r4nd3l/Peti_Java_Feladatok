public class Radio extends ElekromosEszkozok {

  public Radio(boolean isOn, String brand) {
    super(isOn, brand);
  }

  public void ListenRadio() {
    if (isOn()) {
      System.err.println("Listening to the Radio");
    } else {
      System.err.println("Radio is switched off, switch it on first.");
    }
  }
}
