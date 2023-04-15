package _2_design_patterns._1_creational._1_singleton._1_singleton;

public class DatabaseConnectorLazy {

    private static DatabaseConnectorLazy INSTANCE;

    private DatabaseConnectorLazy(){}

    public static DatabaseConnectorLazy getInstance(){
        if(INSTANCE == null) INSTANCE = new DatabaseConnectorLazy();
        return INSTANCE;
    }

    public void connect(){
        System.out.println(this.getClass().getSimpleName() + " > Connecting to Database");
    }

    public void disconnect(){
        System.out.println(this.getClass().getSimpleName() + " > Disconnecting Database");
    }


}
