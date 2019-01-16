<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       request:${requestScope.info}
       requestdog:${requestScope.dog}
       <br>
       session: ${sessionScope.info}
</body>
</html>