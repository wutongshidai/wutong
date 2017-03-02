function ckname(){
	var user = document.getElementById('mima').value;
	var patten = /^[a-zA-Z]\w{3,15}$/ig;
	if(!patten.test(user))
	{
	$("input[name=userName]").focus().val("你是不是傻！");
	return false;
	}
	return true;
	}
	
function ckpassword(){
	var user = document.getElementById('mma').value;
	var patten = /^[0-9a-zA-Z_]{6,12}$/ig;
	if(!patten.test(user))
	{
	$("input[name=password]").focus().val("");
	return false;
	}
	return true;
	}

 function ckMobile() {    
	        var mobile = $.trim($("#mobile").val());    
	        var isMobile = /^1[34578]\d{9}$/ig;    
	            if (!isMobile.exec(mobile) && mobile.length != 11) {  
				$("input[name=mobile]").focus().val("手机号错误");  
//	                $("#mobile").focus();    
	                return false;    
	            }    
	        return true;    
	        }  

 $(function(){  
	        $("#phone_number").blur(function(){  
	                var phone = $("#phone_number").val();  
	                var len = $("#phone_number").val().length;  
	                $.getJSON("userJudge.action",{"phone_mobile":phone},function(data){  
	                        if(data!=null){  
	                            alert("手机号已注册，请重新输入！！");  
	                            $("#userNameError").html("手机号已注册！");  
	                            $("#regFrm").attr("onsubmit","return false");  
	                              
	                        }else if(len==0||phone==null){  
	                            $("#userNameError").html("手机号不能为空！");  
	                            $("#regFrm").attr("onsubmit","return false");  
	                            }  
	                        else if (!checkContactNumber()) {   
	                              $("#userNameError").html("不符合手机号格式！");  
	                              $("#regFrm").attr("onsubmit","return false");  
	                            }   
	                        else{  
	                            $("#userNameError").html("恭喜！手机号可用！")  
	                            $("#regFrm").attr("onsubmit","return true");  
	                                }  
	                    });  
	            });  
	        });  
	// 密码合法性的判断  
	    $(function(){  
	        $("#pwd").blur(function(){  
	            var len = $("#pwd").val().length;  
	            if(len==0){  
	                $("#pwdError").html("密码不能为空！");  
	                $("#regFrm").attr("onsubmit","return false");  
	                }  
	            if(len>0&&len<6){  
	                $("#pwdError").html("密码位数最少为6位！");  
	                $("#regFrm").attr("onsubmit","return false");  
	                }  
	            if(len>=6){  
	                $("#pwdError").html("密码格式正确！");  
	                $("#regFrm").attr("onsubmit","return true");  
	                }  
	            })  
	        })  
	// 确认两次密码  
	    $(function(){  
	        $("#conpwd").blur(function(){  
	        var oldpwd = $("#pwd").val();  
	        var conpwd = $("#conpwd").val();  
	        var number = $("#conpwd").val().length;  
	        if(number == 0){  
	            $("#pwdError").html("密码不能为空！");  
	            $("#regFrm").attr("onsubmit","return false");  
	        }  
	        else if(oldpwd!=conpwd){  
	                $("#conpwdError").html("两次密码不一致！");  
	                $("#regFrm").attr("onsubmit","return false");  
	            }else{  
	                $("#conpwdError").html("密码符合！");  
	                $("#regFrm").attr("onsubmit","return true");  
	            }  
	        })  
	    })  
	    function check(){    
	         fr=document.reg;    
	         if(fr.phone_mobile.value==""){    
	            fr.phone_mobile.focus();    
	            return false;    
	         }    
	         if((fr.login_password.value=="")){    
	                 fr.login_password.focus();   
	                 return false;    
	         }  
	        if((fr.login_password2.value=="")){    
	             fr.login_password2.focus();   
	             return false;    
	     }  
	           fr.submit();  
	         }  
	    function checkContactNumber() {    
	        var mobile = $.trim($("#phone_number").val());    
	        var isMobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1})|(14[0-9]{1}))+\d{8})$/;    
	            if (!isMobile.exec(mobile) && mobile.length != 11) {    
	                $("#phone_number").focus();    
	                return false;    
	            }    
	        return true;    
	        }    








