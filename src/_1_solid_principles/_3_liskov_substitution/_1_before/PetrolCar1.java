package _1_solid_principles._3_liskov_substitution._1_before;

public class PetrolCar1 extends Vehicle1 {
    public PetrolCar1(String type, int age) {
        super(type, age);
    }

    @Override
    public void speedUp(){
        System.out.println("PetrolCar is speeding up...");
    }

    @Override
    public void slowDown(){
        System.out.println("PetrolCar is slowing down...");
    }

    @Override
    public void fuel() throws Exception{
        System.out.println("PetrolCar is being fueled...");
    }
}
