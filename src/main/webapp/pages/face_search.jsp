<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>人脸搜索</title>
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
                    <li><a href="javascript:;" >流量统计</a>
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
                <div class="car_main_header_bt font16"><b>人脸搜索</b></div>
            </div>
            <form action="${pageContext.request.contextPath}/faceSearch/findFace.do" method="post" class="car_main_content clearfix">

                <dl>
                    <dt>开始时间</dt>
                    <dd><input type="text" name="startTime" id="start_time" autocomplete="off"/></dd>
                </dl>
                <dl>
                    <dt>结束时间</dt>
                    <dd><input type="text" name="endTime" id="end_time"  autocomplete="off"/></dd>
                </dl>
                <dl>
                    <dt>年龄段</dt><dd>
                    <input type="text" name="ageRange" readonly placeholder="年龄段" autocomplete="off"/>
                    <div>
                        <span class="top"></span>
                        <span class="bg_top"></span>
                        <ul>
                            <li class="selected">不限</li>
                            <li>儿童</li>
                            <li>少年</li>
                            <li>青年</li>
                            <li>中年</li>
                            <li>老年</li>
                        </ul>
                        <span class="bg_bottom"></span>
                        <span class="bottom"></span>
                    </div>
                    <font></font>
                </dd>
                </dl>
                <dl>
                    <dt>性别</dt>
                    <dd>
                        <input type="text" name="genderCode" readonly  placeholder="性别" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>男</li>
                                <li>女</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>是否佩戴眼镜</dt>
                    <dd>
                        <input type="text" name="glassCode" readonly  placeholder="是否佩戴眼镜" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>是</li>
                                <li>否</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <div class="clearfix"></div>
                <input type="submit" name="submit" class="submit_btn sourch_btn" value=" 查 询 ">
            </form>

            <div class="car_main_footer">

            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/laydate/laydate.js"></script>
<script>
    <%--时间选择--%>
    laydate.render({
        elem: '#start_time'
        ,type: 'datetime'
    });
    laydate.render({
        elem: '#end_time'
        ,type: 'datetime'
    });
</script>
</body>
</html>
