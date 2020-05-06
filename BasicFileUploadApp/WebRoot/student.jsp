<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for StudentForm form</title>
	</head>
	<body>
		<html:form action="/student" enctype="multipart/form-data">
			fileUpload : <html:file property="fileUpload"/><html:errors property="fileUpload"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

