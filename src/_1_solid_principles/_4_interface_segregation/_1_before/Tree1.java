package _1_solid_principles._4_interface_segregation._1_before;

public interface Tree1 {

    // "Fat interfaces"

    // Methods related to "Binary Search Tree"
    public void insert();
    public void delete();
    public void traverse();

    // Methods related to "Balanced Tree"
    public void leftRotation();
    public void rightRotation();
}