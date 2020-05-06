<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>

<html>

	<head>

	</head>
	<body>
		<table border="1">
			<tr>
				<td width="100%" colspan="2" valign="top">
					<tiles:insert attribute="header" />
				</td>
			</tr>

			<tr>
				<td width="25%" valign="top">
					<tiles:insert attribute="menu" />
				</td>
			
				<td width="75%" valign="top">
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