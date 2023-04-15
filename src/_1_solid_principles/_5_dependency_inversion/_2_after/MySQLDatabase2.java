package _1_solid_principles._5_dependency_inversion._2_after;

public class MySQLDatabase2 implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting to " + this.getClass().getSimpleName());
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting " + this.getClass().getSimpleName());
    }
}
