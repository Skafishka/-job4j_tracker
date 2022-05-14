package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Arrays;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;
    /* private int size = 0; */

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
    /*    items[size++] = item; */
        return item;
    }

    public Item[] findAll() {
    /*     return Arrays.copyOf(items, size); */
        return items.toArray(new Item[0]);
    }

    public Item[] findByName(String key) {
    /*    Item[] rsl = new Item[size]; */
        Item[] array =  new Item[items.size()];
        int index = 0;
    /*    for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[count] = items[i];
                count++;
            }
        } */
        for (int i = 0; i < items.size(); i++) {
            if (key.equals(items.get(i).getName())) {
                array[index++] = items.get(i);
            }
        }
        return Arrays.copyOf(array, index);
    }

    public Item findById(int id) {
        int index = indexOf(id);
    /*    return index != -1 ? items[index] : null; */
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
    /*    for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) { */
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index > -1;
        if (rsl) {
            item.setId(id);
    /*        items[index] = item; */
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index > -1;
        if (rsl) {
    /*        System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--; */
            items.remove(index);
        }
        return rsl;
    }

}