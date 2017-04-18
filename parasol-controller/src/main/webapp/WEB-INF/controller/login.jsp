<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>账号注册</title>
    <link rel="stylesheet" href="css/reset.min.css"/>
    <link rel="stylesheet" href="css/zhuC.css"/>
    <link rel="stylesheet" href="css/b.css"/>
<!--     <link rel="stylesheet" type="text/css" href="css/base.css" media="all">
	<link type="text/css" rel="stylesheet" href="css/a.css" source="widget"> -->
	<script type="text/javascript" src="/JS/jquery-1.11.3.js"></script>
	<script type="text/javascript" src="/JS/jquery.validate.min.js"></script>
	<script type="text/javascript" src="/JS/registerCheck.js"></script>
	<script type="text/javascript">

/*	$(function(){
		$("#loginsubmit").click(function(){
		$("#loginForm").submit();		
		/!* alert(error); *!/
	});
  });  	*/
	
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
//-----------------------------------------//
	
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


	/*            协议单选框必选校验                             */




	if(!$('#agree_status').is(":checked")){
		alert("请认真阅读协议并选中");
		return false;
	}else if($('#idr').is(":checked")){

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
								 $("#userName").css("borderColor", ""); 
								$('#loginsubmit').removeAttr("disabled"); 
								
                         }
                     } 
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
                     }  
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
                    <option value=台湾>台湾</option>
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
			<div class="spanf">
					<div class="spanf-1">
						<input name="agree_status" id="agree_status" type="checkbox" value="0" onClick="auto_ck(this);">
						<p for="idr">我已阅读并同意协议</p>
					</div>
					<div class="spanf-2">
						<div class="theme-buy">
							<a class="btn btn-primary btn-large theme-login" href="javascript:;">《梧桐时代用户注册协议》</a>
						</div>
						<div class="theme-popover">
							<div class="theme-poptit">
								<a href="javascript:;" title="关闭" class="close">×</a>
								<h3>梧桐时代服务条款</h3>
							</div>
							<div class="www">
								<h4>1、服务概述</h4>

								<p>本服务条款是开发者（您）与北京梧桐时代科技有限责任公司（下称梧桐时代）之间的协议。</p>
								<p>1.1重要须知：梧桐时代在此特别提醒，开发者（您）欲访问和使用梧桐时代平台网站或梧桐时代网站所提供的服务，必须事先认真阅读本服务条款中各条款，包括免除梧桐时代责任的免责条款及对用户的权利限制。请您审阅并接受或不接受本服务条款（未成年人审阅时应得到法定监护人的陪同）。如您不同意本服务条款及/或随时对其的修改，您应不使用或主动取消梧桐时代公司提供的服务。您的使用行为将被视为您对本服务条款全部的完全接受，包括接受梧桐时代对服务条款随时所做的任何修改。</p>
								<p>1.2这些条款可由梧桐时代随时更新，且毋须另行通知。梧桐时代平台服务条款(以下简称"服务条款")一旦发生变更,梧桐时代将在网页上公布修改内容。修改后的服务一旦在网页上公布即有效代替原来的服务条款。您可随时登陆梧桐时代网站查阅最新版服务条款。</p>
								<p>1.3梧桐时代平台网站，向广大开发者提供服务。本服务条款适用于梧桐时代提供的各种服务，但当您使用梧桐时代某一特定服务时，如该服务另有单独的服务条款、指引或规则，您应遵守本服务条款及梧桐时代随时公布的与该服务相关的服务条款、指引或规则等。前述所有的指引和规则，均构成本服务条款的一部分。除非本服务条款另有其他明示规定，新推出的产品或服务、增加或强化目前本服务的任何新功能，均受到本服务条款之规范。</p>

								<h4>2、用户使用规则</h4>
								<p>2.1梧桐时代平台仅提供网络平台内容支持，用户（您）必须自行配备上网和使用电信增值业务所需的设备，自行负担个人上网或第三方（包括但不限于电信或移动通信提供商）收取的通信费、信息费等有关费用。如涉及其他电信增值服务的，我们建议您与您的电信增值服务提供商确认相关的费用问题。 2.2除您与梧桐时代另有约定外，您同意本服务条款所有内容，您不可对梧桐时代平台所提供服务的任何部分或服务代码，进行出售、或利用本服务进行调查、广告、或用于其他商业目的，其中，您不得将任何广告信函与信息、促销资料、垃圾邮件与信息、滥发邮件与信息、直销及传销邮件与信息以网络电话、短信、彩信、邮件、即时通信、文件分享或以其他方式传送。</p>
								<p>2.3开发者的产品中不得通过梧桐时代相关服务发送任何妨碍社会治安或非法、虚假、骚扰性、侮辱性、恐吓性、伤害性、破坏性、挑衅性、庸俗性、淫秽色情性等内容的信息，一旦发现将立即停止对其服务，同时，梧桐时代不承担相关法律责任。</p>
								<p>2.4保证自己在使用各服务时用户身份的真实性和正确性及完整性，如果资料发生变化，您应及时更改。在安全完成本服务的登记程序并收到一个密码及帐号后，您应维持密码及帐号的机密安全。您应对任何人利用您的密码及帐号所进行的活动负完全的责任，北京梧桐时代科技有限责任公司无法对非法或未经您授权使用您帐号及密码的行为作出甄别，因此北京梧桐时代科技有限责任公司不承担任何责任。在此，您同意并承诺做到∶</p>
								<p>2.4.1当您的密码或帐号遭到未获授权的使用，或者发生其他任何安全问题时，您会立即有效通知到北京梧桐时代科技有限责任公司。</p>
								<p>2.5用户同意接受北京梧桐时代科技有限责任公司通过手机短信、电子邮件、客户端软件、网页或其他合法方式向用户发送商品促销或其他相关商业信息。在使用电信增值服务的情况下，用户同意接受本公司及合作公司通过增值服务系统或其他方式向用户发送的相关服务信息或其他信息，其他信息包括但不限于通知信息、宣传信息、广告信息等。</p>
								<h4>2.6关于收费服务</h4>
								<p>2.6.1梧桐时代平台所提供的部分服务是以收费方式提供的。一旦您本人或团队（包括您的代理）通过个人帐户购买收费服务，您应按有关的收费标准、付款方式支付相关服务费及其他费用。资费说明标明在梧桐时代平台网站相应服务的相应页面上。在您所开发的应用通过梧桐时代审核人审核前，您无法使用本公司的相关服务支持，如有其它问题可发邮件咨询。</p>
								<p>2.6.2逾期付费：服务费之逾期交纳应按梧桐时代或合作公司关于迟延付费的相应的规定办理。</p>
								<p>2.7依本服务条款所取得的服务权利不可转让。</p>
								<p>2.8您需要严格遵守国家的有关法律、法规和行政规章制度。如开发者（您）违反国家法律法规或本服务条款，本公司和合作公司将有权停止向用户提供服务而不需承担任何责任，如导致梧桐时代或合作公司遭受任何损害或遭受任何来自第三方的纠纷、诉讼、索赔要求等，开发者（您）须向本公司或合作公司赔偿相应的损失，开发者（您）并需对其违反服务条款所产生的一切后果负全部法律责任。</p>

								<h4>3、服务风险及免责声明</h4>
								<p>3.1用户须明白，本服务仅依其当前所呈现的状况提供，本服务涉及到互联网及相关通信等服务，可能会受到各个环节不稳定因素的影响。因此服务存在因上述不可抗力、计算机病毒或黑客攻击、系统不稳定、用户所在位置、用户关机、通信网络、互联网络原因等造成的服务中断或不能满足用户要求的风险。开通服务的开发者须承担以上风险，本公司和合作公司对服务之及时性、安全性、准确性不作担保，对因此导致用户不能发送和接受阅读消息、或传递错误，个人设定之时效、未予储存或其他问题不承担任何责任。</p>
								<p>3.2如本公司的系统发生故障影响到本服务的正常运行，本公司承诺在第一时间内与相关单位配合，及时处理进行修复。但用户因此而产生的经济损失，本公司和合作公司不承担责任。此外，梧桐时代保留不经事先通知为维修保养、升级或其他目的暂停本服务任何部分的权利。</p>
								<p>3.3梧桐时代在此郑重提请您注意，任何经由本服务上载、发送即时信息、电子邮件或任何其他方式传送的资讯、资料、文字、软件、音乐、音讯、照片、图形、视讯、信息、用户的登记资料或其他资料（以下简称"内容"），均由内容提供者承担责任。梧桐时代无法控制经由本服务传送之内容，也无法对用户的使用行为进行全面控制，因此不保证内容的合法性、正确性、完整性、真实性或品质；您已预知使用本服务时，可能会接触到令人不快、不适当或令人厌恶之内容，并同意将自行加以判断并承担所有风险，而不依赖于梧桐时代。但在任何情况下，梧桐时代有权依法停止传输任何前述内容并采取相应行动，包括但不限于暂停用户 使用本服务的全部或部分，保存有关记录，并向有关机关报告。但梧桐时代有权(但无义务)依其自行之考量，拒绝和删除可经由本服务提供之违反本条款的或其他引起梧桐时代或其他用户反感的任何内容。</p>
								<p>3.4关于使用及储存之一般措施：您承认关于本服务的使用梧桐时代有权制订一般措施及限制，包含但不限于本服务将保留用户个人信息、电子邮件信息、通信资料信息、所上载内容之最长期间、本服务一个帐号当中可收发电子邮件或手机短信等的最大数量、本服务一个账号当中可收发的单个信息或电子邮件的大小、梧桐时代平台服务器为您分配的最大使用空间，以及一定期间内您使用本服务之次数上限（及每次使用时间之上限）。通过本服务存储或传送任何信息、通信资料和其他内容，如被删除或未予储存，您同意梧桐时代平台毋须承担任何责任。您也同意，长时间未使用的帐号，梧桐时代有权关闭并收回帐号。您也同意，梧桐时代有权依其自行之考量，不论通知与否，随时变更这些一般措施及限制。</p>
								<p> 3.5链接服务：本服务或第三方可提供与其他国际互联网上之网站或资源之链接。由于梧桐时代平台无法控制这些网站及资源，您了解并同意：无论此类网站或资源是否可供利用，梧桐时代不予负责；梧桐时代也对存在或源于此类网站或资源之任何内容、广告、产品或其他资料不予保证或负责。因您使用或依赖任何此类网站或资源发布的或经由此类网站或资源获得的任何内容、商品或服务所产生的任何损害或损失，梧桐时代不负任何直接或间接之责任。若您认为该链接所载的内容侵犯您的权利，梧桐时代声明与上述内容无关，不承担任何责任。梧桐时代建议您与该网站或法律部门联系，寻求法律保护。</p>
								<p>3.6通过本平台的服务，您发布的信息可能夹带有额外广告信息（以下简称"信息"）。我们出于便利向平台用户提供这些信息，但我们并不控制第三方服务，也不对其负责。如果您或者接受方因此与对应第三方进行交易，由消费者承担责任，梧桐时代不承担任何责任。若因第三方服务而造成您的困扰和损失的，您需要直接与对应的第三方服务商直接协商解决，梧桐时代不承担任何责任。</p>
								<p>3.7我们原则上保证平台线路质量稳定可靠，但因以下情况造成的质量问题乙方不承担违约责任，如： 国家政策影响、运营商机房中继线路调整、电信运营商机房维护检修、电信运营商网络互联互通链接不通畅、电信运营商政策调整与影响、乙方租用第三方云主机线路影响以及不可抗力因素造成的服务质量问题等。并且要求您不得利用乙方平台播放、散布下列内容：</p>
								<p> 3.7.1反对宪法所确定的基本原则的；</p>
								<p>3.7.2危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；</p>
								<p> 3.7.3有损国家荣誉和利益的；</p>
								<p> 3.7.4煽动民族仇恨、民族歧视、破坏民族团结的；</p>
								<p>3.7.5破坏国家宗教政策，宣扬法轮功等邪教和封建迷信的；</p>
								<p>3.7.6散布谣言，扰乱社会秩序的，破坏社会稳定的；</p>
								<p>3.7.7散布淫秽、色情、赌博、暴力、凶杀、恐怖、诈骗或者教唆犯罪的；</p>
								<p>3.7.8侮辱或者诽谤他人，侵犯他人合法权益的；</p>
								<p>3.7.9有法律、行政法规禁止的其他内容的。</p>
								<p>3.7.10有其他违反运营商规定的行为的；</p>
								<p>3.7.11有对最终用户造成骚扰行为的；</p>

								<h4>4、服务变更、中断或终止及服务条款的修改</h4>
								<p>4.1本服务的所有权和运作权、一切解释权归北京梧桐时代科技有限责任公司。梧桐时代提供的服务将按照其发布的章程、服务条款和操作规则严格执行。</p>
								<p>4.2本公司有权在必要时修改服务条款，服务条款一旦发生变动，将会在相关页面上公布修改后的服务条款。如果不同意所改动的内容，用户应主动取消此项服务或与我们取得联系。如果用户继续使用服务，则视为接受服务条款的变动。</p>
								<p>4.3本公司和合作公司有权按需要修改或变更所提供的收费服务、收费标准、收费方式、服务费、及服务条款。如果出现任何产品价格变动，梧桐时代和合作公司将尽最大努力通过有效方式通知用户有关的修改或变更。</p>
								<p>4.4本公司特别提醒用户注意，本公司为了保障公司业务发展和调整的自主权，本公司拥有经或未经事先通知而修改服务内容、中断或中止部分或全部服务的权利，修改会以通告形式公布于梧桐时代网站相关页面上，一经公布视为通知。梧桐时代行使修改或中断服务的权利而造成损失的，梧桐时代不需对用户或任何第三方负责。</p>
								<p>4.5如发生下列任何一种情形，本公司有权随时中断或终止向用户提供服务而无需通知用户：</p>
								<p>4.5.1用户提供的个人资料不真实；</p>
								<p>4.5.2用户违反本服务条款的规定；</p>
								<p>4.5.3按照主管部门的要求；</p>
								<p>4.5.4其他本公司认为是符合整体服务需求的特殊情形。</p>

								<h4>5、用户隐私保护条款</h4>
								<p>5.1梧桐时代重视对用户隐私的保护，保护隐私是梧桐时代的一项基本政策。您提供的登记资料及梧桐时代公司保留的有关您的若干其他个人资料将受到中国有关隐私的法律和本公司《隐私保护声明》之规范。</p>
								<p>5.2您使用梧桐时代服务时，梧桐时代有权用数字代码、通用唯一标识符、cookies或其他技术确定进入服务的计算机。梧桐时代有可能利用所得信息对服务的使用进行总体性及匿名的数据统计及分析，所得数据可供梧桐时代或其合作人使用。计算机识别技术也会用于执行相关的服务条款。</p>
								<p>5.3梧桐时代可能会与第三方合作向用户提供相关的服务，如该第三方为合法经营的公司且提供同等的用户隐私保护（如电信运营商），梧桐时代有权将用户的注册资料等提供给该第三方。</p>

								<h4>6、商标使用说明</h4>
								<p>6.1梧桐时代平台、梧桐时代、号码logo等，以及其他梧桐时代标志及产品、服务名称，均为梧桐时代公司之商标（以下简称"梧桐时代标识"）。未经梧桐时代 事先书面同意，您不得将梧桐时代标记以任何方式展示或使用或作其他处理，也不得向他人表明您有权展示、使用、或其他有权处理梧桐时代标识的行为。</p>
								<p>7、知识产权及法律保护条款</p>
								<p>7.1本公司定义的信息内容包括：文字、软件、声音、相片、录像、图表；网页；广告中全部内容；本公司为用户提供的商业信息。所有这些内容受版权、商标权、和其它知识产权和所有权法律的保护。所以，用户只能在本公司和相关权利人授权下才能使用这些内容，而不能擅自使用、抄袭、复制、修改、编撰这些内容、或创造与内容有关的衍生产品。</p>
								<p>7.2关于梧桐时代提供的软件和服务：您了解并同意，本服务及本服务所使用或提供之相关软件（以下简称"软件"）（但不包括两用户之间直接传递的资料）是由梧桐时代公司拥有所有相关知识产权及其他法律保护之专有之知识产权（包括但不限于版权、商标权、专利权、及商业秘密）资料。若就某一具体服务存在单独的最终用户软件授权协议，您除应遵守本协议有关规定外，亦应遵守该软件授权协议。　除非您亦同意该软件授权协议，否则您不得安装或使用该软件。对于未提供单独的软件授权协议的软件，　除您应遵守本服务协议外，梧桐时代公司或所有权人仅将为您个人提供可取消、不可转让、非专属的软件授权许可，　并仅为访问或使用本服务之目的而使用该软件。此外，在任何情况下，未经梧桐时代明示授权，您均不得修改、出租、出借、出售、散布本软件之任何部份或全部，或据以制作衍生著作，或使用擅自修改后的软件，或进行还原工程、反向编译，或以其他方式发现原始编码，包括但不限於为了未经授权而使用本服务之目的。您同意将通过由梧桐时代所提供的界面而非任何其他途径使用本服务。</p>

								<h4>8、本服务条款与国家法律、法规一致</h4>
								<p>8.1本服务条款要与国家相关法律、法规一致，如发生服务条款与相关法律、法规条款有相抵触的内容，抵触部分以法律、法规条款为准。</p>

								<h4>9、用户权益条款</h4>
								<p>9.1用户维护本公司利益，负责支付由用户使用超出服务范围引起的一切费用（包括但不限于：律师费用、违反服务条款的损害补偿费用以及其它第三人使用用户的电脑、帐号和其它知识产权的追索费）。 9.2用户须对违反国家法律规定及本服务条款所产生的一切后果承担法律责任。</p>

								<h4>10、服务条款适用范围</h4>
								<p>10.1本公司的住所地为北京市大兴，如果用户与本公司发生争议，用户同意将争议提交至本公司所在地的人民法院通过诉讼的方式解决。</p>
								<p>10.2如本服务条款中的任何条款无论因何种原因完全或部分无效或不具有执行 力，本服务条款的其余条款仍应有效且具有约束力，并且努力使该规定反映之意向具备效力。</p>
								<p>10.3本服务条款构成您与梧桐时代之全部协议，规范您对本服务之使用，并取代您先前与梧桐时代达成的全部协议。但在您使用相关服务、或使用第三方提供的内容或软件时，亦应遵从所适用之附加条款及权利。</p>　
								<p>10.4每项服务的内容、收费标准、收费方式、服务费及服务条款应以最后发布的通知为准。</p>
								<p>10.5用户对服务之任何部分或本服务条款的任何部分之意见及建议可通过邮件与梧桐时代联系，公司邮箱：kf@wutongsd.com 梧桐时代公司保留本服务条款之解释权。</p>

								<h4>北京梧桐时代科技有限责任公司</h4>
							</div>
						</div>
						<div class="theme-popover-mask"></div>
					</div>
				</div>


       <!--      <span class="yd">
                <p>
                    <input name="agree_status" id="agree_status" type="checkbox" value="0" onClick="auto_ck(this);">
                    <label for="idr">我已阅读并同意协议</label>
                </p>
                <p class="wei">《梧桐时代用户注册协议》</p>
            </span>-->



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

<script type="application/javascript">




	/*         弹窗                    */


	jQuery(document).ready(function($) {
		$('.theme-login').click(function(){
			$('.theme-popover-mask').fadeIn(100);
			$('.theme-popover').slideDown(200);
		})
		$('.theme-poptit .close').click(function(){
			$('.theme-popover-mask').fadeOut(100);
			$('.theme-popover').slideUp(200);
		})

	})


</script>
</body>
</html>
