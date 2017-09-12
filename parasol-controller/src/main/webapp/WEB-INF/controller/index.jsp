<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>梧桐时代-建筑业二次分包领域集采平台</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=8">

    <meta http-equiv=Content-Type content="text/html;charset=utf-8">

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/index.css" rel="stylesheet"  type="text/css"/>
</head>
<body>
<div class="fanHui-wenma">
    <span>扫码关注</span>
    <div class="vv">
        <div class="vv-1"><img src="img/erweima.png" alt=""/></div>
        <p>扫一扫</p>
        <p>关注梧桐时代</p>
        <p>官方微信公众号</p>
    </div>
</div>
<a  class="fanHui" href="javascript:;" id="btn"></a>
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
            <li><a href="/html/myAccount.html">我的账户</a></li>
            <li><a href="#">联系客服</a></li>
            <li><a href="/perties.do">消息</a></li>
            <li><a href="/zhucechenggong.do">帮助</a></li>
        </ul>
    </div>
    <!--logo 搜索-->
    <div class="search banx" >
        <span class="logo"></span>
        <p></p>
        <div class="search_f">
            <form method="GET"   target="_blank" onsubmit="return formsub()">
                <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" ><img src="img/dongh_newbbs_ssfdj1.png" ></button>
                <a href="#" class="re">热门搜索</a>
                <a href="#">设计</a>
                <a href="../html/zjLb1.html">专家库</a>
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
                <li><a href="/xuqiudating.do">招标大厅</a></li>
                <li><img src="img/hr.png" alt=""/><a href="caiLiao.html">材料</a></li>
                <li>专业分包</li>
                <li>劳务分包</li>
                <li><a href="/cgal.do">设计</a></li>
                <li><a href="../html/zjLb1.html">专家库</a></li>
                <li>设备租赁</li>
                <li><a href="/cgal.do">成功案例</a></li>
            
             
            </ul>
    
        </div>
        <!--                                                 主体内容                                          -->
        <div class="main banx">
            <div class="main_leftsidebar">       
             <div class="imgWe">
                    <div>
                        <h6>梧桐资讯</h6>
                        <a href="#">更多</a>
                    </div>
                    <div class="list_lh">
                        <ul class="wenZ">                         
                           <!--  <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>
                            <li><a href="#"><em></em>北京东豪建设集团入驻梧桐时代</a><i>4-20</i></li>  -->
                        </ul>
                    </div>
                </div>
                <div class="button"><a href="/liumu.do">发布招标需求 > </a></div>          
            </div>

            <!--                       -->

            <div class="main_m" id="main_m">
                <div id="box" class="box">
                    <div class="imgWrap"></div>
                    <ul></ul>
                    <a href="javascript:;" class="btnLeft"></a>
                    <a href="javascript:;" class="btnRight"></a>
                </div>
            </div>


            <!--                                                          -->

            <div class="tuceng">
                <div class="main_rightsidebar">
                    <div class="he">
                        <div><img src="img/wdl.png" alt=""/></div>
                        <p>Hi,欢迎访问梧桐时代!</p>
                        <span class="deng"><div class="" <c:if test="${empty user.userName}"> style="display: block" </c:if><c:if test="${not empty user.userName}">style="display: none" </c:if>><a href="/dengL.do" >登录</a></div>
             							<div class="yonghu" <c:if test="${not empty user.userName}"> style="display: block" </c:if><c:if test="${empty user.userName}">style="display: none" </c:if>><a href="/dengL.do" >${user.userName }</a></div></span>
                        <span class="zhu"><div class="" <c:if test="${empty user.userName}"> style="display: block" </c:if><c:if test="${not empty user.userName}">style="display: none" </c:if>><a href="/login.do" >注册</a></div>
             						<%--	<div class="" <c:if test="${not empty user.userName}"> style="display: block" </c:if><c:if test="${empty user.userName}">style="display: none" </c:if>><a href="/loginOut.do" >退出</a></div> --%>
                        </span>
                        <ul>
                            <li class="xin"><a href="#">新人福利</a></li>
                            <li class="hui"><a href="login.do">会员注册</a></li>
                        </ul>
                    </div>
                    <div class="fo">
                        <ul>
                            <li><a href="#"></a>最新发布<i></i></li>
                         
                            <li><a href="/xuqiudating.do" style="color: #459DFF">更多</a></li>
                        </ul>
                      <!--   <p class="fo-s">需求发布</p> -->
                        <c:forEach items="${tenders}" var="tender" >
                        	<p><a href="/choiceDemand.do?projectName=${tender.projectName }" stye="margin-left: 6px;">${tender.projectName }</a></p>
                        </c:forEach>
                    </div>
                </div>
            </div>

        </div>
        <!--广告                                                -->
        <div class="banner banx">
         <div class="banner-1">
                <h5>入驻采买商家</h5><i></i>
            </div>
            <div class="banner-2" id="div1">
                <ul id="ul1">

                </ul>
                <ul id="ul2">

                </ul>
            </div>     
        </div>
        <div class="clear"></div>

        <!-- 主体 材料                                        -->

        <div class="main_cail banx">

            <h2>材料<i></i><p><a href="#">更多<span></span></a></p></h2>

            <div class="cail-content">
                <div class="leftsidebar">
                    <span><img src="img/材料广告/材料图.png"alt=""/></span>
                    <ul>
                        <li><img src="img/材料广告/东方雨虹.png"alt=""/></li>
                        <li><img src="img/材料广告/奥的斯.png"alt=""/></li>
                        <li><img src="img/材料广告/宝胜.png"alt=""/></li>
                        <li><img src="img/材料广告/日丰.png"alt=""/></li>
                        <li><img src="img/材料广告/蒙娜丽莎.png"alt=""/></li>
                        <li><img src="img/材料广告/libang-.png"alt=""/></li>
                    </ul>
                </div>
                <div class="clear"></div>
                <div class="content">
                    <div class="content_diyi">
                        <ul>
                            <li><b></b>北京</li>
                            <li>线缆商家</li>
                            <li><img src="img/sycl-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>好评率：100%</li>
                            <li>成交量：1000+</li>
                            <li>江苏帝一集团有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>地面材料</li>
                            <li><img src="img/sycl-2.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京全欣科技有限公司</li>
                        </ul>

                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>材料商家</li>
                            <li><img src="img/sycl-3.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>海鲸伟业装饰材料有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石材商家</li>
                            <li><img src="img/sycl-4.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京蓝兴峰胜石材有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>地毯商家</li>
                            <li><img src="img/sycl-5.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>东升地毯集团</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>铝材商家</li>
                            <li><img src="img/sycl-6.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京科泰盛世铝业有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>涂料商家</li>
                            <li><img src="img/sycl-7.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京东方海润贸易有限公司</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!--专业分包                                          -->

        <div class="main_fenb banx">

            <h2>专业分包<i></i><p><a href="#">更多<span></span></a></p></h2>

            <div class="cail-content">
                <div class="leftsidebar">
                    <span><img src="img/专业分包广告图/专业分包.png" alt=""/></span>
                    <ul>
                        <li><img src="img/专业分包广告图/中财.png" alt=""/></li>
                        <li><img src="img/专业分包广告图/施耐德.png" alt=""/></li>
                        <li><img src="img/专业分包广告图/海湾.png" alt=""/></li>
                        <li><img src="img/专业分包广告图/西门子.png" alt=""/></li>
                        <li><img src="img/专业分包广告图/远大中国.png" alt=""/></li>
                        <li><img src="img/专业分包广告图/飞利浦.png" alt=""/></li>
                    </ul>
                </div>
                <div class="clear"></div>
                <div class="content">
                    <div class="content_diyi">
                        <ul>
                            <li><b></b>北京</li>
                            <li>劳务商家</li>
                            <li><img src="img/syfb-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>好评率：100%</li>
                            <li>成交量：1000+</li>
                            <li>北京京东安装饰</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>防水商家</li>
                            <li><img src="img/syfb-2.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京世纪洪雨防水有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>幕墙商家</li>
                            <li><img src="img/syfb-3.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>鸿泰建筑装饰设计有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>弱电商家</li>
                            <li><img src="img/syfb-4.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>伟辰远峰科技发展有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>空调商家</li>
                            <li><img src="img/syfb-5.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京力格泰商贸有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>灯具商家</li>
                            <li><img src="img/syfb-6.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京星空华业光电科技</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>开关设备</li>
                            <li><img src="img/syfb-7.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北龙源开关设备有限责任公司</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- 设计                                                        -->
        <div class="main_she banx">
            <h2>设计<i></i><p><a href="/cgal.do"> 更多<span></span></a></p></h2>
            <div class="sheji">
                <div class="leftsidebar">
                    <span><img src="img/sheji/0.png" alt=""/></span>
                    <ul>
                        <li></li>
                        <li>优质设计商家</li>
                        <li></li>
                        <li></li>
                    </ul>
                    <div>
                        <span><img src="img/zhuanjianku/1.png" alt=""/></span>
                        <p>天建设计院</p>
                        <p>好评率：100%</p>
                    </div>
                    <div>
                        <span><img src="img/zhuanjianku/1.png" alt=""/></span>
                        <p>天建设计院</p>
                        <p>好评率：100%</p>
                    </div>
                    <div>
                        <span><img src="img/zhuanjianku/1.png" alt=""/></span>
                        <p>天建设计院</p>
                        <p>好评率：100%</p>
                    </div>
                </div>

            </div>
            <div class="sheji_content">
                <p>施工效果图</p>
                <ul>
                    <li class="diyi">
                        <span><img src="img/sheji/1.png" alt=""/></span>
                        <span><img src="img/sheji/1-1.png" alt=""/></span>
                        <span><img src="img/sheji/1-2.png" alt=""/></span>
                        <span><img src="img/sheji/1-3.png" alt=""/></span>
                    </li>
                    <li class="dier">
                        <span><img src="img/sheji/2.png" alt=""/></span>
                        <span><img src="img/sheji/2-1.png" alt=""/></span>
                        <span><img src="img/sheji/2-2.png" alt=""/></span>
                        <span><img src="img/sheji/2-3.png" alt=""/></span>
                    </li>
                    <li class="disan">
                        <span><img src="img/sheji/3.png" alt=""/></span>
                        <span><img src="img/sheji/3-1.png" alt=""/></span>
                        <span><img src="img/sheji/3-2.png" alt=""/></span>
                        <span><img src="img/sheji/3-3.png" alt=""/></span>
                    </li>
                </ul>
            </div>
        </div> 
        <!-- 专家库                                                    -->
        <div class="main_zhuan banx">
           <h2>专家库<i></i><p><a href="#"> 更多<span></span></a></p></h2>
            <ul>
            	 <c:forEach items="${experts}" var="experts" >
                      <li>
                    	<span><img src="${experts.photo}" alt=""/></span>
                    	<p class="zi">${experts.spare3 }</p>
                    	<p>学&nbsp;&nbsp;历：${experts.education }</p>
                    	<p>专业领域：${experts.field }</p>
                    	<p>专家职称：${experts.title}</p>
                    	<p class="guan"><a href="/html/zjXq1.html?id=${experts.id }">查看详情</a></p>
                	  </li>
                 </c:forEach>
         <!--        <li>
                    <span><img src="img/zhuanjianku/syzj-01.png" alt=""/></span>
                    <p class="zi">王长军</p>
                    <p>学&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：工民建专业</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="zHuanJia/zjxq-4.html">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-02.png" alt=""/></span>
                    <p class="zi">庄英</p>
                    <p>学&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：暖通及机电设备</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="zHuanJia/zjxq-2.html">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-03.png" alt=""/></span>
                    <p class="zi">杨国强</p>
                    <p>学&nbsp;&nbsp;历：工程硕士</p>
                    <p>专业领域：工程监理</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="zHuanJia/zjxq-1.html">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-04.png" alt=""/></span>
                    <p class="zi">何礼富</p>
                    <p>学&nbsp;&nbsp;历：硕士研究生</p>
                    <p>专业领域：计算机应用</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="zHuanJia/zjxq-3.html">查看详情</a></p>
                </li> -->
            </ul>
            <div>
              <span>
                        <p>入驻专家库</p>
                        <em>(入驻条件：评标专家)</em>
              </span>
                <ol>
                    <li>入驻价值</li>
                    <li><i></i>专属个人页面</li>
                    <li><i></i>专属交易顾问</li>
                    <li><i></i>足不出户当全国专家</li>
                </ol>
                <p><a id="btn110">立即入驻</a></p>
            </div>
        </div>
        <!--  成功案例                                        成功案例-->
        <div class="main_anli banx">
             <h2>成功案例<i></i><p><a href="/cgal.do">更多<span></span></a></p></h2>
            <ul>
                <li>
                    <span><img src="img/chenggonganli/1.png" alt=""/></span>
                    <p>京民大厦工程</p>
                    <p>装饰装修<i><em>￥</em>324,985.12</i></p>
                </li>
                <li>
                    <span><img src="img/chenggonganli/2.png" alt=""/></span>
                    <p>国家会议中心工程</p>
                    <p>装饰装修<i><em>￥</em>16,086,662.20</i></p>
                </li>
                <li>
                    <span><img src="img/chenggonganli/3.png" alt=""/></span>
                    <p>北京市第一中级人民法院工程</p>
                    <p>装饰装修<i><em>￥</em>40,465,801.86</i></p>
                </li>
                <li>
                    <span><img src="img/chenggonganli/4(1).png" alt=""/></span>
                    <p>希界维国际影城</p>
                    <p>装饰装修<i><em>￥</em>9,300,000.00</i></p>
                </li>
            </ul>
        </div>

        <!-- logo 图片                                              -->
        <div class="main_logo banx"><img src="img/banner1.png" alt=""/></div>
        <!--梧桐网                                                 -->
        <div class="main_wutong banx">
            <p>梧桐网</p>
            <ul>
                <li>
                    <ol>
                        <li>个人会员</li>
                        <li>VIP服务</li>
                        <li>升级VIP</li>
                        <li>信誉度</li>
                    </ol>
                </li>
                <li>
                    <ol>
                        <li>企业会员</li>
                        <li>人才招聘</li>
                        <li>证书服务</li>
                        <li>VIP服务</li>
                        <li>升级VIP</li>
                    </ol>
                </li>
                <li>
                    <ol>
                        <li>广告服务</li>
                        <li>资讯发布</li>
                        <li>广告推广</li>
                    </ol>
                </li>
                <li>
                     <ol>
                         <li>商务合作</li>
                         <li>沙龙/活动</li>
                         <li>体 验 馆</li>
                         <li>               会 展</li>
                     </ol>
                </li>
                <li>
                    <ol>
                        <li class="w">账户与安全</li>
                        <li>实名认证</li>
                        <li>密码管理</li>
                        <li>资金安全</li>
                        <li>平台保证</li>
                    </ol>
                </li>
            </ul>
        </div>
        <!-- 占位符                                                  横线           -->
        <div class="main_zhanwei banx"></div>

        <div class="main_weibuguanGg banx">
            <ul>
                <li><a href="https://www.aliyun.com/"><img src="img/guangGaotu/beG.png" alt=""/></a></li>
                <li><a href="http://www.donghao.cc"><img src="img/guangGaotu/dongH.png" alt=""/></a></li>
                <li><a href="http://yantai.liebiao.com/zhuangxiu/323475925.html"><img src="img/guangGaotu/changW.png" alt=""/></a></li>
                <li><a href="http://www.honggao.com.cn/"><img src="img/guangGaotu/changM.png" alt=""/></a></li>
                <li><a href="http://c.eqxiu.com/s/V9CaNrUU"><img src="img/guangGaotu/fanH.png" alt=""/></a></li>
                <li><a href="http://www.huadu2003.com/"><img src="img/guangGaotu/jianG.png" alt=""/></a></li>
                <li><a href="http://www.tctd.com.cn/"><img src="img/guangGaotu/tongC.png" alt=""/></a></li>
                <li><a href="http://www.bjzjht.com/"><img src="img/guangGaotu/zhongT.png" alt=""/></a></li>
            </ul>
        </div>
        <!-- 占位符                                                           横线-->
        <div class="main_zhanwei banx"></div>

        <!--友情链接                                                       -->
        <div class="main_youqing banx">
            <div>
                <h3>友情链接</h3>
                <p><a href="http://www.donghao.cc/">北京东豪建设集团有限公司</a></p>
                <p><a href="http://www.huadu2003.com/">华都国际建设集团有限公司</a></p>
                <p><a href="http://www.bjzjht.com/">北京中建华腾装饰工程有限公司</a></p>
                <p><a href="http://www.tctd.com.cn/">北京同创同德建筑装饰工程有限责任公司</a></p>
                <p><a href="http://c.eqxiu.com/s/V9CaNrUU">北京众望共创科技中心</a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
                <p><a href="#"></a></p>
            </div>
        </div>
        <!--尾部                                             尾部-->
        <div class="main_wenbu banx">
 	    <p><a href="Tail%20link/About%20us.html">关于我们</a></p>
            <p><a href="Tail%20link/Enterprise%20service.html">企业服务</a></p>
            <p><a href="Tail%20link/Contact%20us.html">联系我们</a></p>
            <p><a href="Tail%20link/Help%20center.html">帮助中心</a></p>
	    <p><a href="">网站导航</a></p>	
            <p>Copyright2016 北京梧桐时代科技有限责任公司 . <a href="http://www.miitbeian.gov.cn/publish/query/indexFirst.action">京ICP备17016004号-1</a></p>
            <p>通讯地址：北京市大兴区亦庄镇小羊坊康碱路 6 号</p>
        </div>
       <!-- <a href="javascript:scroll(0,0)">返回顶部</a>-->
    </div>
   </div>
</div>

</body>
<script src="JS/jquery-1.11.3.js"></script>
<script src="JS/utils.js" type="text/javascript" rel="stylesheet"></script>
<script src="JS/move.js"></script>
<script src="JS/AutoBanner.js"></script>
<script>var oTab=new AutoBanner('box','json/data.txt',6000);</script>
<script>
	$("#btn110").click(function(){
		$.ajax({
			type:"get",
			url:"http://192.168.3.124:8082/expertsJump.do",
			async:true,
			success:function(data){
				console.log(data)
				location.href = "http://192.168.3.124:8082/"+data.redirects
			}
		});
	})
/*       获取滚动文字数据     并且绑定         */
    $.ajax({
        type: 'get',
        dataType: 'json',
        /*    url: "json/json2.txt",*/
        url: "json/data2.txt",

        success: function (data) {

            console.log(data);
            var htmlStr = '';
            /*  for (var i = 0; i < data.length; i++) {*/
            var len = data.length;

            for (var i=0;i<data.length;i++) {
                var curData = data[i];
                htmlStr += '<li>'
                        + '<a href="#">'+'<em>'+'</em>'+curData["weiZ"]+'</a>'
                        +'<i>'+curData["dete"]+'</i>'
                        + '</li>';
            }
            $('.wenZ').append(htmlStr);
        }
    });



/*                 滚动方法                 */

    (function($){
        $.fn.myScroll = function(options){

            var defaults = {
                speed:40,
                rowHeight:24
            };

            var opts = $.extend({}, defaults, options),intId = [];

            function marquee(obj, step){

                obj.find("ul").animate({
                    marginTop: '-=1'
                },0,function(){
                    var s = Math.abs(parseInt($(this).css("margin-top")));
                    if(s >= step){
                        $(this).find("li").slice(0, 1).appendTo($(this));
                        $(this).css("margin-top", 0);
                    }
                });
            }

            this.each(function(i){
                var sh = opts["rowHeight"],speed = opts["speed"],_this = $(this);
                intId[i] = setInterval(function(){
                    if(_this.find("ul").height()<=_this.height()){
                        clearInterval(intId[i]);
                    }else{
                        marquee(_this, sh);
                    }
                }, speed);

                _this.hover(function(){
                    clearInterval(intId[i]);
                },function(){
                    intId[i] = setInterval(function(){
                        if(_this.find("ul").height()<=_this.height()){
                            clearInterval(intId[i]);
                        }else{
                            marquee(_this, sh);
                        }
                    }, speed);
                });

            });

        }

    })(jQuery);

    /*                             文字滚动                      */

    $(document).ready(function(){
        $('.list_lh li:even').addClass('lieven');
    });
    $(function(){
        $("div.list_lh").myScroll({
            speed:40, 
            rowHeight:450,
        });
    });











    /*                     分两次获取 分别的 数据     滚动图片                 */
    $.ajax({
    type: 'get',
    dataType: 'json',
    /*    url: "json/json2.txt",*/
    url: "json/data66.txt",

    success: function (data) {

    console.log(data);
    var htmlStr = '';
    /*  for (var i = 0; i < data.length; i++) {*/
    var len = data.length;

    for (var i=0;i<data.length;i++) {
    var curData = data[i];
    htmlStr += '<li>'
    + '<a href="#">'
    + '<img src="' + curData["imgSrc"] + '" alt=""/>'
    + ' </a>'
    + '</li>';
    }
    $('#ul1').append(htmlStr);
		fangfa()
    }
    });


    /*                获取桂东图片 2                 */
    $.ajax({
    type: 'get',
    dataType: 'json',
    /*    url: "json/json2.txt",*/
    url: "json/data66.txt",

    success: function (data) {

    console.log(data);
    var htmlStr = '';
    /*  for (var i = 0; i < data.length; i++) {*/
    var len = data.length;

    for (var i=0;i<data.length;i++) {
    var curData = data[i];
    htmlStr += '<li>'
    + '<a href="#">'
    + '<img src="' + curData["imgSrc"] + '" alt=""/>'
    + ' </a>'
    + '</li>';
    }
    $('#ul2').append(htmlStr);
	fangfa2()
    }
    });




    /*

    /!*         滚动              *!/




    window.onload = function() {

    var oUl = document.getElementById('ul1');
    var oLi = oUl.getElementsByTagName('li');

    /!*    var AA=oLi.getElementsByName('a');*!/


    var timer = null;
    var iSpeed = -1;  // 步距  正数是向右  负数是向左  数字来调快慢
    oUl.innerHTML+=oUl.innerHTML;
    oUl.style.width = oLi.length*oLi[0].offsetWidth+'px'; /!*   正常写法 但是有点兼容问题 我就写成下面的固定值了   *!/

    /!*  oUl.style.width = oLi.length*179+'px'; // oLi[0].offsetWidth+'px'会有一点兼容问题 我就写成固定值了*!/

    timer = setInterval(startOut,30);
    function startOut(){

    if (oUl.offsetLeft<-oUl.offsetWidth/2) {
    oUl.style.left = 0;
    }
    else if (oUl.offsetLeft>0) {
    oUl.style.left = -oUl.offsetWidth/2 + 'px';
    }
    oUl.style.left = oUl.offsetLeft + iSpeed + 'px';
    }

    //移入暂停，移除开始
    oUl.onmouseover = function(){
    clearInterval(timer);

    }
    oUl.onmouseout = function(){
    timer = setInterval(startOut,30);
    }
    }

    */


    /*      广告    滚动     2         */


    function fangfa() {

    var oUl = document.getElementById('ul1');
    var oLi = oUl.getElementsByTagName('li');

    /*    var AA=oLi.getElementsByName('a');*/

    var timer = null;
    var iSpeed = -1;  // 步距  正数是向右  负数是向左  数字来调快慢
    oUl.innerHTML+=oUl.innerHTML;

    /*
    console.log(oLi[0]);
    console.log(oUl);
    */
    /*   var liW=$('#ul1 li').innerWidth();

    console.log(liW);//179 能获取到但是没有单位

    oUl.style.width = oLi.length*liW+'px';*/

    oUl.style.width = oLi.length*oLi[0].offsetWidth+'px'; /*   正常写法 但是有点兼容问题 我就写成下面的固定值了    */


    /*    oUl.style.width = oLi.length*179+'px'; // oLi[0].offsetWidth+'px'会有一点兼容问题 我就写成固定值了*/


    timer = setInterval(startOut,30);

    function startOut(){

    if (oUl.offsetLeft<-oUl.offsetWidth/2) {
    oUl.style.left = 0;
    }
    else if (oUl.offsetLeft>0) {
    oUl.style.left = -oUl.offsetWidth/2 + 'px';
    }
    oUl.style.left = oUl.offsetLeft + iSpeed + 'px';
    }

    //移入暂停，移除开始
    oUl.onmouseover = function(){
    clearInterval(timer);
    }
    oUl.onmouseout = function(){
    timer = setInterval(startOut,30);
    }
    }

    function fangfa2() {

    var oUl = document.getElementById('ul2');
    var oLi = oUl.getElementsByTagName('li');

    /*    var AA=oLi.getElementsByName('a');*/

    var timer = null;
    var iSpeed = -1;  // 步距  正数是向右  负数是向左  数字来调快慢
    oUl.innerHTML+=oUl.innerHTML;

    /*
    console.log(oLi[0]);
    console.log(oUl);
    */
    /*   var liW=$('#ul1 li').innerWidth();

    console.log(liW);//179 能获取到但是没有单位

    oUl.style.width = oLi.length*liW+'px';*/

    oUl.style.width = oLi.length*oLi[0].offsetWidth+'px'; /*   正常写法 但是有点兼容问题 我就写成下面的固定值了    */


    /*    oUl.style.width = oLi.length*179+'px'; // oLi[0].offsetWidth+'px'会有一点兼容问题 我就写成固定值了*/


    timer = setInterval(startOut,30);

    function startOut(){

    if (oUl.offsetLeft<-oUl.offsetWidth/2) {
    oUl.style.left = 0;
    }
    else if (oUl.offsetLeft>0) {
    oUl.style.left = -oUl.offsetWidth/2 + 'px';
    }
    oUl.style.left = oUl.offsetLeft + iSpeed + 'px';
    }

    //移入暂停，移除开始
    oUl.onmouseover = function(){
    clearInterval(timer);
    }
    oUl.onmouseout = function(){
    timer = setInterval(startOut,30);
    }
    }


    //onload事件侦听函数
    function addLoadEvent(func){
    var oldonload=window.onload;
    if(typeof window.onload!="function"){window.onload=func;}else{window.onload=function(){oldonload();func();}};
    }
    //调用方式
//  addLoadEvent(fangfa);
//  addLoadEvent(fangfa2);



































    /*            返回首页       */
    var oBtn=document.getElementById('btn');
    window.onscroll=computedDisplay;
    function computedDisplay(){
        if(utils.win('scrollTop')>=utils.win('clientHeight')){
            oBtn.style.display='block';
        }else{
            oBtn.style.display='none';
        }
    }
    oBtn.onclick=function(){
        this.style.display='none';
        window.onscroll=null;
        var duration=500;
        var interval=10;
        var target=utils.win('scrollTop');
        var step=(target/duration)*interval;
        var timer=setInterval(function(){
            var curT=utils.win('scrollTop');
            if(curT<=0){
                clearInterval(timer);
                window.onscroll=computedDisplay;
                return;
            }
            curT-=step;
            utils.win('scrollTop',curT);
        },interval)
    }
    
      function display(id){  
    	        var traget=document.getElementById(id);  
    	        if(traget.style.display=="none"){  
    	            traget.style.display="";  
    	        }else{  
    	            traget.style.display="none";  
    	      }  
    	   }  
</script>

</html>















































































