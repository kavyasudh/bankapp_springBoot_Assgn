<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update book</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
    rel="stylesheet"></head>
<body>
<form:form action="addaccount" method="post" modelAttribute="account">
	<form:hidden path="accountid"/>
	<table>
		<tr>
			<td>Enter name</td>
			<td><form:input path="name" readonly="true"/></td>
		</tr>
		<tr>
			<td>Enter balance</td>
			<td><form:input path="balance" readonly="true"/></td>
		</tr>
		<tr>
			<td>Enter address</td>
			<td><form:input path="address"/> </td>
		</tr>
		<tr>
			<td>Enter phone</td>
			<td><form:input path="phone"/></td>
		</tr>
		<tr>
			<td>Enter email</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>Enter aadharCard</td>
			<td><form:input path="aadharcard" readonly="true"/></td>
		</tr>
		<tr>
			<td>Enter panNumber</td>
			<td><form:input path="panNumber" readonly="true"/></td>
		</tr>
		
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
</form:form>
</body>
</html>
