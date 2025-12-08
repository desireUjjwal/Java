package com.example.JdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo4_ProblemWithStatements
{
    public static void main( String[] args ) throws Exception
    {
    	int sid = 5;
    	String sname = "Max";
    	int marks = 48;
       
       String url = "jdbc:postgresql://localhost:5432/postgres";
       String uname = "postgres";
       String pass = "Kumar@#100";

       String sql = "insert into students values(" + sid + ",'" + sname +"'," + marks + ")"; 
       // We don't want to do these tedious " work
       // This can also lead to sql injection
       // We want to improve the performance as well by caching the queries
       
       
       Connection con = DriverManager.getConnection(url, uname, pass);
       System.out.println("Connection Established");
       Statement st = con.createStatement();
       boolean status = st.execute(sql);
       System.out.print(status);
       con.close();
       
    }
}
