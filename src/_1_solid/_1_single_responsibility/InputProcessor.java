package _1_solid._1_single_responsibility;

import java.util.Scanner;

public class InputProcessor {

    public static Pair input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String first = sc.nextLine();

        System.out.print("Enter the second number: ");
        String second = sc.nextLine();

        sc.close();
        return new Pair(first, second);
    }
}
