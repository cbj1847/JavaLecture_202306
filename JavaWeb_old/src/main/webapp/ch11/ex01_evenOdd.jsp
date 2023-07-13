<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int num = (int) Math.ceil(Math.random()*10);
%>		<!-- Java code 삽입 태그 -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Even/Odd Num</title>
</head>
<body>
	<h1>Even / Odd</h1>
	<hr>
	<h3>난수를 통해서 얻은 숫자 : <%= num %></h3>		<!-- 위의 자바코드 변수 호출 -->
	<% if (num % 2 == 0) { %>
		<h3>짝수입니다.</h3>
	<% } else { %>
		<h3>홀수입니다.</h3>
	<% } %>
	<hr>
	<% for (int i=0; i<num; i++) { %>
		<p> 안녕하세요 </p>
	<% } %>
</body>
</html>