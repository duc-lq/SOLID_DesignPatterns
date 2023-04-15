package _1_solid_principles._3_liskov_substitution._2_after;

public class PetrolCar2 extends Vehicle2{

    public PetrolCar2(String type, int age){
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
    public void fuel() {
        System.out.println("PetrolCar is being fueled...");
    }


}
