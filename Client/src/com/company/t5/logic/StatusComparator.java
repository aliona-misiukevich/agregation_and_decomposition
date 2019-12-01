package com.company.t5.logic;

import com.company.t5.entity.Account;

import java.util.Comparator;

public class StatusComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
        if (a1.isBlocked() == a2.isBlocked()) {
            return 0;
        }
        if (a1.isBlocked()) {
            return 1;
        }
        return -1;
    }
}
