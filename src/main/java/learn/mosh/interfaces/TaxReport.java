package learn.mosh.interfaces;

public class TaxReport {

    private TaxCalculator calculator;

    //Not need to create the object, just used. when you implement a class

//    public TaxReport(TaxCalculator calculator){
//        //Constructor injection,,,
//        this.calculator = calculator;
//    }
    public void show(TaxCalculator calculator){
        double tax =  calculator.calculateTax();
        System.out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
