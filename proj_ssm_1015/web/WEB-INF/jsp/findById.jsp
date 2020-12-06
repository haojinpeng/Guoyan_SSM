<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/8/5
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询单个</title>
    <link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css"/>
</head>
<body>
<div style="margin-top: 100px; margin-left: 200px;">
			     <span style="font-size: 20px;">
			     	会员修改
			     </span>
    <span style="font-size: 15px;">
				   	USER UPDATE
				   </span>
</div><br><br><br>


<form class="layui-form" action="updUser" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">编号</label>
        <div class="layui-input-block">
            <input type="text" name="user_id" required style="width: 250px;"  lay-verify="required" placeholder="请输入编号" autocomplete="off" class="layui-input"  value="${user.user_id}" readonly>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名</label>
        <div class="layui-input-block">
            <input type="text" name="user_name" required style="width: 250px;"  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input"  value="${user.user_name}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>
        <div class="layui-input-block">
            <input type="text" name="user_age" required  style="width: 250px;" lay-verify="required" placeholder="请输入年龄" autocomplete="off" class="layui-input" value="${user.user_age}">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">体重</label>
        <div class="layui-input-block">
            <input type="text" name="user_weight" required  style="width: 250px;" lay-verify="required" placeholder="请输入体重" autocomplete="off" class="layui-input" value="${user.user_weight}">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit >修改</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
    </div>
</form>

</body>
<script src="resources/layui/layui.js" type="text/javascript" charset="utf-8"></script>

</html>
