<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request" />
<body>
	<h4><%=msg%></h4>
	<fieldset align="center">
		<legend>Change password</legend>
		<a href="./home">Home</a><a style="float: right" href="#"></a> <a
			href="./logout">Logout</a>

		<form action="./changepassword" method="post">
			<table align="center">
				<tr>
					<td>New password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm password</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Change Password"></td>
				</tr>

			</table>
		</form>
	</fieldset>
</body>
</html>