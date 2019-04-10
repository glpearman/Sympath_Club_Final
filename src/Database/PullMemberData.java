package Database;
import java.util.Scanner;

public class PullMemberData {

    public static void getData(){
        DBConnect connect = new DBConnect();
        try{
            String query = "select * from club_members";
            connect.rs = connect.st.executeQuery(query);
            System.out.println("Records From Database:");
            while(connect.rs.next()){
                int memberID = connect.rs.getInt("MemberID");
                String firstName = connect.rs.getString("FirstName");
                String lastName = connect.rs.getString("LastName");
                String address = connect.rs.getString("Address");
                int balance = connect.rs.getInt("Balance");
                int linkedAccounts = connect.rs.getInt("LinkedAccounts");

                System.out.println(memberID + " " +
                        firstName + " " +
                        lastName + " " +
                        address + " " +
                        balance + " " +
                        linkedAccounts + " " + "\n");
            }
            getDataByName();
        }catch (Exception ex){
            System.out.println("Error: " +ex);
        }
    }

    public static void getDataByName(){
        DBConnect connect = new DBConnect();
        System.out.println("Search by first name");
        Scanner scanner =new Scanner(System.in);
        String name=scanner.next();
        try{
            String query = "select * from club_members where FirstName like ('"+name+'%'+"') order  by MemberID";
            connect.rs = connect.st.executeQuery(query);

            while(connect.rs.next()){
                int memberID = connect.rs.getInt("MemberID");
                String firstName = connect.rs.getString("FirstName");
                String lastName = connect.rs.getString("LastName");
                String address = connect.rs.getString("Address");
                int balance = connect.rs.getInt("Balance");
                int linkedAccounts = connect.rs.getInt("LinkedAccounts");

                System.out.println(memberID + " " +
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
}