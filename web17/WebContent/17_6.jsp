<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>

<%
  	String tmp = request.getParameter("number");
	int i=0;	
	if(tmp!=null){
		i=Integer.valueOf(tmp);
		i++;
	}
%>
<form action="/web17/17_6.jsp" method="post">
	 <input type="text" name="number" value="<%out.print(i);%>"/>
	 <input type="submit" value="submit"/>
</form>
<tb>
<li>數量:<%out.print(i);%></li>
</tb>
</body>
</html>