package Counter;

public class Counter {
    int field;
    int initial;

    public Counter (int field) {
        this.field = field;
        this.initial = field;
    }
    public Counter (){
        this(0);
    }

    public void add(int number){
        field = field + number;
    }
    public void add(){
        field ++;
    }
    public int get(){
        return field;
    }
    public void reset(){
        this.field = this.initial;
    }
}
