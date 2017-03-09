<%-- 
    Document   : Welcome
    Created on : Mar 3, 2017, 7:03:00 PM
    Author     : iamsu
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String str=request.getParameter("firstName");
        %>
        <h1>Hello <%=str%> !!</h1>
        <p><%=new Date()%></p>
    </body>
</html>
