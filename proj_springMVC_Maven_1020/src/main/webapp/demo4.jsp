<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/20
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>PathVariable 注解</title>
</head>
<body>
<h1>PUT  与 DELETE 请求。</h1>
<hr size="10" color="red">
<br><br>

<!-- 保存 -->
<form action="user2/testRestPOST" method="post">
    用户名称：<input type="text" name="username"><br/>
    <%-- <input type="hidden" name="_method" value="POST">--%>
    <input type="submit" value="保存">
</form>
<hr/>
<!-- 更新 -->
<%--<form action="${pageContext.request.contextPath}/user2/testRestPUT/1" method="post">--%>
<%--
   <form method="post"  action="${pageContext.request.contextPath}/user2/testRestPUT/1">
--%>
<form method="post" action="user2/testRestPUT/1">

用户名称：<input type="text" name="username"><br/>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="更新">
</form>
<hr/>

<!-- 删除 -->
<form action="/user2/testRestDELETE/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="删除">
</form>
<hr/>

<a href="/user2/testRestGET/1">测试</a>
<hr/>

<h1>PathVariable 注解</h1>
<hr size="10" color="red">
<br><br>
<!-- PathVariable 注解 -->
<a href="/user2/usePathVariable/100">pathVariable 注解</a>
</body>
</html>
