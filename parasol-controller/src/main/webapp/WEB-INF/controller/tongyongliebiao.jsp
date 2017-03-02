<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  xmlns=http://www.w3.org/1999/xhtml xmlns:bd=http://www.baidu.com/2010/xbdml>
<head lang="en">
    <meta charset="UTF-8">
    <title>通用列表</title>
    <link rel="stylesheet" href="/css/reset.min.css"/>
    <link rel="stylesheet" href="/css/tongyongliebiao.css"/>
    <meta http-equiv=Content-Type content="text/html;charset=utf-8">
    <meta http-equiv=X-UA-Compatible content=IE=EmulateIE7>
</head>
<body>
<div class="header">
    <div class="banx">
        <a href="/index.do"> < 返回首页</a>
        <div class="clear"></div>
        <div class="con">
            <div class="con-1">
                <div class="logo"></div>
                <p></p>
            </div>
            <div class="con-2">
                <div>选择类目</div>
                <div>描述您的需求</div>
                <div>发布成功</div>
            </div>
            <div class="zhuN">
                <div class="re">
                	<form  name="form" action="/need.do" method="post" enctype="multipart/form-data">
                    <div class="xuQ">
                        <label for="xuQ"><i>*</i>需求名称</label><input  type="text" id="projectName" name="projectName" placeholder="不得超过50个字符" /><input id="classification" name="classification" type="hidden" value="${classification }" />
                    </div>
                    <div class="xmshuom">
                        <label for="shuoM">项目说明 <p>(不超过500字)</p></label>
                        <textarea class="content" type="text" id="explainl" name="explainl" placeholder="不超过500个汉字"></textarea>
                    </div>
                    <div class="lianxiren">
                        <label for="contactName"><i>*</i>联系人姓名</label><input  type="text" class="contactName" name="contactName" id="contactName" />
                    </div>
                    <div class="dianhua">
                        <label for="contactMobile"><i>*</i>联系人电话</label><input id="contactMobile" name="contactMobile" class="contactMobile" type="number" />
                    </div>
                    <div class="shangchuan">
                        <label for="shangC"><i>*</i>上传附件</label><input type="file" name="file_upload" id="file_upload" /><p>添加附件</p>
                    </div>
                    <div class="tijiao">
                    	<input type="submit" id="but" value="提交"/>
                        <!-- <button id="but">提交</button><p>(请填写完整再提交)</p> -->
                        <div class="clear"></div>
                    </div>
                    </form>
                </div>
                <div class="zR">
                    <p>发布需求常见问题</p>
                    <p>什么是需求发布？</p>
                    <p>如何进行需求发布？</p>
                    <p>标题标题标题标题标题标题？</p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="application/javascript" src="JS/jquery-1.11.3.js"></script>
<script type="application/javascript">

    /*                                                  控制字节                                  */

    $("input").change(function(){
        var value=$(this).val();
        if(value.length>18){
            // 内容超长了
            alert("长度不能大于18个字符");
            $(this).css("borderColor","red");
            return false;
        }else if(value.length<2){
            // 提示长度要大于2
            $(this).css("borderColor","red");
            alert("长度要大于2个字符");
            return false;
        }else{
            $(this).css("borderColor","");
        }
    });

    /*       文本域  字数限制                           */
    document.getElementById('explainl').onkeydown = function(){
        if(this.value.length >= 500)

            event.returnValue = false;
    };


    /*          校验           校验                       */

    document.getElementById("but").onclick=function() {

        var re = /^([\u4e00-\u9fa5]+|[a-zA-Z0-9]+)$/; //不能出现特殊字符
        if ($("#projectName").val() == "" || $("#projectName").val() == "undefined") {
            $("#projectName").css("borderColor", "red");
            $(".tijiao p").css("color", "red");
            alert("需求名称不能为空");
            return false;
        } else if (!re.test($("#projectName").val())) { // 返回true,代表在字符串中找到了非数字。
            $("#projectName").css("borderColor", "red");
            $(".tijiao p").css("color", "red");
            alert('不能输入特殊字符');
            return false;
        } else if ($("#projectName").val()) {
            $("#projectName").css("borderColor", "");
            $(".tijiao p").css("color", "");
        }

        if ($("#explainl").val() == "" || $("#explainl").val() == "undefined") {
            $("#explainl").css("borderColor", "red");
            $(".tijiao p").css("color", "red");
            alert("项目说明不能为空");
            return false;
        }else if ($("#explainl").val()) {
            $("#explainl").css("borderColor", "");
            $(".tijiao p").css("color", "");
        }


        /*      联系人                            校验                */

        var de=/^1[34578]\d{9}$/;

        if($("#contactName").val()=="" || $("#contactName").val()=="undefined"){
            $("#contactName").css("borderColor","red");    $(".tijiao p").css("color","red");
            alert("联系人");
            return false;
        }else if($("#contactName").val()){
            $("#contactName").css("borderColor",""); $(".tijiao p").css("color","");
        }

        if($("#contactMobile").val()=="" || $("#contactMobile").val()=="undefined"){
            $("#contactMobile").css("borderColor","red");    $(".tijiao p").css("color","red");
            alert("请填写手机号");
            return false;
        }else if(!de.test($("#contactMobile").val())){ // 返回true,代表在字符串中找到了非数字。
            $("#contactMobile").css("borderColor","red");
            $(".tijiao p").css("color","red");
            alert('手机号无效');
            return false;
        }else if($("#contactMobile").val()){
            $("#contactMobile").css("borderColor",""); $(".tijiao p").css("color","");
        }


    }


    
    
    
     $(function() {  
    	             //文本框点击事件  
    	             $("input[name='projectName']").blur(function(){  
    	                 //发送ajax请求  
    	                 $.ajax({  
    	                     type:"POST",  
    	                     url:"/projectName.do",  
    	                     data:{  
    	                     	projectName:$("input[name='projectName']").val()
    	                     },  
    	                     dataType:"json",  
    	                     success:function(data){   
    	                         if(data.admin=="0"){  
    		                             alert("项目名称已存在"); 
                                         $("#but").attr("disabled", true);
                                         $("#projectName").css("borderColor", "red");
    									return false; 
    									
    	                         }else if(data.admin=="1"){
			                              $('#but').removeAttr("disabled"); 
			                              $("#shou_j").css("borderColor", "");

    	                         }
    	                     },  
    	                 })  
    	             })  
    	              
    	        })  


</script>

</html>