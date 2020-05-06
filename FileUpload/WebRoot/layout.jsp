<%@page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="t"%>

<html>
	<head></head>
	<body>
		<table border="1" cellpadding="0" cellspacing="0" width="100%"
			bordercolor="#000000" bgcolor="wheat" height="100%" >

			<tr align="center" height="15%" >
				<td width="100%" colspan="2">
					<t:insert attribute="header"></t:insert>
				</td>
				</tr>
				<tr>
					<td width="25%%" align="center">
						<t:insert attribute="menu"></t:insert>
					</td>
					<td width="75%" align="center">
						<t:insert attribute="body"></t:insert>
					</td>
				</tr>
				<tr align="center" height="15%">
					<td width="100%" colspan="2">
						<t:insert attribute="footer"></t:insert>
					</td>
				</tr>
		</table>
	</body>
</html>