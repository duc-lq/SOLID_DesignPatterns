package _1_solid_principles._5_dependency_inversion._1_before;

// Low level module
public class OracleDatabase1 {

    public void connect(){
        System.out.println("Connecting to " + this.getClass().getSimpleName());
    }

    public void disconnect(){
        System.out.println("Disconnecting " + this.getClass().getSimpleName());
    }

}
