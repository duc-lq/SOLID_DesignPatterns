package _2_design_patterns._1_creational._1_singleton._1_singleton;

public class DatabaseConnectorInMultiThreads {

    private static DatabaseConnectorInMultiThreads INSTANCE;

    private DatabaseConnectorInMultiThreads(){}

    public static DatabaseConnectorInMultiThreads getInstance(){
        if(INSTANCE == null){
            // Handle in case we have multiple threads

            // This block can just be entered by a single thread at a time
            // Synchronized block - very slow (100x slower than Non-Synchronized block) -> Use Enum
            synchronized (DatabaseConnectorInMultiThreads.class){

                if(INSTANCE == null){
                    INSTANCE = new DatabaseConnectorInMultiThreads();
                }

            }
        }
        return INSTANCE;
    }

    public void connect(){
        System.out.println("Connecting to Database...");
    }

    public void disconnect(){
        System.out.println("Disconnecting Database...");
    }
}
