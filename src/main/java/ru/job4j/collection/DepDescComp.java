package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] rslO1 = o1.split("/", o1.length());
        String[] rslO2 = o2.split("/", o2.length());
        int rsl = rslO2[0].compareTo(rslO1[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}

