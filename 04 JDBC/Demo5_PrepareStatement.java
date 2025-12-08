package com.example.JdbcPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Demo5_PrepareStatement
{
    public static void main( String[] args ) throws Exception
    {
    	int sid = 6;
    	String sname = "Tia";
    	int marks = 48;
       
       String url = "jdbc:postgresql://localhost:5432/postgres";
       String uname = "postgres";
       String pass = "Kumar@#100";

       String sql = "insert into students values(?,?,?)"; 
       
       
       
       
       Connection con = DriverManager.getConnection(url, uname, pass);
       PreparedStatement st = con.prepareStatement(sql);
       st.setInt(1, sid);
       st.setString(2, sname);
       st.setInt(3, marks);
       st.execute();
       con.close();
       
    }
}
