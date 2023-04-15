package _2_design_patterns._1_creational._1_singleton._2_singleton_enum;

public class SingletonEnumMain {

    public static void main(String[] args){
        System.out.println("* Singleton using Enum");
        Database dbc1 = Database.INSTANCE;
        dbc1.connect();
        dbc1.disconnect();

        Database dbc2 = Database.INSTANCE;
        if(dbc1 == dbc2){
            System.out.println("Check instances : Two instances are the same");
        }
    }
}
