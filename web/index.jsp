<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/14 0014
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      h2{
        width: 180px;
        height: 30px;
        margin: 200px auto;
        text-align: center;
        line-height: 30px;
        background-color: aqua;
        border-radius: 5px;
      }
      a{
        text-decoration: none;
        color: black;
      }
    </style>
  </head>
  <body>
  <h2>
    <a href="${pageContext.request.contextPath}/books/selectAll">进入书籍页面</a>
  </h2>
  </body>
</html>
