package bankExercise.account;

import lombok.Getter;

public abstract class Account {
    @Getter
    protected float currentAmount;

    private final AccountInformation accountInformation;

    public Account(AccountInformation accountInformation){
        this.accountInformation = accountInformation;
    }

    void deposit(float amount){
        if (depositValidation(amount))
            this.currentAmount += amount;
    }

    void withdraw(float amount){
        if(withdrawValidation(amount))
            this.currentAmount -= amount;
    }

    abstract boolean depositValidation(float amountToDeposit);
    abstract boolean withdrawValidation(float amountToDeposit);
}
