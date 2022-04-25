package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public void passangers(int number) {

    }

    @Override
    public int gas(int volume) {
        int priceperLiter = 0;
        return priceperLiter * volume;
    }
}
