/**
 * Created by USER on 03/03/16.
 * @author Esteban
 */
public class Account {
    private float balance;
    private float minimumBalance;

    public Account() {
        balance = 0;
        minimumBalance = (float) 10.0;
    }

    public Account(float balance, float minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(float amount) {
        balance += amount;
        //	balance +=50;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public void transferFunds(Account destination, float amount)
            throws InsufficientFundsException {
        if (balance - amount < minimumBalance){
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

