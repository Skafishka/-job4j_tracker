package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    public String nameCheese() {
        return " plus extra cheese";
    }

    @Override
    public String name() {
        return super.name() + nameCheese();
    }
}
