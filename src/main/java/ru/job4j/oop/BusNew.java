package ru.job4j.oop;

public class BusNew implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }

    @Override
    public void go() {
        System.out.println("Скорость " + getClass().getSimpleName() + " составляет 86 км/ч");
    }
}
