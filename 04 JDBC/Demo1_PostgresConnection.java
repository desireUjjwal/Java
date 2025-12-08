package com.example.JdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo1_PostgresConnection 
{
    public static void main( String[] args ) throws Exception
    {
       
       String url = "jdbc:postgresql://localhost:5432/postgres";
       String uname = "postgres";
       String pass = "Kumar@#100";
       String sql = "SELECT sname FROM public.students where sid = 1 ";
       
//       Class.forName("org.postgresql.Driver"); // This is optional now as it happens automatically
       Connection con = DriverManager.getConnection(url, uname, pass);
       System.out.println("Connection Established");
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
//       System.out.println(rs.next()); // If it have next rows it give true otherwise false
       rs.next();
       String name = rs.getString("sname");
       System.out.println("Name of the student is "+name);
       
       con.close();
       
    }
}
