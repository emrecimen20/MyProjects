package Week6.DBApp;

import java.sql.*;

public class DBConnect {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/employee";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "130440";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees ";
        try {
            // Veri tabanına bağlanma işlemi
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);

           // Tablodaki elemanlarını tüm verileriyle yazdırdım
           while(data.next()){
               System.out.println("ID : " + data.getInt("id"));
               System.out.println("Name : " + data.getString("name"));
               System.out.println("Position : " + data.getString("position"));
               System.out.println("Salary : " + data.getInt("salary"));
               System.out.println("################");
           }
        } catch (SQLException e) {
            System.out.println(e.getMessage());        }
    }
}
