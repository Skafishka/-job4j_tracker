package ru.job4j.tracker;

import org.junit.Test;
import java.util.Collections;
import static org.hamcrest.core.Is.is;
import java.util.List;
import java.util.*;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(new Item("aaew"), new Item("zaz"), new Item("bsx"));
        List<Item> expected = Collections.sort(items);

        assertEquals(expected, is(Collections.sort(items)));
    }

}