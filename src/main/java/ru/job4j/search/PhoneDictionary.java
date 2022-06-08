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
        Predicate<Person> name = (value) -> value.getName().contains(key);
        Predicate<Person> surname = (value) -> value.getSurname().contains(key);
        Predicate<Person> phone = (value) -> value.getPhone().contains(key);
        Predicate<Person> address = (value) -> value.getAddress().contains(key);

        ArrayList<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (name.test(value) || surname.test(value) || phone.test(value) || address.test(value)) {
                result.add(value);
            }
        }
        return result;
    }

}
