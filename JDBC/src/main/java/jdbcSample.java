import java.sql.*;

public class jdbcSample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/sample.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            statement.executeUpdate("drop table if exists person");
            statement.executeUpdate("create table person(id integer, name string)");
            statement.executeUpdate("insert into person values(1, 'wz')");
            statement.executeUpdate("insert into person values(2, 'yz')");
            ResultSet rs = statement.executeQuery("select * from person");
            while(rs.next()) {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }
        } catch(SQLException e) {
            // if the error massage is "out of memory" ,
            // it probably means no database file is found.
            System.err.println(e.getMessage());
        } finally {
            try {
                if(connection != null)
                    connection.close();
            } catch(SQLException e) {
                // connection close failed.
                System.err.println(e);
            }

        }
    }
}
