<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>车辆搜索结果</title>
    <!--[if lt IE 9]>
    <script src="//cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="//cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <script src="//cdn.staticfile.org/es5-shim/4.5.9/es5-shim.min.js"></script>
    <script src="//cdn.staticfile.org/es5-shim/4.5.9/es5-sham.min.js"></script>
    <![endif]-->
        
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/sy.css">
</head>
<body>
<!-- 外层 -->
<div id="warp">
    <!-- 头部 -->
    <div id="header">
        <div class="header_left jiabian fl">2019-03-11 10:00:30
        </div>
        <div class="header_middle jiabian fl">
            <div class="header_middle_img">
                <img src="${pageContext.request.contextPath}/images/bt.png">
            </div>
            <div class="nav">

                <ul>
                    <li><a href="${pageContext.request.contextPath}/pages/index.jsp" >实时展示</a></li>
                    <li><a href="javascript:">流量统计</a>
                        <dl>
                            <dd><a href="${pageContext.request.contextPath}/pages/day_flow.jsp">日流量统计</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/week_flow.jsp">周流量统计</a></dd>
                        </dl>
                    </li>
                    <li><a href="javascript:;" class="on">目标搜索</a>
                        <dl>
                            <dd><a href="${pageContext.request.contextPath}/pages/car_search.jsp">车辆搜索</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/pedestrian_search.jsp">行人搜索</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/face_search.jsp">人脸搜索</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>

        </div>
        <div class="header_right fr">
            <form class="sousuo" action="" method="get">
                <input type="text" name="keyword" class="search_text" value=""/>
                <input type="submit" name="submit" class="search_btn" value=""/>
            </form>
            <span> <a href="#"><img src="${pageContext.request.contextPath}/images/index_shezhi.png"></a></span>
            <span> <a href="#"><img src="${pageContext.request.contextPath}/images/index_guanji.png"></a></span>
        </div>
        <div class="clearfix"></div>

    </div>
    <!--main主要内容 -->
    <div id="main">
        <!-- main左边 -->
        <div class="car_main">
            <div class="car_main_header">
                <div class="car_main_header_bt font16"><b>行人搜索结果</b></div>
            </div>
            <div class="car_main_content">
                <ul class="resuct">
                    <c:forEach items="${pageResults.datas}" var="pedestrian">
                        <li><a href="#"><img src=${pedestrian.bigPicUrl}></a>
                            <div class="wemzo">
                                <p>拍摄时间:</p><p>${pedestrian.personAppearTime}</p>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="car_main_footer">
                <div class="digg">
                    <span>第${pageResults.pageno}/ ${pageResults.totalno}页</span>
                    <span>总记录数：${pageResults.totalsize} 每页显示:${pageResults.pagesize}</span>
                    <span>
                        <c:if test="${pageResults.pageno!= 1}">
                            <a href="${pageContext.request.contextPath }/pedestrianSearch/pageQuery.do?currentPage=1">[首页]</a>
                            <a href="${pageContext.request.contextPath }/pedestrianSearch/pageQuery.do?currentPage=${pageResults.pageno-1}">[上一页]</a>
                        </c:if>

                        <c:if test="${pageResults.pageno != pageResults.totalno}">
                            <a href="${pageContext.request.contextPath }/pedestrianSearch/pageQuery.do?currentPage=${pageResults.pageno+1}">[下一页]</a>
                            <a href="${pageContext.request.contextPath }/pedestrianSearch/pageQuery.do?currentPage=${pageResults.totalno}">[尾页]</a>
                        </c:if>
                    </span>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>
