/**
 * Created by USER on 03/03/16.
 *
 * @author Esteban
 */
public class Account {
    private float balance;
    private float minimumBalance;

    /**
     * Default constructor for Account with
     */
    public Account() {
        balance = 0;
        minimumBalance = (float) 10.0;
    }

    /**
     * Constructor with parameters to create an account with the
     * specific minimumBalance and initial balance
     *
     * @param balance        initial balance
     * @param minimumBalance minimum balance of the account
     */
    public Account(float balance, float minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    /**
     * Adds the specified amount to the balance of the account
     *
     * @param amount amount to deposit
     */
    public void deposit(float amount) {
        balance += amount;
        //	balance +=50;
    }

    /**
     * Deducts the specified amount from the balance of the account
     *
     * @param amount amount to deposit
     */
    public void withdraw(float amount) {
        balance -= amount;
    }

    /**
     * Transfers the specified amount from the account to the destination account.
     * If the resulting balance of the account is lower than the minimum balance the
     * transfer is not completed and an InsufficientFundsException is thrown.
     *
     * @param destination account to transfer founds to
     * @param amount      amount to be transferred
     * @throws InsufficientFundsException
     */
    public void transferFunds(Account destination, float amount)
            throws InsufficientFundsException {
        if (balance - amount < minimumBalance) {
            throw new InsufficientFundsException();
        }
        destination.deposit(amount);

        withdraw(amount);
    }

    public float getBalance() {
        return balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }
}

