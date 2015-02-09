<%-- 
    Document   : settingAndYieldingValues
    Author     : juneau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Yielding and Setting Values</title>
    </head>
    <body>
        <jsp:useBean id="easyBean" scope="page" class="org.javaserverfaces.chapter02.EasyBean"/>
        <jsp:setProperty name="easyBean" property="*"/>
        <form method="post">
        Use the input text box below to set the value, and then hit submit.
        <br/><br/>
        Set the field value: 
        <input id="fieldValue" name="fieldValue" type="text" size="30"/>
        <br/>
        The value contained within the field is currently: 
        <jsp:getProperty name="easyBean" property="fieldValue"/>
        
        <input type="submit">
        </form>
    </body>
</html>
