package Database;

public class NewMemberEntry {
    int tempMemberID;
    String tempFirstName;
    String tempLastName;
    String tempAddress;
    DBConnect connect = new DBConnect();
    Menu menu = new Menu();

    public void NewMemberEntry() {
        connect.newMemberIdFactory();
        DBConnect newid =  new DBConnect();
        tempMemberID = newid.newMemberIdFactory();
        System.out.println(tempMemberID);
        //menu.MakeNewMember();




    }
}
