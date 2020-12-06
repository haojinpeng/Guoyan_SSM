<%--
  Created by IntelliJ IDEA.
  User: Only soul
  Date: 2019-05-24
  Time: 09:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-1.11.3.min.js"></script>
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
    <script src="/layui/layui.js"></script>
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
    <div class="layui-input-block" style="width: 200px;float: left;margin-left:0px">
        <input id="su_name" style="width: 200px" type="text" name="su_name" required lay-verify="required" placeholder="请输入用户名称" autocomplete="off" class="layui-input">

    </div>
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-warm" lay-event="getCheckLength">搜索</button>
        <%--<a href="" class="layui-btn layui-btn-warm" lay-event="getCheckLength">搜索</a>--%>
        <button class="layui-btn layui-btn-danger"lay-event="getCheckData" data-type="getCheckData">批量删除</button>
        <%--<button class="layui-btn layui-btn" lay-event="getCheckLength">获取选中数目</button>--%>
        <button class="layui-btn layui-btn" lay-event="isAll">添加用户</button>
    </div>
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script>
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#test'
            ,url:'/user/queryAllUser'
            ,toolbar: '#toolbarDemo'
            ,cellMinWidth: 40
            ,title: '用户数据表'
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'id', title:'ID', width:40, fixed: 'left', unresize: true, sort: true}
                ,{field:'su_name', title:'用户名'}
                ,{field:'su_login_name', title:'邮箱'}
                ,{field:'su_login_passwd', title:'性别'}
                ,{field:'su_sex', title:'城市'}
                ,{field:'su_birth_dt', title:'签名'}
                ,{field:'su_icon', title:'积分', }
                ,{field:'su_address', title:'IP'}
                ,{field:'su_province', title:'登入次数'}
                ,{field:'su_city', title:'加入时间'}
                /*,{field:'su_district', title:'操作'}
                ,{field:'su_dept_id', title:'操作'}
                ,{field:'su_email', title:'操作'}
                ,{field:'su_mobile', title:'操作'}
                ,{field:'su_status', title:'操作'}
                ,{field:'su_create_uid', title:'操作'}
                ,{field:'su_district', title:'操作'}
                ,{field:'su_create_dt', title:'操作'}*/
                ,{field:'a', title:'操作', toolbar: '#barDemo'}
            ]]
           // ,page: true
            ,page: {layout:['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']}
            ,id:'testReload'
        });

       //头工具栏事件
        //头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    active.getCheckData();
                    break;
                case 'getCheckLength':
                    active.reload();
                    break;
                case 'isAll':
                    active.notice();
                    break;
            };
        });




//添加事件
        //触发事件
        active = {
            //页面重新加载
            reload:function(){
                var su_name=$("#su_name").val();
                alert(sname);
                table.reload('testReload',{
                    where:{su_name:su_name}
                });
            },
            getCheckData:function() {

            },

            notice: function(){

            }


        };



        //监听行工具事件
        table.on('tool(test)', function(obj){
            var data = obj.data;
            //console.log(obj)
            if(obj.event === 'del'){
                layer.confirm('真的删除行么', function(index){
                   // alert(data.id);
                    delUser(data.id);
                    layer.close(index);
                    location.reload();
                });
            } else if(obj.event === 'edit'){
                layer.prompt({
                    formType: 2
                    ,value: data.email
                }, function(value, index){
                    obj.update({
                        email: value
                    });
                    layer.close(index);
                });
            }
        });

    });

    //删除行
    function delUser(id){
        alert(id);
        $.ajax({
            type:'POST',
            url: '/user/delUser?id='+id,
            success: function(msg){
                alert( "Data Saved: " + msg );
            }
        });
    }

</script>
</body>
</html>
