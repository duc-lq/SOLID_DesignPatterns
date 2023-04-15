package _2_design_patterns._1_creational._2_factory._1_factory;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType type){
        if(type == AnimalType.CAT){
            return new Cat();
        }else if(type == AnimalType.DOG){
            return new Dog();
        }else if(type == AnimalType.LION){
            return new Lion();
        }else if(type == AnimalType.TIGER){
            return new Tiger();
        }
        return null;
    }
}
