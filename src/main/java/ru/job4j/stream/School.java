package ru.job4j.stream;

import java.util.function.Predicate;
import java.util.List;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predic) {
        predic.test(students);
        return students;
    };
}
