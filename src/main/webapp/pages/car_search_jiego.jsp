<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 15:06
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
                    <li><a href="index.html" >实时展示</a></li>
                    <li><a href="javascript:;" class="on">流量统计</a>
                        <dl>
                            <dd><a href="day_flow.html">日流量统计</a></dd>
                            <dd><a href="week_flow.html">周流量统计</a></dd>
                        </dl>
                    </li>
                    <li><a href="javascript:;">目标搜索</a>
                        <dl>
                            <dd><a href="car_search.html">车辆搜索</a></dd>
                            <dd><a href="pedestrian_search.html">行人搜索</a></dd>
                            <dd><a href="bike_search.html">人骑车搜索</a></dd>
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
                <div class="car_main_header_bt font16"><b>车辆搜索结果</b></div>
            </div>
            <div class="car_main_content">
                <ul class="resuct">
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>

                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/car_search10.jpg"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="car_main_footer">
                <div class="digg">

                    <a href="#" class="disabled1">上一页</a>
                    <a href="#" class="current">1</a>
                    <a href="#?page=2">2</a>
                    <a href="#?page=3">3</a>
                    <a href="#?page=4">4</a>
                    <a href="http://www.divcss5.com/">5</a>
                    <a href="#?page=6">6</a>
                    <a href="#?page=7">7</a>
                    ...
                    <a href="#?page=199">199</a>
                    <a href="#?page=200">200</a>
                    <a href="#?page=2">下一页 </a>
                    <div class="digg_tz">
                        <form action="" method="post">

                            <label>跳到 <input class="tz_sstext" type="text" id="" value="" /> 页</label> <a href="#" class="current">go</a> <a class="current" href="#">返回</a>
                        </form>
                    </div>

                </div>

            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>
