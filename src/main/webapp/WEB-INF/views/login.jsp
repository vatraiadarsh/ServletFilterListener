<%-- 
    Document   : login
    Created on : 27 July 2021, 10:08:27 am
    Author     : vatra
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login!</h1>
        
        <c:if test="${param.error != null}">
            <div>
                <h1 style="color:red">Invalid Username/Password</h1>
            </div>
    </c:if>
        
        <form method="post" action=""> 
            <div>
                <label>User Name</label>
                <input type="text" name="username"/>
            </div>
            <div>
                <label> Password</label>
                <input type="password" name="password"/>
            </div>
            <button type="submit">Login </button>
        </form>
    </body>
</html>
