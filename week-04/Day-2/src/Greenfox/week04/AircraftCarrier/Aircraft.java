package Greenfox.week04.AircraftCarrier;

public class Aircraft {
  private int baseDamage;
  private int maxAmmo;
  private int ammo;
  private String type;


  Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammo = 0;
  }

  public String getType() {
    return type;
  }

  protected void setType(String type) {
    this.type = type;
  }

  public int getAmmo() {
    return ammo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }
  public String getStatus(){
    return "Type " + getType() + " Ammo: " + ammo + ", Base damage: " + baseDamage + ", All damage: " + (ammo*baseDamage);
  }

  public int fight() {
    int allDamage = this.ammo * this.baseDamage;
    this.ammo = this.maxAmmo;
    return fillAmmo - (this.maxAmmo - currentAmmo);
  }

  public int refill(int fillAmmo) {
    int currentAmmo = this.ammo;
    this.ammo = this.maxAmmo;
    return fillAmmo;
  }

  public boolean isPriority() {
    if (this.type.equals("F14")) {
      return false;
    } else {
      return true;
    }
  }
}
