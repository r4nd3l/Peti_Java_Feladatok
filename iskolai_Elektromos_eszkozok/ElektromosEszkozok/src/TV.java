public class TV extends ElekromosEszkozok {

  public TV(boolean isOn, String brand) {
    super(isOn, brand);
  }

  public void WatchTV() {
    if (isOn()) {
      System.err.println("Watching TV");
    } else {
      System.err.println("TV is switched off, switch it on first.");
    }
  }
}
