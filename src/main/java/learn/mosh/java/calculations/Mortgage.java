package learn.mosh.java.calculations;

import learn.mosh.java.utils.Common;

import java.text.NumberFormat;

public class Mortgage {

    public static void print() {

        System.out.println("============= Mortgage Calculator ============= ");

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(calculate());

        System.out.println(" ============= ----------------- ============= \n");

        System.out.println("Monthly payments : " + mortgageFormatted);
    }

    private static double calculate() {
        return Common.getPrincipal()
                * (Common.getMonthlyInterest() * Math.pow(1 + Common.getMonthlyInterest(), Common.getNumberOfPayments()))
                / (Math.pow(1 + Common.getMonthlyInterest(), Common.getNumberOfPayments()) - 1);
    }
}
