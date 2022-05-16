package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> user = new HashMap<>();

    public void addUser(User user) {
        for (User names : this.user.keySet()) {
            if (!names.equals(user)) {
                this.user.put(user, new ArrayList<Account>());
            }
        }
    }

    public void addAccount(String passport, Account account) {

    }

    public User findByPassport(String passport) {
        return null;



    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
