package com.example.JdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo3_CrudOperations
{
    public static void main( String[] args ) throws Exception
    {
       
       String url = "jdbc:postgresql://localhost:5432/postgres";
       String uname = "postgres";
       String pass = "Kumar@#100";
//       String sql = "insert into students values(5, 'Tia', 60)";
//       String sql = "update students set marks = 68 where sid=5";
       String sql = "delete from students where sid = 5";
       
//       Class.forName("org.postgresql.Driver"); // This is optional now as it happens automatically
       Connection con = DriverManager.getConnection(url, uname, pass);
       System.out.println("Connection Established");
       Statement st = con.createStatement();
       boolean status = st.execute(sql);
       System.out.print(status);
       con.close();
       
    }
}
