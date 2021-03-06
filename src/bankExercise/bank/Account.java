package bankExercise.bank;

import java.util.UUID;

abstract class Account {
    private UUID uuid;
    private float currentAmount;

    Account(){
        this.uuid = UUID.randomUUID();
    }

    void deposit(float amount){
        if(this.depositValidation())
            this.currentAmount += amount;
    }

    void withdraw(float amount){
        if(this.withdrawValidation())
            this.currentAmount -= amount;
    }

    abstract boolean depositValidation();
    abstract boolean withdrawValidation();
}
