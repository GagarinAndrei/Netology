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
    public void pay(int amount) {
        if (isOk(amount)) {
            System.out.println("Платёж с Расчёт счёта " + amount);
            this.balance -= amount;
        } else {
            System.out.println("Не хватает средств на Расчёт счёте!");
        }
        System.out.println(getBalance());

    }

    @Override
    public void transfer(Account account, int amount) {
        if (isOk(amount) && account.addMoney(amount)) {
            this.balance -= amount;
        }
        System.out.println(getBalance());
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Пополнение Расчёт счёта на " + amount);
        this.balance += amount;
        System.out.println(getBalance());
        return true;
    }
}
