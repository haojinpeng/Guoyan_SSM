<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/27
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异步</title>
</head>
<body>
<!-- request body 注解 -->
<form action="sm/useRequestBody" method="post">
    用户名称：<input type="text" name="username" ><br/>
    用户密码：<input type="password" name="password" ><br/>
    用户年龄：<input type="text" name="age" ><br/>
    <input type="submit" value="保存">
</form>

</body>
</html>
