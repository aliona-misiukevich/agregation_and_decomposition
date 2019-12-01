package com.company.t5.logic;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import com.company.t5.entity.Account;
import com.company.t5.entity.Client;
import java.util.Collections;
import java.util.List;

public class AccountLogic {

    public static void blockAccount(Account account) {
        account.setBlocked(true);
    }

    public static void unblockAccount(Account account) {
        account.setBlocked(false);
    }

    public static Account findAccountByNumber(Client client, int number) {
        List<Account> accounts = client.getAccounts();
        for (Account account :
                accounts) {
            if (account.getNumber() == number) {
                return account;
            }
        }
        return null;
    }

    public static void sortAccountsByBalance(Client client) {
        Collections.sort(client.getAccounts(), new BalanceComparator());
    }

    public static void sortAccountByNumber(Client client) {
        Collections.sort((client.getAccounts()), new NumberComparator());
    }

    public static void sortByStatus(Client client) {
        Collections.sort((client.getAccounts()), new StatusComparator());
    }

    public static int calculateSumOfClientAccounts(Client client){
        int sum = 0;
        for (Account account:
             client.getAccounts()) {
            sum += account.getBalance();
        }
        return sum;
    }

    public static int calculateSumOfClientPositiveBalance(Client client){
        int sum = 0;
        for (Account account:
                client.getAccounts()) {
            if (account.getBalance() > 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }

    public static int calculateSumOfClientNegativeBalance(Client client){
        int sum = 0;
        for (Account account:
                client.getAccounts()) {
            if (account.getBalance() < 0) {
                sum += account.getBalance();
            }
        }
        return sum;
    }
}
