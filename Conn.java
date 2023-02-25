package BankManagementSystem;
// JDBC connectivity is used here.
// this class is used as object so there is no main class.

/*

 There are 5 Steps to create the connection:
 1. Register the Driver.
 2. Create Connection.
 3. Create Statement.
 4. Execute Query.
 5. Close Connection.

 */
import java.sql.*;
public class Conn {
    Connection c;
    // To create connection. This is the part of step 2.
    Statement s;
    // To create statement. This is the part of step 3.
    public Conn() {
        try{
            // exceptional handling is done because MySQL is an external entity, so it might create run time error.
            // Class.forName(com.mysql.cj.jdbc.Driver); // STEP 1
            // this driver is present in mySQL library.
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Minim@nn1996");
            // we have to create the database so that we can create connection.
            // the above area is the connection with sql database. All this is a CONNECTION STRING.
            // STEP 2
            s = c.createStatement();
            // now after this we have to import a library.

        } catch(Exception e){
            System.out.println("e");
        }
    }
}
