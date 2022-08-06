
import java.util.ArrayList;
import java.util.stream.*;

public class Bank {

    private ArrayList<BankAccount> accountList = new ArrayList<>();

    //method to add an account
    public void addAccount(BankAccount account) {
        accountList.add(account);
    }

    //method to delete an account
    public boolean deleteAccount(BankAccount account) {
        //only delete 'empty' accounts
        if (account.getBalance() == 0) {
            accountList.remove(account);
            return true;
        } else {
            return false;
        }
    }

	//method to find an account by name
    //variations of this are discussed below
    public BankAccount getAccount(String name) {
        BankAccount findAccount = null;
        int count = 0;
        boolean found = false;
        while ((count < accountList.size()) && !found) {
            if (accountList.get(count).getName().equals(name)) {
                found = true;
                findAccount = accountList.get(count);
            } else {
                count++;
            }
        }
        return findAccount;
    }

    public BankAccount getAccount1(String name) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getName().equals(name)) {
                return accountList.get(i);
            }
        }
        return null; //if not found
    }

    public BankAccount getAccount2(String name) {
        BankAccount account
                = accountList.stream().filter(a -> a.getName().equals(name)).findFirst().get();
        return account;
    }

    //method to return the total amount of money
    public int totalAmount() {
        int total = 0;
        for (BankAccount account : accountList) {
            total += account.getBalance();
        }
        return total;
    }

    //toString method
    public String toString() {
        String accountString = "";
        for (BankAccount account : accountList) {
            accountString += account + "\n";
        }
        return accountString;
    }

}
