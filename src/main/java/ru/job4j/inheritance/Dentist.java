package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private static String district;

    public Dentist(String name, String surname, String education, String birthday, String diagnosis, String district) {
        super(name, surname, education, birthday, diagnosis);
        this.district = district;
    }

    public static String getDistrict() {
        return district;
    }

    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getDiagnosisheal());
        System.out.println(getDistrict());
    }
}
