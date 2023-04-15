package _1_solid_principles._3_liskov_substitution._1_before;

public class Vehicle1 {

    protected String type;
    protected int age;

    public Vehicle1(String type, int age){
        this.type = type;
        this.age = age;
    }

    public void speedUp(){
        System.out.println("Vehicle is speeding up...");
    }

    public void slowDown(){
        System.out.println("Vehicle is slowing down...");
    }

    public void fuel() throws Exception{
        System.out.println("Vehicle is being fueled...");
    }
}
