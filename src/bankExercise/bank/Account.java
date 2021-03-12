package bankExercise.bank;

abstract class Account {
    float currentAmount;

    void deposit(float amount){
        this.currentAmount += amount;
    }

    void withdraw(float amount){
        this.currentAmount -= amount;
    }
}
