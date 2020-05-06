<%@taglib uri="/struts-tags" prefix="s" %>

Student Details

<s:form action="insertStudentAction.action">

<s:textfield name="studentNo" label="StudentNo"/>
<br/>

<s:textfield name="studentName" label="StudentName"/>
<br/>
<s:submit value="SUBMIT"/>
</s:form>