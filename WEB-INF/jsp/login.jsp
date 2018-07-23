<%-- 
    Document   : login
    Created on : Jul 19, 2018, 8:40:47 AM
    Author     : Yogi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="frm" id="frm" action="login.htm?action=authenicate" method="post">
            <input type="text" name="loginid" id="loginid" maxlength="10" value="${loginid}">
            <input type="password" name="password" id="password" maxlength="10" value="${pwd}">
            <input type="submit" value="submit">
        </form>
    </body>
</html>
