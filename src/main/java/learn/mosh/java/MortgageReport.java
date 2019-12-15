package learn.mosh.java;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    void printMortgage(){

        double mortgage = calculator.calculateMortgage();

        System.out.println("\n========= Mortgage Calculator ========");
        System.out.println("Monthly payments : " + currency.format(mortgage));
        System.out.println("=========== --------------- ========== \n");
    }

    void printPaymentSchedule(){

        System.out.println("Payment Schedule");
        System.out.println("**************************************");

        for (double balance : calculator.getRemainigBalances())
            //System.out.println("Month ("+month+") " + NumberFormat.getCurrencyInstance().format(calculateBalance(month)));
            System.out.println(currency.format(balance));

        System.out.println("**************************************");
    }
}
