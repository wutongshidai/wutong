<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>登录列表</title>
    <link rel="stylesheet" href="css/reset.min.css"/>
    <link rel="stylesheet" href="css/dengL.css"/>
<!--     <link rel="stylesheet" type="text/css" href="css/base.css" media="all">
	<link type="text/css" rel="stylesheet" href="css/a.css" source="widget"> -->
	<script type="text/javascript" src="/JS/jquery-1.11.3.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#loginsubmit").click(function(){
		$("#loginForm").submit();
		/* alert(error); */
	});
});
</script>
<script>
function ckname(){
	var user = document.getElementById('mima').value;
	var patten = /^[0-9a-zA-Z]\w{5,17}$/ig;
	if(!patten.test(user))
	{
	$("input[name=userName]").focus().val("用户名不符合规则!");
	return false;
	}
	return true;
	}
	
function ckpassword(){
	var user = document.getElementById('mma').value;
	var patten = /^[0-9a-zA-Z_]{6,18}$/ig;
	if(!patten.test(user))
	{
	$("input[name=password]").focus().val("");
	return false;
	}
	return true;
	}
</script>
</head>
<body>
<div class="tuCeng">

 
    <div class="dengL">
    <div class="ding" style="text-align: right;"><a href="/index.do" style=" color:#062748; font-size:16px;"> < 返回首页</a></div>
        <div class="left">
            <span>
                <p>登录</p>
                <a href="/login.do">新用户注册</a>
            </span>
				<div class="msg-wrap">
				<div class="msg-warn" style="
    border-right-width: 150px;"
				<c:if test="${!empty error }">style="display: none;"</c:if>>
						<b></b>公共场所不建议自动登录，以防账号丢失
				</div>
				<div <c:if test="${empty error }">style="display: none;"</c:if> class="msg-error">
						<b></b>${error }
				</div>
				</div>
            <form form id="loginForm" action="/dengL.do" method="post">
                <div class="xL1">
                    <label for="mima">账号:</label>
                    <input type="text"  name="userName" id="mima" onblur="return ckname();" value="" placeholder="请输入账号" class=""/>
                </div>
                <div class="xL2">
                    <label for="mma">密码:</label>
                    <input type="password" name="password" id="mma" onblur="return ckpassword();"value="" placeholder="请输入密码" class=""/>
                </div>
                <div class="xL3">
                    <input type="checkbox" name="bu" checked="checked">记住我 （下次自动登录）
                </div>
                <div class="xL4">
                    <button type="submit" id="loginsubmit" class="dengLu" >登录</button>
                    <p class="de">忘记密码？</p>
                </div>
            </form>
            <!--   <a href="#"><img src="img/imgxiaotubiao/qq.png" alt=""/></a><a href="#"><img src="img/imgxiaotubiao/weixin.png" alt=""/></a> -->
        </div>
        <div class="reght"></div>
    </div>
</div>
</body>
</html>