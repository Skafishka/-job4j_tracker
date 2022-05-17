package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> user = new HashMap<>();

    public void addUser(User user) {
        if (this.user.size() == 0) {
            this.user.put(user, new ArrayList<Account>());
        } else {
            for (User names : this.user.keySet()) {
                if (!names.equals(user)) {
                    this.user.put(user, new ArrayList<Account>());
                }
            }
        }
    }

    public void addAccount(String passport, Account account) {
        User newFound = this.findByPassport(passport);
        user.get(newFound).add(account);
    }

    public User findByPassport(String passport) {
        for (User names : user.keySet()) {
            if (names.getPassport().equals(passport)) {
                return names;
            }
        break;
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            User names = findByPassport(passport);
            for (Account account : user.get(names)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            break;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        Account srcUser = findByRequisite(srcPassport, srcRequisite);
        Account destUser = findByRequisite(destPassport, destRequisite);
        addAccount(srcPassport, srcUser);
        addAccount(destPassport, destUser);
        boolean rsl = false;
        if (srcUser != null && srcUser.getBalance() >= amount) {
            destUser.setBalance(destUser.getBalance() + amount);
            rsl = true;

        }
        return rsl;
    }
}
