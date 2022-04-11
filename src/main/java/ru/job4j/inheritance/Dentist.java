package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String district;

    public Dentist() {
    }

    public Dentist(String name, String surname, String education, String birthday, String diagnosis, String district) {
        super(name, surname, education, birthday, diagnosis);
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        System.out.println(dentist.getName());
        System.out.println(dentist.getDiagnosisheal());
        System.out.println(dentist.getDistrict());
    }
}
