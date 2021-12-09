package ru.netology.bills;

public abstract class Account {

    public abstract String getBalance();

    public abstract int getBalance(Account account);

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);
}
