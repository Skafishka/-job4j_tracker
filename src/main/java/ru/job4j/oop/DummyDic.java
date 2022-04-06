package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String word = eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic engword = new DummyDic();
        String sentence = engword.engToRus("hello");
        System.out.println("Неизвестное слово. " + sentence);
    }
}
