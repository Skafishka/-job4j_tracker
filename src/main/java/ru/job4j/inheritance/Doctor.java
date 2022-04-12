package ru.job4j.inheritance;

public class Doctor extends Profession {
    private static String diagnosis;

    public Doctor(String name, String surname, String education, String birthday, String diagnosis) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
    }

    public static String getDiagnosisheal() {
        return diagnosis;
    }
}
