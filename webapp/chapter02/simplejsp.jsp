<%-- 
    Document   : simplejsp
    Author     : juneau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Example</title>
    </head>
    <body>
        <jsp:useBean id="dateBean" scope="application" class="org.javaserverfaces.chapter02.DateBean"/>
        <h1>Hello World!</h1>
        <br/>
        <p>
            The current date is: ${dateBean.currentDate}!
        </p>
    </body>
</html>
