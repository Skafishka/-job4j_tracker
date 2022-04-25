package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Поехали!");
    }

    @Override
    public void passangers(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public int gas(int volume) {
        int priceperLiter = 0;
        return priceperLiter * volume;
    }
}
