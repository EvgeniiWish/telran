package de.telran.lesson18;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String[] str = {"любая", "строка", "будет", "здесь", "любая"};


        String[] unique = eliminateDublicates(str);
        System.out.println(Arrays.toString(unique));
    }

    private static String[] eliminateDublicates(String[] strArray) {
        String[] noDoubles = new String[strArray.length];

        int i = 0;
        for (String s : strArray) {
            if (isContains(noDoubles, s)) continue;
            noDoubles[i] = s;
            i++;
        }
        return Arrays.copyOfRange(noDoubles, 0, i);
    }


    private static boolean isContains(String[] strArray, String findMe) {
        for (String s : strArray) {
            if (s == findMe) return true;
        }
        return false;
    }
}
