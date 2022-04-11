package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int age;

    public Engineer() {
    }

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.age = age;
    }

    public int getExperience() {
        return age;
    }
}
