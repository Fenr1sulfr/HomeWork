import java.net.URL;
import java.sql.*;
public class DataBaseHandler extends Config {
    public static final String URL = "jdbc:mysql://localhost:3306/passengers";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "sadboys133722813";
    public DataBaseHandler(){

    }
    public void databaseIdName() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT *FROM users_1");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)
                        + " "
                        +
                        resultSet.getString(2)
                        +resultSet.getInt(3)+
                        resultSet.getString(4)+resultSet.getInt(6));
            }

        } catch (Exception e) {
            System.out.println("badtime");

        }
    }
}
