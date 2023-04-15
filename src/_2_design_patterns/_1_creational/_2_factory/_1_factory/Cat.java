package _2_design_patterns._1_creational._2_factory._1_factory;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating...");
    }
}
