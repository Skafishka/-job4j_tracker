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
        List<Item> items = Arrays.asList(new Item("aaa"), new Item("zzz"), new Item("bbb"));
        Collections.sort(items, new ItemDescByName());
        assertThat(items.get(0).getName(), is("zzz"));
    }

}