package com.ujjwal;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // at service we need to change it as doGet, doPost, doPut, doDelete for exact task
        System.out.println("In service method");
        res.setContentType("text/html");
//        res.getWriter().println("Hello World");
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World</b></h2>");

    }
}
