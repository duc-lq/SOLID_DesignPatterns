package _1_solid_principles._3_liskov_substitution._2_after;

public class ElectricCar2 extends Vehicle2{

    public ElectricCar2(String type, int age){
        super(type, age);
    }

    @Override
    public void speedUp(){
        System.out.println("ElectricCar is speeding up...");
    }

    @Override
    public void slowDown(){
        System.out.println("ElectricCar is slowing down...");
    }

    @Override
    public void fuel(){
        System.out.println("ElectricCar is being charged...");
    }
}
