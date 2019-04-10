package Database;

public class NewMemberEntry {
    int tempMemberID;
    String tempFirstName;
    String tempLastName;
    String tempAddress;
    DBConnect connect = new DBConnect();
    Menu menu = new Menu();

/*    public void NewMemberEntry() {
        connect.newMemberIdFactory();
        DBConnect newid =  new DBConnect();
        tempMemberID = newid.newMemberIdFactory();
        System.out.println(tempMemberID);
        //menu.MakeNewMember();




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
        /*try{
            String query = "insert into club_members(MemberID, FirstName, LastName, Address)";
            query.executeUpdate(rs);
            int memberID = rs.getInt("MemberID");
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

