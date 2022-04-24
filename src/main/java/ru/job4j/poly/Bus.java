package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {

    }

    @Override
    public int passangers(int number) {
        return number;
    }

    @Override
    public int gas(int volume) {
        int priceperLiter = 0;
        return priceperLiter * volume;
    }
}
