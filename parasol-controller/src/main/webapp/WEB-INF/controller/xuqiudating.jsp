<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head lang="en">
    <meta charset="UTF-8">
    <title>需求大厅</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=9">

    <link rel="stylesheet" href="css/reset.min.css" type="text/css"/>
    <link href="css/xuqiudating.css" rel="stylesheet"  type="text/css"/>



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
        <div class="search" >
            <span class="logo"></span>
            <p></p>
            <div class="search_f">
                <form method="GET"   target="_blank" onsubmit="return formsub()">
                    <input  id="kuang" type="text" name="q" value="搜全网" onfocus="javascript:this.value=''" ><button type="button"   name="topic" style="color: #0000cc" onclick="display_alert()" style="cursor:pointer" ><img src="img/dongh_newbbs_ssfdj1.png" ></button>
                    <a href="#" class="re">热门搜索</a>
                    <a href="#">设计</a>
                    <a href="#">专家库</a>
                    <a href="#">材料</a>
                    <a href="#">需求</a>
                </form>
            </div>
        </div>
        <!--                     需求  首部           -->
        <div class="xuqiuT">
            <ul>
                <li><a href="/index.do">首页</a></li>
                <li class="mr"><a href="/xuqiudating.do">招标大厅</a></li>
                <li><img src="img/hr.png" alt=""/><a href="caiLiao.html">材料</a></li> 
                <li>专业分包</li>
                <li>劳务分包</li>            
                <li><a href="/cgal.html">设计</a></li>
                <li>专家库</li>
                <li>设备租赁</li>             
                <li><a href="/cgal.html">成功案例</a></li>
            </ul>
            <div class="bannerTu">
                <a href="/liumu.do"></a>
                <div class="fa">
                    <a></a>
                    <a></a>
                    <a></a>
                    <a></a>
                    <a></a>
                </div>
            </div>
        </div>
        <div class="content">
            <div class="gongC">
                <div class="leM"></div>
                <div class="can">
                    <div class="tab_menu">
                        <ul>
                            <li class="on r">全部</li>
                            <li>勘察</li>
                            <li>施工</li>
                            <li>专业</li>
                            <li>审计</li>
                            <li>监理</li>
                            <li>其他</li>
                        </ul>
                    </div>
                    <div class="tab_box">
                        <div class="non">
                            <div class="ll">
                           		<c:forEach items="${project}" var="project" begin="0" end="15" step="2">
									<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
                       		    </c:forEach>
                            </div>
                            <div class="rr">
								<c:forEach items="${project}" var="project" begin="1" end="15" step="2">
									<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
                       		    </c:forEach>
                            </div>
                        </div>
                        <div>
                        <div class="ll">
          						<c:forEach items="${list0}" var="list0" begin="0" end="15" step="2">
                                	<c:if test="${list0.tender.classification == 0 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${list0.tender.projectName }"> <em>【${list0.genres }】</em>${list0.tender.projectName }</a><i>${list0.time }</i></p>
									</c:if>
                       			</c:forEach>
                        </div>
                            <div class="rr">
                               <c:forEach items="${list0}" var="list0" begin="1" end="15" step="2">
                                	<c:if test="${list0.tender.classification == 0 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${list0.tender.projectName }"> <em>【${list0.genres }】</em>${list0.tender.projectName }</a><i>${list0.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list1}" var="project" begin="0" end="15" step="2">
                                	<c:if test="${project.tender.classification == 1 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list1}" var="project" begin="1" end="15" step="2">
                                	<c:if test="${project.tender.classification == 1 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list2}" var="project" begin="0" end="15" step="2">
                                	<c:if test="${project.tender.classification == 2 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list2}" var="project" begin="1" end="15" step="2">
                                	<c:if test="${project.tender.classification == 2 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list3}" var="project" begin="0" end="15" step="2">
                                	<c:if test="${project.tender.classification == 3 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list3}" var="project" begin="1" end="15" step="2">
                                	<c:if test="${project.tender.classification == 3 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list4}" var="project" begin="0" step="15"  varStatus="status">
									<c:if test="${status.index < 5 && project.tender.classification == 4 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if> 
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list4}" var="project" begin="1" step="15">
                                	<c:if test="${project.tender.classification == 4 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list5}" var="project" begin="0" end="15" step="2">
                                	<c:if test="${project.tender.classification == 5 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list5}" var="project" begin="1" end="15" step="2">
                                	<c:if test="${project.tender.classification == 5 }">
										<p><a href="/selectByPrimaryNamel.do?projectName=${project.tender.projectName }"> <em>【${project.genres }】</em>${project.tender.projectName }</a><i>${project.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
                <a href="/tenderProgramme.do"> >> 查看所有需求</a>
            </div>
         <div class="guangG"><img src="img/xuqiudating/dtgg01.png"  alt=""/></div>
            <div class="caiG">
                <div class="can">
                    <div class="caiGou">
                        <ul>
                            <li class="on r">全部</li>
                            <li>机械设备</li>
                            <li>原材料</li>
                            <li>零部件</li>
                            <li>技术</li>
                            <li>服务</li>
                            <li>MRO</li>
                            <li>其他</li>
                        </ul>
                    </div>
                    <div class="cGou">
                        <div class="non">
                            <div class="ll">
                           		<c:forEach items="${purchase}" var="purchase" begin="0" end="15" step="2">
									<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
                       		    </c:forEach>
                            </div>
                            <div class="rr">
								<c:forEach items="${purchase}" var="purchase" begin="1" end="15" step="2">
									<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
                       		    </c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list6}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 6 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list6}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 6 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list7}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 7 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list7}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 7 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list8}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 8 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list8}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 8 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list9}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 9 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list9}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 9 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list10}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 10 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list10}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 10 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list11}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 11 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list11}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 11 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <div>
                            <div class="ll">
                                <c:forEach items="${list12}" var="purchase" begin="0" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 12 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div class="rr">
                               <c:forEach items="${list12}" var="purchase" begin="1" end="15" step="2">
                                	<c:if test="${purchase.tender.classification == 12 }">
										<p><a href="/tyxq.do?projectName=${purchase.tender.projectName }"> <em>【${purchase.genres }】</em>${purchase.tender.projectName }</a><i>${purchase.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="cai"></div>
                <a href="/tenderPurchase.do"> >> 查看所有需求</a>
            </div>
            <div class="guangG-2"><img src="img/xuqiudating/dtgg02.png"   alt=""/></div>
            <div class="shij-wuye">
                <div class="shij">
                    <span></span>
                    <div class="shij-1">
                        <div class="shij-2">
                            <ul>
                                <li class="on r">全部</li>
                                <li>工业</li>
                                <li>建筑</li>
                                <li>室内</li>
                                <li>景观</li>
                                <li>其他</li>
                            </ul>
                        </div>
                        <div class="shij-3">
                            <div class="non">
  								<c:forEach items="${design}" var="design" begin="0" end="7" step="1">
									<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
                       		    </c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list13}" var="design" begin="0" end="7" step="1">
                                	<c:if test="${design.tender.classification == 13 }">
										<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list14}" var="design" begin="0" end="7" step="1">
                                	<c:if test="${design.tender.classification == 14 }">
										<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list15}" var="design" begin="0" end="7" step="1">
                                	<c:if test="${design.tender.classification == 15 }">
										<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list16}" var="design" begin="0" end="7" step="1">
                                	<c:if test="${design.tender.classification == 16 }">
										<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list17}" var="design" begin="0" end="7" step="1">
                                	<c:if test="${design.tender.classification == 17 }">
										<p><a href="/tyxq.do?projectName=${design.tender.projectName }"> <em>【${design.genres }】</em>${design.tender.projectName }</a><i>${design.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <a href="/tenderDesign.do"> >>  查看所有需求</a>
                    </div>
                </div>
                <div class="wuye">
                    <span></span>
                    <div class="wuye-1">
                        <div class="wuye-2">
                            <ul>
                                <li class="on r">全部</li>
                                <li>物业管理</li>
                                <li><a href="javascript:void(0)" my_url="/classification.do?classification=18">物业服务</a></li>
                                
                                <li>其他</li>
                            </ul>
                        </div>
                        <div class="wuye-3">
                            <div class="non">
  								<c:forEach items="${manage}" var="manage" begin="0" end="7" step="1">
									<p><a href="/tyxq.do?projectName=${manage.tender.projectName }"> <em>【${manage.genres }】</em>${manage.tender.projectName }</a><i>${manage.time }</i></p>
                       		    </c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list18}" var="manage" begin="0" end="7" step="1">
                                	<c:if test="${manage.tender.classification == 18 }">
										<p><a href="/tyxq.do?projectName=${manage.tender.projectName }"> <em>【${manage.genres }】</em>${manage.tender.projectName }</a><i>${manage.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                            <div >
     						    <c:forEach items="${list19}" var="manage" begin="0" end="7" step="1">
                                		<c:if test="${demandHalls.tender.classification == 19 }"> </c:if> 
										<p><a href="/tyxq.do?projectName=${manage.tender.projectName }"> <em>【${manage.genres }】</em>${manage.tender.projectName }</a><i>${manage.time }</i></p>
									
                       			</c:forEach>
                            </div>
                            <div>
     						    <c:forEach items="${list20}" var="manage" begin="0" end="7" step="1">
                                	<c:if test="${manage.tender.classification == 20 }">
										<p><a href="/tyxq.do?projectName=${manage.tender.projectName }"> <em>【${manage.genres }】</em>${manage.tender.projectName }</a><i>${manage.time }</i></p>
									</c:if>
                       			</c:forEach>
                            </div>
                        </div>
                        <a href="/tenderProperty.do"> >>  查看所有需求</a>
                    </div>
                </div>
            </div>
            <div class="guangG-3"><img src="img/xuqiudating/dtgg03.png"  alt=""/></div>
            <div class="zaoJia">
                <div class="zaoJia-1">
                    <div class="zajialog"></div>
                    <div class="zaoJia-2">
                        <div class="zaoJia-3">
                            <ul>
                                <li class="r on">全部</li>
                            </ul>
                        </div>
                        <div class="zaoJia-4">
                            <div class="non">
  								<c:forEach items="${consultation}" var="consultation" begin="0" end="7" step="1">
									<p><a href="/tyxq.do?projectName=${consultation.tender.projectName }"> <em>【${consultation.genres }】</em>${consultation.tender.projectName }</a><i>${consultation.time }</i></p>
                       		    </c:forEach>
                            </div>
                        </div>
                    </div>
                    <a href="/tenderCost.do"> >>  查看所有需求</a>
                </div>
                <div class="guangG-4"><img src="img/xuqiudating/dtgg04.png"  alt=""/></div>
            </div>
            <!--                       时代            广告                          -->

            <div class="wenbuyingyong">
                 <span>梧桐时代</span>
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
                            <li> 会 展</li>
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

            <!--                  尾部                                             尾部                       -->
            <div class="main_wenbu">
                <p><a href="#">关于我们</a></p>
                <p><a href="#">企业服务</a></p>
                <p><a href="#">联系我们</a></p>
                <p><a href="#">帮助中心</a></p>
                <p><a href="#">网站导航</a></p>
                <p>Copyright2017 北京梧桐时代科技有限责任公司 . <a href="http://www.miitbeian.gov.cn/publish/query/indexFirst.action">京ICP备17016004号</a></p>
                <p>通讯地址：北京市大兴区亦庄县小羊坊康碱路 6 号</p>
            </div>
        </div>
    </div>
</div>
</body>
<script type="application/javascript" src="JS/jquery-1.11.3.js"></script>
<script type="application/javascript">
    $(function(){
        $(".tab_menu ul li").click(function(){
            $(this).addClass("on").siblings().removeClass("on"); //切换选中的按钮高亮状态
            var index=$(this).index(); //获取被按下按钮的索引值，需要注意index是从0开始的
            $(".tab_box > div").eq(index).show().siblings().hide(); //在按钮选中时在下面显示相应的内容，同时隐藏不需要的框架内容
        });
    });

    $(function(){
        $(".caiGou ul li").click(function(){
            $(this).addClass("on").siblings().removeClass("on"); //切换选中的按钮高亮状态
            var index=$(this).index(); //获取被按下按钮的索引值，需要注意index是从0开始的
            $(".cGou > div").eq(index).show().siblings().hide(); //在按钮选中时在下面显示相应的内容，同时隐藏不需要的框架内容
        });
    });


    $(function(){
        $(".shij-2 ul li").click(function(){
            $(this).addClass("on").siblings().removeClass("on"); //切换选中的按钮高亮状态
            var index=$(this).index(); //获取被按下按钮的索引值，需要注意index是从0开始的
            $(".shij-3 > div").eq(index).show().siblings().hide(); //在按钮选中时在下面显示相应的内容，同时隐藏不需要的框架内容
        });
    });

    $(function(){
        $(".wuye-2 ul li").click(function(){
            $(this).addClass("on").siblings().removeClass("on"); //切换选中的按钮高亮状态
            var index=$(this).index(); //获取被按下按钮的索引值，需要注意index是从0开始的
            $(".wuye-3 > div").eq(index).show().siblings().hide(); //在按钮选中时在下面显示相应的内容，同时隐藏不需要的框架内容
        });
    });

/*     $(function(){
        $("[my_url]").click(function(){
            alert($(this).attr("my_url"));//显示当前点击元素自定义属性my_url的值
            var _url = $(this).attr("my_url");
            $.ajax(function(){
                type: "POST",
                url: _url,
                success: function(msg){
                    alert( "..." );
                }
            });
        });
    });
 */

/*  $(function(){
	 $("[my_url]").click(function(){
		 var _url = $(this).attr("my_url");
		 $.ajax({
			 type:"POST",
			 url: "/classification.do?classification=19",
			 success: function(data){
				 if(data.admin=="1"){
					 alert("dadadf");
				 }
			 }
		 });
	 });
 });  */

</script>
</html>

























































































