
import java.util.Scanner;
import java.util.ArrayList;

/*
 * This is a class to *test* the BankAccount class. It creates a couple of
 * accounts ("Jones" and "Smith") as well as adding and withdrawing some
 * money from them. Then it uses a look to create an ArrayList containing
 * as many BankAccounts as you want to type in:-)
 */
class BankAccountTest {

    public static void main(String[] args) {

		//Create a single bank account called b and do things to it:
        //deposit and withdraw money
        BankAccount b = new BankAccount("Jones");
        int value = b.depositMoney(500);
        System.out.println(b.getName());
        System.out.println(value);
        System.out.println(b.getBalance());
        System.out.println(b);

        value = b.withdrawMoney(700);
        System.out.println(b.getBalance());

        //Similarly, do the same with another bank account called nb
        BankAccount nb = new BankAccount("Smith", 0);
        nb.depositMoney(500);
        System.out.println(nb.getName());
        System.out.println(nb.getBalance());
        value = nb.withdrawMoney(700);
        System.out.println(nb.getBalance());
        System.out.println(nb);
    }
}
