package _2_design_patterns._1_creational._1_singleton._1_singleton;

public class DatabaseConnectorEager {

    private static DatabaseConnectorEager INSTANCE = new DatabaseConnectorEager();

    private DatabaseConnectorEager(){}

    public static DatabaseConnectorEager getInstance(){
        return INSTANCE;
    }

    public void connect(){
        System.out.println(this.getClass().getSimpleName() + " > Connecting to Database...");
    }

    public void disconnect(){
        System.out.println(this.getClass().getSimpleName() + " > Disconnecting Database...");
    }


}
