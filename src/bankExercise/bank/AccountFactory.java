package bankExercise.bank;

class AccountFactory {
    Account make(){
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
