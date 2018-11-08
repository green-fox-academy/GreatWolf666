package Greenfox.week02;

import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }
    public static void checkNums(ArrayList<Integer> inList) {
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        boolean trueFalse = false;

        if (inList.containsAll(newList)) {
            trueFalse = true;
        } else {
            trueFalse = false;
        }

        System.out.println(trueFalse);
    }
}