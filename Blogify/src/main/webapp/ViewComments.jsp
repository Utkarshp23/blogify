<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border=1>
		<thead>
			<td>Comment</td>
			<td>Topic</td>
			<td>Commented by</td>
		</thead>
		<c:forEach items="${commentList }" var="comment">
				<tr>
					<td>${comment.getCommentcontent() }</td>
					<td>${comment.getTopicname() }</td>
					<td>${comment.getUsername() }</td>
				</tr>
		</c:forEach>
		</table>

</body>
</html>