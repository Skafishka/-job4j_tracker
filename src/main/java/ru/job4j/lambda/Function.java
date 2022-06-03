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
 
    /*    func = (start1, end1) -> {
            start1 = Double.valueOf(start);
            end1 = Double.valueOf(end);
            while (end1 < start1) {
                rsl.add(end1 * 2 + 1);
                end1++;
            };
            return func.apply(rsl);
        };

    };

    /*   public static void main(String[] args) {
        List<Double> diapason (
                int start;
                int end;
                Function<Double, Double> func) {
            List<Double> rsl = new ArrayList<>();
            Runnable runnable = () -> {
                int start1 = start;
                int end1 = end;
                while (start1 <= end1) {
                    double f = 2 * start1 + 1;
                    rsl.add(f);

                }
            };
        };
        return func.apply(start, end); */

}


