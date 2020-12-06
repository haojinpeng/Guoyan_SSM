<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/15
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询所有</title>
    <link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css"/>
</head>
<body>
<center>
    <h1>

        <marquee>
            <font color="red">欢迎您进入本网站！！！</font></marquee></h1>
</center>
<div class="layui-form">
    <form class="layui-form" action="queryAllUsers" method="post">

        <div class="layui-form-item">
            <%-- <label class="layui-form-label">用户名</label>--%>
            <div class="layui-input-inline">
                <input type="text" name="user_name"  style="width: 150px;"  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" >
            </div>
            <%--  <label class="layui-form-label">年龄</label>--%>
            <div class="layui-input-inline">
                <input type="text" name="user_age"   style="width: 150px;" lay-verify="required" placeholder="请输入年龄" autocomplete="off" class="layui-input">
            </div>

            <div class="layui-input-inline">
                <button class="layui-btn" lay-submit >查询</button>
            </div>
        </div>

    </form>
</div>
<table class="layui-table">
    <tr>
        <th>序号</th>
        <th>编号</th>
        <th>用户名</th>
        <th>年龄</th>
        <th>体重</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${usersList}" var="users" varStatus="i">
        <tr>
            <td>
                ${i.index+1}
            </td>
            <td>${users.user_id}</td>
            <td>${users.user_name}</td>
            <td>${users.user_age}</td>
            <td>${users.user_weight}</td>
            <td>
           <a href="delUser?user_id=${users.user_id}" class="layui-btn layui-btn-danger">删除</a>
           &nbsp;&nbsp;
           <a href="findUsersById?user_id=${users.user_id}" class="layui-btn layui-btn-danger">修改</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
