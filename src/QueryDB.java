import java.sql.*;

public class QueryDB {

    // Alle angestellten ID und Namen werden ausgegeben in einer Schleife, solange ResultSet Next ausgeführt wird.
    public static void allNameIdEmployees(){
        String sql ="SELECT * FROM employees";
        try {
            Connection con = ConnectDB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int getID = rs.getInt("employee_id");
                String getName = rs.getString("name");
                System.out.println("ID: " + getID + " Name: "+ getName);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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

    //Ausgabe der letzten gespeicherten Daten
    public static void getLastInsertCustomer(){
        String sql ="SELECT name, email, phone, address\n" +
                "FROM customers ORDER BY customer_id DESC LIMIT 1;";
        try {
            Connection con = ConnectDB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String getName = rs.getString("name");
                String getEmail = rs.getString("email");
                String getPhone = rs.getString("phone");
                String getAddress = rs.getString("address");

                System.out.println("Folgende Daten wurden erfasst:\n"+
                        "•Name: "+getName + " •E-Mail: "+ getEmail+" •Telefon: "+getPhone+" •Adresse: "+ getAddress);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

