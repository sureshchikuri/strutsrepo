

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
  
    This is my JSP Success page. <br>
    SelectedState:
    <bean:write name="studentForm" property="state"/>
   
   </body>
</html>
