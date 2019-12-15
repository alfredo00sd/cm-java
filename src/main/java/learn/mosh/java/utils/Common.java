package learn.mosh.java.utils;

import java.util.Scanner;

public class Common {

    //Validate inputs from the user
    private static int principal = (int) readNumber("Principal: ",1000,5_000_000);
    private static float annualInterest = (float) readNumber("Annual interest rate: ",1,30);
    private static byte years = (byte) readNumber("Period in years: ", 1, 50);

    //Constants
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    //preloaded formulas
    private static float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
    private static short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

    private static double readNumber(String prompt, double min, double max){

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

    public static float getMonthlyInterest() {
        return monthlyInterest;
    }

    public static short getNumberOfPayments() {
        return numberOfPayments;
    }

    public static int getPrincipal() {
        return principal;
    }

    public static byte getYears() {
        return years;
    }

    public static byte getMonthsInYear() {
        return MONTHS_IN_YEAR;
    }
}
