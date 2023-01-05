<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
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
      
      .main_body {
        height: inherit;
        width: inherit;
        flex: 10;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
      }
     
    </style>
  </head>
  <body>
    <div class="main_container">
    <jsp:include page="/header.jsp"/> 
    
      <div class="main_body">
        <a href="getTopics">View Topics</a>
      </div>
    </div>
  </body>
</html>
