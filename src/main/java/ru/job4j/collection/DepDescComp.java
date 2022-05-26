package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] rslO1 = o1.split("/", o1.length());
        String[] rslO2 = o2.split("/", o2.length());
        if (rslO1.length == rslO2.length) {
            for (int i = rslO1.length - 1; i > 0; i--) {
                int w = rslO2[i].compareTo(rslO1[i]);
                if (w != 0) {
                    return rslO1[i].compareTo(rslO2[i]);
                }
            }
        }
        return Integer.compare(rslO1.length, rslO2.length);
    }
}

