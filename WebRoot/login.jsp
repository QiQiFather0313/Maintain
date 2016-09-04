<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>科技发展部办公管理平台</title>
        <link rel="stylesheet" type="text/css" href="./ext4/resources/css/ext-all.css" />
        <script type="text/javascript" src="ext4/ext-all.js"></script>
        <script type="text/javascript" src="ext4/locale/ext-lang-zh_CN.js"></script>
        <script type="text/javascript" src="login/app.js"></script>
		<link rel="stylesheet" type="text/css" href="styles/ext-patch.css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	
  <body>
  		<form>
  			<input type="hidden" id="g_baiscpath" value="<%=basePath%>">
  			<input type="hidden" id="g_login_error" value="<%=request.getParameter("error")%>">
  		</form>
  </body>
</html>
