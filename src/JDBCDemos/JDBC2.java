package JDBCDemos;

import java.sql.*;

public class JDBC2 {

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

     // 4.  Executing query (DDL queries)

       /*  String sql = "select * from persons";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("fName")+"\t");
            System.out.print(rs.getString("lName")+"\t");
            System.out.println(rs.getInt("age"));
        }*/

        String sql = "select * from student1";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("firstName")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }

        st.close();
        con.close();
    }
}
