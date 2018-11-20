package Greenfox.week04.AircraftCarrier;

import java.util.List;

public class Carrier {
  private List<Aircraft> listOfAircraftCarried;
  private int ammoStorage;
  private int health;


  Carrier(int ammoToFill, int maxHealth) {
    int listOfAircraftCarried = 0;
    this.ammoStorage = ammoToFill;
    this.health = maxHealth;
  }

  public void add(Aircraft aircraftToAdd) {
    listOfAircraftCarried.add(aircraftToAdd);
  }

  public int calculateDamageOfCarrier() {
    int damageOfCarrier = 0;
    for (Aircraft aircraft : listOfAircraftCarried) {
      damageOfCarrier += aircraft.getAmmo() * aircraft.getBaseDamage();
    }
    return damageOfCarrier;
  }

  public String getStatus() {
    return "HP: " + health + ", Aircraft count: " + listOfAircraftCarried.size()
        + ", Ammo Storage: " + ammoStorage + ", Total dmg: " + calculateDamageOfCarrier();
  }

  public void fill() {
    if (ammoStorage == 0) {
      System.out.println("Armoury dry!");
    } else {
      for (Aircraft aircraft : listOfAircraftCarried) {
        aircraft.refill(ammoStorage);
        ammoStorage = ammoStorage - (ammoStorage - aircraft.refill(ammoStorage));
      }
    }
  }

  public void fight(Carrier fightWith) {
    fightWith.health -= this.calculateDamageOfCarrier();
  }
}
