<%-- 
    Document   : newjsf
    Created on : 13 Aug, 2021, 2:09:02 PM
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
                String name = request.getParameter("name");
                String password = request.getParameter("pwd");
                
                 if (name.equals("pranay") && password.equals("pranay123")){
                     session.setAttribute("name", name);
                     response.sendRedirect("Home.jsp");
                             
                 }
                 
                 else{
                     out.println("Invalid Credentials");
                 }
            
            %>
        </body>
    </html>

