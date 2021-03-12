package bankExercise.bank;

import bankExercise.account.Account;
import bankExercise.account.AccountFactory;
import bankExercise.account.AccountType;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<Account>();

    void createAccount(AccountType accountType){
        accounts.add(new AccountFactory().make(accountType));
    }


}
