package Greenfox.week04.theGarden;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants;
  ArrayList<Plant> needsWatering = new ArrayList<Plant>();

  public Garden(ArrayList<Plant> plants) {
    this.plants = plants;
  }

  private int fillWaterList() {
    int numberOfPlants = 0;
    needsWatering.clear();
    for (Plant plant : plants) {
      if (plant.needWater()) {
        needsWatering.add(plant);
        numberOfPlants++;
      }
    }
    return numberOfPlants;
  }
  public void watering(int amountOfWater){
// sorting and collecting unwatered plants
// calculate the amount of water for individual plants
// iterate through the list of unwatered plants
// call watering method on each plant
// iterate plants list, call get status
    double waterPerPlant;
    waterPerPlant = amountOfWater/fillWaterList();
   for (Plant plant : needsWatering){
     plant.watering(waterPerPlant);
   }

  }

  public void printStatus() {
    System.out.println();
    for (Plant plant : plants) {
      System.out.println(plant.getStatus());
    }
  }
}
