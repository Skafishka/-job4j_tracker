package ru.job4j.inheritance;

public class Engineer extends Profession {
    private static int age;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.age = age;
    }

    public static int getExperience() {
        return age;
    }
}
