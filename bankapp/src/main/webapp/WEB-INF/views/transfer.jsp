<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hcl Internal banking app</title>
</head>
<body>
<form:form action="transfer" method="post" modelAttribute="transferBean">

<table>

<tr>
<td>Enter from account</td>
<td>
<form:input path="fromAccountId"/></td>
</tr>
<tr>
<td>Enter to account</td>
<td>
<form:input path="toAccountId"/></td>
</tr>
<tr>
<td>Enter amount</td>
<td>
<form:input path="amount"/></td>
<tr>

<td><input type="submit"></td>

</tr>

</table>


</form:form>


</body>
</html>