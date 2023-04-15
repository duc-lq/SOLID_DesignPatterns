package _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Type;

public class FactoryProducer {

    public static AbstractFactory getFactory(Type type){
        if(type == Type.NORMAL){
            return new NormalProductFactory();
        }else if(type == Type.INVERTER){
            return new InverterProductFactory();
        }
        return null;
    }
}
