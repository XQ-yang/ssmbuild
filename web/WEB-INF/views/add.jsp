<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/15 0015
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <!-- 引入 layui.css -->
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
    <!-- 引入 layui.js -->
    <script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
    <style>
        .layui-btn{
            text-align: center;
            margin-left: 10px;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<h1>添加书籍</h1>
<form class="layui-form" action="${pageContext.request.contextPath}/books/addbook" method="get">

    <div class="layui-form-item">
        <label class="layui-form-label">书籍名称</label>
        <div class="layui-input-block">
            <input type="text" name="bookname" required lay-verify="required" placeholder="请输入书籍名称" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">书籍数量</label>
        <div class="layui-input-block">
            <input type="text" name="bookcounts" required lay-verify="required" placeholder="请输入书籍数量" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">书籍描述</label>
        <div class="layui-input-block">
            <input type="text" name="detail" required lay-verify="required" placeholder="请输入书籍描述" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <button class="layui-btn" lay-submit >添加</button>
    <a class="layui-btn" href="${pageContext.request.contextPath}/books/selectAll">取消</a>
</form>
</body>
</html>
