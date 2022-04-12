package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private static String clinic;

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis) {
        super(name, surname, education, birthday, diagnosis);
        this.clinic = clinic;
    }

    public static String getClinic() {
        return clinic;
    }

    public static void main(String[] args) {
        System.out.println(getDiagnosisheal());
        System.out.println(getClinic());
    }
}
