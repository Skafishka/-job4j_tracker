package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI extends Item {

    public StartUI(LocalDateTime created) {
        super(created);
    }

    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdFormat = formatter.format(item.getCreated());
        System.out.println(createdFormat);
    }
}
