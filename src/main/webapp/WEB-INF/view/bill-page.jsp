<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Generate Bill</title>
</head>
<body>
	<h1 align=center>Generate Bill</h1><hr>
	<div align = "center">
	<form:form action="generatebill" method="post" modelAttribute="billInfoDTO">
		<label>Credit card number: </label>
		<form:input path = "creditCard"/>
		<br/>
		
		<label>Amount: </label>
		<form:input path = "amount"/>
		<br/>
		
		<label>Currency: </label>
		<form:input path = "currency"/>
		<br/>
		
		<label>Date: </label>
		<form:input path = "date"/>
		<br/>
		
		<input type="submit" value="Generate">
	</form:form>
	</div>
</body>
</html>