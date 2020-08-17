import java.sql.*;
import java.util.Scanner;
public class lab9
{
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet result;
    private static ResultSetMetaData resultSMD;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String query;
        final String URL = "jdbc:mysql://localhost/librarytable?serverTimezone=Europe/Kiev&useSSL=false";
        final String USER = "root";
        final String PASSWORD = "61hovumo";
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.prepareStatement("USE 'librarytable'").executeQuery();
            query = "show tables";
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i));
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++) {
                    System.out.print(result.getString(i));
                }
                System.out.println();
            }
            System.out.println("\nMAX PRICE");
            query =  "SELECT MAX(Price) AS max_pr FROM goods;";
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }
            System.out.println("\n");
            query =  "select Name, Amount, Price from goods where (Amount > 50 and Price < 4500) and Name like 'Iphone%'";
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }
            System.out.println("\n");
            query =  "select Name, Amount, Price from goods where (Amount > 50 and Amount < 500 and Price < 4500) order by Amount desc ";
            //System.out.println("Query : " + query);
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }

            System.out.println("\nadding data to table");
            query =  "insert into provider(provider.First_Name, provider.Last_Name, provider.number, provider.Goods, provider.Delivery_Time, provider.Amount, provider.Note, provider.Producer) values ('midsf', 'Lordbrock','944662179','fgfdgdf','24.12.20', '20','-','usa')";
            connection.prepareStatement(query).executeQuery();
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }
            //System.out.println("\nQuery with UPDATE:");
            query =  "update goods set name = 'DDDDDDDDDD' where goods_code = 11;";
            System.out.println("Query : " + query);
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }
            System.out.println("\nQuery with UPDATE:");
            query =  "update provider set provider.First_Name = 'LASTLAB9' where id = 2;";
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            preparedStatement = connection.prepareStatement(query);
            result = preparedStatement.executeQuery();
            resultSMD = result.getMetaData();
            for (int i = 1; i <= resultSMD.getColumnCount(); i++)
            {
                System.out.print(resultSMD.getColumnName(i) + "\t|\t");
            }
            System.out.println();
            while (result.next())
            {
                for (int i = 1; i <= resultSMD.getColumnCount(); i++)
                {
                    System.out.print(result.getString(i) + "\t|\t");
                }
                System.out.println();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
