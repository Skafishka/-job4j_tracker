package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> user = new HashMap<>();

    public void addUser(User user) {
        this.user.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User newFound = this.findByPassport(passport);
        if (newFound != null) {
            List<Account> userAccount = user.get(newFound);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User names : user.keySet()) {
            if (names.getPassport().equals(passport)) {
                return names;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User userFound = findByPassport(passport);
        if (userFound != null) {
            for (Account account : user.get(userFound)) {
                if (account.getRequisite().contains(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        Account srcUser = findByRequisite(srcPassport, srcRequisite);
        Account destUser = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if (srcUser != null && destUser != null && srcUser.getBalance() >= amount) {
            destUser.setBalance(destUser.getBalance() + amount);
            srcUser.setBalance(srcUser.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
