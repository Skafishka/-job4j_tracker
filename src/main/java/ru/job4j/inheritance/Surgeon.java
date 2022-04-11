package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String clinic;

    public Surgeon() {
    }

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis) {
        super(name, surname, education, birthday, diagnosis);
        this.clinic = clinic;
    }

    public String getClinic() {
        return clinic;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        System.out.println(surgeon.getDiagnosisheal());
        System.out.println(surgeon.getClinic());
    }
}
