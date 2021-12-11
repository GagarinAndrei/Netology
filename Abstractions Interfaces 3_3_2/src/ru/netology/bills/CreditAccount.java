package ru.netology.bills;

public class CreditAccount extends Account {
    private int balance;

    @Override
    public boolean isOk(int amount) {
        return (this.balance + amount) <= 0;
    }

    @Override
    public String getBalance() {
        return "Кредит счёт: " + balance;
    }

    @Override
    public int getBalance(Account account) {
        return this.balance;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Платёж с Кредит счёта");
        System.out.println("Платёж с Кредит счёта: " + amount);
        this.balance -= amount;
        System.out.println(getBalance());
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        System.out.println("Перевод с Кредит счёта");
        System.out.println("Нельзя переводить с Кредит счёта");
        System.out.println(getBalance());
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Пополнение Кредит счёта");
        if (isOk(amount)) {
            System.out.println("Пополнение Кредит счёта на: " + amount);
            this.balance += amount;
            System.out.println(getBalance());
            return true;
        } else {
            System.out.println("Кредит счёт не может быть положительным");
            System.out.println(getBalance());
            return false;
        }


    }
}
