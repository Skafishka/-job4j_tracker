package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String qualification;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        System.out.println(getSurname());
        System.out.println(getExperience());
    }
}
