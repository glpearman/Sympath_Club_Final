package Database;
import java.sql.*;

public class DBConnect {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    //Establishes a connection to the database
    public DBConnect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/club_memebers","root", "");
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println("Error: " +ex);
        }
    }
}
