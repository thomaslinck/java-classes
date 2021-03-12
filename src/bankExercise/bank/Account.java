package bankExercise.bank;

abstract class Account {
    float currentAmount;

    void deposit(float amount){
        if (depositValidation())
            this.currentAmount += amount;
    }

    void withdraw(float amount){
        if(withdrawValidation())
            this.currentAmount -= amount;
    }

    abstract boolean depositValidation();
    abstract boolean withdrawValidation();
}
