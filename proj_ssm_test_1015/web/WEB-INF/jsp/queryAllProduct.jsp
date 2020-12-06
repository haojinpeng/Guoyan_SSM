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
<%--<div class="layui-form">
    <form class="layui-form" action="queryAllProduct" method="post">

        <div class="layui-form-item">
            <div class="layui-input-inline">
                <input type="text" name="user_name"  style="width: 150px;"  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" >
            </div>
            &lt;%&ndash;  <label class="layui-form-label">年龄</label>&ndash;%&gt;
            <div class="layui-input-inline">
                <input type="text" name="user_age"   style="width: 150px;" lay-verify="required" placeholder="请输入年龄" autocomplete="off" class="layui-input">
            </div>

            <div class="layui-input-inline">
                <button class="layui-btn" lay-submit >查询</button>
            </div>
        </div>

    </form>
</div>--%>
<table class="layui-table">
    <tr>
        <th>序号</th>
        <th>id</th>
        <th>productNum</th>
        <th>productName</th>
        <th>cityName</th>
        <th>departureTime</th>
        <th>productPrice</th>
        <th>productDesc</th>
        <th>productStatus</th>
    </tr>
    <c:forEach items="${productList}" var="product" varStatus="i">
        <tr>
            <td>${i.index+1}</td>
            <td>${product.id}</td>
            <td>${product.productNum}</td>
            <td>${product.productName}</td>
            <td>${product.cityName}</td>
            <td>${product.departureTime}</td>
            <td>${product.productPrice}</td>
            <td>${product.productDesc}</td>
            <td>${product.productStatus}</td>
            <td>
           <a href="delProduct?id=${product.id}" class="layui-btn layui-btn-danger">删除</a>
           &nbsp;&nbsp;
           <a href="#" class="layui-btn layui-btn-danger">修改</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
