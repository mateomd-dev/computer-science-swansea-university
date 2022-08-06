
import java.util.Scanner;

class BankMenu {

    private Bank bankDetails;
    private Scanner in;

    public BankMenu(Bank bank) {
        bankDetails = bank;
        in = new Scanner(System.in);
    }

    public boolean display() {
        boolean cont = true;
        BankAccount account;

        System.out.println("Bank Options");
        System.out.println(
                "Select option from list: \n"
                + "  1 - Add an account\n"
                + "  2 - Delete an account\n"
                + "  3 - Deposit money\n"
                + "  4 - Withdraw money\n"
                + "  5 - Print Details\n"
                + "  0 - Exit\n"
        );

        int selection = readInt("");
        in.nextLine();
        switch (selection) {
            case 1: //Add account
                account = newAccount();
                String newName = account.getName();
                if ((account != null) && (bankDetails.getAccount(newName)
                        == null)) {
                    bankDetails.addAccount(account);
                    System.out.println("Added OK");
                } else {
                    System.out.println("Name not unique or cancelled");
                }
                break;
            case 2: //Delete account
                account = readAccount();
                if ((account != null)
                        && bankDetails.deleteAccount(account)) {
                    System.out.println("Deleted OK");
                } else {
                    System.out.println("Not empty or cancelled");
                }
                break;
            case 3: //Deposit Money
                account = readAccount();
                if ((account != null)) {
                    int amount = readInt("Enter amount: ");
                    account.depositMoney(amount);
                    System.out.println("Balance: "
                            + account.getBalance());
                } else {
                    System.out.println("No changes");
                }
                break;
            case 4: //Withdraw Money
                account = readAccount();
                if ((account != null)) {
                    int amount = readInt("Enter amount: ");
                    int withdrawn = account.withdrawMoney(amount);
                    System.out.println("Withdrawn: " + withdrawn);
                    System.out.println("Balance: "
                            + account.getBalance());
                } else {
                    System.out.println("No changes");
                }
                break;
            case 5: //Print details
                System.out.println(bankDetails);
                break;
            case 0: //Quit
                cont = false;
                break;
            default: //Error
                System.out.println("Invalid selection.");
                break;
        }
        return cont;
    }

    private BankAccount newAccount() {
        System.out.print(
                "Enter a new account "
                + "name or just enter to cancel: ");
        BankAccount newAccount = null;
        String newName = in.nextLine();
        if (!newName.equals("")) {
            newAccount = new BankAccount(newName);
        }
        System.out.println(newAccount.getName());
        return newAccount;
    }

    private BankAccount readAccount() {
        BankAccount account = null;
        boolean done = false;
        do {
            System.out.print(
                    "Enter the name of "
                    + "an existing account or "
                    + "enter to cancel: ");
            String accountName = in.nextLine();
            if (accountName.equals("")) {
                done = true;
            } else {
                BankAccount provAccount
                        = bankDetails.getAccount(accountName);
                if (provAccount != null) {
                    done = true;
                    account = provAccount;
                }
            }
        } while (!done);
        return account;
    }

    private int readInt(String prompt) {
        System.out.print(prompt);
        while (!in.hasNextInt()) {
            System.out.print("Enter an integer: ");
            in.nextLine();
        }
        int value = in.nextInt();
        return Math.abs(value);
    }

    private String enterAccountname() {
        System.out.println("Enter an account name");
        return in.nextLine();
    }
}
