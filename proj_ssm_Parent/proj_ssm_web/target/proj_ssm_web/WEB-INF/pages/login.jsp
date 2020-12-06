<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/30
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <script src="/layui/layui.js"></script>
</head>

</head>
<body>
<div class="layui-fluid" >
    <div class="layui-row" style="width: auto;height: 700px;">
        <div class="layui-col-md4 layui-col-md-offset4">
            <div style="margin-top: 100px;margin-left: 180px;">
						<span style="font-size: 20px;">
							用户登录
						</span>
            </div>
            <br><br><br>
            <form class="layui-form" action="/user/login" >
                <div class="layui-form-item">
                    <label class="layui-form-label">账户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="su_login_name"  id="su_login_name" style="width: 250px;" lay-verify="required" placeholder="请输入账户名"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-block">
                        <input type="password" name="su_login_passwd" id="su_login_passwd" style="width: 250px;" lay-verify="required" placeholder="请输入密码"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item" style="text-align: center;">
                    <div class="layui-input-block">
                        <button type="submit" class="layui-btn layui-btn-normal layui-btn-sm layui-icon layui-icon-release"
                                lay-filter="doSubmit">提交
                        </button>
                        <button type="reset" class="layui-btn layui-btn-warm layui-btn-sm layui-icon layui-icon-refresh">重置
                        </button>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>
</body>


</body>
</html>
