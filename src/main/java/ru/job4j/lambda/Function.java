package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public List<Double> diapason(int start, int end, java.util.function.Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        while (start < end) {
            double start1 = start;
            rsl.add(func.apply(start1));
            start++;
        }
        return rsl;
    }
}


