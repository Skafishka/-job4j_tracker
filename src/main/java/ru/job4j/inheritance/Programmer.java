package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private static String school;

    public Programmer(String name, String surname, String education, String birthday, int age, String school) {
        super(name, surname, education, birthday);
        this.school = school;
    }

    public static String getSchool() {
        return school;
    }

    public static void main(String[] args) {
        System.out.println(getExperience());
        System.out.println(getName());
        System.out.println(getSchool());
    }
}
