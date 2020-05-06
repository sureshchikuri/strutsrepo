<%@taglib uri="/struts-tags" prefix="s"%>

<s:form action="UpdateEmployeeAction.action">

	<s:textfield name="empId" label="EmpId"/>
	<s:textfield name="empName" label="EmpName"/>
	<s:textfield name="empSal" label="EmpSalary"/>

	<s:submit value="Submit"/>
</s:form>