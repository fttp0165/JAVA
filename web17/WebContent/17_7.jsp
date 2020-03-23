<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Date" %>
<% out.println("現在時間" + new Date()); %>
<%@include file="/17_6.jsp" %>
</body>
</html>