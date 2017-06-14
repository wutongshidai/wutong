<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>通用需求</title>

    <meta http-equiv=Content-Type content=“text/html;charset=utf-8″>
    <meta http-equiv=X-UA-Compatible content=IE=EmulateIE7>

    <!–[if lt IE 9]>
    <script src=”http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js”></script>
    <![endif]–>

    <!–[if IE]>
    <script>
        (function(){if(!/*@cc_on!@*/0)return;var e = "abbr,article,aside,audio,canvas,datalist,details,dialog,eventsource,figure,footer,header,hgroup,mark,menu,meter,nav,output,progress,section,time,video".split(','),i=e.length;while(i-){document.createElement(e[i])}})()
    </script>
    <![endif]–>

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/xuqiufabu-tongyong.css" rel="stylesheet"  type="text/css"/>

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
                <li><a href="#">我的账户</a></li>
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
                <form method="GET"   target="_blank" onsubmit="return formsub()">
                    <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" > <img src="img/souuso.png" ></button>
                    <a href="#" class="re">热门搜索</a>
                	<a href="#">设计</a>
                	<a href="#">专家库</a>
                	<a href="#">材料</a>
                	<a href="#">需求</a>
                </form>
            </div>
        </div>
        <!--  zhu ti 导航-->
        <div class="content banx">
            <div class="mainbav">
                <ul>
                <li class="mr"><a href="/index.do">首页</a></li>
                <li><a href="/xuqiudating.do">需求大厅</a></li>
                <li><img src="img/hr.png" alt=""/>材料</li>
                <li>专业分包</li>
                <li>劳务分包</li>
                <li><a href="cgal.html">设计</a></li>
                <li><a href="zjLb.html">专家库</a></li>
                <li>设备租赁</li>
                <li><a href="cgal.html">成功案例</a></li>
                </ul>
            </div>
            <div class="zhuTi">
                <p>需求大厅 <a href="#"> < ${esc}</a><a href="#"> < ${desc}</a></p>
                <div class="Dxiaoguo">
                   <%--  <p>${tender.agreementPrice} <em>元</em></p> --%>
                    <h5>${tender.projectName}</h5>
                </div>
                <div class="zhuT">
                    <div class="cengg">
                        <div class="xinX">
                            <h6>项目信息</h6>
                            <ul>
                                <li>项目名称：${tender.projectName}</li>
<!--                                 <li class="shuoM">其他项目说明：<p>百个字其他项目说明五百五百个子字五百个字其他项目说明五百个子字五百个字五百个子字五百个字其他项目说明五百个子字五百个字其他项目说明五百个子字五百个字其他项目说明五百个子字五百个字五百个子字五百个字其他项目说明五百个子字五百个字其他项目说明五百个子字五百个字其他项目说明五百个子字五百个字</p></li> -->   
                                <li>联系人：${tender.contactName}</li>
                                <li>电话：${tender.contactMobile}</li>
                                <li>附件列表：<a href="/fileDownload_servlet.do?filePath=${tender.tenderFile}"> ${suffix}</a></li>

                              <!--  <li>招标单位：某某公司</li>
                                <li>招标代理机构：某某机构</li>
                                <li>项目类别：工程</li>
                                <li>工期：500自然日</li>
                                <li>招标文件递交截止时间：2017-2-12</li>
                                <li>投标保证金：500元</li>
                                <li>质量要求：合格</li>
                                <li>项目地点：北京</li>
                                <li>合同估算价：5000.00元</li>
                                <li>招标地址：北京市大兴区****地区</li>
                                <li class="ggg">固定合同</li> &lt;!&ndash; 里增加了 DIV  &ndash;&gt;
-->
                            </ul>
                        </div>
                        <div class="miaoS">
                            <h6>需求描述</h6>
                           <!--   
                            <ul>
                               <li>仓库3D仿真展示端，说有数据来自第三方系统，通过WEBAPI及TCP与第三方系统通信</li>
                                <li>3D局部示意图请参考《WAREHOUSE.PNG》</li>
                                <li>通过3D技术仿真附件《ROBOTS-IN-WAREHOUSE.MP4》中的内容</li>
                                <li>1.用户登录|退出登录</li>
                                <li>${tender.explainl }</li>
                            </ul>
                             -->
                            <div class="shuoM">
                            <textarea name="textarea" readonly>${tender.explainl}</textarea>
                            </div>
                        </div>
                    </div>
                    <div class="reB">
                        <div>
                            <div><img src="img/dengllu.jpg" alt="商家"/></div>
                            <span>好评率：100%</span>
                            <p>北京宏洋宸电线电缆</p>
                        </div>
                        <div>
                            <div><img src="img/dengllu.jpg" alt="商家"/></div>
                            <span>好评率：100%</span>
                            <p>北京宏洋宸电线电缆</p>
                        </div>
                        <div>
                            <div><img src="img/dengllu.jpg" alt="商家"/></div>
                            <span>好评率：100%</span>
                            <p>北京宏洋宸电线电缆</p>
                        </div>
                    </div>
                </div>
                <div class="reM">
                    <h6>热门商家</h6>
                    <ul>
                        <li>
                            <span><img src="img/dengllu.jpg" alt="商家"/></span>
                            <p><em></em>北京</p>
                            <b>电线商家</b>
                            <p>北京宏洋宸电线电缆</p>
                        </li>
                        <li>
                            <span><img src="img/dengllu.jpg" alt="商家"/></span>
                            <p><em></em>北京</p>
                            <b>电线商家</b>
                            <p>北京宏洋宸电线电缆</p>
                        </li>
                        <li>
                            <span><img src="img/dengllu.jpg" alt="商家"/></span>
                            <p><em></em>北京</p>
                            <b>电线商家</b>
                            <p>北京宏洋宸电线电缆</p>
                        </li>
                        <li>
                            <span><img src="img/dengllu.jpg" alt="商家"/></span>
                            <p><em></em>北京</p>
                            <b>电线商家</b>
                            <p>北京宏洋宸电线电缆</p>
                        </li>
                        <li>
                            <span><img src="img/dengllu.jpg" alt="商家"/></span>
                            <p><em></em>北京</p>
                            <b>电线商家</b>
                            <p>北京宏洋宸电线电缆</p>
                        </li>
                    </ul>
                </div>
                <div class="clear"></div>

                <!-- 主体 材料                                        -->

                <!--尾部                                             尾部-->
                <div class="main_wenbu banx">
                    <p><a href="#">关于我们</a></p>
                    <p><a href="#">企业服务</a></p>
                    <p><a href="#">联系我们</a></p>
                    <p><a href="#">帮助中心</a></p>
                    <p><a href="#">网站导航</a></p>
                    <p>Copyright2016 梧桐时代科技有限责任公司 . 京ICP 证 17016004 号 京公网安备  1100000000000 号</p>
                    <p>通讯地址：北京市大兴区亦庄县小羊坊康碱路 6 号</p>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>