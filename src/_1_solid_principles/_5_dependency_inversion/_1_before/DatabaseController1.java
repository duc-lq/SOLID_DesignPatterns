package _1_solid_principles._5_dependency_inversion._1_before;

// High level module
public class DatabaseController1 {

    //private MySQLDatabase database;
    private OracleDatabase1 database;

    /*
        When updating low level module, we also need to update high level module
        -> violate SOLID principles (especially Dependency Inversion Principle)
    */

    public DatabaseController1(){
        //database = new MySQLDatabase();
        database = new OracleDatabase1();
    }

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.disconnect();
    }
}
