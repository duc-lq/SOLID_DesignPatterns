package _1_solid_principles._4_interface_segregation._2_after;

public class BalancedTree2 implements RotationTree2{

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
        System.out.println(this.getClass().getSimpleName() + " > Left Rotation...");
    }

    @Override
    public void rightRotation() {
        System.out.println(this.getClass().getSimpleName() + " > Right Rotation...");
    }
}
