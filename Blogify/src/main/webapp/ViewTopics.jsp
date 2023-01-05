<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	 * {
        box-sizing: border-box;
      }

      body {
        font-family: 'Lexend Deca', sans-serif;
        display: flex;
        align-items: center;
        justify-content: center;
        width: 100vw;
        height: 100vh;
        overflow: hidden;
        margin: 0;
      }
	
	.main_container {
        height: inherit;
        width: inherit;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
      }

</style>
</head>
<body>
	<div class="main_container">
		<jsp:include page="/header.jsp"/> 
		<div>
			<ul>
				<c:forEach items="${topicList}" var="topic">
					<li><a href="getComments?tpid=${topic.getTopicid()}">${topic.getTopicname()}</a></li>
				</c:forEach>
			</ul>
		</div>
	</div>
	
	
</body>
</html>