import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class services {
    //eingabe services in ein ArrayList
    // ArrayList wird itteriert und damit die eweilige ID des Cervices eingeschrieben
    public static void cerviceID(){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> serviceID = new ArrayList<>();

        //Eingabe der IDs
        System.out.println("Folgende Dienstleistungen werden angeboten:\n" +
                "1 = Staub saugen\n" +
                "2 = Boden wischen\n"+
                "3 = Staub wischen\n"+
                "durch komma getrennt bitte eingeben.");
        String input = scanner.nextLine();

        // Eingabe aufteilen und in Integer umwandeln


    }

    public static void setCustomer(String name, String email, String phone, String address) {
        String sql = "INSERT INTO customers (name, email, phone, address) VALUES (?,?,?,?)";

        try (Connection con = ConnectDB.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, phone);
            pst.setString(4, address);
            int affectedRows = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
