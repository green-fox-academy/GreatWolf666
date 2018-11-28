package Greenfox.week04.theGarden;

public class Plant {
  String color;
  double currentWaterLevel;
  int waterLimit;
  double efficiency;
  String type;

  public boolean needWater(){
    return currentWaterLevel < waterLimit;
  }

  public Plant(String color, int waterLimit, double efficiency, String type) {
    this.color = color;
    this.currentWaterLevel = 0;
    this.waterLimit = waterLimit;
    this.efficiency = efficiency;
    this.type = type;
  }
  public void watering(double water){
    this.currentWaterLevel = currentWaterLevel + (water * efficiency);
  }
 public String getStatus(){
    return "The " + color + " "+ type + " " + (needWater() ? " need " : " doesn't need ") + " water";
 }
}
