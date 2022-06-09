package ru.job4j.stream;

import java.util.function.Predicate;
import java.util.List;

public class School {
    public static boolean collect(List<Student> students, Predicate<List<Student>> predic) {
        return predic.test(students);
    }
}
