<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for StudentForm form</title>
		
		<script type="text/javascript">
		function validateForm(method){
		var form=eval("document.studentForm");
		form.action="/BasicDispatcherActionApp/student.do?something="+method;
		form.submit();
		}
		
		</script>
	</head>
	<body>
		<html:form action="/student">
			studentNo : <html:text property="studentNo"/><html:errors property="studentNo"/><br/>
			studentName : <html:text property="studentName"/><html:errors property="studentName"/><br/>
			<html:submit property="something" value="Insert" onclick="validateForm('insert')"/>
			<html:submit property="something" value="Update" onclick="validateForm('update')"/>
			<!--<html:hidden property="something" value="insert"/>-->
		</html:form>
	</body>
</html>

