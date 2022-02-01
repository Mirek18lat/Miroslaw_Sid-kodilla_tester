package com.kodilla.bank.homework;

public class CashMachine {
    double[] transactions;
    int size;
    public double number;
    String name;
    public static double totalBalance;
    public double nMashineIn;
    public static double nMashineOut;
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
        nMashineIn += transaction;
        averageMachineIn = nMashineIn/number;

    }

    public void addCashOut(double transaction) {
        this.size++;
        double[] newOutMachineArray = new double[this.size];
        System.arraycopy(transactions, 0, newOutMachineArray, 0, transactions.length);
        newOutMachineArray[this.size - 1] = transaction;
        this.transactions = newOutMachineArray;
        number++;
        totalBalance -= transaction;
        nMashineOut += transaction;

    }

    public double getTotalBalance() {
        return totalBalance += totalBalance;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public double getNumber() {
        return number;
    }

    public double getAverage(){
         return nMashineIn/number;
    }
}

