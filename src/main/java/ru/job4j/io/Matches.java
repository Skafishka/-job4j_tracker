package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            boolean ok = matches > 0 && matches <= 3 && matches <= count;
            if (ok) {
                count -= matches;
                System.out.println("Осталось " + count + " спичек!");
                turn = !turn;
            } else {
                System.out.println("Введите корректное число от 0 до 3 или до числа оставшихся спичек!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }

    }
}
