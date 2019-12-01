package com.company.t5.entity;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.Objects;

public class Account {
    private int number;
    private int balance;
    private boolean isBlocked;

    public Account(int number, int balance, boolean isBlocked) {
        this.balance = balance;
        this.number = number;
        this.isBlocked = isBlocked;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean value) {
        isBlocked = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return number == account.number &&
                balance == account.balance &&
                isBlocked == account.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance, isBlocked);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }
}

