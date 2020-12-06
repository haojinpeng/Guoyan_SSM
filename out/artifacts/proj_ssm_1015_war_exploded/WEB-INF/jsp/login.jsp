<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css" />
</head>
<body>
<div class="layui-fluid" >
    <div class="layui-row" style="background-image: url(img/login_bg.jpg);width: auto;height: 700px;">
        <div class="layui-col-md4 layui-col-md-offset4">
            <div style="margin-top: 100px;margin-left: 180px;">
						<span style="font-size: 20px;">
							用户登录
						</span>
            </div>
            <br><br><br>
            <form class="layui-form" action="login">
                <div class="layui-form-item">
                    <label class="layui-form-label">账户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="user_id" required style="width: 250px;" lay-verify="required" placeholder="请输入账户名"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-block">
                        <input type="password" name="user_age" required style="width: 250px;" lay-verify="required" placeholder="请输入密码"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="margin-left: 70px;">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit >登录</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
</body>
<script src="resources/layui/layui.js" type="text/javascript" charset="utf-8"></script>
</html>
