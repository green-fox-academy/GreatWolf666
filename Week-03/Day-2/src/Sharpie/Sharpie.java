package Sharpie;

public class Sharpie {
    String color;
    double width = (float) 1.5 ;
    int inkAmount = 100;

    public int use(){
        return this.inkAmount -=1;
    }
}
