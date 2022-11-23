package ru.job4j.tracker;

import ru.job4j.tracker.store.SqlTracker;
import java.sql.SQLException;
import java.util.List;

public class StartUI {

    public void init(Input input, Store tracker, List<UserAction> actions) throws SQLException {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                System.out.println(("Wrong input, you can select: 0 .. " + (actions.size() - 1)));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ValidateInput(
                new ConsoleInput()
        );
        Output output = new ConsoleOutput();
        try (SqlTracker tracker = new SqlTracker()) {
            tracker.init();
            List<UserAction> actions = List.of(
                    new CreateAction(output),
                    new ShowAllAction(output),
                    new EditAction(output),
                    new DeleteAction(output),
                    new FindByIdAction(output),
                    new FindByNameAction(output),
                    new ExitProgramAction()
            );
            new StartUI().init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}