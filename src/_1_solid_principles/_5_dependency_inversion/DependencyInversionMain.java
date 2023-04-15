package _1_solid_principles._5_dependency_inversion;

import _1_solid_principles._5_dependency_inversion._1_before.DatabaseController1;
import _1_solid_principles._5_dependency_inversion._2_after.Database;
import _1_solid_principles._5_dependency_inversion._2_after.DatabaseController2;
import _1_solid_principles._5_dependency_inversion._2_after.OracleDatabase2;

public class DependencyInversionMain {

    /*
        DEPENDENCY INVERSION PRINCIPLE

        => "High-level modules SHOULD NOT DEPEND on Low-level modules.
            Both should depend on ABSTRACTIONS"

    */

    public static void run(){
        System.out.println("BEFORE");
        // When updating Database, need to update in low level module
        DatabaseController1 dbc1 = new DatabaseController1();

        dbc1.connect();
        dbc1.disconnect();

        System.out.println("\nAFTER");
        // When updating Database, just need to update in high level module, no need to update in low level module
        Database db;

        // Select one out of two options and do update right on high level module
        //db = new MySQLDatabase2();
        db = new OracleDatabase2();

        DatabaseController2 dbc2 = new DatabaseController2(db);
        dbc2.connect();
        dbc2.disconnect();
    }
}
