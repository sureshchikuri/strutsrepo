<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script>
function openFile() {

	var form = eval("document.fileUploadForm");
if(form.reportType.value==""){
alert("Please enter ReportType);
form.reportType.focus();
return false;
}
}
</script>
<body bgcolor="wheat">
	<br>
	<center>
		<h1>
			FileUpload
		</h1>
	</center>
	<html:form action="/fileUpload" enctype="multipart/formdata">
		<center>
			<table border="1">

				<tr>
					<td>
						<html:select property="reportType">
							<html:option value="">Please Select</html:option>
							<html:option value="Floor">Floor</html:option>
							<html:option value="Zone">Zone</html:option>
						</html:select>
					</td>
					<td>
						<a href="#" onclick="openFile();">SampleFile</a>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
					<td>
						<html:file property="excelFile"></html:file>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
					<td colspan="2" align="center">
						<input type="button" name="submitButton" value="submit"
							onclick="uploadFile();" />
						<input type="button" name="downloadButton" value="Error Report"
							onclick="downloadFile();" disabled="disabled" />
					</td>
			</table>
			<br />
		</center>
	</html:form>

</body>
<%String status=(String)request.getAttribute("status");

if(status!=null){
System.out.println("status.in jsp:"+status);

%>
enableButton('<%=status %>')
<%}%>
