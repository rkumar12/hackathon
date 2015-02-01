<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Pivotal Cloud Foundry Migration Assistance</title>
</head>
<body>
Please input the path to file to upload.
  <form:form action="/hackathon/process"
    method="POST" enctype="multipart/form-data" >
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
  </form:form>
</body>
</html>
<%@ include file="footer.jsp" %>