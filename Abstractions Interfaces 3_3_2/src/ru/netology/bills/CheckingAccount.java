package ru.netology.bills;

public class CheckingAccount extends Account {
    private int balance;

    @Override
    public boolean isOk(int amount) {
        return (this.balance - amount) >= 0;
    }

    @Override
    public String getBalance() {
        return "Расчётный счёт: " + balance;
    }

    @Override
    public int getBalance(Account account) {
        return this.balance;
    }

    @Override
    public boolean pay(int amount) {
        if (isOk(amount)) {
            System.out.println("Платёж с Расчёт счёта " + amount);
            this.balance -= amount;
            System.out.println(getBalance());
            return true;
        } else {
            System.out.println("Не хватает средств на Расчёт счёте!");
            System.out.println(getBalance());
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (isOk(amount) && account.addMoney(amount)) {
            this.balance -= amount;
            System.out.println(getBalance());
            return true;
        } else {
            System.out.println(getBalance());
            return false;
        }
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Пополнение Расчёт счёта на " + amount);
        this.balance += amount;
        System.out.println(getBalance());
        return true;
    }
}
