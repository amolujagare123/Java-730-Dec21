package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     // 1.  Loading a driver ( download the driver corresponding to you database ) https://dev.mysql.com/downloads/connector/j/

        Class.forName("com.mysql.cj.jdbc.Driver");

      // 2.  Creating a connection
        String username ="root";
        String password ="root";
        String url = "jdbc:mysql://localhost:3306/730batch1";
        Connection con = DriverManager.getConnection(url,username,password);

     // 3.  Creating statement
        Statement st = con.createStatement();

     // 4.  Executing query (DML queries)

       // String sql = "insert into student1 values(11,'Jitendra','IT','56')";
        String sql = "update persons set age=40 where id =1";
        // String sql1 = "insert into student1 values(11,\"Jitendra\",\"IT\",\"56\")";

        // try update and delete

        st.executeUpdate(sql);
    }
}
