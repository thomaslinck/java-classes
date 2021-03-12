package bankExercise.bank;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<Account>();

    void createAccount(){
        accounts.add(new AccountFactory().make());
    }


}
