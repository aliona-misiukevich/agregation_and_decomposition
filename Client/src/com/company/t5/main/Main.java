package com.company.t5.main;

import com.company.t5.entity.Account;
import com.company.t5.entity.Client;
import com.company.t5.logic.AccountLogic;
import com.company.t5.view.Print;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Account account1  = new Account(235, 300,true);
	Account account2 = new Account(234, -200, false);

	List<Account> accounts = new ArrayList<Account>();
	accounts.add(account1);
	accounts.add(account2);

	Client client1 = new Client("test1", accounts);

        //AccountLogic.sortAccountsByBalance(client1);
        //Print.printAccountsBalance(client1);

		//AccountLogic.sortAccountByNumber(client1);
		//Print.printAccountsNumbers(client1);

		AccountLogic.sortByStatus(client1);
		int sum = AccountLogic.calculateSumOfClientAccounts(client1);
		Print.printSum(sum);


    }
}
