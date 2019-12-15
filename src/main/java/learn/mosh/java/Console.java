package learn.mosh.java;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static double readNumber(String prompt){
        return sc.nextDouble();
    }

    static double readNumber(String prompt, double min, double max){

        double value;

        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();
            if (value >= min && value <= max)
                break;
            else {
                System.out.println("Ingrese un valor entre " + min + " y " + max);
            }
        }
        return value;
    }

}
