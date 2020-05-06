<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for StudentForm form</title>
	</head>
	<body>
		<html:form action="/student">
			studentno : <html:text property="studentno"/><html:errors property="studentno"/><br/>
			studentname : <html:text property="studentname"/><html:errors property="studentname"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

