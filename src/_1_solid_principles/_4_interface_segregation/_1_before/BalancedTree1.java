package _1_solid_principles._4_interface_segregation._1_before;

public class BalancedTree1 implements Tree1 {

    @Override
    public void insert() {
        System.out.println(this.getClass().getSimpleName() + " > Inserting an item...");
    }

    @Override
    public void delete() {
        System.out.println(this.getClass().getSimpleName() + " > Removing a given item...");
    }

    @Override
    public void traverse() {
        System.out.println(this.getClass().getSimpleName() + " > Traversing...");
    }

    @Override
    public void leftRotation() {
        // PAY ATTENTION HERE
        System.out.println(this.getClass().getSimpleName() + " > Left Rotation");
    }

    @Override
    public void rightRotation() {
        // PAY ATTENTION HERE
        System.out.println(this.getClass().getSimpleName() + " > Right Rotation");
    }
}
