<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Pivotal Cloud Foundry Migration Assistance</title>
</head>
<body>
  <form:form method="POST" action="/addCustomerInfo">
   <table>
    <tr>
        <td><form:label path="fName">First Name</form:label></td>
        <td><form:input path="fName" /></td>
    </tr>
    <tr>
        <td><form:label path="lName">Last Name</form:label></td>
        <td><form:input path="lName" /></td>
    </tr>
    <tr>
        <td><form:label path="emailId">EmailId</form:label></td>
        <td><form:input path="emailId" /></td>
    </tr>
    <tr>
        <td><form:label path="technology">Technology</form:label></td>
        <td><form:select path="technology">
         <form:option value="NONE" label="--- Select ---"/>
         <form:option value="JAVA" label="JAVA"/>
         <form:option value="J2EE" label="J2EE"/>
         <form:option value=".NET" label=".NET"/>
         <form:option value="JAVASCRIPT" label="JAVASCRIPT"/>        
         <form:option value="RUBY" label="RUBY"/>
         </form:select>
        </td>
    </tr>
    <tr>
        <td><form:label path="runTimeEnvironment">DEPLOYMENT ENVIRONMENT</form:label></td>
        <td><form:select path="runTimeEnvironment">
         <form:option value="NONE" label="--- Select ---"/>
         <form:option value="TOMCAT" label="TOMCAT"/>
         <form:option value="WEBSPHERE" label="WEBSPHERE"/>
         <form:option value="JBOSS" label="JBOSS"/>
         <form:option value="STANDALONE" label="STANDALONE"/>        
         <form:option value="APACHE" label="APACHE"/>
         </form:select>
        </td>
    </tr>
    <tr>
        <td><form:label path="deploymnetType">DEPLOYMENT TYPE</form:label></td>
        <td><form:select path="deploymnetType">
         <form:option value="NONE" label="--- Select ---"/>
         <form:option value="SINGLE" label="SINGLE"/>
         <form:option value="MULTIPLE" label="MULTIPLE"/>
         </form:select>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
