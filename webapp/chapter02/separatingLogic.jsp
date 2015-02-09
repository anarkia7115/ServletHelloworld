<%-- 
    Document   : separatingLogic
    Author     : juneau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Separating Business Logic from View Code</title>
    </head>
    <body>
        <jsp:useBean id="randomBean" scope="application" class="org.javaserverfaces.chapter02.RandomBean"/>
        <h1>Display a Random Number</h1>
        <br/>
        <br/>
        <p>
            Your random number is ${randomBean.randomNumber}.  Refresh page to see another!  
        </p>
    </body>
</html>
