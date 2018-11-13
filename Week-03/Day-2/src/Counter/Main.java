package Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.add(5);
        counter.add(15);
        counter.get();

        System.out.println(counter.get());

    }
}
