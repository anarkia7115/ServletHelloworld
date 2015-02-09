<%-- 
    Document   : embeddingJava.jsp
    Author     : juneau
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! LocalDateTime currDate = LocalDateTime.now(); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Embedding Java in a JSP</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br/>
        <br/>
        The current date and time is: <%= currDate %>
        
    </body>
</html>
