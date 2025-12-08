package com.example.JdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo2_FetchingAllRecords
{
    public static void main( String[] args ) throws Exception
    {
       
       String url = "jdbc:postgresql://localhost:5432/postgres";
       String uname = "postgres";
       String pass = "Kumar@#100";
       String sql = "SELECT * from students";
       
//       Class.forName("org.postgresql.Driver"); // This is optional now as it happens automatically
       Connection con = DriverManager.getConnection(url, uname, pass);
       System.out.println("Connection Established");
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()) {
       	System.out.print(rs.getInt(1) + " - ");
       	System.out.print(rs.getString(2) + " - ");
       	System.out.println(rs.getInt(3));
       }       
       con.close();
       
    }
}
