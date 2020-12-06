<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/19
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>test SpringMVC</title>
</head>
<body>
${pageContext.request.contextPath}
<br>
<h1>${pageContext.request.contextPath}</h1>
<!-- 第一种访问方式 -->
<a href="${pageContext.request.contextPath}/users/addUser">访问hello</a>
<br><br>
<!-- 第二种访问方式 -->
<a href="/users/addUser">访问订单添加</a>

<hr>

<a href="/item/addItem">添加订单，get 请求</a>
<br/>
<form action="/item/addItem" method="post">
    <input type="submit" value="保存账户，post 请求">
</form>

<hr>

<a href="/item/removeItem?itemName=aaa&count>100">删除订单,数量>100</a>

<br><br>
<a href="/item/removeItem?itemName=aaa&count>150">删除订单,数量>150</a>
<hr>

<a href="/item/addItem?id=10000">添加订单，id=100</a>
<br/>
</body>
</html>
