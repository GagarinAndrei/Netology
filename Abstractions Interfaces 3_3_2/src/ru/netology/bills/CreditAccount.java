package ru.netology.bills;

public class CreditAccount extends Account {
    private int balance;

    @Override
    public String getBalance() {
        return "Кредит счёт: " + balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Платёж с Кредит счёта " + amount);
        this.balance -= amount;
        System.out.println(getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Нельзя переводить с Кредит счёта");
        System.out.println(getBalance());
    }

    @Override
    public void addMoney(int amount) {
        if ((this.balance + amount) > 0) {
            System.out.println("Кредитный баланс не может быть положительным");
            return;
        }
        System.out.println("Пополнение Кредит счёта на " + amount);
        this.balance += amount;
        System.out.println(getBalance());

    }
}
