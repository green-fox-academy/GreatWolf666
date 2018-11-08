package Greenfox.week02;

import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        for (String word: list) {
            System.out.print(word + " ");
        }
        // Expected output: "What I cannot create I do not understand."

    }
    public static ArrayList<String> quoteSwap(ArrayList<String>swaplist){
        Collections.swap(swaplist, 2, 5);

        String quote = "";

        for (String words : swaplist
        ) {
            quote += words + "";
        }
        return swaplist;
        }
    }
