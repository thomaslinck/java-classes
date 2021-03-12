package bankExercise.account;

import lombok.Getter;

import java.util.UUID;

public abstract class Account {
    @Getter
    protected float currentAmount;

    private UUID accountUUID;

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
