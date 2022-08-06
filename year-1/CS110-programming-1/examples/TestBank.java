
class TestBank {

    public static void main(String[] args) {
        Bank testBank = new Bank();

        BankAccount testAccount = new BankAccount("Bob", 100);
        testBank.addAccount(testAccount);
        testBank.addAccount(new BankAccount("Mary"));
        testBank.getAccount2("Mary").depositMoney(500);
        System.out.println(testBank);
    }
}
