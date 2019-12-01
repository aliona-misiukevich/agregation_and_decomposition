package com.company.t5.entity;
//4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов.
// Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private List<Account> accounts;

    public Client(String name, List<Account> accounts){
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
