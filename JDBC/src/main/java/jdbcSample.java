import java.sql.*;

public class jdbcSample {
    public static void main(String[] args) {

        // 声明连接connection
        Connection connection = null;
        try {
            // 连接到数据库
            connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/sample.db");
            // 事务
            Statement statement = connection.createStatement();
            // 设定SQL执行超时时间（秒），超时则抛出SQLException
            statement.setQueryTimeout(30);

            // 删除原有的person表
            statement.executeUpdate("drop table if exists person");
            // 创建person表以及声明其结构
            statement.executeUpdate("create table person(id integer not null, name string not null)");
            // 插入数据
            statement.executeUpdate("insert into person values(1, 'wz')");
            statement.executeUpdate("insert into person values(2, 'yz')");
            // 选择数据，*为全部，放入ResultSet实例中
            ResultSet rs = statement.executeQuery("select * from person");
            // 遍历输出
            while(rs.next()) {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }

            System.out.println("---------------------------------");

            // 更新数据
            statement.executeUpdate("update person set name = 'zz' where id = 1");
            statement.executeUpdate("update person set id = 3 where name = 'yz'");
            rs = statement.executeQuery("select * from person");
            while(rs.next()) {
                // read the result set
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }

            System.out.println("---------------------------------");
            // 删除数据
            statement.executeUpdate("delete from person where name = 'zz'");
            rs = statement.executeQuery("select * from person");
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
