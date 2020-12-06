<%--
  Created by IntelliJ IDEA.
  User: 爱喝雪碧的大个子
  Date: 2020/10/20
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>POJO 类包含集合类型演示</title>
</head>
<body>
<!-- POJO 类包含集合类型演示 -->
<form action="account/updateAccount" method="post">
    用户名称：<input type="text" name="username" ><br/>
    用户密码：<input type="password" name="password" ><br/>
    用户年龄：<input type="text" name="age" ><br/>
    账户 1 名称：<input type="text" name="accounts[0].name" ><br/>
    账户 1 金额：<input type="text" name="accounts[0].money" ><br/>
    账户 2 名称：<input type="text" name="accounts[1].name" ><br/>
    账户 2 金额：<input type="text" name="accounts[1].money" ><br/>
    账户 3 名称：<input type="text" name="accountMap['one'].name" ><br/>
    账户 3 金额：<input type="text" name="accountMap['one'].money" ><br/>
    账户 4 名称：<input type="text" name="accountMap['two'].name" ><br/>
    账户 4 金额：<input type="text" name="accountMap['two'].money" ><br/>
    <input type="submit" value="保存">
</form>

</body>
</html>
