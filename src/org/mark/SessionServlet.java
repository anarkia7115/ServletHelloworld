package org.mark;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Uncomment the following line to run example stand-alone
//@WebServlet(name="SessionServlet", urlPatterns={"/SessionServlet"}) 

// The following will allow the example to run within the context of the JSFByExample
// enterprise application (JSFByExample.war distro or Netbeans Project)
@WebServlet(name="SessionServlet", urlPatterns={"/ch01/SessionServlet"}) 
public class SessionServlet extends HttpServlet {
  public void doPost (HttpServletRequest req, HttpServletResponse res)  
       throws ServletException, IOException {
 
   // Obtain he Session object
      
      HttpSession session = req.getSession(true);
 
   // Set up a session attribute

      String email = (String)              
      session.getAttribute ("session.email");         
//      if (email == null) {
//          email = req.getParameter("email");         
//          session.setAttribute ("session.email", email);       
//      }
      
      email = req.getParameter("email");         
      session.setAttribute ("session.email", email);   
      
      String sessionId = session.getId();

      res.setContentType("text/html"); 
      PrintWriter out = res.getWriter(); 
      out.println("<html>");
      out.println("<head><title>Working with sessions</title></head>");
      out.println("<body>");
      out.println("<h1>Session Test</h1>");
      out.println ("Your email address is: " + email + "<br/><br/>");
      out.println ("Your session id: " + sessionId);
      out.println("</body></html>");
   }
}


