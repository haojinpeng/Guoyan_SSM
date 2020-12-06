<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/15
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <script src="/layui/layui.js"></script>
</head>
<body>
<!-- 框架 -->
<div class="layui-fluid">

    <!-- 一行两列  3   9 -->
    <div class="layui-row">
        <!-- 左边导航名开始 -->
        <div class="layui-col-md3" style="border: 1px solid lightgrey; background-color:  #2F4056; height: 40px; ">
					<span class="spfont">
						<i class="layui-icon" style="color: #009E94;font-size: 30px">&#xe653;</i> 菜单导航
					</span>
        </div>
        <!-- 左边导航名结束 -->
        <!-- 右边功能面板名开始 -->
        <div class="layui-col-md9" style="border: 1px solid lightgrey; background-color:  #2F4056; height: 40px;">
					<span class="spfont">
						<i class="layui-icon" style="color: #009E94;font-size: 30px ">&#xe638;</i> 菜单功能实现
					</span>
        </div>
        <!-- 右边功能面板名结束 -->
    </div>



    <!-- 一行两列  3   9 -->
    <div class="layui-row ">
        <!-- 左边导航开始 -->
        <div class="layui-col-md3 " style="border: 1px solid lightgrey; height: 708px; ">
            <ul class="layui-nav layui-nav-tree layui-bg-cyan layui-inline" lay-filter="demo" style="margin-right: 10px; height: 100%; width: 100%; ">
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">信息管理系统</a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;">系统管理</a>
                            <dl class="layui-nav-child">
                                <dd><a href="/user/toIndex" target="ifarmemode" >用户管理</a></dd>
                            </dl>
                        </dd>
                    </dl>
                </li>

            </ul>
        </div>
        <!-- 左边导航结束 -->
        <!-- 右边功能面板开始 -->
        <div class="layui-col-md9" style="border: 1px solid lightgrey; height: 708px; ">
            <!-- 右边面板显示开始 -->
            <iframe name="ifarmemode" height="100%" width="100%" scrolling="auto" >

            </iframe>
            <!-- 右边面板显示结束-->
        </div>
        <!-- 右边功能面板结束 -->
    </div>
</div>
</body>
<script src="resources/layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    layui.use('element', function() {
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem) {
            //console.log(elem)
            //layer.msg(elem.text());

        });
    });
</script>
</html>
