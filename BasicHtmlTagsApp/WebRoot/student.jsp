<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for StudentForm form</title>
		<script type="text/javascript">
		function confirmation(){
		alert("Alert");
		}
		</script>
	</head>
	<body>
		<html:form action="/student">
		
		Text:
		<html:text property="text"/>
		<br/>
		Password:
		<html:password property="password"></html:password>
		<br/>
		TextArea:
		<html:textarea property="textArea"/>
		<br/>
		Select:
		<html:select property="select" size="1">
		<html:option value="java">java</html:option>
		<html:option value=".net">net</html:option>
		<html:option value="testing">testing</html:option>
		</html:select>
		<br/>
		checkbox:
		<html:checkbox property="checkbox">checkbox</html:checkbox>
		<br/>
		Radio:
		India<html:radio property="radio" value="india"></html:radio>
		Pak<html:radio property="radio" value="pak"></html:radio>
		<br/>
		MultiBox:
		<html:multibox property="multiBox"  value="java"/>java
		<html:multibox property="multiBox"  value="net"/>net
		<html:multibox property="multiBox"  value="testing"/>testing
		<br/>
		hidden:
		<html:hidden property="hidden" value="hiddenValue"/>
		<br/>
			<html:submit onclick="confirmaton()"/><html:cancel/>
		</html:form>
	</body>
</html>

