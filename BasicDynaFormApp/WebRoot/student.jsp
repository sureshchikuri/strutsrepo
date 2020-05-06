<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for DynaActionForm form</title>
	</head>
	<body>
		<html:form action="/student">
			studentNo : <html:text property="studentNo"/><html:errors property="studentNo"/><br/>
			studentName : <html:text property="studentName"/><html:errors property="studentName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

