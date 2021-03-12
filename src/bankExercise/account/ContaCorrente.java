package bankExercise.account;

class ContaCorrente extends Account{
    @Override
    boolean depositValidation(float amountToDeposit) {
        return false;
    }

    @Override
    boolean withdrawValidation(float amountToDeposit) {
        return false;
    }
}
