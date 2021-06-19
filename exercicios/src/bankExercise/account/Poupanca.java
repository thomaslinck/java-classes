package bankExercise.account;

class Poupanca extends Account{

    Poupanca(){
        super(new AccountInformation());
    }

    @Override
    boolean depositValidation(float amountToDeposit) {
        return true;
    }

    @Override
    boolean withdrawValidation(float amountToDeposit) {
        return ((currentAmount-amountToDeposit)>=0) ? true : false;
    }
}
