package ru.netology.bills;

public class CheckingAccount extends Account {
    private int balance;

    @Override
    public String getBalance() {
        return "Расчётный счёт: " + balance;
    }

    @Override
    public int getBalance(Account account) {
        return this.balance;
    }

    @Override
    public void pay(int amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Не хватает средств!");
            return;
        }
        this.balance -= amount;
        System.out.println(getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("Не хватает средств!");
            return;
        }
        System.out.println("Перевод с Расчётного счёта " + amount);
        this.balance -= amount;
        account.addMoney(amount);

        if ((account instanceof CreditAccount) && getBalance(account) > 0) {
            this.balance += amount;
        }

        System.out.println(getBalance());
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Пополнение Расчётного счёта на " + amount);
        this.balance += amount;
        System.out.println(getBalance());
    }
}