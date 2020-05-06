<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for StudentForm form</title>
	</head>
	<body>
		<html:form action="/studentPostAction">
			state : <html:select property="state"><html:errors property="state"/><br/>
			<html:option value="0">Select</html:option>
			<html:optionsCollection name="stateList" label="stateName" value="stateName"/>
			</html:select>
			<br/>
			<html:submit/>
		</html:form>
	</body>
</html>

