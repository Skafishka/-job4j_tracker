package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] numberLeft = left.split(". ", 2);
        int numLeft = Integer.parseInt(numberLeft[0]);
        String[] numberRight = right.split(". ", 5);
        int numRight = Integer.parseInt(numberRight[0]);
        return Integer.compare(numLeft, numRight);
    }
}