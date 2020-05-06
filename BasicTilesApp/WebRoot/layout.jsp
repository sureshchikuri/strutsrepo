<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html>
	<head>
	</head>
	<body bgcolor="wheat">
		<table border="1" cellpadding="0" cellspacing="0" width="100%"
			bordercolor="#000000" bgcolor="wheat">
			<tr>
				<td width="100%" colspan="2" valign="top">
					<tiles:insert attribute="header" />
				</td>
			</tr>
			<tr>
				<td width="27%" valign="top">
					<tiles:insert attribute="menu" />
				</td>
				<td width="73%" valign="top">
					<tiles:insert attribute="body" />
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="2" valign="top">
					<tiles:insert attribute="footer" />
				</td>
			</tr>
		</table>
	</body>
</html>