<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>用户注册</title>
		<link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css" />
	</head>
	<body>
		
		<div style="margin-top: 100px; margin-left: 200px;">
			     <span style="font-size: 20px;">
			     	会员注册
			     </span>
				   <span style="font-size: 15px;">
				   	USER REGISTER
				   </span>  
		</div><br><br><br>
		<form class="layui-form" action="addUser" method="post">
		<div class="layui-form-item">
		    <label class="layui-form-label">用户名</label>
		    <div class="layui-input-block">
		      <input type="text" name="user_name" required style="width: 250px;"  lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" >
		    </div>
		  </div>
		  <div class="layui-form-item">
		      <label class="layui-form-label">年龄</label>
		      <div class="layui-input-block">
		        <input type="text" name="user_age" required  style="width: 250px;" lay-verify="required" placeholder="请输入年龄" autocomplete="off" class="layui-input">
		      </div>
		    </div>
			<div class="layui-form-item">
			    <label class="layui-form-label">体重</label>
			    <div class="layui-input-block">
			      <input type="text" name="user_weight" required  style="width: 250px;" lay-verify="required" placeholder="请输入体重" autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  <div class="layui-form-item">
			     <div class="layui-input-block">
			       <button class="layui-btn" lay-submit >注册</button>
			       <button type="reset" class="layui-btn layui-btn-primary">重置</button>
			     </div>
			   </div>
			</div>
		</form>

	</body>
	<script src="resources/layui/layui.js" type="text/javascript" charset="utf-8"></script>
	
<script>
	layui.use(['form', 'layedit', 'laydate'], function(){
	  var form = layui.form
	  ,layer = layui.layer
	  ,layedit = layui.layedit
	  
	
	  /*//自定义验证规则
	  form.verify({
	    title: function(value){
	      if(value.length < 5){
	        return '标题至少得5个字符啊';
	      }
	    }
	    ,pass: [
	      /^[\S]{6,12}$/
	      ,'密码必须6到12位，且不能出现空格'
	    ]
	    ,content: function(value){
	      layedit.sync(editIndex);
	    }
	  });*/

	});
	</script>

</html>
