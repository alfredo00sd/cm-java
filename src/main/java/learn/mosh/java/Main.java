package learn.mosh.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How can i call you?");
        String userInput = sc.nextLine();

        greetUser(userInput);
        sc.close();
    }

    private static void greetUser(String name){
        System.out.println("Hi, " + name);
    }
}
