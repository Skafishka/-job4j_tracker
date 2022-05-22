package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса по переводу средств
 * с одного счёта на другой
 * @author Sergei Kolygin
 * @version 1.0
 */
public class BankService {
    /**
     * хранение информации о пользователе и перечня его счётов
     * осуществляется в коллекции тира HashMap
     */
    private final Map<User, List<Account>> user = new HashMap<>();

    /**
     * Метод принимает на вход заявку user и добавляет её в перечень клиентов банка
     * в случае нового клиента.
     * @param user клиент, который добавляется в перечень клиентов, в случае если это
     *             новый клиент.
     */
    public void addUser(User user) {
        this.user.putIfAbsent(user, new ArrayList<>());
    }

    /**
     *
     * @param passport
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User newFound = this.findByPassport(passport);
        if (newFound != null) {
            List<Account> userAccount = user.get(newFound);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     *
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
        for (User names : user.keySet()) {
            if (names.getPassport().equals(passport)) {
                return names;
            }
        }
        return null;
    }

    /**
     *
     * @param passport
     * @param requisite
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        User userFound = findByPassport(passport);
        if (userFound != null) {
            for (Account account : user.get(userFound)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
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
