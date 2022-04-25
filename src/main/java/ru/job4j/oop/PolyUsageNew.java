package ru.job4j.oop;

public class PolyUsageNew {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new BusNew();

        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
            a.go();
        }
    }
}
