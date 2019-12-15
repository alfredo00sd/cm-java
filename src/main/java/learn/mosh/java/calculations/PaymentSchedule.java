package learn.mosh.java.calculations;

import learn.mosh.java.utils.Common;

import java.text.NumberFormat;

public class PaymentSchedule {

    public static void print(){

        System.out.println("Payment Schedule \n" +
                "**************************************");

        for (short month = 1; month <= (Common.getYears() * Common.getMonthsInYear()); month++ ){

            double balance = calculate(month);

            System.out.println("Month ("+month+") " + NumberFormat.getCurrencyInstance().format(balance));
        }

        System.out.println("**************************************");
    }

    private static double calculate(short month){
        return Common.getPrincipal()
                * (Math.pow(1 + Common.getMonthlyInterest(), Common.getNumberOfPayments())
                - Math.pow(1 + Common.getMonthlyInterest(), month))
                / (Math.pow(1 + Common.getMonthlyInterest(), Common.getNumberOfPayments()) - 1);
    }
}
