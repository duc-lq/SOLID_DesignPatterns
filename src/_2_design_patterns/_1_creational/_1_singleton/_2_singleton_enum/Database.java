package _2_design_patterns._1_creational._1_singleton._2_singleton_enum;

public enum Database {

    // Acquiring Enum INSTANCE is THREAD SAFE
    // No need to use Synchronized block
    INSTANCE;

    public void connect(){
        System.out.println(this.getClass().getSimpleName() + " > Connecting to Database...");
    }

    public void disconnect(){
        System.out.println(this.getClass().getSimpleName() + " > Disconnecting to Database...");
    }
}
