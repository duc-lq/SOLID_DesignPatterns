package _1_solid_principles._1_single_responsibility;

import _1_solid_principles._1_single_responsibility._1_before.SingleResponsibilityMain_Before;

public class SingleResponsibilityMain {

    /*
        SINGLE RESPONSIBILITY PRINCIPLE

        => "A Class should have only ONE reason to change"

        - Every single software entity (class or method) should have only a SINGLE REASON to change
        - If a given CLASS/ or METHOD does multiple operations then it is advisable to separate into DISTINCT CLASSES/ or METHOD

        HINT:
        - If there are 2+ reasons to change a given class then it is a sign of violating the SINGLE RESPONSIBILITY Principle
        - Each class or method handles just a single responsibility
        - This is how we can achieve LOOSELY COUPLED software components

    */

    public static void run(){
        SingleResponsibilityMain_Before.run();
        //SingleResponsibilityMain_After.run();
    }
}
