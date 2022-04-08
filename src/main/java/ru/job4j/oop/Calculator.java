package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        y += x;
        return y;
    }

    public static int minus(int q) {
        q -= x;
        return q;
    }

    public int divide(int w) {
        w = w / x;
        return w;
    }

    public int multiply(int a) {
        a = x * a;
        return a;
    }

    public int sumAllOperation(int e) {
        e = Calculator.sum(e) + Calculator.minus(e) + divide(e) + multiply(e);
        return e;
    }

        public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(5);
        System.out.println(sum);
        int minus = minus(5);
        System.out.println(minus);
        int divide = calculator.divide(5);
        System.out.println(divide);
        int multiply = calculator.multiply(5);
        System.out.println(multiply);
        int all = calculator.sumAllOperation(5);
        System.out.println(all);
    }
}
