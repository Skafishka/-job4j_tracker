package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public static int minus(int q) {
        return q - x;
    }

    public int divide(int w) {
        return w / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int e) {
        return Calculator.sum(e) + Calculator.minus(e) + divide(e) + multiply(e);
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
