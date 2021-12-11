package ru.netology.bills;

public abstract class Account {
    public abstract boolean isOk(int amount);

    public abstract String getBalance();

    public abstract int getBalance(Account account);

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);
}
