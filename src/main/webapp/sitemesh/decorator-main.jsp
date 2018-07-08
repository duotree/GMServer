<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/pages/top.jsp" %>
 <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<html>
<head>
<meta charset="UTF-8">
<!-- 引入 Bootstrap -->
<link href="<%=path %>/resource/css/dashboard.css" rel="stylesheet">
<title>商品管理系统</title>
<decorator:head />
</head>
<body>
	<div class="navbar-black">
		<div class="container-fluid">
	        <div class="navbar-header">
	        	<a class="navbar-brand" href="#">登录管理</a>
	        </div>
		</div>
	</div>
	<div class="container-fluid">
      <div class="row">
       <div class="col-sm-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">补偿/公告</a></li>
            <li><a href="#">发送邮件</a></li>
            <li><a href="#">发送全局邮件</a></li>
            <li><a href="#">邮件查询</a></li>
            <li><a href="#">公告推送</a></li>
            <li><a href="#">游戏公告</a></li>
            <li><a href="#">礼品吗</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">服务器数据</a></li>
            <li><a href="#">服务器信息</a></li>
            <li><a href="#">全局数据</a></li>
            <li><a href="#">登录服务器信息</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">玩家数据</a></li>
            <li><a href="#">角色数据</a></li>
            <li><a href="#">修改数据</a></li>
            <li><a href="#">言论回收</a></li>
            <li><a href="#">物品信息</a></li>
          </ul>
        </div>
        <div class="col-sm-10 container-content">
        	<decorator:body /> 
        </div>
      </div>
     </div>
	<div class="clearfix"></div>
	
	 
</body>
<script src="<%=path%>/resources/js/jquery-1.10.1.min.js"></script>
<script src="<%=path %>/dist/js/bootstrap.min.js"></script>
</html>