package ru.job4j.pojo;

public class Shop {
    private static int y = -1;

    public static int indexOfNull(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                y = i;
                break;
            }
        }
    return y;
    }

}