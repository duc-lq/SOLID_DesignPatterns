package _2_design_patterns._1_creational._2_factory._2_abstract_factory.factory;

import _2_design_patterns._1_creational._2_factory._2_abstract_factory._enum.Brand;
import _2_design_patterns._1_creational._2_factory._2_abstract_factory.product.Product;

public interface AbstractFactory {

    public Product getProduct(Brand brand);
}
