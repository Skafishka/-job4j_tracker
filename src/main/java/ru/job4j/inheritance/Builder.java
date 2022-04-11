package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String qualification;

    public Builder() {
    }

    public Builder(String qualification) {
        this.qualification = qualification;
    }

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.println(builder.getSurname());
        System.out.println(builder.getExperience());
    }
}
