package _1_solid_principles._4_interface_segregation;

import _1_solid_principles._4_interface_segregation._1_before.BalancedTree1;
import _1_solid_principles._4_interface_segregation._1_before.BinarySearchTree1;
import _1_solid_principles._4_interface_segregation._1_before.Tree1;
import _1_solid_principles._4_interface_segregation._2_after.BalancedTree2;
import _1_solid_principles._4_interface_segregation._2_after.BinarySearchTree2;
import _1_solid_principles._4_interface_segregation._2_after.RotationTree2;
import _1_solid_principles._4_interface_segregation._2_after.Tree2;

public class InterfaceSegregationMain {

    /*
        INTERFACE SEGREGATION PRINCIPLE

        => "Software modules (classes and methods) should NOT be forced to DEPEND upon INTERFACES that THEY DO NOT USE"

    */

    public static void run(){

        // Before
        System.out.println("BEFORE");
        Tree1 t11 = new BinarySearchTree1();
        t11.insert();
        t11.delete();
        t11.traverse();
        t11.leftRotation();
        t11.rightRotation();
        System.out.println("* ATTENTION: \nWe call leftRotation and rightRotation methods here but there is nothing happens.\nThere is no implementation in the body of those methods -> violate Interface Segregation Principle.\nCheck the body of those methods for more details.");

        System.out.println();
        Tree1 t12 = new BalancedTree1();
        t12.insert();
        t12.delete();
        t12.traverse();
        t12.leftRotation();
        t12.rightRotation();

        System.out.println("\nAFTER");
        // After
        Tree2 t21 = new BinarySearchTree2();
        t21.insert();
        t21.delete();
        t21.traverse();
        // * ATTENTION: There is no leftRotation and rightRotation here (t21)
        System.out.println("* ATTENTION:\nThere is no leftRotation and rightRotation methods in the class. \nWe did not Override the method without concrete implementation in the body (NO those methods in the class) \n-> NOT violate Interface Segregation Principle.");

        System.out.println();
        RotationTree2 t22 = new BalancedTree2();
        t22.insert();
        t22.delete();
        t22.traverse();
        t22.leftRotation();
        t22.rightRotation();







    }
}
