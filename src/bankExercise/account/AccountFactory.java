package bankExercise.account;

public class AccountFactory {
    Account make(AccountType accountType){

        Account account = new Account() {

            @Override
            boolean depositValidation() {
                return false;
            }

            @Override
            boolean withdrawValidation() {
                return false;
            }
        };
        return account;
    }
}
