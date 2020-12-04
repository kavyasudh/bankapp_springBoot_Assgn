<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css"
    rel="stylesheet">
</head>
<body>
<form:form action="addaccount" method="post" modelAttribute="accountBean">
	
	<table>
			<tr>
				<td><form:hidden path = "accountid" value = "0" /></td>
			</tr>
			<tr>
				<td>Enter name:</td>
				<td><form:input path="name" /><form:errors path="name" class="error"></form:errors> </td>
			</tr>

			<tr>
				<td>Enter balance:</td>
				<td><form:input path="balance" /><form:errors path="balance" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter address:</td>
				<td><form:input path="address" /><form:errors path="address" class="error"></form:errors></td>
			</tr>

			<tr>
				<td>Enter phone:</td>
				<td><form:input path="phone"  /><form:errors path="phone" class="error"></form:errors></td>
			</tr>

			<tr>
				<td>Enter email:</td>
				<td><form:input path="email" /><form:errors path="email" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter AadharCard:</td>
				<td><form:input path="aadharcard" /><form:errors path="aadharcard" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter Pan Card:</td>
				<td><form:input path="panNumber" /><form:errors path="panNumber" class="error"></form:errors></td>
			</tr>
			

			<tr>
				<td><input type="submit" value="add account" /></td>
			</tr>
		</table>
	
</form:form>
</body>
</html>
