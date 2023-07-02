<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  double finalA = (Double)request.getAttribute("finalA");
%>
<%
  double ogA = (Double)request.getAttribute("ogA");
%>
<%
  String type = (String)request.getAttribute("type");
%>
<center>
<h1>BILL DETAILS :-</h1>
<%
  if(request.getAttribute("type").equals("prime")){%>
   <h1 style='color:blue'>Original Amount :- <%=ogA %></h1>
   <h1 style='color:blue'>Delivery Charge :- 0.0</h1>
   <br></br>
   <h1 style='color:red'>Final Amount with 5% GST:- <%=finalA %></h1>
   <h1></h1>
   <%}else{%>
   <h1 style='color:blue'>Original Amount :- <%=ogA %></h1>
   <h1 style='color:blue'>Delivery Charge :- 40.0</h1>
   <br></br>
   <h1 style='color:red'>Final Amount with 5% GST:- <%=finalA %></h1>
   <%} %>
</center>   
</body>
</html>