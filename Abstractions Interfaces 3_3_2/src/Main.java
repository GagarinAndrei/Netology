import ru.netology.bills.Account;
import ru.netology.bills.CheckingAccount;
import ru.netology.bills.CreditAccount;
import ru.netology.bills.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account checking = new CheckingAccount();
        Account savings = new SavingsAccount();
        Account credit = new CreditAccount();

        showBalance(savings);
        showBalance(checking);
        showBalance(credit);
        printLine();

        savings.addMoney(200);
        savings.transfer(checking, 40);
        savings.pay(100);
        printLine();

        checking.addMoney(200);
        checking.transfer(credit, 250);
        checking.pay(150);
        printLine();

        credit.pay(1000);
        credit.transfer(savings, 500);
        credit.addMoney(350);
    }

    public static void showBalance(Account account) {
        System.out.println("Начальный баланс " + account.getBalance());
    }

    public static void printLine() {
        System.out.println("____________________________");
    }
}
