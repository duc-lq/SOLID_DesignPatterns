package _1_solid_principles._4_interface_segregation._2_after;

public class BinarySearchTree2 implements Tree2 {
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
}
