<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>造价咨询类招标详情</title>

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/xuqiudating-xiangqing.css" rel="stylesheet"  type="text/css"/>

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
                    <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" ><img src="img/souuso.png" ></button>
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
               		<li><a href="/xuqiudating.do">招标大厅</a></li>
                	<li><img src="img/hr.png" alt=""/><a href="caiLiao.html">材料</a></li>
                	<li>专业分包</li>
                	<li>劳务分包</li>
                	<li><a href="/cgal.do">设计</a></li>
                	<li><a href="#">专家库</a></li>
                	<li>设备租赁</li>
                	<li><a href="/cgal.do">成功案例</a></li>
                </ul>
            </div>

<!--       主体  部分  主题  内容                    -->
            <div class="content-1">
                <div class="left tab_menu">
                    <span class="qq">
                         <i></i>全部分类
                    </span>
                    <ul>
                        <li class="gongcheng"><a href="/tenderProgramme.do"><i class="sb"></i> 工程类</a></li>
                        <li class="caigou"><a href="/tenderPurchase.do"><i class="sb"></i> 采购类</a></li>
                        <li class="sheji"><a href="/tenderDesign.do"><i class="sb"></i> 设计类</a></li>
                        <li class="wuye"><a href="/tenderProperty.do"><i class="sb"></i> 物业类</a></li>
                        <li class="zaojia backblue"><a href="/tenderCost.do"><i class="bs"></i> 造价咨询类</a></li>
                    </ul>
                    <span class="boo">
                          <i></i>
                    </span>
                </div>
                <div class="tab_box">
                    <div class="right cc">
                        <div id="bvb">
                            <ul>
                            <c:forEach items="${pagination.list }" var="tender" >        
                          	  <li><a href="/choiceDemand.do?projectName=${tender.projectName }"><p>${tender.projectName }</p><i><fmt:formatDate pattern="yyyy-MM-dd" value="${tender.startTime }" type="both"/></i></a></li>
                            </c:forEach>
                                
<!--                                 <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标D效果图标题标题标题标题标题标题标D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li>
                                <li><a href="#"><p>别野3D效果图标题标题标题标题标题标题标题标题标题标题</p><i>2017-02-16</i></a></li> -->
                            </ul>
                        </div>
     						 <div class="allpage" style="margin-top: 10px">
           						 <span class="number">
           								 <c:forEach items="${pagination.pageView }" var="page" >${page } </c:forEach>
            					 </span>
           					 </div>
                        <div class=""> </div>
                    </div>
                </div>
            </div>
          
            <!--   梧桐网                                                 -->
            <div class="main_wutong banx">
                <p>梧桐时代</p>
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
                            <li> 展  会</li>
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

            <!--尾部                                             尾部-->
            <div class="main_wenbu banx">
                <p><a href="#">关于我们</a></p>
                <p><a href="#">企业服务</a></p>
                <p><a href="#">联系我们</a></p>
                <p><a href="#">帮助中心</a></p>
                <p><a href="#">网站导航</a></p>
            	<p>Copyright2016 北京梧桐时代科技有限责任公司 . <a href="http://www.miitbeian.gov.cn/publish/query/indexFirst.action">京ICP备17016004号-1</a></p>
                <p>通讯地址：北京市大兴区亦庄县小羊坊康碱路 6 号</p>
            </div>
            <!-- <a href="javascript:scroll(0,0)">返回顶部</a>-->
        </div>
    </div>
</div>
</body>
<script src="JS/jquery-1.11.3.js" type="application/javascript"></script>
<script type="text/javascript">

    /*      选项卡     */
/*     $(function(){
        $(".tab_menu ul li").click(function(){

            $(".tab_menu ul li").find("i").removeClass("bs");

            $(".tab_menu ul li").find("a").removeClass("aaa");

            $(this).find("i").addClass("bs");

            $(this).find("a").addClass("aaa");

             $(this).addClass("dd").siblings().removeClass("dd"); //切换选中的按钮高亮状态

            var index=$(this).index(); //获取被按下按钮的索引值，需要注意index是从0开始的

            $(".tab_box>div").eq(index).show().siblings().hide(); //在按钮选中时在下面显示相应的内容，同时隐藏不需要的框架内容
        });

    });
 
     */
  /*   function(){
    	    var ${tender.startTime } = new Date();
    	    document.write(${tender.startTime }.toString());
    } */
</script>
</html>