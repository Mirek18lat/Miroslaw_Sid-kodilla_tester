package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;
    private CashMachine cashMachine4;
    private CashMachine cashMachine5;
    private CashMachine cashMachine6;
    private CashMachine[] machines;
    private int machinesNumber;
    private String name;
    public int totalBalans;
    public int numberCashOut;
    public int numberCashIn;
    public int sumIn;
    public int sumOut;


    public Bank(String name) {
        this.machines = new CashMachine[0];
        this.machinesNumber = 0;
    }

    public void addMachineNumber (CashMachine code) {
        this.machinesNumber++;
        CashMachine[] newTab = new CashMachine[this.machinesNumber];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.machinesNumber - 1] = code;
        this.machines = newTab;
    }


    public void transactionCashMachine1(int transaction) {
        if (transaction < 0) {
            this.cashMachine1.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine1.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }

    public void transactionCashMachine2(int transaction) {
        if (transaction < 0) {
            this.cashMachine2.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine2.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }

    public void transactionCashMachine3(int transaction) {
        if (transaction < 0) {
            this.cashMachine3.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine3.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }
    public void transactionCashMachine4(int transaction) {
        if (transaction < 0) {
            this.cashMachine4.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine4.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }
    public void transactionCashMachine5(int transaction) {
        if (transaction < 0) {
            this.cashMachine5.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine5.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }

    public void transactionCashMachine6(int transaction) {
        if (transaction < 0) {
            this.cashMachine6.subTrack(transaction);
            numberCashOut++;
            sumOut += transaction;
        } else {
            this.cashMachine6.add(transaction);
            numberCashIn++;
            sumIn += transaction;
        }
        totalBalans += transaction;
    }
    
    public int getTotalBalans() {
        return totalBalans;
    }

    public int getNumberCashIn() {
        return numberCashIn;
    };

    public int getNumberCashOut() {
        return numberCashOut;
    }

    public double getInAverage(){
        return sumIn/numberCashIn;
    }

    public double getIOutAverage(){
        return sumOut/numberCashOut;
    }
}
