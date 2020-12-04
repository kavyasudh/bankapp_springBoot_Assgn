<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
    rel="stylesheet">
<!-- <style>
.error{
	color:#EF1313;
	font-style: italic;
}</style> -->
</head>
<body>
<h3>Welcome</h3>
	<form:form action="withdraw" method="post" modelAttribute="withdrawBean">
		<table>
			
			<tr>
				<td>Enter account number:</td>
				<td><form:input path="accountid"/><form:errors path="accountid" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter amount to be transferred:</td>
				<td><form:input path="amount"/><form:errors path="amount" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="transfer amount"></td>
			</tr>
			
		
		</table>
	
	</form:form>

</body>
</html>
