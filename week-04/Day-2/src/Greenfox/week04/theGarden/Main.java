package Greenfox.week04.theGarden;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

// new garden object(2 trees, 2 flowers as parameters)
// call garden watering method(40 first, 70 second)
    ArrayList<Plant> plants = new ArrayList<Plant>();
    plants.add(new Flower("yellow"));
    plants.add(new Flower("blue"));
    plants.add(new Tree("purple"));
    plants.add(new Tree("orange"));

    Garden garden = new Garden(plants);
    garden.printStatus();
    garden.watering(40);
    garden.printStatus();
    garden.watering(70);
    garden.printStatus();
  }
}
