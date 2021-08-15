<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/15 0015
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍显示</title>
    <!-- 引入 layui.css -->
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
    <!-- 引入 layui.js -->
    <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
    <style>
        .seach{
            float: right;
        }
        .layui-btn{
            margin-left: 10px;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="layui-row">
    <h1>书籍列表</h1>
    <hr/>
</div>
<div class="layui-row">
    <div>
        <a href="${pageContext.request.contextPath}/books/toadd" class="layui-btn layui-btn-normal">新增书籍</a>
        <a href="${pageContext.request.contextPath}/books/selectAll" class="layui-btn layui-btn-normal">显示所有书籍</a>
        <div class="seach">
            <form action="${pageContext.request.contextPath}/books/selectbooklike" class="layui-input-inline">
                <div class="layui-input-inline">
                    <input type="text" name="bookname" class="layui-input" required>
                </div>
                <button class="layui-btn" lay-submit lay-filter="formDemo">搜索</button>
            </form>
        </div>
    </div>
    <table class="layui-table">
        <thead>
        <tr>
            <th>书籍编号</th>
            <th>书籍名称</th>
            <th>书籍数量</th>
            <th>书籍描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <th>${book.bookid}</th>
                <th>${book.bookname}</th>
                <th>${book.bookcounts}</th>
                <th>${book.detail}</th>
                <th><a href="${pageContext.request.contextPath}/books/toupdate/${book.bookid}"
                       class="layui-btn layui-btn-warm">修改</a>&nbsp;
                    <a href="${pageContext.request.contextPath}/books/deletebook?id=${book.bookid}"
                       class="layui-btn layui-btn-danger">删除</a>
                </th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
