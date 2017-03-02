<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>登陆列表</title>
    <link rel="stylesheet" href="css/reset.min.css"/>
    <link rel="stylesheet" href="css/zhuC.css"/>
    <link rel="stylesheet" href="css/b.css"/>
<!--     <link rel="stylesheet" type="text/css" href="css/base.css" media="all">
	<link type="text/css" rel="stylesheet" href="css/a.css" source="widget"> -->
	<script type="text/javascript" src="/JS/jquery-1.11.3.js"></script>
	<script type="text/javascript" src="/JS/jquery.validate.min.js"></script>
	<script type="text/javascript" src="/JS/registerCheck.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#loginsubmit").click(function(){
		$("#loginForm").submit();
		
		/* alert(error); */
	});
  });  	
	
/* 	function sub(){
	alert("傻不傻！");
	window.location.href="/sdkTestSend.do";
} */
//-------------------------------------------//
function checkemail(email){
	 var str=email;
	  //在JavaScript中，正则表达式只能使用"/"开头和结束，不能使用双引号
	 var Expression=/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/; 
	 var objExp=new RegExp(Expression);
	 if(objExp.test(str)==true){
	  return true;
	 }else{
	  return false;
	 }
	}
//------------------------------------------//
function checkmobile(mobile){//验证手机号
	 var str=mobile;
	  //在JavaScript中，正则表达式只能使用"/"开头和结束，不能使用双引号
	 var Expression=/^1[34578]\d{9}$/; 
	 var objExp=new RegExp(Expression);
	 if(objExp.test(str)==true){
	  return true;
	 }else{
	  return false;
	 }
	}
	//----------------------------------------//
	
function checkuserName(userName){//验证用户名
	 var str = userName;
	 var Expression = /^[0-9a-zA-Z]\w{5,17}$/ ; 
	 var objExp=new RegExp(Expression);
	 if(objExp.test(str)==true){
	  return true;
	 }else{
	  return false;
	 }
	}
	
function checkpassword(password){//验证用户名
	 var str = password;
	 var Expression = /^[0-9a-zA-Z_]{6,18}$/ ; 
	 var objExp=new RegExp(Expression);
	 if(objExp.test(str)==true){
	  return true;
	 }else{
	  return false;
	 }
	}
	
	
function checkForm(loginForm){   

	   if(!checkuserName(loginForm.userName.value)){
		   window.alert("用户名格式不正确");
		   return false;
	   }
	   if(!checkpassword(loginForm.password.value)){
		   window.alert("密码格式不正确");
		   return false;
	   }
	   if(loginForm.repassword.value!=loginForm.password.value){
	      window.alert("您输入的两次密码不一致！");
	      return false;
	   }
	   if(loginForm.userEmail.value==""){
	      window.alert("请输入email地址");
	      return false;
	   }
	   if(!checkemail(loginForm.userEmail.value)){
	      window.alert("您输入的email地址格式不正确");
	      return false;
	   }
	   if(loginForm.province.value==""){
		  window.alert("所在省不能为空！");
		  return false;
	   }
	   if(loginForm.city.value==""){
	      window.alert("所在市不能为空！");
		  return false;
	  }
	   if(loginForm.authCode.value==""){
	      window.alert("请输入校验码");
	      return false;
	   }
	   /* if(!checkyanz(loginForm.authCode.value)){
		   window.alert("校验码错误");
		   return false;
	   } */
	   if(loginForm.mobile.value==""){         //手机号为空
		   window.alert("手机号不能为空");
		   return false;
	   }
	   if(!checkmobile(loginForm.mobile.value)){
		   window.alert("手机号格式不正确");
		   return false;
	   }
	}
  //------------------------------//
	/*    function checkyanz(authCode){
			var strCode = ${strCode};			
			if(authCode == strCode){
				return true;
			}else{
				return false;
			}
		}  */
 //------------------------------//
function chageCode() {
    $('#codeImage').attr('src','authCode.do?abc='+Math.random());//链接后添加Math.random，确保每次产生新的验证码，避免缓存问题。
}
//--------------------------------//
 $(function() {  
             //文本框点击事件  
             $("input[name='userName']").blur(function(){  
                 //发送ajax请求  
                 $.ajax({  
                     type:"POST",  
                     url:"/userName.do",  
                     data:{  
                     	userName:$("input[name='userName']").val()
                     },  
                     dataType:"json",  
                     success:function(data){   
                         if(data.admin=="0"){  
                             //将接收到的数据显示到文本框  
                                 alert("用户名不可用");
                                 $("#loginsubmit").attr("disabled", true);
                                 $("#userName").css("borderColor", "red");  
                                 return false; 
                         }else if(data.admin=="1"){ 
								alert("用户名可用");
								 $("#userName").css("borderColor", ""); 
								$('#loginsubmit').removeAttr("disabled"); 
								
                         }
                     },  
                 })  
             })  
              
        }) 
//--------------------------------//
 $(function() {  
             //文本框点击事件  
             $("input[name='authCode']").blur(function(){  
                 //发送ajax请求  
                 $.ajax({  
                     type:"POST",  
                     url:"/checkCode.do",  
                     data:{  
                         authCode:$("input[name='authCode']").val()  
                     },  
                     dataType:"json",  
                     success:function(data){  
                         //清空  
                         $("#showRet").empty();  
                         if(data.admin=="1"){  
                             //将接收到的数据显示到文本框  
							/*	alert("验证码正确");  */
                            $("#showRet").text("验证码正确").css("color","black");  //不显示，需修改
                         }else if(data.admin=="0"){
							 	alert("请输入验证码"); 
                            $("#showRet").text("请输入验证码").css("color","red");  
                         }else{  
								alert("验证码错误");
                             $("#showRet").text("验证码错误").css("color","red");   
                         }  
                     },  
                 })  
             })  
              
        }) 
</script>
</head>
<body>
<div class="tuceng" id="tuceng">
    <a href="/index.do"> < 返回首页</a>
    <div class="neiR" id="neiR">
        <ul>
            <li class="geren" id="geren">个人会员注册<i></i></li>
            <li class="qiye" id="qiye">企业会员注册<i></i></li>
        </ul>
        <div class="gr" id="gr">
            <p>提交个人注册信息</p>
			<form form id="loginForm" name="loginForm" action="/register.do" method="post" onSubmit="return checkForm(loginForm)" >
            <div class="yongH">
                <label for="yongh">&nbsp;&nbsp;用户名</label>
                <input type="text" class="" id="userName" name="userName" placeholder="6-18位英文字母或数字" />
            </div>
            <div class="miM">
                <label for="mima">&nbsp;&nbsp;&nbsp;密码</label>
                <input type="password" class="" name="password" placeholder="6-18个字符，可使用字母 ,数字,下划线" /> 
            </div>
            <div class="queR">
                <label for="queren">&nbsp;确认密码</label>
                <input type="password" class="" name="repassword" placeholder="确认密码"/>
            </div>
            <div class="dinZ">
                <label for="queren">&nbsp;电子邮箱</label>
            	<input type="text" id="userEmail" class="" name="userEmail" placeholder="请填写有效邮箱"/>
             <!--    <input type="text" class=""/> -->
             <!--   <input type="text" id="2" /><input type="button" value="提交" onclick="mail()" /> -->
            <!--     <input name="email" id="EMAIL" type="text" onfocus="showDesc(this)" onblur="checkText(this)"/> -->
            </div>
            <span class="name">
                <p>&nbsp;&nbsp;&nbsp;性别</p>
                <input type="radio" name="sex" value="0" checked="checked"/>
                <p class="n">男</p>
                <input type="radio" name="sex" value="1" checked="checked"/>
                <p class="v">女</p>
            </span>
            <div class="suoZ">
            
             <!--    <label for="suozai">&nbsp;所在地区</label>
                <input  type="number" name="province" />
                <input  type="number" name="city" /> -->
                
               <label>&nbsp;所在地区</label>
			省：<select name="province" id="to_cn" onchange="set_city(this, document.getElementById('city')); WYL();" class=login_text_input > 			
					<option value=0>请选择</option> 
					<option value=台湾>台湾</option> 
					<option value=北京>北京</option> 
					<option value=上海>上海</option> 
					<option value=天津>天津</option> 
					<option value=重庆>重庆</option> 
					<option value=河北省>河北省</option> 
					<option value=山西省>山西省</option> 
					<option value=辽宁省>辽宁省</option> 
					<option value=吉林省>吉林省</option> 
					<option value=黑龙江省>黑龙江省</option> 
					<option value=江苏省>江苏省</option> 
					<option value=浙江省>浙江省</option> 
					<option value=安徽省>安徽省</option> 
					<option value=福建省>福建省</option> 
					<option value=江西省>江西省</option> 
					<option value=山东省>山东省</option> 
					<option value=河南省>河南省</option> 
					<option value=湖北省>湖北省</option> 
					<option value=湖南省>湖南省</option> 
					<option value=广东省>广东省</option> 
					<option value=海南省>海南省</option> 
					<option value=四川省>四川省</option> 
					<option value=贵州省>贵州省</option> 
					<option value=云南省>云南省</option> 
					<option value=陕西省>陕西省</option> 
					<option value=甘肃省>甘肃省</option> 
					<option value=青海省>青海省</option> 
					<option value=内蒙古>内蒙古</option> 
					<option value=广西>广西</option> 
					<option value=西藏>西藏</option> 
					<option value=宁夏>宁夏</option> 
					<option value=新疆>新疆</option> 
					<option value=香港>香港</option> 
					<option value=澳门>澳门</option> 
					</select> - 市： 
					<select id="city" class=login_text_input name="city"> 
					<option value=0>请选择</option> 
					</select>
                <!-- <input  type="number" class="reght" name="" id="suozai" /> -->
            </div>
            <div class="yanZheng">
                <label for="queren">&nbsp;&nbsp;验证码</label>
                <input id="authCode" name="authCode" type="text"/>
        		<!--这里img标签的src属性的值为后台实现图片验证码方法的请求地址-->
       			<label><img type="image" src="authCode.do" id="codeImage" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer;"/></label>
        		<label class="hua">看不清楚<a onclick="chageCode()">换一张</a></label><span id="showRet"></span> 
                <!-- <input type="text" class=""/><img src="img/imglunb/9.jpg" alt=""/><a>看不清楚  换一张</a> -->
            </div>
            <div class="shouJ">
                <label for="queren">&nbsp;&nbsp;手机号</label>
                  <input type="text" name="mobile" id="mobile" class="" placeholder="有效的手机号"/><span style="color: red;" id="userNameError"/>
              <!--    <input type="text" name="mobile" id="mobile" class=""/><span style="color: red;" id="userNameError"/> -->
            </div>
            <div class="duanX">
                <label for="yanZ">短信验证码</label>
                <input type="text" id="yanZ" placeholder="填写验证码"/> <button type="sub()" onclick="sub()" class="">获取验证码</button>
            </div>
             <span class="yd">
                <p>
                    <input name="agree_status" id="agree_status" type="checkbox" value="0" onClick="auto_ck(this);">
                    <label for="idr">我已阅读并同意协议</label>
                </p>
                <p class="wei">《梧桐时代用户注册协议》</p>
            </span>
            <button type="submit" id="loginsubmit" class="" >注册</button>
        </div>
		</form>
        <!--                                               -->
   <!--      <div class="qy" id="qy">
            <p>提交个人注册信息</p>
            <div class="yongH">
                <label for="yonghu">&nbsp;&nbsp;用户名</label>
                <input type="text" class=""/> <input type="text" class="reght" name="" id="yonghu" value="" placeholder="6-18位英文字母或数字" />
            </div>
            <div class="miM">
                <label for="mimad">&nbsp;&nbsp;&nbsp;密码</label>
                <input type="text" class=""/> <input type="text"  class="reght" name="" id="mimad" value="" placeholder="6-18个字符，可使用字母 ,数字,下划线" />
            </div>
            <div class="queR">
                <label for="querenm">&nbsp;确认密码</label>
                <input type="text" class=""/> <input type="text"  class="reght" name="" id="querenm" value="" placeholder="您可以通过手机号,邮箱取回口令" />
            </div>
            <div class="dinZ">
                <label for="queren">&nbsp;注册邮箱</label>
                <input type="text" class=""/>
            </div>
            <div class="dinZ">
                <label for="queren">&nbsp;企业全称</label>
                <input type="text" class=""/>
            </div>
            <div class="dinZ">
                <label for="queren">&nbsp;企业性质</label>
                <input type="text" class=""/>
            </div> <div class="dinZ">
                <label for="queren">&nbsp;主营项目</label>
                <input type="text" class=""/>
            </div>
            <div class="suoZ">
                <label for="suozaid">&nbsp;所在地区</label>
                <input type="text" /> <input type="text"  class="reght" name="" id="suozaid" />
            </div>
            <div class="yanZheng">
                <label for="queren">&nbsp;&nbsp;验证码</label>
                <input type="text" class=""/><img src="img/imglunb/9.jpg" alt=""/><a>看不清楚  换一张</a>
            </div>
            <div class="shouJ">
                <label for="queren">&nbsp;&nbsp;手机号</label>
                <input type="text" class=""/>
            </div>
            <div class="duanX">
                <label for="yanZm">短信验证码</label>
                <input type="text" id="yanZm"/>  <button type="submit" class="dengLu" >获取验证码</button>
            </div>
            <span>
                <p>
                    <input name="idr1" id="idr1" type="checkbox" onClick="auto_ck(this);">
                    <label for="idr1">我已阅读并同意协议</label>
                </p>
                <p class="wei">《梧桐时代用户注册协议》</p>
            </span>
            <button>提交</button>
        </div> -->
    </div>
</div>
</body>
</html>
