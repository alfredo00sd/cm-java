package learn.mosh.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class App 
{

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    public static void main( String[] args ) {

        System.out.println("============= Mortgage Calculator ============= ");

        int principal = (int)readNumber("Principal: ",1000,5_000_000);
        float annualInterest = (float)readNumber("Annual interest rate: ",1,30);
        byte years = (byte)readNumber("Period in years: ", 1, 50);

        printMortgage(principal,annualInterest,years);
        printPaymentSchedule(principal,annualInterest,years);
    }

    public static double readNumber(String prompt, double min, double max){

        Scanner sc = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = sc.nextFloat();
            if (value >= min && value <= max)
                break;
            else {
                System.out.println("Ingrese un valor entre " + min + " y " + max);
            }
        }
        return value;
    }

    private static void printMortgage(int principal, float annualInterest, byte years){

        double mortgage = calculateMortgage(principal, annualInterest, years);
        System.out.println("============= ------------------- ============= \n");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly payments : " + mortgageFormatted);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years){

        System.out.println("Payment Schedule \n");
        System.out.println("**************************************");

        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++ ){
            double balance = calculateBalance(principal,annualInterest,years,month);

            System.out.println("Month ("+month+") " + NumberFormat.getCurrencyInstance().format(balance));
        }
        System.out.println("**************************************");
    }

    //Schedule payments.
    //Formula B = L[(1+c)^n - (1+c)^p] / [(c+1)^n - 1]
    /* L(Long time payment) = principal.
     *  c = monthly interest.
     *  p = number of payments made.
     *  n = number of payments.
     *  B = remind balance.
     * */
    public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateMortgage(int principal, float annualInterest, int years){

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return   principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
