// code related to establishing MySQL DB connectivity of the program

package CodingInterfaces;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectivity {
    // Establishes connection to the database by creating a connection object
    // and returns the created connection object to the caller
    public Connection getDBConnection() throws Exception{
        final String DBURL="jdbc:mysql://localhost:3306/heart_beat_db";
        final String USERNAME="root";
        final String PASSWORD="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        return conn;
    }
}
