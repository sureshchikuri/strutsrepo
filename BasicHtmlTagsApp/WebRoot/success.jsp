<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
	<head>
		<title>JSP for StudentForm form</title>
	</head>
	<body>
	
		Text:
		<bean:write name="studentForm" property="text"/>
		<br />
		password:
		<bean:write name="studentForm" property="password" />
		<br />
		TextArea:
		<bean:write name="studentForm" property="textArea" />
		<br />
		select:
		<bean:write name="studentForm" property="select" />
		<br />
		checkbox:
		<bean:write name="studentForm" property="checkbox" />
		<br />
		radio:
		<bean:write name="studentForm" property="radio" />
		<br />
		hidden:
		<bean:write name="studentForm" property="hidden" />
		<br />
		multibox:
		<logic:iterate id="multiBoxId" name="studentForm" property="multiBox">
			<bean:write name="multiBoxId" />
			<br />
		</logic:iterate>

	</body>
</html>

