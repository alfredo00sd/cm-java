package learn.mosh.interfaces;

public interface TaxCalculator {

    double calculateTax();

    //avoid static methods on interfaces... they just only will be used for what will
    // be done, not how. If u need to share a behavior between various classes, then use
    // an abstract class and extend it ot use that logic anywhere.
}
