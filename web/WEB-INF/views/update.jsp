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
    <title>修改书籍</title>
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
<h1>修改书籍</h1>
<form class="layui-form" action="${pageContext.request.contextPath}/books/updatebook" method="get">
    <div class="layui-form-item">
        <div class="layui-input-block">
            <input type="hidden" name="bookid" autocomplete="off" class="layui-input" value="${Qbook.bookid}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">书籍名称</label>
        <div class="layui-input-block">
            <input type="text" name="bookname" required lay-verify="required" value="${Qbook.bookname}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">书籍数量</label>
        <div class="layui-input-block">
            <input type="text" name="bookcounts" required lay-verify="required" value="${Qbook.bookcounts}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">书籍描述</label>
        <div class="layui-input-block">
            <input type="text" name="detail" required lay-verify="required" value="${Qbook.detail}" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
    <button class="layui-btn" lay-submit >修改</button>
    <a href="${pageContext.request.contextPath}/books/selectAll" class="layui-btn">取消</a>
</form>
</body>
</html>
