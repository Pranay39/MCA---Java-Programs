<%-- 
    Document   : logout
    Created on : 13 Aug, 2021, 2:38:13 PM
    Author     : 3P
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>--%>
<%--<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!--<f:view>-->
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <%
                session.removeAttribute("name");
                session.removeAttribute("password");
                session.invalidate();
            %>
            <br>
            <h1>Log out done successfully!</h1>
        </body>
    </html>
<!--</f:view>-->
