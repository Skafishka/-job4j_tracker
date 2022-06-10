package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        ArrayList<Address> results = results.stream()
                .map(task -> task.city)
                .collect(Collectors.toList());
        return results;
    }
}
