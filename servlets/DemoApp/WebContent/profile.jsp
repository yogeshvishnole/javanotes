<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="yellow">
<%
String url = "jdbc:postgresql://localhost:5432/yogesh";
String username = "postgres";
String password = "newPassword";
String sql = "SELECT * FROM Student WHERE roll_no=1";
Class.forName("org.postgresql.Driver");
Connection  con = DriverManager.getConnection(url,username,password);  
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
rs.next();
%>

Name:<%= rs.getString(1)%>
Roll No.<%= rs.getString(2)%>

</body>
</html>