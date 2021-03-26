package bankExercise.main;

import bankExercise.account.AccountType;
import bankExercise.bank.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var bank = new Bank();

        System.out.println("Digite 1 para criar uma conta corrente ou em 2 para uma poupança");
        var accountSelection = scanner.nextLine();
        System.out.println(accountSelection);

        bank.createAccount(accountSelection== "1" ? AccountType.CORRENTE : AccountType.POUPANCA);


    }
}
