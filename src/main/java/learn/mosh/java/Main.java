package learn.mosh.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Browser browser = new Browser();
//        browser.navigate("Google");

        new Employee(10_000);
        Employee employee = new Employee(50_000,20);
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        employee.calculateWage();
        System.out.println(wage);

//
//        //Procedural programming is overload a main method calling procedures... or functions on the main.
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//        System.out.println(calculateWage(baseSalary,extraHours,hourlyRate));
    }

//    private static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
//        return baseSalary + (extraHours * hourlyRate);
//    }
}
//Static to make a member part of the class and not replicate that field at the object.
// Non-static fields are part of the object not the class