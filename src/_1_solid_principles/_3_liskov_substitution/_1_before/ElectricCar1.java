package _1_solid_principles._3_liskov_substitution._1_before;

public class ElectricCar1 extends Vehicle1 {

    public ElectricCar1(String type, int age) {
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
    public void fuel() throws Exception{
        throw new Exception("ElectricCar cannot be fueled...");
    }
}
