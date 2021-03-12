package bankExercise.account;

import java.util.UUID;

public abstract class Account {
    float currentAmount;
    UUID accountUUID;

    public Account(){
        this.accountUUID = UUID.randomUUID();
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
