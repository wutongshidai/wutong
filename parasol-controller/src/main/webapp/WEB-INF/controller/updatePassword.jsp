<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>个人密码修改</title>

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/wodefabu-xiug.css" rel="stylesheet"  type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="img/xuqiufabu/xlogo.png" media="screen" />
</head>
<body>
<div class="banxin1260">
    <div>
        <!--zhu dao hang-->
        <div class="nav">
            <span><a href="#">关于我们</a></span>
        <ul>
			<li>
             <div class="aa" <c:if test="${empty user.userName}"> style="display: block" </c:if><c:if test="${not empty user.userName}">style="display: none" </c:if>><a href="/dengL.do" >登录</a></div>
             <div class="aa" <c:if test="${not empty user.userName}"> style="display: block" </c:if><c:if test="${empty user.userName}">style="display: none" </c:if>><a href="/dengL.do" >${user.userName }</a></div>       
         	</li>
			<li><a href="/loginOut.do">退出</a></li>
            <li><a href="/login.do">免费注册</a></li>
            <li><a href="/alltenders.do">我的账户</a></li>
            <li><a href="#">联系客服</a></li>
            <li><a href="#">消息</a></li>
            <li><a href="#">帮助</a></li>
        </ul>
        </div>
        <!--logo 搜索-->
        <div class="search banx" >
            <span class="logo"></span>
            <p></p>
            <div class="search_f">
           <!--      <form method="GET"   target="_blank" onsubmit="return formsub()">
                    <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" ><img src="img/souuso.png" ></button>
                    <a href="#" class="re">热门搜索</a>
                <a href="#">设计</a>
                <a href="#">专家库</a>
                <a href="#">材料</a>
                <a href="#">需求</a>
                </form> -->
            </div>
        </div>
        <!--  zhu ti 导航-->
        <div class="content banx">
            <div class="mainbav">
                <ul>
                    <li><a href="/index.do">首页</a></li>
                    <li  class="mr"><a href="/userMessage.do">账户设置</a></li>
                    <li><a href="/alltenders.do">我的发布</a></li>
                    <li><a href="#">专家预约</a></li>
                    <li><a href="#">消息</a></li>
                    <li><a href="#">常见问题</a></li>
                </ul>
            </div>

            <!--       主体  部分  主题  内容                    -->
            <div class="content-1">
                <div class="left">
                    <div class="to">
                        <div><img src="img/xuqiufabu/wdl.png" ></div>
                        <span>${niname }</span>
                    </div>
                    <div><i></i><a href="/alltenders.do">我的发布</a></div>
                    <div class="menu" id="menu">
                        <ul class="fir">
                            <li>
                                <em></em><span><i></i>个人资料</span>
                                <ul class="two">
                                    <li><a href="userMessage.do">基本信息</a></li>
                                    <li><a href="#">身份认证</a></li>
                                    <li><a href="#">手机绑定</a></li>
                                </ul>
                            </li>
                            <li>
                                <em></em><span><i></i>评论管理</span>
                            </li>
                            <li  class="Highlight">
                                <em></em><span><i></i>账号安全</span>
                                <ul  class="two">
                                    <li><a href="/updatePasswords.do">修改登录密码</a></li>
                                    <li><a href="#">当前安全级别</a></li>
                                    <li><a href="#">联系方式</a></li>
                                    <li><a href="#">邮寄地址</a></li>
                                </ul>
                            </li>
                            <li>
                                <em></em><span><i></i>常见问题</span>
                            </li>
                            <li>
                                <em></em><span><i></i>投诉建议</span>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="right">
                    <div>
                        <div class="fa"><p>基本信息</p></div>
                        <form class="xixi" name="form" id="form" action="/updatePassword.do" method="post" onSubmit="return checkPassword(form)">
                            <div>
                                <label for="zha">当前密码：</label><input  name="password" type="password" id="zha" value="" />
                            </div>
                            <div>
                                <label for="zh">重置密码：</label><input name="newpasswords" type="password" id="zh" value=""  /><p>(6-18个字符,可使用字母,数字,下划线)</p>
                            </div>
                            <div>
                                <label for="z">确认密码：</label><input  name="newpassword" type="password" id="z" value=""  /><p>(请再次输入您的密码)</p>
                            </div>
                            <input type="submit" id="but" class="but" value="保存"/>
                        </form>
                    </div>

                </div>
            </div>

            <!-- 占位符                                                  横线           -->
            <div class="main_zhanwei banx"></div>

            <!--尾部                                             尾部-->
            <div class="main_wenbu banx">
                  <p><a href="#">关于我们</a></p>
            	  <p><a href="#">企业服务</a></p>
            	  <p><a href="#">联系我们</a></p>
            	  <p><a href="#">帮助中心</a></p>
            	  <p><a href="#">网站导航</a></p>
            	  <p>Copyright2016 北京梧桐时代科技有限责任公司 . <a href="http://www.miitbeian.gov.cn/publish/query/indexFirst.action">京ICP备17016004号-1</a></p>
            	  <p>通讯地址：北京市大兴区亦庄镇小羊坊康碱路 6 号</p>
            </div>
            <!-- <a href="javascript:scroll(0,0)">返回顶部</a>-->
        </div>
    </div>
</div>
</body>
<script src="JS/jquery-1.11.3.js" type="application/javascript"></script>
<script type="text/javascript">


    /*                          树形菜单                                  */

 /*   document.getElementById("but").onclick=function() {




         if($("#zha").val()=="" || $("#zha").val()=="undefined"){
            $("#zha").css("borderColor","red");
            $(".tijiao p").css("color","red");
            alert("工程名称不能为空");
            return false;
        }else if($("#zha").val()){
            $("#zha").css("borderColor","");
        }




        if ($("#zh").val() == "" || $("#zh").val() == "undefined") {
            $("#zh").css("borderColor", "red");
            alert("确认密码");
            return false;

        } else if($("#zh").val() !== $("#z").val()) {
            $("#zh").css("borderColor", "red");
            alert("确认密码不匹配,请重新输入!");
            return false;
        } else if ($("#zh").val()) {
            $("#zh").css("borderColor", "");
        }
    } */




    $("#menu").on("click", function (ev) {
        var tar = ev.target,
                $tar = $(tar);//->把获取的原生DOM事件源对象转换为jQuery对象,这样就可以随意的使用jQuery中提供的方法了
        if (/^(EM|SPAN)$/i.test(tar.tagName)) {
            var $tarP = $tar.parent(),
                    $childUL = $tarP.children("ul"),
                    $childEM = $tarP.children("em");

            if ($childUL.length <= 0) {
                return;
            }

            var isBok = $childUL.css("display");
            $childEM.toggleClass("bg");
            $childUL.stop().slideToggle(200, function () {
                if (isBok === "block") {
                    //->当前是显示的我们让其后代中的UL/EM隐藏
                    $childUL.find("ul").css("display", "none");
                    $childUL.find("em").removeClass("bg");
                }
            });
        }
    });
    
    //--------校验密码---------//
    $(function() {  
    	      //文本框点击事件  
    	      $("input[name='password']").blur(function(){  
    	      //发送ajax请求  
    	      $.ajax({  
    	               type:"POST",  
    	               url:"/ajaxPassword.do",  
    	               data:{  
    	                     password:$("input[name='password']").val()
    	                     },  
    	               dataType:"json",  
    	               success:function(data){   
    	               if(data.admin=="1"){  
    		                 alert("输入密码错误！"); 
                            $("#but").attr("disabled", true);
                            $("#zha").css("borderColor", "red");
    							return false; 		
    	                      }else if(data.admin=="0"){
			                $('#but').removeAttr("disabled"); 
			             /*    $("#shou_j").css("borderColor", ""); */     	                                 
    	                       }
    	                    },  
    	                 })  
    	              })     
    	           })  
   //-----------校验两次密码----------//
   function checkPassword(form){
	   if(!checkpassword(form.newpasswords.value)){		  
           $("#zh").css("borderColor", "red");
		   window.alert("重置密码格式不正确！");
		   return false;
	   }
	   if(!checkpassword(form.newpassword.value)){		
           $("#z").css("borderColor", "red");
		   window.alert("确认密码格式不正确！");
		   return false;
	   }
	   if(form.newpassword.value!=form.newpasswords.value){
           $("#zh").css("borderColor", "red");
           $("#z").css("borderColor", "red");
	      window.alert("您输入的两次密码不一致！");
	      return false;
	   }
    }
    
    
   function checkpassword(newpasswords){					//验证密码
		 var str = newpasswords;
		 var Expression = /^[0-9a-zA-Z_]{6,18}$/ ; 
		 var objExp=new RegExp(Expression);
		 if(objExp.test(str)==true){
		  return true;
		 }else{
		  return false;
		 }
		}
</script>
</html>


