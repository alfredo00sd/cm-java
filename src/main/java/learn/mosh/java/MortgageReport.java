package learn.mosh.java;

import java.text.NumberFormat;

class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;
    private int monthIndex = 1;

    MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    void printMortgage(){

        double mortgage = calculator.calculateMortgage();

        System.out.println("\n========= Mortgage Calculator ======");
        System.out.println("Monthly payments : " + currency.format(mortgage));
        System.out.println("=========== --------------- ========== \n");
    }

    void printPaymentSchedule(){

        System.out.println("********* Payment Schedule ***********");

        for (double balance : calculator.getRemainingBalances()) {
            System.out.println("Month(" + monthIndex + ")" + currency.format(balance));
            monthIndex++;
        }
        System.out.println("**************************************");
    }
}
