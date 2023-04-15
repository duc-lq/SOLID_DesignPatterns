package _2_design_patterns._1_creational._2_factory._2_abstract_factory;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Brand;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Type;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory.AbstractFactory;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory.FactoryProducer;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.product.Product;

public class AbstractFactoryMain {

    /* Example:
       AbstractFactory
           |_ Normal
                |_ Panasonic
                |_ LG
           |_ Inverter
                |_ Panasonic
                |_ LG
    */

    public static void main(String[] args){
        AbstractFactory factory = FactoryProducer.getFactory(Type.NORMAL);
        Product product = factory.getProduct(Brand.LG);
        product.assemble();

    }
}
