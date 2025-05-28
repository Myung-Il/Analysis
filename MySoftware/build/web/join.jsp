<%-- 
    Document   : join
    Created on : 2025. 3. 30., 오후 2:18:53
    Author     : MNU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 가입 결과</title>
</head>
<body>
    <h1>회원 가입이 완료되었습니다.</h1>

    <p>아이디: <%= request.getParameter("userId") %></p>
    <p>패스워드: <%= request.getParameter("password") %></p>
    <p>이름: <%= request.getParameter("name") %></p>

</body>
</html>