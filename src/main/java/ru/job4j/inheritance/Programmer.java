package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String school;

    public Programmer() {
    }

    public Programmer(String name, String surname, String education, String birthday, int age, String school) {
        super(name, surname, education, birthday);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.getExperience());
        System.out.println(programmer.getName());
        System.out.println(programmer.getSchool());
    }
}
