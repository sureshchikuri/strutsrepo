<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%><!--
 
 
 I18N is Not supported in Dispatch action
--><html> 
	<head>
		<title>JSP for StudentForm form</title>
	</head>
	<body>
		<html:form action="/insertStudent">
			<bean:message key="studentNo"/> : <html:text property="studentNo"/><html:errors property="studentNo"/><br/>
			<bean:message key="studentName"/> : <html:text property="studentName"/><html:errors property="studentName"/><br/>
				<html:submit property="something" value="insert"/>
		</html:form>
	</body>
</html>