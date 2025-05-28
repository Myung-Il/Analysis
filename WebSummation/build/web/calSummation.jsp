<%-- 
    Document   : newjsp
    Created on : 2025. 3. 26., 오전 9:43:48
    Author     : MNU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int firstno, secondno;
    int sum;
    
    firstno = Integer.parseInt(request.getParameter("firstno"));
    secondno = Integer.parseInt(request.getParameter("secondno"));
    
    sum = firstno+secondno;
%>

<!doctype html>
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First Num : <%= firstno%></h1>
        <h1>Second Num : <%= secondno%></h1>
        <h1>Result = <%= sum%></h1>
    </body>
</html>


