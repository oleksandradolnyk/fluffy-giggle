package Homework8_07_11;

import java.util.*;

public class Set_words {

    public static void main(String[] args) {

    String words = "масло, яйця, масло, ковбаса, молоко, курка, молоко, яйця, молоко, масло, пельмені, курка";
    strToSet(words);

}

    public static void strToSet(String string){

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(string.split(", ")));

        for (String y:hashSet) {
            String capital = y.substring(0, 1).toUpperCase() + y.substring(1).toLowerCase();
            System.out.println(capital); // output: Ковбаса Молоко Курка Масло Яйця Пельмені
        }

    }
}
