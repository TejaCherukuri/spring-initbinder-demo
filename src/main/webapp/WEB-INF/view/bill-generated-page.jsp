<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Generate Bill</title>
</head>
<body>
	<h1 align = center>Bill Generation</h1><hr>
	<p>Bill of amount <span style="color:blue">${billInfoDTO.amount} ${billInfoDTO.currency}</span> is generated on your credit card number 
		<span style="color:blue">${billInfoDTO.creditCard}</span> on <span style="color:blue">${billInfoDTO.date}</span></p>
</body>
</html>