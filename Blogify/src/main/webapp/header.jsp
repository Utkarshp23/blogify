<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.header {
        height: inherit;
        width: inherit;
        flex: 1;
        display: flex;
        flex-direction: row;
        justify-content: space-around;
        align-items: center;
      }

      .header h3 {
        flex: 10;
        padding-left: 20px;
      }

      .lsBtns {
        flex: 3;
        display: flex;
        flex-direction: row;
        justify-content: space-around;
      }
      
      .btn {
        font-family: inherit;
        width: 90px;
        padding: 10px;
        border: none;
        border-radius: 20px;
        background-color: #6b53d3;
        color: #ffffff;
      }
      .btn:hover {
        background-color: #3e0f71;
        cursor: pointer;
      }
	
</style>
</head>
<body>
	<div class="header">
        <h3>Blogify</h3>
        <div class="lsBtns">
          <a href="">
            <button class="btn">Login</button>
          </a>
          <a href="">
            <button class="btn">SignUp</button>
          </a>
        </div>
</body>
</html>