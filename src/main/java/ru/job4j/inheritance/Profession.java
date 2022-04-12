package ru.job4j.inheritance;

public class Profession {
    private static String name;
    private static String surname;
    private static String education;
    private static String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public static String getName() {
        return name;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getEducation() {
        return education;
    }

    public static String getBirthday() {
        return birthday;
    }
}
