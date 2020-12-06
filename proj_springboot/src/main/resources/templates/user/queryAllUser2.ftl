<html>
<head>
    <title>hello spring boot,迭代Map</title>
</head>
<body>
<hr size="10" color="red">
<table border="1" width="400px" height="400px">
    <thead>
    <tr>

        <th>编号</th>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
        <th>姓名</th>
    </tr>
    </thead>
    <tbody>

    <#list userMap?keys as k>

    <tr>
        <td>${k}</td>
        <td>${userMap[k].id}</td>
        <td>${userMap[k].username}</td>
        <td>${userMap[k].password}</td>
        <td>${userMap[k].name}</td>
    </tr>
    </#list>

    </tbody>
</table>
<br>
<img src="/images/a3.jpg"/>
</body>
</html>