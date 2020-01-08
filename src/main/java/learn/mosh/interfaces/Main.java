package learn.mosh.interfaces;

public class Main {

    //We use interfaces to build loosely-coupled, extensible, testable applications.
    //Interfaces are about What, and classes are about how.

    public static void main(String[] args) {

        TaxCalculator2020 calculator = new TaxCalculator2020(100_000);
        TaxReport report = new TaxReport();
        report.show(calculator);

        //Setter injection
//        report.setCalculator(new TaxCalculator2019());
//        report.show();

        //Method injection
        report.show(new TaxCalculator2019());
    }
}
