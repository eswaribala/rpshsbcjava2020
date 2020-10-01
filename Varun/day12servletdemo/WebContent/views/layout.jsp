<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="../styles/layout.css"/>
<script type="text/javascript" src="../scripts/layout.js"></script>
</head>
<body>
<%--Declaration tag --%>
<%!int capacity=200; %>
<%--Scriptlet --%>
<section id="main">

<%
for(int i=100;i<capacity;i++)
{
		
 	
	if(i%10==0)
	{
 %>
    <section class="layout-row">
    </section>
    <br>
   
    <% 
	}	
	if(i%5==0)
	{
	%>
	<button id="passage"></button>	
	<%
	 }
	%>
<%--expression tag --%>
<button class="button"><%=i%></button>
<%		
}
%>

</section>

</body>
</html>