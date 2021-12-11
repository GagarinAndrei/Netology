package ru.netology.bills;

public class SavingsAccount extends Account {
    private int balance;

    @Override
    public boolean isOk(int amount) {
        return (this.balance - amount) >= 0;
    }

    @Override
    public String getBalance() {
        return "Сбер счёт: " + balance;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Платёж со Сбер счёта");
        System.out.println("Нельзя платить со Сбер счёта!");
        System.out.println(getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Перевод со Сбер счёта");
        if (!(this.isOk(amount) && account.addMoney(amount))) {
            System.out.println("Нельзя перевести со Сбер счёта!");
        } else {
            System.out.println("Перевод со Сбер счёта: " + amount);
            this.balance -= amount;
        }
        System.out.println(getBalance());
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Пополнение Сбер счёта на: " + amount);
        this.balance += amount;
        System.out.println(getBalance());
        return true;
    }
}
