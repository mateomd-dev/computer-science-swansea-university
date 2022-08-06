
class RunBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankMenu menu = new BankMenu(bank);

        while (menu.display());
    }
}
