package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    public String extraCheese() {
        return " and additionally tomato";
    }

    @Override
    public String name() {
        return super.name() + extraCheese();
    }
}
