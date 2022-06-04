package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public List<Double> diapason(int start, int end, java.util.function.Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (int i = start; start < end; start++) {
            rsl.add(func.apply((double) start));
        }
        return rsl;
    }
}


