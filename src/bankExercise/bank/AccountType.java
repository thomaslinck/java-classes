package bankExercise.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

enum AccountType {
    POUPANCA("Poupança"),
    CORRENTE("Conta Corrente");

    String humanReadableType;
}
