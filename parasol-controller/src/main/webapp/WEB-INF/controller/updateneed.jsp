<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  xmlns=http://www.w3.org/1999/xhtml xmlns:bd=http://www.baidu.com/2010/xbdml>
<head lang="en">
    <meta charset="UTF-8">
    <title>发布需求</title>
    <meta name="viewport" content="width=device-width, user-scalable=no,
           initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv=Content-Type content="text/html;charset=utf-8">
    <meta http-equiv=X-UA-Compatible content=IE=EmulateIE7>
    <script>var wpo={start:new Date*1,pid:109,page:'superpage'}</script>
    <meta http-equiv=X-UA-Compatible content=IE=EmulateIE7>
    <link rel="stylesheet" href="/css/reset.min.css"/>
    <link rel="stylesheet" href="/css/fabuxuqiu.css"/>
    <style>
 /*    .shangchuan div input{
    filter:alpha(opacity=0); 
    -moz-opacity:0; 
    opacity:0;
    } */
    </style>
</head>
<body>
<div class="header">
    <div class="banx">
        <a href="/index.do"> < 返回首页</a>
        <div class="clear"></div>
        <div class="con">
            <div class="con-1">
                <div class="logo">
                </div>
                <p></p>
            </div>
            <div class="con-2">
                <div>选择类目</div>
                <div>描述您的需求</div>
                <div>发布成功</div>
            </div>
            <div class="con-3">
            <form  name="form" action="++++++++" method="post" enctype="multipart/form-data">
                <div class="le"> 
                    <!--  onkeydown 为键盘事件  -->
                    <div class="zhao">
                        <label for="zhao"><i>*</i>工程名称</label><input  type="text" id="projectName" name="projectName" value="${tender.projectName}"  placeholder="不得超过50个字符" />
                    </div>
                    <div class="zhaobiao">
                        <label for="zhaobiao"><i>*</i>招标单位</label><input  type="text" id="tenderee" name="tenderee" value="${tender.tenderee}"  placeholder="不得超过50个字符"/>
                    </div> 
                    <div class="gongcheng">
                        <label for="gongcheng">招标代理机构</label><input  type="text" id="tenderCompany" name="tenderCompany" value="${tender.tenderCompany}" placeholder="不得超过50个字符" />
                    </div>
                    <div class="fanwei">
                        <label for="fanwei"><i>*</i>项目类别</label><input  type="text" id="projectType" name="projectType"　value="${tender.projectType}" placeholder="不得超过50个字符" />
                    </div>
                    <div class="gongqi">
                        <label for="gongqi"><i>*</i>工期</label><input  id="schedule" name="schedule" value="${tender.schedule}" onkeyup="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}" onafterpaste="if(this.value.length==1){this.value=this.value.replace(/[^1-9]/g,'')}else{this.value=this.value.replace(/\D/g,'')}"><p>日历天</p>
                    </div>
                    <div class="zhiliang">
                        <label for="zhiliang"><i>*</i>质量要求</label><input  type="text" id="zhiliang"  value="合格" readonly />
                    </div>
                    <div class="zhijia">
                        <label for="zhijia"><i>*</i>合同估算价</label><input step="0.01" value="${tender.agreementPrice}" type="number" id="agreementPrice" name="agreementPrice" placeholder="只能保留两位小数" onkeypress="return myNumberic(event)" /><p>元</p>
                    </div>
                    <div class="ghuding">
                        <input type="checkbox" name="contractStatus"/>
                        <p>固定总价合同</p>
                        <input type="checkbox" name="billStatus" />
                        <p>增值税专用发票</p>
                        <input type="checkbox" name="priceStatus" />
                        <p>超价废标</p>
                    </div>
                    <div class="xiangmu">
                        <label for="xiangmu"><i>*</i>项目地点</label><input value="${tender.projectLocation}" type="text" id="projectLocation" name="projectLocation" placeholder="不得超过50个字符" />
                    </div>
                    <div class="baojiajiezhi" id="baojiajiezhi">
                        <label ><i>*</i>投标文件递交截止时间</label>
                        <select name="year1" id="year1" class="s_center"></select>年
                        <select name="month1" id="month1" class="s_center"></select>月
                        <select name="day1" id="day1" class="s_center"></select>日
                    </div>
                    <div class="baozheng">
                        <label for="baozheng"><i>*</i>投标保证金</label><input step="0.01"  type="number" id="tenderMoney" name="tenderMoney" placeholder="不得超过估算价2%" onkeypress="return myNumberic(event)" /><p>元</p><p class="baifei">(不超过招标项目估算价的2%)</p>
                    </div>
                </div>
                <!--                          右  右                     右侧                             -->
                <div class="re">
                    <div class="zhaob">
                        <label for="zhiliang"><i>*</i>招标地址</label><input  type="text" id="tenderAddress" name="tenderAddress" placeholder="不得超过50个字符" /><input id="classification" name="classification" type="hidden" value="${tender.tenderAddress}" />
                    </div>
                    <div class="zhaobiaoren">
                        <label for="zhiliang"><i>*</i>联系人</label>姓名<input  type="text" value="${tender.contactName}" class="lianXren" id="contactName" name="contactName" placeholder="二到五个字" />手机号<input id="contactMobile" value="${tender.contactMobile}" name="contactMobile" class="shouJhao" type="number" placeholder="有效手机号" />
                    </div>
                    <div class="xmshuom">
                        <label for="shuoM">其他项目说明 <p id="textCount">(不超过500字)</p></label>
                        <textarea class="content" type="text" id="explainl" name="explainl" placeholder="不超过500个汉字" value="${tender.explainl }" onkeyup="words_deal()"></textarea>
                    </div>
                    
              <!--  <div class="shach"> 
                  <div class="sh">
                          <p><i>*</i>上传附件</p>
                      </div>
                      <div class="shan">
                          <div class="upload-box" id="upload-box">
                              <form action="" name="first">
                                  <input type="file"/> 原生的file
                                  <input type="submit" value="上传"/> 原生的submit
                              </form>
                              <div class="upload">
                                  <div class="upload-choose">招标文件</div>
                                  <div class="upload-info"></div>
                              </div>
                          </div>
                          <div class="upload-box" id="upload-box-1">
                              <form action="" name="first">
                                  <input type="file"/>
                                  <input type="submit" value="上传"/>
                              </form>
                              <div class="upload">
                                  <div class="upload-choose">投标文件</div>
                                  <div class="upload-info"></div>
                              </div>
                          </div>
                      </div>
                  </div> -->
                    
                      <div class="shangchuan">
                              <label for="shangC"><i>*</i>上传附件</label>招标文件<input value="${suffix}" type="file" name="file_upload" id="shangC" onchange="getPhotoSize(this)" />
                      </div>
                      <div class="shangchuan">
                              <label for="zhaoBw">上传附件</label>其它文件<input value="${suffixl}" type="file" name="file_upload" id="zhaoBw" onchange="getPhotoSize(this)" />
                      </div>
                    
                    
                    <p>添加附件不大于100M</p>     
                    <div class="clear"></div>
                    <div class="tijiao">
                    <input type="submit" id="but" value="提交"/>
                      <!--   <button id="but">提交</button><p>(请填写完整再提交)</p> -->
                    <div class="clear"></div>
                    </div>
            </form> 
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="application/javascript" src="/JS/jquery-1.11.3.js"></script>
<script type="text/javascript" src="/JS/fBxq.js"></script>
<script>
    new YMDselect('year1','month1','day1');
</script>
<script type="text/javascript">

    /*                                                  控制字节                                     */

    $("input").change(function(){
    	  if($("input[name='priceStatus']")=="priceStatus"){
              return false;
          }
    	   if($("input[name='contractStatus']")=="contractStatus"){
              return false;
          }
    	  if($("input[name='billStatus']")=="billStatus"){
              return false;
          } 
        var value=$(this).val();
        if(value.length>50){
            // 内容超长了
            alert("长度不能大于50个字符");
            $(this).css("borderColor","red");
            return false;
        }else if(value.length<1){
            // 提示长度要大于1
            $(this).css("borderColor","red");
            alert("长度要大于1个字符");
            return false;
        }else{
            $(this).css("borderColor","");
        }
    });

/*       文本域  字数限制                           */
  
    function words_deal()
    {
        var curLength=$("#shuoM").val().length;
        if(curLength>5)
        {
            var num=$("#shuoM").val().substr(0,500);
            $("#shuoM").val(num);

            alert("不得超过500字，多出的字将被截断！" );
        }
        else
        {
            $("#textCount").text(5-$("#shuoM").val().length);
        }
    }

 /*  只保留两位小数        */

/*     function noNumbers(e)
    {
        var keynum;
        var keychar;
        var numcheck;
        if(window.event) // IE
        {
            keynum = e.keyCode
        }
        else if(e.which) // Netscape/Firefox/Opera
        {
            keynum = e.which
        }
        keychar = String.fromCharCode(keynum);
//判断是数字,且小数点后面只保留两位小数
        if(!isNaN(keychar)){
            var index=e.currentTarget.value.indexOf(".");
            if(index >= 0 && e.currentTarget.value.length-index >2){
                alert("只保留两位小数");
                return false;
            }
            return true;
        }
//如果是小数点 但不能出现多个 且第一位不能是小数点
        if("."== keychar ){
            if(e.currentTarget.value==""){
                return false;
            }
            if(e.currentTarget.value.indexOf(".") >= 0){
                return false;
            }
            return true;
        }
        return false  ;
    } */
    function myNumberic(e,len) {
        var obj=e.srcElement || e.target;
        var dot=obj.value.indexOf(".");//alert(e.which);
        len =(typeof(len)=="undefined")?2:len;
        var  key=e.keyCode|| e.which;
        if(key==8 || key==9 || key==46 || (key>=37  && key<=40))//这里为了兼容Firefox的backspace,tab,del,方向键
            return true;
        if (key<=57 && key>=48) { //数字
            if(dot==-1)//没有小数点
                return true;
            else if(obj.value.length<=dot+len)//小数位数
                alert("只保留两位小数");
                return true;
        } else if((key==46) && dot==-1){//小数点
            alert("注意小数点");
            return true;
        }

        return false;
    }

/* 

 //           原来的 校验                                            
   

        //      校验           校验             

        document.getElementById("but").onclick=function(){

            var re = /^[a-zA-Z\u4e00-\u9fa5][a-zA-Z0-9\u4e00-\u9fa5]*$/; //不能出现特殊字符
            
            if($("#projectName").val()=="" || $("#projectName").val()=="undefined"){
                $("#projectName").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert("工程名称不能为空");
                return false;
            } else if(!re.test($("#projectName").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#projectName").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#projectName").val()){
                $("#projectName").css("borderColor","");
                $(".tijiao p").css("color","");
            }



            if($("#tenderee").val()=="" || $("#tenderee").val()=="undefined"){
                $("#tenderee").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("招标单位不能为空");
                return false;
            }else if(!re.test($("#tenderee").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#tenderee").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#tenderee").val()){
                $("#tenderee").css("borderColor",""); $(".tijiao p").css("color","");
            }



            if($("#tenderCompany").val()=="" || $("#tenderCompany").val()=="undefined"){
                $("#tenderCompany").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("招标代理机构不能为空");
                return false;
            }else if(!re.test($("#tenderCompany").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#tenderCompany").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#tenderCompany").val()){
                $("#tenderCompany").css("borderColor",""); $(".tijiao p").css("color","");
            }



            if($("#fanwei").val()=="" || $("#fanwei").val()=="undefined"){
                $("#fanwei").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("项目类别不能为空");
                return false;
            }else if(!re.test($("#fanwei").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#fanwei").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#fanwei").val()){
                $("#fanwei").css("borderColor",""); $(".tijiao p").css("color","");
            }

    //       工期                      


            if($("#schedule").val()=="" || $("#schedule").val()=="undefined"){
                $("#schedule").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请填写工期");
                return false;
            }else if($("#schedule").val()){
                $("#schedule").css("borderColor",""); $(".tijiao p").css("color","");
            }



            if($("#zhiliang").val()=="" || $("#zhiliang").val()=="undefined"){
                $("#zhiliang").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请填写质量要求");
                return false;
            }else if(!re.test($("#zhiliang").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#zhiliang").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#zhiliang").val()){
                $("#zhiliang").css("borderColor",""); $(".tijiao p").css("color","");
            }


            if($("#agreementPrice").val()=="" || $("#agreementPrice").val()=="undefined"){
                $("#agreementPrice").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请填写价格");
                return false;
            }else if($("#agreementPrice").val()){
                $("#agreementPrice").css("borderColor",""); $(".tijiao p").css("color","");
            }



           if($("#projectLocation").val()=="" || $("#projectLocation").val()=="undefined"){
               $("#projectLocation").css("borderColor","red");    $(".tijiao p").css("color","red");
               alert("请填项目地点");
                return false;
            }else if(!re.test($("#projectLocation").val())){ // 返回true,代表在字符串中找到了非数字。
               $("#projectLocation").css("borderColor","red");
               $(".tijiao p").css("color","red");
               alert('不能输入特殊字符');
               return false;
           }else if($("#projectLocation").val()){
               $("#projectLocation").css("borderColor",""); $(".tijiao p").css("color","");
           }


            //                时间 戳                          


            if($("#year1").val()=="0" || $("#year1").val()=="undefined"){
                $("#year1").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请选择年份");
                return false;
            }else if($("#year1").val()!=="0"){
                $("#year1").css("borderColor",""); $(".tijiao p").css("color","");
            }

            if($("#month1").val()=="0" || $("#month1").val()=="undefined"){
                $("#month1").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请选择月份");
                return false;
            }else if($("#month1").val()!=="0"){
                $("#month1").css("borderColor",""); $(".tijiao p").css("color","");
            }

            if($("#day1").val()=="0" || $("#day1").val()=="undefined"){
                $("#day1").css("borderColor","red");    $(".tijiao p").css("color","red");
                alert("请选择日");
                return false;
            }else if($("#day1").val()!=="0"){
                $("#day1").css("borderColor",""); $(".tijiao p").css("color","");
            }
           if($("#tenderMoney").val()=="" || $("#tenderMoney").val()=="undefined"){
               $("#tenderMoney").css("borderColor","red");    $(".tijiao p").css("color","red");
               alert("请填写投标保证金");
                return false;
            }else if($("#tenderMoney").val()){
               $("#tenderMoney").css("borderColor",""); $(".tijiao p").css("color","");
           }

          if($("#tenderAddress").val()=="" || $("#tenderAddress").val()=="undefined"){
              $("#tenderAddress").css("borderColor","red");    $(".tijiao p").css("color","red");
              alert("请填写招标地址");
                return false;
            }else if(!re.test($("#tenderAddress").val())){ // 返回true,代表在字符串中找到了非数字。
              $("#tenderAddress").css("borderColor","red");
              $(".tijiao p").css("color","red");
              alert('不能输入特殊字符');
              return false;
          }else if($("#tenderAddress").val()){
              $("#tenderAddress").css("borderColor",""); $(".tijiao p").css("color","");
            }
    //   联系人                            校验           

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
              //           div         

            if($("#explainl").val()=="" || $("#explainl").val()=="undefined"){
              $("#explainl").css("borderColor","red");    $(".explainl p").css("color","red");
              alert("请填项目说明");
                return false;
            }else if(!re.test($("#explainl").val())){ // 返回true,代表在字符串中找到了非数字。
                $("#explainl").css("borderColor","red");
                $(".tijiao p").css("color","red");
                alert('不能输入特殊字符');
                return false;
            }else if($("#explainl").val()){
              $("#explainl").css("borderColor",""); $(".explainl p").css("color","");
            }
            $(".tijiao p").css("color","");
            
            
            
        }; 


     */
    

        /*                 新的                校验                                   */
          

               /*          校验           校验                      */

               document.getElementById("but").onclick=function(){

               /*     var re = /^[a-zA-Z\u4e00-\u9fa5][a-zA-Z0-9\u4e00-\u9fa5]*$/; //不能出现特殊字符 */
                   
                   if($("#projectName").val()=="" || $("#projectName").val()=="undefined"){
                       $("#projectName").css("borderColor","red");
                       $(".tijiao p").css("color","red");
                       alert("工程名称不能为空");
                       return false;
                   }else if($("#projectName").val()){
                       $("#projectName").css("borderColor","");
                       $(".tijiao p").css("color","");
                   }



                   if($("#tenderee").val()=="" || $("#tenderee").val()=="undefined"){
                       $("#tenderee").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("招标单位不能为空");
                       return false;
                   }else if($("#tenderee").val()){
                       $("#tenderee").css("borderColor",""); $(".tijiao p").css("color","");
                   }



                   if($("#tenderCompany").val()=="" || $("#tenderCompany").val()=="undefined"){
                       $("#tenderCompany").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("招标代理机构不能为空");
                       return false;
                   }else if($("#tenderCompany").val()){
                       $("#tenderCompany").css("borderColor",""); $(".tijiao p").css("color","");
                   }



                   if($("#fanwei").val()=="" || $("#fanwei").val()=="undefined"){
                       $("#fanwei").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("项目类别不能为空");
                       return false;
                   }else if($("#fanwei").val()){
                       $("#fanwei").css("borderColor",""); $(".tijiao p").css("color","");
                   }

           /*                工期                          */


                   if($("#schedule").val()=="" || $("#schedule").val()=="undefined"){
                       $("#schedule").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请填写工期");
                       return false;
                   }else if($("#schedule").val()){
                       $("#schedule").css("borderColor",""); $(".tijiao p").css("color","");
                   }



                   if($("#zhiliang").val()=="" || $("#zhiliang").val()=="undefined"){
                       $("#zhiliang").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请填写质量要求");
                       return false;
                   }else if($("#zhiliang").val()){
                       $("#zhiliang").css("borderColor",""); $(".tijiao p").css("color","");
                   }


                   if($("#agreementPrice").val()=="" || $("#agreementPrice").val()=="undefined"){
                       $("#agreementPrice").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请填写价格");
                       return false;
                   }else if($("#agreementPrice").val()){
                       $("#agreementPrice").css("borderColor",""); $(".tijiao p").css("color","");
                   }



                  if($("#projectLocation").val()=="" || $("#projectLocation").val()=="undefined"){
                      $("#projectLocation").css("borderColor","red");    $(".tijiao p").css("color","red");
                      alert("请填项目地点");
                       return false;
                   }else if($("#projectLocation").val()){
                      $("#projectLocation").css("borderColor",""); $(".tijiao p").css("color","");
                  }


                   /*                     时间 戳                                */


                   if($("#year1").val()=="0" || $("#year1").val()=="undefined"){
                       $("#year1").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请选择年份");
                       return false;
                   }else if($("#year1").val()!=="0"){
                       $("#year1").css("borderColor",""); $(".tijiao p").css("color","");
                   }

                   if($("#month1").val()=="0" || $("#month1").val()=="undefined"){
                       $("#month1").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请选择月份");
                       return false;
                   }else if($("#month1").val()!=="0"){
                       $("#month1").css("borderColor",""); $(".tijiao p").css("color","");
                   }

                   if($("#day1").val()=="0" || $("#day1").val()=="undefined"){
                       $("#day1").css("borderColor","red");    $(".tijiao p").css("color","red");
                       alert("请选择日");
                       return false;
                   }else if($("#day1").val()!=="0"){
                       $("#day1").css("borderColor",""); $(".tijiao p").css("color","");
                   }




                  if($("#tenderMoney").val()=="" || $("#tenderMoney").val()=="undefined"){
                      $("#tenderMoney").css("borderColor","red");    $(".tijiao p").css("color","red");
                      alert("请填写投标保证金");
                       return false;
                   }else if($("#tenderMoney").val()){
                      $("#tenderMoney").css("borderColor",""); $(".tijiao p").css("color","");
                  }

                 if($("#tenderAddress").val()=="" || $("#tenderAddress").val()=="undefined"){
                     $("#tenderAddress").css("borderColor","red");    $(".tijiao p").css("color","red");
                     alert("请填写招标地址");
                       return false;
                   }else if($("#tenderAddress").val()){
                     $("#tenderAddress").css("borderColor",""); $(".tijiao p").css("color","");
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



                   /*                 div          */

                   if($("#explainl").val()=="" || $("#explainl").val()=="undefined"){
                     $("#explainl").css("borderColor","red");    $(".explainl p").css("color","red");
                     alert("请填项目说明");
                       return false;
                   }else if($("#explainl").val()){
                     $("#explainl").css("borderColor",""); $(".explainl p").css("color","");
                   }
                   $(".tijiao p").css("color","");
				   
				   
				   
				   
			       if($("#shangC").val()=="" || $("#shangC").val()=="undefined"){
                      $("#shangC").css("borderColor","red");    $(".tijiao p").css("color","red");
                             alert("必须上传招标文件");
                                       return false;
                      }else if($("#shangC").val()){
                               $("#shangC").css("borderColor",""); $(".tijiao p").css("color","");
                     } 
                   
               };        
       
    function getPhotoSize(obj){
        photoExt=obj.value.substr(obj.value.lastIndexOf(".")).toLowerCase();//获得文件后缀名
        var fileSize = 0;
        var isIE = /msie/i.test(navigator.userAgent) && !window.opera;
        if (isIE && !obj.files) {
            var filePath = obj.value;
            var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
            var file = fileSystem.GetFile (filePath);
            fileSize = file.Size;
        }else {
            fileSize = obj.files[0].size;
        }
        fileSize=Math.round(fileSize/10240*1024)/1000; //单位为KB
        console.log(fileSize);
        if(fileSize>=102400){
            $(".shang").css("borderColor","red");
         
            alert("您的文件格式或大小 不正确！");
            return false;
        }
    } 
//---------------校验项目名-----------------//
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
/*     	
    	  function getPhotoSize(obj){
            photoExt=obj.value.substr(obj.value.lastIndexOf(".")).toLowerCase();//获得文件后缀名
            var fileSize = 0;
            var isIE = /msie/i.test(navigator.userAgent) && !window.opera;
            if (isIE && !obj.files) {
                var filePath = obj.value;
                var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
                var file = fileSystem.GetFile (filePath);
                fileSize = file.Size;
            }else {
                fileSize = obj.files[0].size;
            }
            fileSize=Math.round(fileSize/1024*1024)/1000; //单位为KB
            console.log(fileSize);
            if(fileSize>=10240){
                alert("文件最大为10MB，请重新上传!");
                return false;
            }
        } */
    	
</script>
</html>

