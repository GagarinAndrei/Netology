package ru.netology.bills;

public abstract class Account {
    public abstract boolean isOk(int amount);

    public abstract String getBalance();

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);
}
