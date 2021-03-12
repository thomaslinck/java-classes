package bankExercise.account;

class Poupanca extends Account{
    @Override
    boolean depositValidation(float amountToDeposit) {
        return true;
    }

    @Override
    boolean withdrawValidation(float amountToDeposit) {
        return ((currentAmount-amountToDeposit)>=0) ? true : false;
    }
}
