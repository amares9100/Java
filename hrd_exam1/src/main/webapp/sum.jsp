<%@page import="controller.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp" %>
	
	<%
	
	Dao dao =new Dao();
	
	
	%>
	
	
	<center>
	<h3> 회원 매출 조회 </h3>
	
	<form name="sumform" action="/hrd_exam1/join" method="get">
			<table border="1">
				<tr>
					<th>회원번호</th> <th>성명</th> <th>고객등급</th> <th>매출</th>
				</tr>
				<% ArrayList<MemberDto> result = dao.getsum();
					for(MemberDto dto : result){
				%>	
				<tr>
					<td><%=dto.getCustno() %></td> <td><%=dto.getCustname() %></td>
					<td><%=dto.getGrade() %></td> <td><%=dto.getSum() %></td>
				</tr>
				<%} %>		
				
			</table>
		</form>
	</center>
	
	
	
	
	
	
	
	<%@include file="footer.jsp" %>

</body>
</html>