<%@taglib uri="/struts-tags" prefix="s" %>

Student Details

<s:form action="StudentAction">

<s:textfield name="student.studentNo" label="StudentNo"/>
<br/>

<s:textfield name="student.studentName" label="StudentName"/>
<br/>
<s:submit value="SUBMIT"/>
</s:form>