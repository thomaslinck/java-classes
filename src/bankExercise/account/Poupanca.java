package bankExercise.account;

class Poupanca extends Account{
    @Override
    boolean depositValidation(float amountToDeposit) {
        return true;
    }

    @Override
    boolean withdrawValidation(float amountToDeposit) {
        return false;
    }
}
