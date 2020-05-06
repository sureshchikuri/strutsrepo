<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for SrudentForm form</title>
	</head>
	<body>
		<html:form action="/student">
			<bean:message key="studentNo" bundle="zone"/> : <html:text property="studentNo"/><html:errors property="studentNo"/><br/>
			<bean:message key="studentName" bundle="zone"/>: <html:text property="studentName"/><html:errors property="studentName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

