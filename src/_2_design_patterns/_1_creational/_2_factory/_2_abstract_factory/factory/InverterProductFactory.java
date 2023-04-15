package _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Brand;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.inverter.LgInverter;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.inverter.PanasonicInverter;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.product.Product;

public class InverterProductFactory implements AbstractFactory{

    @Override
    public Product getProduct(Brand brand){
        if(brand == Brand.LG){
            return new LgInverter();
        }else if(brand == Brand.PANASONIC){
            return new PanasonicInverter();
        }
        return null;

    }
}
