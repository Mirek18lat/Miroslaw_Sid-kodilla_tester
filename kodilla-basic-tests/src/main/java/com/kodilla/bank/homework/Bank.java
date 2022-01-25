package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {
    private double machinesNumber;
    public String machineList[];
    public double totalBalans;
    public double numberCashOut;
    public double numberCashIn;
    public double sumIn;
    public double sumOut;

    public static void main(String[] args) {

        String[] machineList = new String[] {"cm1", "cm2", "cm3"};

        CashMachine cm1 = new CashMachine();
        cm1.addCashIn(200);
        cm1.addCashIn(300);
        cm1.addCashIn(400);
        cm1.addCashIn(700);
        cm1.addCashOut(20);
        cm1.addCashOut(30);
        cm1.addCashOut(80);
        cm1.addCashOut(100);
        cm1.addCashOut(200);
        cm1.addCashOut(20);

        System.out.println(Arrays.toString(cm1.getTransactions()));
        System.out.println(cm1.totalBalance);
        System.out.println(cm1.number);
        System.out.println(cm1.averageMachineIn);
        System.out.println(cm1.nMashineIn);

        CashMachine cm2 = new CashMachine();
        cm2.addCashIn(500);
        cm2.addCashIn(120);
        cm2.addCashIn(450);
        cm2.addCashIn(528);
        cm2.addCashOut(1620);
        cm2.addCashOut(123);
        cm2.addCashOut(4562);
        cm2.addCashOut(21246);
        cm2.addCashOut(1231);

        System.out.println(Arrays.toString(cm2.getTransactions()));
        System.out.println(cm2.totalBalance);
        System.out.println(cm2.number);

        CashMachine cm3 = new CashMachine();
        cm3.addCashIn(4560);
        cm3.addCashIn(4560);
        cm3.addCashIn(546876);
        cm3.addCashIn(542);
        cm3.addCashOut(20);
        cm3.addCashOut(475);
        cm3.addCashOut(8);
        cm3.addCashOut(5400.3);
        cm3.addCashOut(7);
        cm3.addCashOut(12);





    }
}
// //b.getBalance() -> ad.1
    ///get mashine.
    // Dodać listę mashyn jako tablicę.
    //na każdej maszynie wywyołać metoda, która doda do tablicy lisyt in/out.
    //wykonac operacje sunujące sumujące itp na każdej masznie. i tyle

 //