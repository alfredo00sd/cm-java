package learn.mosh.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        System.out.println("============= Mortgage Calculator ============= ");

        int principal = (int)readNumber("Principal: ",1000,5_000_000);
        float annualInterest = (float)readNumber("Annual interest rate: ",1,30);
        byte years = (byte)readNumber("Period in years: ", 1, 50);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        System.out.println("============= ------------------- ============= \n");

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The mortgage is : " + mortgageFormatted);
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

    public static double calculateMortgage(int principal, float annualInterest, int years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return   principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
