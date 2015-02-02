<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<body>
	THANKS ${name} FOR PROVIDING THE INFORMATION.
	<br>
	<hr>
	AS PER INITIAL DATA THE COMPLEXITY TO MIGRATE TO PCF IS ${complexity}
	<BR>

	<H1>FOR COMPLETE ANALAYSIS PLEASE UPLOAD THE SOURCE</H1>
	Please input the path to file to upload.

	<form:form action="/process" method="POST"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>UPLOAD THE SOURCE CODE</td>
				<td><input type="file" name="file" /></td>
			</tr>
			<tr>
			<td>
				<input type="submit" value="Upload" />
			</td>
			</tr>
			<table>
		</form:form>
</body>
</html>