package _2_design_patterns._1_creational._2_factory._2_abstract_factory.inverter;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory.product.Product;

public class PanasonicInverter implements Product {

    @Override
    public void assemble() {
        System.out.println("Assembling " + this.getClass().getSimpleName());
    }

}
