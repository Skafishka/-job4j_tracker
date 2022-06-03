package ru.job4j.lambda;

import java.util.List;


public class DiapasonFuncCalc {
    public static void main(String[] args) {
        List<Double> diapason(int start, int end, Function<Double, Double> func) {
            return func.apply(start, end);
        };
    }

}
