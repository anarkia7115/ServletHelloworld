/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaserverfaces.chapter01;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="RedirectServlet", urlPatterns={"/redirect"}) 
public class RedirectServlet extends HttpServlet {
  
        @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws IOException, ServletException {
                String site = "http://www.apress.com";
                
        res.sendRedirect(site);
    }
}  
