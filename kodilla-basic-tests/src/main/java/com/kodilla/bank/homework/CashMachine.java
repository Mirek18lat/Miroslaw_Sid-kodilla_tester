package com.kodilla.bank.homework;

public class CashMachine {
    int[] transactions;
    int size;
    int number;
    String name;
    int balance;

    public CashMachine(String name, int transaction) {
        this.name = name;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
        number ++;
        balance += transaction;
    }

    public void subTrack(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
        number ++;
        balance += transaction;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
    }

    public int numberTransaction () {
        return number;
    }
}
