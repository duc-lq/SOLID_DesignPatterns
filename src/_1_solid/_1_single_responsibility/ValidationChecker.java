package _1_solid._1_single_responsibility;

public class ValidationChecker {

    public static boolean isValid(Pair pair){
        String first = pair.getFirst();
        String second = pair.getSecond();

        try{
            Integer.parseInt(first);
        }catch(NumberFormatException nfe){
            return false;
        }

        try{
            Integer.parseInt(second);
        }catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

}
