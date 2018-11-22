package Greenfox.week04.AircraftCarrier;

public class Aircraft {

  enum Model { F14, Su33, F35}

  private int baseDamage;
  private int maxAmmo;
  private int currentAmmo;
  private Model type;

  Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.currentAmmo = 0;
  }

  public void setType(Model type) {
    this.type = type;
  }

  public Model getType() {
    return type;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public String getStatus() {
    return "Type " + getClass().getSimpleName()
        + ", Ammo: " + currentAmmo
        + ", Base dmg: " + baseDamage
        + ", All dmg: " + (currentAmmo * baseDamage);
  }

  public int fight() {
    int allDamage = this.currentAmmo * this.baseDamage;
    this.currentAmmo = 0;
    return allDamage;
  }

  public int refill(int fillAmmo) {
    int currentAmmo = this.currentAmmo;
    this.currentAmmo = this.maxAmmo;
    return fillAmmo - (this.maxAmmo - currentAmmo);
  }

  public boolean isPriority() {
    if (getType() == Model.F35) {
      return true;
    } else {
      return false;
    }
  }

}
