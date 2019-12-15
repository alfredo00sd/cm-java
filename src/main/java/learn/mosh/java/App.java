package learn.mosh.java;

public class App
{

    public static void main(String[] args ) {

        int principal = (int) Console.readNumber("Principal: ",1000,5_000_000);
        float annualInterest = (float) Console.readNumber("Annual interest rate: ",1,30);
        byte years = (byte) Console.readNumber("Period in years: ", 1, 50);

        MortgageCalculator calculator = new MortgageCalculator(principal,annualInterest,years);
        MortgageReport report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}
