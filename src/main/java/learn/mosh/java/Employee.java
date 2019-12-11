package learn.mosh.java;

//Coupling -- dependency of class to other.
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //Constructor helps to initialize the object to some value at the creation time and avoid
    // problems of empty variable or method.

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public Employee(int baseSalary) {
        this(baseSalary,0);
        //setBaseSalary(baseSalary)
        //setHourlyRate(0)
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {

        if(baseSalary <= 0){
            //use throw to stop the program and send the exception
            throw new IllegalArgumentException("Salary can not be 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0){
            //use throw to stop the program and send the exception
            throw new IllegalArgumentException("hourly rate can not be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }
}

