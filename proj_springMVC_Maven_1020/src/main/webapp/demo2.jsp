<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- 修改用户信息 -->
<form action="user/updateUser" method="post">
    用户名称：<input type="text" name="username" ><br/>
    用户年龄：<input type="text" name="age" ><br/>
    <input type="submit" value="保存">
</form>


</body>
</html>
