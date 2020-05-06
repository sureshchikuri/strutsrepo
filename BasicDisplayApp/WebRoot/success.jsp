<!DOCTYPE HTML PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>

<html>
<body>
<d:table id="studentList"
name="requestScope.studentForm.studentList" pagesize="3" export="true" requestURI="/student.do">
<d:column property="studentNo" sortable="true"/>
<d:column property="studentName" sortable="true"/>
<d:column property="email" sortable="true"/>
</d:table>
</body>
</html>