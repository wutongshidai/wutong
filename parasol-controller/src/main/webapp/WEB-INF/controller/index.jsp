<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>梧桐网</title>
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=8">

    <meta http-equiv=Content-Type content="text/html;charset=utf-8">

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/index.css" rel="stylesheet"  type="text/css"/>



</head>
<body>
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
                <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" ><img src="img/dongh_newbbs_ssfdj.png" ></button>
                <a href="#" class="re">热门搜索</a>
                <a href="#">设计</a>
                <a href="#">设计</a>
                <a href="#">设计</a>
                <a href="#">设计</a>
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
                <li>设计</li>
                <li><a href="zjLb.html">专家库</a></li>
                <li>设备租赁</li>
                <li>成功案例</li>
            
             
            </ul>
    
        </div>
        <!--                                                 主体内容                                          -->
        <div class="main banx">
            <div class="main_leftsidebar">
                <div>
                    <span><img src="img/首页修改图片/图.png" alt=""/></span>
                    <p>网站正试运营 更多好礼等您拿!</p>
                </div>
                <ul>
                    <li><i></i>工程造价咨询</li>
                    <li><i></i>工程管理</li>
                    <li><i></i>BIM</li>
                    <li><i></i>VR体验馆</li>
                    <li><i></i>帮助</li>
                </ul>
                <div class="button"><a href="/liumu.do">发布您的需求 > </a></div>
                <span></span>
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
             							<div class="" <c:if test="${not empty user.userName}"> style="display: block" </c:if><c:if test="${empty user.userName}">style="display: none" </c:if>><a href="/dengL.do" >${user.userName }</a></div></span>
                        <span class="zhu"><div class="" <c:if test="${empty user.userName}"> style="display: block" </c:if><c:if test="${not empty user.userName}">style="display: none" </c:if>><a href="/login.do" >注册</a></div>
             							<div class="" <c:if test="${not empty user.userName}"> style="display: block" </c:if><c:if test="${empty user.userName}">style="display: none" </c:if>><a href="/loginOut.do" >退出</a></div>
                        </span>
                        <ul>
                            <li class="xin"><a href="#">新人福利</a></li>
                            <li class="hui"><a href="#">会员注册</a></li>
                        </ul>
                    </div>
                    <div class="fo">
                        <ul>
                            <li><a href="#"></a>最新发布<i></i></li>
                            <li><a href="#"></a>公告<i></i></li>
                            <li><a href="#"></a>更多<i></i></li>
                        </ul>
                      <!--   <p class="fo-s">需求发布</p> -->
                        <c:forEach items="${tenders}" var="tender" >
                        	<p><a href="/selectByPrimaryNamel.do?projectName=${tender.projectName }" stye="margin-left: 6px;">${tender.projectName }</a></p>
                        </c:forEach>
                    </div>
                </div>
            </div>

        </div>
        <!--广告                                                -->
        <div class="banner banx">
           <!--  <span><img src="img/yizhanshifuwu/11.png"alt=""/></span> -->
            <span><img src="img/yizhanshifuwu/1(1).png"alt=""/></span>
         <!--    <span><img src="img/yizhanshifuwu/3.png"alt=""/></span>
            <span><img src="img/yizhanshifuwu/2.png"alt=""/></span>
            <span><img src="img/yizhanshifuwu/4.png"alt=""/></span> -->
             <span><img src="img/yizhanshifuwu/1(1).png"alt=""/></span>
            <span><img src="img/yizhanshifuwu/1(1).png"alt=""/></span>
            <span><img src="img/yizhanshifuwu/1(1).png"alt=""/></span>
        </div>
        <div class="clear"></div>

        <!-- 主体 材料                                        -->

        <div class="main_cail banx">

            <h2>材料<i></i><p>更多<span></span></p></h2>

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
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>江苏帝一集团有限公司</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>

                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!--专业分包                                          -->

        <div class="main_fenb banx">

            <h2>专业分包<i></i><p>更多<span></span></p></h2>

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
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京京东安装饰</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                    <div>
                        <ul>
                            <li><b></b>北京</li>
                            <li>石料商家</li>
                            <li><img src="img/z-1.png" alt=""/></li>
                            <li>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                                <i><img src="img/z-x.png" alt=""/></i>
                            </li>
                            <li>成交量：1000+</li>
                            <li>好评率：100%</li>
                            <li>北京裕隆东升石材</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- 设计                                                        -->
        <div class="main_she banx">
            <h2>设计<i></i><p >更多<span></span></p></h2>
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
                        <span><img src="img/zhuanjianku/111.png" alt=""/></span>
                        <p>天建设计院</p>
                        <p>好评率：100%</p>
                    </div>
                    <div>
                        <span><img src="img/zhuanjianku/1-1.png" alt=""/></span>
                        <p>天建设计院</p>
                        <p>好评率：100%</p>
                    </div>
                    <div>
                        <span><img src="img/zhuanjianku/1-1.png" alt=""/></span>
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
            <h2>专家库<i></i> <p>更多<span></span></p></h2>
            <ul>
                <li>
                    <span><img src="img/zhuanjianku/syzj-01.png" alt=""/></span>
                    <p class="zi">王长军</p>
                    <p>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：工民建专业</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="#">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-02.png" alt=""/></span>
                    <p class="zi">齐宝廷</p>
                    <p>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：机电及智能化</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="#">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-03.png" alt=""/></span>
                    <p class="zi">邢燕丽</p>
                    <p>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：信息与信息管理</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="#">查看详情</a></p>
                </li>
                <li>
                    <span><img src="img/zhuanjianku/syzj-04.png" alt=""/></span>
                    <p class="zi">郭朝峰</p>
                    <p>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;历：大学本科</p>
                    <p>专业领域：房建</p>
                    <p>所在城市：北京</p>
                    <p class="guan"><a href="#">查看详情</a></p>
                </li>
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
                <p><a href="#">立即入驻</a></p>
            </div>
        </div>
        <!--  成功案例                                        成功案例-->
        <div class="main_anli banx">
            <h2>成功案例<i></i><p>更多<span></span></p></h2>
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
                <li><img src="img/guangGaotu/beG.png" alt=""/></li>
                <li><img src="img/guangGaotu/changM.png" alt=""/></li>
                <li><img src="img/guangGaotu/changW.png" alt=""/></li>
                <li><img src="img/guangGaotu/dongH.png" alt=""/></li>
                <li><img src="img/guangGaotu/fanH.png" alt=""/></li>
                <li><img src="img/guangGaotu/jianG.png" alt=""/></li>
                <li><img src="img/guangGaotu/tongC.png" alt=""/></li>
                <li><img src="img/guangGaotu/zhongT.png" alt=""/></li>
            </ul>
        </div>
        <!-- 占位符                                                           横线-->
        <div class="main_zhanwei banx"></div>

        <!--友情链接                                                       -->
        <div class="main_youqing banx">
            <div>
                <h3>友情链接</h3>
                <p><a href="http://www.donghao.cc/">北京东豪建设有限公司</a></p>
                <p><a href="#">北方工业集团</a></p>
                <p><a href="#">北京中铁建设工程</a></p>
                <p><a href="#">北京维创物业管理有限公司</a></p>
                <p><a href="#">北京东豪建设有限公司</a></p>
                <p><a href="#">北方工业集团</a></p>
                <p><a href="#">北京中铁建设工程</a></p>
                <p><a href="#">北京维创物业管理有限公司</a></p>
                <p><a href="#">北京东豪建设有限公司</a></p>
                <p><a href="#">北方工业集团</a></p>
                <p><a href="#">北京中铁建设工程</a></p>
                <p><a href="#">北京维创物业管理有限公司</a></p>
                <p><a href="#">北京东豪建设有限公司</a></p>
                <p><a href="#">北方工业集团</a></p>
                <p><a href="#">北京中铁建设工程</a></p>
                <p><a href="#">北京维创物业管理有限公司</a></p>
            </div>
        </div>
        <!--尾部                                             尾部-->
        <div class="main_wenbu banx">
            <p><a href="#">关于我们</a></p>
            <p><a href="#">企业服务</a></p>
            <p><a href="#">联系我们</a></p>
            <p><a href="#">帮助中心</a></p>
            <p><a href="#">网站导航</a></p>
            <p>Copyright2016 梧桐时代科技有限责任公司 . 京ICP 证 000000 号 京公网安备  1100000000000 号</p>
            <p>通讯地址：北京市大兴区亦庄县小羊坊康碱路 6 号</p>
        </div>
       <!-- <a href="javascript:scroll(0,0)">返回顶部</a>-->
    </div>
   </div>
</div>

</body>
<script src="JS/utils.js" type="text/javascript" rel="stylesheet"></script>
<script src="JS/move.js"></script>
<script src="JS/AutoBanner.js"></script>
<script>var oTab=new AutoBanner('box','json/data.txt',6000);</script>
<script>
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















































































