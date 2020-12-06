<html>
<head>
    <title>hello spring boot,迭代list</title>
</head>
<body>
<hr size="10" color="red">
<table border="1" width="400px" height="400px">
    <thead>
    <tr>
        <th>序号</th>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>姓名</th>
    </tr>
    </thead>
    <tbody>

    <#list userList as user>

    <tr>
        <td>${user_index}</td>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.name}</td>
    </tr>
    </#list>

    </tbody>
</table>
<br>
<img src="/images/a0.jpg"/>
</body>
</html>