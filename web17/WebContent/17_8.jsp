<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
    
 <jsp:useBean id="user" class="BennyWeb.user" scope="request" />
 <jsp:setProperty name="user" property="name" param="name"/>
  <jsp:setProperty name="user" property="pw" param="password"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="/web17/17_8.jsp" method="post">
	 Accunt:<input type="text" name="name" value="example:username"/>
	 <p>Password:<input type="password" name="password" value="*****"/>
	 <p><input type="submit" value="Submit"/>
</form>
<p>Accunt:<jsp:getProperty name="user" property="name"/>
<p>Password:<jsp:getProperty name="user" property="pw"/>
</body>
</html>