package Database;

import java.util.Scanner;

//Temporary Database.Menu. Will be replaced with GUI.
public class Menu {
    Scanner choose = new Scanner(System.in);
    static DBConnect connect = new DBConnect();
    public Menu() {

        String choice = null;
        while (!"end".equals(choice)) {
            System.out.println("Select option:\n" +
                    "1) Add New Members\n" +
                    "2) Edit Member\n" +
                    "3) View Members\n" +
                    "4) Exit\n");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                connect.pushNewMemberData();
                choice = null;
            }
            if ("2".equals(choice)) {
                //Database.EditMemberData
                choice = null;
            }
            if ("3".equals(choice)) {
                PullMemberMenu();
                choice = null;
            }
            if ("4".equals(choice)) {
                System.exit(0);
                choice = null;
            }
        }
        choose.close();
    }

    public void PullMemberMenu() {
        String choice = null;
        while (!"end".equals(choice)) {
            System.out.println("Select option:\n" +
                    "1) View all members\n" +
                    "2) View Member by ID\n" +
                    "3) Back\n");
            choice = choose.nextLine();
            if ("1".equals(choice)) {
                new PullMemberData();
                choice = null;
            }
            if ("2".equals(choice)) {
                PullMemberData.PullMemberByID();
                choice = null;
            }
            if ("3".equals(choice)) {
                break;
            }
        }
    }

   /* public void MakeNewMember(){
        String choice = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        String sql = "insert into club_members "
                + " (FirstName, LastName, Adress)" + " values (?, ?, ?)";

        myStmt = myConn.prepareStatement(sql);

        myStmt.setString(1, lastName);
        myStmt.setString(2, firstName);
        myStmt.setString(3, address);

        myStmt.executeUpdate();

    }*/
}

