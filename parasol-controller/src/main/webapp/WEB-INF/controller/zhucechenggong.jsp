<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>注册成功</title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link rel="stylesheet" href="css/zhucechenggong.css" type="text/css"/>
    <script type="text/javascript" src="/JS/jquery-1.11.3.js"></script>
	<script type="text/javascript">     
		function countDown(secs,surl){         
 		var jumpTo = document.getElementById('jumpTo');
 		jumpTo.innerHTML=secs;  
	 	if(--secs>0){     
     	setTimeout("countDown("+secs+",'"+surl+"')",1000);     
     	}     
 		else{       
     	location.href=surl;     
	 	-ma
     	}     
 		}     
	</script>
</head>
<body>

<div class="tuceng" id="tuceng">
    <a href="/index.do"> < 返回首页</a>
    <div class="neiR" id="neiR">
        <ul>
            <li class="geren" id="geren">会员注册<i></i></li>
            <!--  <li class="qiye" id="qiye">企业会员注册<i></i></li>-->
        </ul>
        <span><img src="img/zhucefabu/chengong.png" alt=""/></span>
        <p>您以成功注册为梧桐会员！ <a href="/dengL.do">点击此处</a>返回登录页面</p>
        <a href="/dengL.do" class="zz"><span id="jumpTo">10</span>秒后系统会自动跳转，也可点击本处直接跳</a> 
    </div>
</div>
	<script type="text/javascript">
		countDown(5,'/dengL.do');
	</script>  
</body>
</html>