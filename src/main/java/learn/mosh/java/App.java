package learn.mosh.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        /*  Mortgage equation
                M = P r(1+r)^n / (1+r)^n -1
            Rate equation
                n% = n / 100, this result is divided by 12 and you will get the rate

            M is your monthly payment.
            P is your principal.
            r is your monthly interest rate, calculated by dividing your annual interest rate by 12.
            n is your number of payments (the number of months you will be paying the loan)
        */
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float annualInterest;
        int numberOfPayments;
        float monthlyInterest;

        Scanner sc = new Scanner(System.in);

        System.out.println("============= Mortgage Calculator ============= ");

        while (true) {

            System.out.print("Principal : ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 5_000_000)
                break;
            System.out.println("Ingrese un valor entre 1000 y 5,000,000");
        }

        while (true) {
            System.out.print("Annual interest rate : ");
            annualInterest = sc.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            } else {
                System.out.println("Ingrese un valor entre 1 y 30");
            }
        }

        while (true) {
            System.out.print("Period in years : ");
            byte years = sc.nextByte();
            if (years >= 1 && years <= 50) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Ingrese un valor entre 1 y 50");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The mortgage is : " + mortgageFormatted);
    }

}
