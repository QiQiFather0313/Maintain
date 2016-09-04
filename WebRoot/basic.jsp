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
        <title>维修系统-基础信息注册</title>
        <link rel="stylesheet" type="text/css" href="<%=basePath%>ext4/resources/css/ext-all.css" />
        <script type="text/javascript" src="<%=basePath%>ext4/ext-all.js"></script>
        <script type="text/javascript" src="<%=basePath%>ext4/locale/ext-lang-zh_CN.js"></script>
        <script type="text/javascript" src="<%=basePath%>basic/app.js"></script>
	<!--	
		<link rel="stylesheet" type="text/css" href="styles/ext-patch.css" />
	
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	
  <body>
  		<form>
  			<input type="hidden" id="g_role" value="<%=request.getParameter("role")%>">
  			<input type="hidden" id="g_baiscpath" value="<%=basePath%>">
  		</form>
  </body>
</html>
