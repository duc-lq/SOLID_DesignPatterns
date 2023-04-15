package _2_design_patterns._1_creational._2_factory._1_factory;

public class FactoryMain {

    /*
        FACTORY DESIGN PATTERN

        - To create loosely coupled OOP design

        We should favor abstraction (supertypes) instead of concrete implementations
    */

    public static void main(String[] args){
        Animal animal = AnimalFactory.getAnimal(AnimalType.TIGER);
        animal.eat();
    }

}
