
public class BankAccount {

    // The account balance is stored here - it can't be accessed outside the class
    private int balance;

    // Similarly, for the account name
    private final String accountName;

    // constructor with an opening balance
    public BankAccount(String name, int openingAmount) {
        balance = openingAmount;
        accountName = name;
    }

    // constructor with no opening balance - defaults to zero.
    public BankAccount(String name) {
        accountName = name;
        balance = 0;
    }

	//Method to add money - notice we've chosen to return the
    //balance as well as update it - this is a common approach
    //but you don't have to do it, and could have made this void.
    public int depositMoney(int amount) {
        balance += amount;
        return balance;
    }

	//Method to withdraw money
    //Once again, we return the new balance
    public int withdrawMoney(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        return balance;
    }

    //Method to check the balance
    public int getBalance() {
        return balance;
    }

    //Method to return name
    public String getName() {
        return accountName;
    }

    //Method to print out an account:
    public String toString() {
        return ("Account Name " + accountName + " has a balance of " + balance);
    }
}
