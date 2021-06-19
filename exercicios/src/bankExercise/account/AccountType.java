package bankExercise.account;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum AccountType {
    POUPANCA("Poupança"),
    CORRENTE("Conta Corrente");

    String humanReadableType;
}
