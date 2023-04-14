package _1_solid._1_single_responsibility;

public class SingleResponsibilityMain_After {

    public static void run(){

        // Input
        Pair pair = InputProcessor.input();

        // Validation/ Check
        if(!ValidationChecker.isValid(pair)){
            System.out.println("Either first or second input is not a number");
            return;
        }

        int num1 = Integer.valueOf(pair.getFirst());
        int num2 = Integer.valueOf(pair.getSecond());

        // Calculation
        int result = Operation.addition(num1, num2);

        System.out.println("Addition: " + result);



    }
}
