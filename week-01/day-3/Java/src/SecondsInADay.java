public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsSpent = 51666;
        int secondsInADay = 86400;

        System.out.println("The number of remaining seconds is " + secondsInADay % secondsSpent);


    }
}
