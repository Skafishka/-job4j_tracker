package ru.job4j.search;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = (value) -> value.getName().contains(key)
            || value.getSurname().contains(key)
            || value.getPhone().contains(key)
            || value.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (combine.test(value)) {
                result.add(value);
            }
        }
        return result;
    }

}
