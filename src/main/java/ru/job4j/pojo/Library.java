package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("First", 20);
        Book second = new Book("Second", 14);
        Book third = new Book("Third", 19);
        Book cleanCode = new Book("Clean code", 15);
        Book[] massive = new Book[4];
        massive[0] = first;
        massive[1] = second;
        massive[2] = third;
        massive[3] = cleanCode;
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i].getName() + " - " + massive[i].getCount());
        }
        Book temp = massive[0];
        massive[0] = massive[3];
        massive[3] = temp;
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i].getName() + " - " + massive[i].getCount());
        }
        for (int i = 0; i < massive.length; i++) {
            if ("Clean code".equals(massive[i].getName())) {
                System.out.println(massive[i].getName());
            }
        }
    }
}
