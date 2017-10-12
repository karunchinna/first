<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.err {color: red; font-family: fantasy; font-size: 14 }
</style>
</head>
<body>
<h1>${msg}</h1>
<h1 align="center">Enter Your Details</h1>

	<f:form action="loginUser" method="post" commandName="credentialsBean">
		<table align="center">
			<tr>
				<td>UserID</td><td><f:input path="userID"/>
					<f:errors path="userID" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>Password</td><td><f:password path="password"/>
					<f:errors path="password" cssClass="err"/>
				</td>
			</tr>
			<tr><td><input type="submit" value="Login"></td></tr>
			</table>
			</f:form>
</body>
</html>