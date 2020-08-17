import java.sql.*;
import java.util.Scanner;

public class DBHelper {
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet result;
    private static ResultSetMetaData resultSMD;

    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        String query;
        final String URL = "jdbc:mysql://localhost:3306/librarytable";
        final String dbName = "librarytable";
        final String USER = "root";
        final String PASSWORD = "61hovumo";

        Connection con = null;

        con = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement st = con.createStatement();

        DatabaseMetaData meta = con.getMetaData();
        ResultSet rs1 = meta.getTables(null, null, null, new String[]{"TABLE"});
        ResultSet rs2 = meta.getTables(null, null, "%", null);
        System.out.println("One way of Listing Tables");
        while (rs1.next()) {
            System.out.println(rs1.getString("TABLE_NAME"));
        }
        System.out.println("Another way of Listing Tables");
        while (rs2.next()) {
            System.out.println(rs2.getString(3));
        }


    }
}
