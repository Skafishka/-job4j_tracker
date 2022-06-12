package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
     * @param user это клиент, который добавляется в перечень клиентов, в случае если это
     *             новый клиент.
     */

    public void addUser(User user) {
        this.user.putIfAbsent(user, new ArrayList<>());
    }
    /**
     * Метод принимает на вход заявку на добавление аккаунта в случае если user найден
     * по номеру паспорта и у него не существует данного номера аккаунта
     * @param passport это номер паспорта, по которому происходит поиск user
     * @param account это номер аккаунта, по которому происходит проверка
     *                наличие/отсутствие аккаунта у user
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
     * Метод принимает на вход значение passport и производит поиск по списку паспортов с
     * выводом значения user
     * @param passport это значение используется для поиска паспорта в списке user
     * @return используется для вывода результата поиска
     */

    public User findByPassport(String passport) {
        return user.keySet()
                .stream()
                .filter(q -> q.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }
    /**
     * Метод принимает на вход значение passport для поиска user и после принимает значение
     * requisite для поиска среди списка account у user соответствующего номера аккаунта по
     * реквизитам
     * @param passport этот параметр используется для поиска соответствующего user
     * @param requisite этот параметр используется для поиска соответствующего account по реквизитам
     * @return используется для вывода результата поиска account
     */

    public Account findByRequisite(String passport, String requisite) {
        User userFound = findByPassport(passport);
        if (userFound != null) {
            return user.get(userFound)
                    .stream()
                    .filter(q -> q.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод принимает на вход номера паспортов и реквизитов аккаунта и осуществляет перевод денег с
     * одного аккаунта на другой.
     * Поиск отправителя и получателя производится по номеру паспорта и реквизитам счёта.
     * В случае успешного нахождения отправителя и получателя и наличия достаточного баланса
     * денег у отправителя, производится перевод.
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite номер реквизитов отправителя
     * @param destPassport номер паспорта получателя
     * @param destRequisite номер реквизитов получателя
     * @param amount сумма к переводу денег
     * @return возврат подтверждения перевода
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
