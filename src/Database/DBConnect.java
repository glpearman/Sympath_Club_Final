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
    //Pulls all data from the databse and displays it
    public void getData(){
        try{
            String query = "select * from club_members";
            rs = st.executeQuery(query);
            System.out.println("Records From Database:");
            while(rs.next()){
                int memberID = rs.getInt("MemberID");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                int balance = rs.getInt("Balance");
                int linkedAccounts = rs.getInt("LinkedAccounts");

                System.out.println(memberID +" "+
                        firstName + " " +
                        lastName + " " +
                        address + " " +
                        balance + " " +
                        linkedAccounts + " " + "\n");
            }
        }catch (Exception ex){
            System.out.println("Error: " +ex);
        }
    }
    //Takes user input for an ID, then retrives all data about that member with the matching ID
    public  void getDataByID(){
        try{
            String query = "select * from club_members";
            rs = st.executeQuery(query);
            getData();
        }catch (Exception ex){
            System.out.println("Error: " +ex);
        }
    }
    //Gets the last MemberID in the MemberID column and increments it by 1 when a new member is initialized
    public int newMemberIdFactory(){
        try{
            String query = "select MemberID from club_members order by MemberID DESC";
            rs = st.executeQuery(query);
            while(rs.next()) {
                int memberID = rs.getInt("MemberID");
                int newMemberID = memberID + 1;
                System.out.println(newMemberID);
                return newMemberID;
            }
        }catch (Exception ex){
            System.out.println("Error: " +ex);
        }
        return 0;
    }
    //Pushes the newly created member data to the database
    public void pushNewMemberData(){
       /* try{
            String query = "insert into club_members(MemberID, FirstName, LastName, Address)";
            rs = st.executeUpdate(query);

            int memberID = rs.getint("MemberID");
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            String address = rs.getString("Address");


            } catch (SQLException e) {
            e.printStackTrace();
        }
    }catch (Exception ex){
            System.out.println("Error: " +ex);
        }*/
    }
}
