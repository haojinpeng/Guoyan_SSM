<html>
<head>
    <title>迭代map</title>
    <link rel="stylesheet" href="/css/user.css">
</head>
<body>


<form action="/user/updateUser" method="post">
    <table border="1" id="tab" align="center">
        <tr>
            <td>编号</td>
            <td>
                <input type="text" name="id" readonly="readonly" value="${users.id}">
            </td>
        </tr>
        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username"  value="${users.username}">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="password" name="password"  value="${users.password}">
            </td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" name="name"  value="${users.name}">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改">
            </td>

        </tr>

    </table>
</form>
<img src="/images/a1.jpg">
</body>
</html>