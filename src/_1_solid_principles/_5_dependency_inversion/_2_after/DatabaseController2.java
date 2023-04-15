package _1_solid_principles._5_dependency_inversion._2_after;

public class DatabaseController2 {

    private Database db;

    public DatabaseController2(Database db){
        this.db = db;
    }

    public void connect(){
        this.db.connect();
    }

    public void disconnect(){
        this.db.disconnect();
    }
}
