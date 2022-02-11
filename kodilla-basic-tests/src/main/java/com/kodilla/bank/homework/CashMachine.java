package com.kodilla.bank.homework;

public class CashMachine {
    double[] transactions;
    int size;
    public double number;
    String name;
    public static double totalBalance;
    public static double nMachineIn;
    public static double cashIn;
    public static double cashOut;
    public static double nMachineOut;
    double[] cashMachine;
    public static double  averageMachineIn;


     public CashMachine() {
        this.size = 0;
        this.transactions = new double[0];
        this.name = new String();
    }

    public void addCashIn(double transaction) {
        this.size++;
        double[] newInMachineArray = new double[this.size];
        System.arraycopy(transactions, 0, newInMachineArray, 0, transactions.length);
        newInMachineArray[this.size - 1] = transaction;
        this.transactions = newInMachineArray;
        number++;
        totalBalance += transaction;
        cashIn += transaction;
        nMachineIn ++;
    }

    public double getnMachineIn() {
        return nMachineIn;
    }


    public void addCashOut(double transaction) {
        this.size++;
        double[] newOutMachineArray = new double[this.size];
        System.arraycopy(transactions, 0, newOutMachineArray, 0, transactions.length);
        newOutMachineArray[this.size - 1] = -transaction;
        this.transactions = newOutMachineArray;
        number++;
        totalBalance -= transaction;
        cashOut -= transaction;
        nMachineOut ++;
    }

    public double getMachineTotal() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double getMachineAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public double getNumber() {
        return number;
    }


}

