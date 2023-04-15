package _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Brand;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.normal.LgNormal;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.normal.PanasonicNormal;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.product.Product;

public class NormalProductFactory implements AbstractFactory{

    @Override
    public Product getProduct(Brand brand){
        if(brand == Brand.LG){
            return new LgNormal();
        }else if(brand == Brand.PANASONIC){
            return new PanasonicNormal();
        }
        return null;

    }
}
