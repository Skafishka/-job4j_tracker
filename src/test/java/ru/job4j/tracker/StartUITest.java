package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.sql.SQLException;
import java.util.List;

public class StartUITest {

    @Test
    public void whenCreateItem() throws SQLException {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = List.of(
                new CreateAction(out),
                new ExitProgramAction()
        );
        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findById(1).getName(), is("Item name"));
    }

    @Test
    public void whenShowAllAction() throws SQLException {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        MemTracker memTracker = new MemTracker();
        memTracker.add(new Item("Item name"));
        List<UserAction> actions = List.of(
                new ShowAllAction(out),
                new ExitProgramAction()
        );
        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findById(1).getName(), is("Item name"));
    }

    @Test
    public void whenEditAction() throws SQLException {
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Item name"));
        Output out = new StubOutput();
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        List<UserAction> actions = List.of(
                new EditAction(out),
                new ExitProgramAction()
        );
        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findById(1).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteAction() throws SQLException {
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Deleted item"));
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = List.of(
                new DeleteAction(out),
                new ExitProgramAction()
        );
        new StartUI().init(in, memTracker, actions);
        assertNull(memTracker.findById(item.getId()));
    }

    @Test
    public void whenInvalidExit() throws SQLException {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"7", "0"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = List.of(
                new ExitProgramAction()
        );
        new StartUI().init(in, memTracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                              + "0. Exit Program" + ln
                              + "Wrong input, you can select: 0 .. 0" + ln
                              + "Menu:" + ln
                              + "0. Exit Program" + ln
                        )
        );
    }
}