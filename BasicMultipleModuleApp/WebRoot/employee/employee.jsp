<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for DynaActionForm form</title>
	</head>
	<body>
		<html:form action="/employee">
			employeeNo : <html:text property="employeeNo"/><html:errors property="employeeNo"/><br/>
			employeeName : <html:text property="employeeName"/><html:errors property="employeeName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

