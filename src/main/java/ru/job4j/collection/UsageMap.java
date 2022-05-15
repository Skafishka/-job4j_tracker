package ru.job4j.collection;

import  java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> emailCollection = new HashMap<>();
        emailCollection.put("qwerty@io.fi", "Petro Petrovich");
        emailCollection.put("qaz@io.fi", "Henri Itäinen");
        emailCollection.put("wsx@io.fi", "Sami Pulkkinen");
        for (String email : emailCollection.keySet()) {
            String name = emailCollection.get(email);
            System.out.println(email + " = " + name);
        }
    }
}
