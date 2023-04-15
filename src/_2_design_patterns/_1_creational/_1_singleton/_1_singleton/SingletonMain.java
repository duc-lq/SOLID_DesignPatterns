package _2_design_patterns._1_creational._1_singleton._1_singleton;

public class SingletonMain {

    public static void main(String[] args){
        System.out.println("* EAGER SINGLETON");
        DatabaseConnectorEager dbc1 = DatabaseConnectorEager.getInstance();
        dbc1.connect();
        dbc1.disconnect();

        DatabaseConnectorEager dbc2 = DatabaseConnectorEager.getInstance();

        if(dbc1 == dbc2){
            System.out.println("Check instances : Two instances are the same");
        }

        System.out.println("\n* LAZY SINGLETON");
        DatabaseConnectorLazy dbc3 = DatabaseConnectorLazy.getInstance();
        dbc3.connect();
        dbc3.disconnect();

        DatabaseConnectorLazy dbc4 = DatabaseConnectorLazy.getInstance();

        if(dbc3 == dbc4){
            System.out.println("Check instances : Two instances are the same");
        }
    }
}
