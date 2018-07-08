<html>
<head>
	<meta charset="UTF-8">
	<%@ include file="top.jsp" %>
    <link href="<%=path%>/resource/bootstrap/css/signin.css" rel="stylesheet">
    <title>魂之轨迹GM系统</title>
</head>

<script type="text/javascript">

	var token = "";
	$(function(){
		//输入非空值 去掉提示
		$("#username").hover(function(e){
			var username = $.trim($("#username").val());
			if (username!=null && username!=""){
				$("#username").tooltip("destroy");
			}
		});
		//输入非空值 去掉提示
		$("#password").hover(function(e){
			var password = $.trim($("#password").val());
			if (password!=null && password!=""){
				$("#password").tooltip("destroy");
			}
		});
		$.post("<%=path%>/login/encodeLogin.do",function(data){
			token = data.token;
		});
	}); 
	// 按下enter 直接触发登录按钮
	document.onkeydown = function(event){
        var e = event || window.event;
         if(e && e.keyCode==13){ // enter 键
           login();
        }
     }; 
	
	function post(URL, PARAMS) {
		
		$("#loginForm").attr("action",URL);
		$("#loginForm").attr("method","post");
		$("#hiddenType").val("login");
		$("#password").val(PARAMS.passwd);
		$("#loginForm").submit(); 
		
	} 
	
	function login(){
		var userName = $('#username').val();
		var passwd = $('#password').val();
		if(userName == undefined || userName == ""){
			alert("用户名不能为空");
			return ;
		}
		if(passwd == undefined || passwd == ""){
			alert("密码不能为空");
			return;
		} 
		
		if (userName.trim().length > 15 || userName.trim().length < 4){
			alert("用户名长度为4-15个字符");
			return ;
		}
		
		if (passwd.trim().length > 20 || passwd.trim().length < 4){
			alert("密码长度为4-20个字符");
			return ;
		} 
		var userNameReg = new RegExp('[A-Za-z0-9]+');
		var loginUrl = "<%=path%>/login/checkLogin.do";
		var checkUrl = "<%=path%>/login/checkLogin.do";
		var name = userName.match(userNameReg);
		
		if (name == null || name[0].length != userName.length){
			alert("输入用户名错误，用户名只能为数字、字母的组合");
			return;
		}
		
		var password = hex_md5(passwd);
		
		var param = {type:"login",username:userName, password:hex_md5(token+hex_md5(passwd))}; //hex_md5(token+hex_md5(passwd))
	   
		
	    checkLogin(checkUrl,loginUrl,param); 
		
	};
	
	function checkLogin(checkUrl,loginUrl,param){
		$.ajax({
			url : checkUrl,
			type:'post',
			data:param,
			success:function(data){
				console.log("data", data);
				if (data.rst != 'success'){
					alert(data.rst);
				}else if (data.rst == 'success'){
					window.location.href = "<%=path%>/login/main.do"
				}else if (data.rst == "logout"){
					window.location.href = "<%=path%>/login/login.do"
				}
			},
			error:function(data){
				console.log("error", data);
			}
		})
	}
	
	/* var onloadFn = function(){
		
		if(rst != undefined && rst == "fail"){
			alert("用户/密码错误!");
		}
	} */
</script>

<%-- <%
     String rst = (String)request.getAttribute("rst");
	 if(rst != null ){
		 String show = "<script language='javascript' type='text/javascript'> var rst='" + rst +"'</script>";
		 out.println(show);
	 }
	
 %> --%>
<body>
	
	<div class="floatDiv">
		<h1 class="form-signin-heading">魂之轨迹GM系统</h1>
	    <form class="form-signin" role="form" id="loginForm">
		    <div class="form-group">
		        <label for="username" class="col-md-3  control-label"> 用户名</label>
		        <div class="col-lg-8">
		            <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名" title="请输入用户名" required autofocus>
		        </div>
		    </div>
		    <div class="form-group">
		        <label for="password" class="col-md-3 control-label">密码</label>
		        <div class="col-lg-8">
		            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"  title="请输入密码" required>
		        </div>
		    </div>
		    <div class="form-group">
		        <div class="col-md-offset-3 col-lg-8">
		            <button type="button" onclick="login()" class="btn btn-lg btn-primary btn-block">登录</button>
		            <input type="hidden" id="hiddenType" name="type"> 
		        </div>
		    </div>
		</form>
	</div>
</body>
</html>