package Database;

public class PullMemberData {
    static DBConnect connect = new DBConnect();

    public PullMemberData(){
        //Pulls all member data in database
        connect.getData();
    }

    public static void PullMemberByID(){
        connect.getDataByID();
    }
}