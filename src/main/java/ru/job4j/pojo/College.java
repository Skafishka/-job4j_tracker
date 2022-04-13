package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Александр Петрович");
        student.setGroup(4);
        student.setDate("04 мая 2018 года.");
        System.out.println(student.getFio() + ", учится в группе No" + student.getGroup() + ", поступление в университет - " + student.getDate());
    }
}
