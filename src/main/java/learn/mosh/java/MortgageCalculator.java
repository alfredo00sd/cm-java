package learn.mosh.java;

public class MortgageCalculator {

    private static final byte MONTHS_IN_YEAR = 12;
    private static final float PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    private double calculateBalance(short numberOfPaymentsMade){

        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    double calculateMortgage(){

        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return   principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    double[] getRemainigBalances(){

        double[] balances = new double[getNumberOfPayments()];

        for (short month = 1; month <= balances.length; month++ )
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
