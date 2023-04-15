package _1_solid_principles._3_liskov_substitution;

import _1_solid_principles._3_liskov_substitution._1_before.ElectricCar1;
import _1_solid_principles._3_liskov_substitution._1_before.PetrolCar1;
import _1_solid_principles._3_liskov_substitution._1_before.Vehicle1;

import _1_solid_principles._3_liskov_substitution._2_after.ElectricCar2;
import _1_solid_principles._3_liskov_substitution._2_after.PetrolCar2;
import _1_solid_principles._3_liskov_substitution._2_after.Vehicle2;

public class LiskovSubstitutionMain {

    /*
        LISKOV SUBSTITUTION PRINCIPLE

        => "Object of superclass shall be replaceable with objects of its subclassed WITHOUT BREAKING the application"

    */

    public static void run(){

        // Before
        Vehicle1 v11 = new PetrolCar1("Sedan", 9);
        v11.speedUp();
        v11.slowDown();
        try {
            v11.fuel();
        }catch(Exception e){
            e.printStackTrace();
        }

        Vehicle1 v12 = new ElectricCar1("SUV", 3);
        v12.speedUp();
        v12.slowDown();

        try {
            v12.fuel();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.print("\n");

        // After
        Vehicle2 v21 = new PetrolCar2("Hatchback", 2);
        v21.speedUp();
        v21.slowDown();
        v21.fuel();

        Vehicle2 v22 = new ElectricCar2("MUV", 6);
        v22.speedUp();
        v22.slowDown();
        v22.fuel();

    }
}
