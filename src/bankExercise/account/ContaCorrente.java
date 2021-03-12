package bankExercise.account;

class ContaCorrente extends Account{
    private float dailyDepositLimit = 10000;
    private float dailyWithdrawLimit = 10000;

    @Override
    boolean depositValidation(float amountToDeposit) {
        return amountToDeposit < dailyDepositLimit ? true : false;
    }

    @Override
    boolean withdrawValidation(float amountToDeposit) {

        if (((currentAmount-amountToDeposit) >= 0 ) && (amountToDeposit < dailyDepositLimit))
            return true;
        else
            return false;
    }
}
