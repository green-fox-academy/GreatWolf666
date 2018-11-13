package Animal;

public class Animal {
    int hunger = 50;
    int thirst = 50;

    public int eat () {
        return this.hunger -=1;
    }
    public int drink (){
        return this.thirst -=1;
    }
    public void play (){
        this.hunger ++;
        this.thirst ++;
    }


}
