
<%@page import="java.util.List"%>
<%@page import="com.lti.moel.Question"%>
<%@page import="com.lti.moel.Option"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--<%= session.getId() --%>
<form action="AnswerCheckServlet">
<%
  Question qs = (Question) session.getAttribute("nextQs");
%>
<h2>Q. <%= qs.getQuestion() %></h2>		
<%
   List<Option> ops = qs.getOptions();
   int opNo = 0;
   for(Option op: ops) {
%>
   <input type= "radio" name="op" value="<%= opNo++%>"/> <%= op.getOption() %><br/>

<%
   } 
%>  

<br/>

<button type="submit">Next</button>
</form>
<!--  <a href="QuestionLoaderServlet">Next Question</a>-->
</body>
</html>	