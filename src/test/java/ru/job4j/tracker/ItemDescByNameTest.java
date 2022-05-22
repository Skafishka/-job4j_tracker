package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(new Item("aaa"), new Item("zzz"), new Item("bbb"), new Item("hhh"));
        List<Item> expected = Arrays.asList(items.get(1), items.get(3), items.get(2), items.get(0));
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }

}