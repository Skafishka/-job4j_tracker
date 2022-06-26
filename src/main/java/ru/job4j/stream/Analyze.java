package ru.job4j.stream;

import ru.job4j.ex.FindMaxLength;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;

import static java.util.stream.Collectors.*;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(q -> q.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(q -> new Tuple(q.getName(), (q.getSubjects().stream()
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D))))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.
                flatMap(q -> q.getSubjects().stream())
                .collect(groupingBy((Subject::getName), LinkedHashMap::new, averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(q -> new Tuple(q.getKey(), q.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(q -> new Tuple(
                q.getName(), q.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore).sum()))
                .max(Tuple::compareTo)
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(q -> q.getSubjects().stream())
                .collect(groupingBy(Subject::getName, LinkedHashMap::new, summingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(w -> new Tuple(w.getKey(), w.getValue()))
                .max(Tuple::compareTo)
                .orElse(null);
    }

}