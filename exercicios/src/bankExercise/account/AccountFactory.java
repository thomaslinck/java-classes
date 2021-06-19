package bankExercise.account;

public class AccountFactory {
    public Account make(AccountType accountType) throws EnumConstantNotPresentException{
        Account account;

        if(accountType.equals(accountType.POUPANCA))
            account = new Poupanca();
        else if(accountType.equals(accountType.CORRENTE))
            account = new ContaCorrente();
        else
            throw new EnumConstantNotPresentException(accountType.getClass(), accountType.toString());

        return account;
    }
}
