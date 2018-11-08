package Greenfox.week02;
import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
        System.out.println(makingMatches(girls, boys));
//        ArrayList<String> makingMatches = new ArrayList<String>(girls);
//        girls.addAll(boys);
//        Collections.sort(makingMatches);
//        System.out.println(makingMatches);
//        WTF?!
    }
    public static ArrayList<String> makingMatches(ArrayList<String> girlsNames, ArrayList<String> boysNames) {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < girlsNames.size() && i < boysNames.size(); i++) {
            output.add(girlsNames.get(i) + "," + boysNames.get(i));
        }
        return output; }
}
