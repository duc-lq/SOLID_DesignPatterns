package _1_solid_principles._3_liskov_substitution._2_after;

public abstract class Vehicle2 {

    protected String type;
    protected int age;

    public Vehicle2(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void speedUp(){
        System.out.println("Vehicle is speeding up...");
    }

    public void slowDown(){
        System.out.println("Vehicle is slowing down...");
    }

    public abstract void fuel();
}
