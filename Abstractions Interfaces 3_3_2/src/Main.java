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
        printDoubleLine();

        savings.addMoney(200);
        printLine();
        savings.transfer(checking, 40);
        printLine();
        savings.pay(100);
        printDoubleLine();

        checking.addMoney(3000);
        printLine();
        checking.transfer(credit, 200);
        printLine();
        checking.pay(150);
        printDoubleLine();

        credit.pay(1000);
        printLine();
        credit.transfer(savings, 500);
        printLine();
        credit.addMoney(350);
    }

    public static void showBalance(Account account) {
        System.out.println("Начальный баланс " + account.getBalance());
    }

    public static void printLine() {
        System.out.println("____________________________");
    }

    public static void printDoubleLine() {
        System.out.println("============================");
    }
}
