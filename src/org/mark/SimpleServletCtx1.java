package org.mark;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 *
 * @author Mark
 */


@WebServlet(name="SimpleServletCtx1", urlPatterns={"/SimpleServletCtx1"},
initParams={ @WebInitParam(name="name", value="Mark") }) 
public class SimpleServletCtx1 extends HttpServlet {
  
        @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        /* Display some response to the user */

        out.println("<html><head>");
        out.println("<title>Simple Servlet Context Example</title>");
        out.println("\t<style>body { font-family: 'Lucida Grande', " +
            "'Lucida Sans Unicode';font-size: 13px; }</style>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<p>This is a simple servlet to demonstrate context!  Hello " 
                                 + getServletConfig().getInitParameter("name") + "</p>");

        out.println("</body></html>");
        out.close();
    }
} 

