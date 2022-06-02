package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLoading {
    public static void main(String[] args) {
        String[] names = {
                "Ivan"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthCmp);

        String[] namesAgain = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthCmpAgain = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(namesAgain, lengthCmpAgain);
    }
}
