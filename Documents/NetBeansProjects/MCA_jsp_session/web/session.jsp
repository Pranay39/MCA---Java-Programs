<%--
    Document   : session
    Created on : 13 Aug, 2021, 8:03:24 PM
    Author     : 3P
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>--%>
<%--<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <%
                String name = (String)request.getParameter("uname");
                
                out.print("Welcome "+name);
                
                session.setAttribute("name1", name);
                
                
            %>
            <br>
            <a href="output.jsp">Check output page here</a>
            <br>
        </body>
    </html>
