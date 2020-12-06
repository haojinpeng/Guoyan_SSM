<%--
  Created by IntelliJ IDEA.
  User: 爱喝雪碧的大个子
  Date: 2020/10/20
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- 特殊情况之：类型转换问题 -->
<a href="account/deleteAccount?date=2020-10-20">根据日期删除账户</a>
<hr><br>
<!-- 特殊情况之：类型转换问题 -->
<a href="account/deleteAccount2?date=2020-10-1">根据日期删除账户</a>
<br><br>
<!-- 原始 ServletAPI 作为控制器参数 -->
<a href="account/testServletAPI">测试访问 ServletAPI</a>
<br><br>
</body>
</html>
