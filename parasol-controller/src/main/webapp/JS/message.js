
var InterValObj; //timer变量，控制时间
var count = 60; //间隔函数，1秒执行
var curCount;//当前剩余秒数


//-------------------------短信验证--------//
function sendMessage() {
    curCount = count;
    /* var code = ""; */
    var mobile = $("#mobile").val();
    /* var jbPhoneTip = $("#jbPhoneTip").text(); */
    if (mobile != "") {
        /* if(jbPhoneTip == "√ 该手机号码可以注册，输入正确" || jbPhoneTip == "√ 短信验证码已发到您的手机,请查收"){ */
        // 产生验证码
        /* 	 for ( var i = 0; i < 6; i++) {
         code += parseInt(Math.random() * 9).toString();
         }  */
        // 设置button效果，开始计时
        $("#btnSendCode").attr("disabled", "true");
        $("#btnSendCode").val("已发送，请在" + curCount + "秒内输入验证码");
        InterValObj = window.setInterval(SetRemainTime, 1000);   // 启动计时器，1秒执行一次
        // 向后台发送处理数据
        $.ajax({
            type: "POST", // 用POST方式传输
            /* dataType: "text", */ // 数据格式:JSON
            url: "/sdkTestSend.do", // 目标地址
            data: "mobile=" + mobile,   /*  +"&code=" + code*/
            error: function (XMLHttpRequest, textStatus, errorThrown) {

            },
            success: function (data){
                data = parseInt(data, 10);
                if(data == 1){
                    /* $("#jbPhoneTip").html("<font color='#339933'>√ 短信验证码已发到您的手机,请查收</font>"); */
                    alert("短信已发送，请查收");
                }else if(data == 0){
                    /* $("#jbPhoneTip").html("<font color='red'>× 短信验证码发送失败，请重新发送</font>"); */
                    alert("短信发送失败");
                }else if(data == 2){
                    /* $("#jbPhoneTip").html("<font color='red'>× 该手机号码今天发送验证码过多</font>"); */
                    alert("验证次数超限");
                }
            }
        });
        /* } */
    }else{
        /* $("#jbPhoneTip").html("<font color='red'>× 手机号码不能为空</font>"); */
        alert("手机号不能为空");
    }
}


//----------校验短信验证码------------//

$(function() {
    //文本框点击事件  
    $("input[name='mobileyan']").blur(function(){
        //发送ajax请求  
        $.ajax({
            type:"POST",
            url:"/checkCode.do",
            data:{
                mobileyan:$("input[name='mobileyan']").val()
            },
            dataType:"json",
            success:function(data){
                if(data.admin=="1"){
                    document.getElementById("mobileyan").value="";
                    $("#loginsubmit").attr("disabled", true);
                    $("#btnSendCode").val("验证失败");
                    $("#btnSendCode").attr("disabled", "false");
                   /* alert("验证失败");*/
                }else if(data.admin=="0"){
                    $("#btnSendCode").attr("disabled", "false");
                    $("#btnSendCode").val("验证成功");

                }else{
                    alert("验证码不能为空");
                    $("#loginsubmit").attr("disabled", true);
                }
            }
        })
    })

})
//-------------------------------//

//timer处理函数
function SetRemainTime() {
    if (curCount == 0) {
        window.clearInterval(InterValObj);// 停止计时器
        $("#btnSendCode").removeAttr("disabled");// 启用按钮
        $("#btnSendCode").val("重新发送验证码");
        code = ""; // 清除验证码。如果不清除，过时间后，输入收到的验证码依然有效
    }else {
        curCount--;
        $("#btnSendCode").val("已发送，请在" + curCount  + "秒内输入验证码");
    }
}
//-------------------------------------//


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
