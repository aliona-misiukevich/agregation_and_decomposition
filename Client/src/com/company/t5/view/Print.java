package com.company.t5.view;

import com.company.t5.entity.Account;
import com.company.t5.entity.Client;

public class Print {

    public static void printAccountsBalance(Client client){
        for (Account account:
             client.getAccounts()) {
            System.out.println(account.getBalance());
        }
    }

    public static void printAccountsNumbers(Client client) {
        for (Account account :
                client.getAccounts()) {
            System.out.println(account.getNumber());
        }
    }
     public static void printAccounts(Client client) {
         for (Account account:
              client.getAccounts()) {
             System.out.println(account.toString());
         }
        }

        public static void printSum(int sum){
        System.out.println(sum);
        }
}
