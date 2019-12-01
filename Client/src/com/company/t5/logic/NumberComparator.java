package com.company.t5.logic;

import com.company.t5.entity.Account;

import java.util.Comparator;

public class NumberComparator implements Comparator<Account> {

    @Override
    public int compare(Account a1, Account a2) {
        return a1.getNumber() - a2.getNumber();
    }
}
