<%--
  Created by IntelliJ IDEA.
  User: zxy
  Date: 2020/10/27
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script src="js/jquery-3.5.1.min.js"></script>
    <script>
        $(function(){
            //alert("11");
            //页面一加载就给按钮绑定单击事件

            $("#testJson").click(function(){

                //发起异步请求
                  $.ajax({
                     // url:"sm/testResponseJson",//请求服务器的路径
                      url:"sm/testResponseJson2",
                      type:"post",//提交方式
                      async:true,//支持异步
                      data:'{"id":1,"name":"test","money":999.0}',//前端给后台传值
                      contentType:"application/json;charset=utf-8",
                      dataType:"json",//后台给前端传值的类型
                      success:function(account){
                          alert(account.id+"\t"+account.name+"\t"+account.money);
                      }
                  });

            });



          

        });
    </script>
</head>
<body>

<!-- 测试异步请求 -->
<input type="button" value="测试 ajax 请求 json 和响应 json" id="testJson"/>

<br><br>


</body>
</html>
