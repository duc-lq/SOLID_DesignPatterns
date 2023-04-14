package _1_solid._1_single_responsibility;

import java.util.Scanner;

public class SingleResponsibilityMain_Before {

    public static void run(){

        // Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String first = sc.nextLine();
        System.out.print("Enter the second number: ");
        String second = sc.nextLine();

        // Validation/Check
        try{
            Integer.parseInt(first);
        }catch(NumberFormatException nfe){
            System.out.println("First one is not a number");
            return;
        }

        try{
            Integer.parseInt(first);
        }catch(NumberFormatException nfe){
            System.out.println("First one is not a number");
            return;
        }

        // Calculation
        int num1 = Integer.valueOf(first);
        int num2 = Integer.valueOf(second);

        int result = num1 + num2;
        System.out.println("Result: " + result);

        sc.close();

    }
}
