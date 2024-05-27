public class ElekromosEszkozok {

  private boolean isOn;
  private String brand;

  public ElekromosEszkozok(boolean isOn, String brand) {
    this.isOn = isOn;
    this.brand = brand;
  }

  public boolean isOn() {
    return isOn;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void switchOn() {
    isOn = true;
  }

  public void switchOff() {
    isOn = false;
  }
}
