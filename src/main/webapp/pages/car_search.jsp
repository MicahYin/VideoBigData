<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>车辆搜索</title>
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
                    <li><a href="javascript:;" class="on">流量统计</a>
                        <dl>
                            <dd><a href="${pageContext.request.contextPath}/pages/day_flow.jsp">日流量统计</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/week_flow.jsp">周流量统计</a></dd>
                        </dl>
                    </li>
                    <li><a href="javascript:;">目标搜索</a>
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
                <div class="car_main_header_bt font16"><b>车辆搜索</b></div>
            </div>
            <form action="${pageContext.request.contextPath}/carSearch/findCar.do" method="post" class="car_main_content clearfix">
                <dl>
                    <dt>开始时间</dt>
                    <dd><input type="text" name="startTime" id="start_time" autocomplete="off"></dd>
                </dl>
                <dl>
                    <dt>结束时间</dt>
                    <dd><input type="text" name="endTime" id="end_time" autocomplete="off"></dd>
                </dl>
                <dl>
                    <dt>车牌</dt>
                    <dd><input type="text" name="plateNo" placeholder="车牌" autocomplete="off"></dd>
                </dl>
                <dl>
                    <dt>车辆类型</dt>
                    <dd>
                        <input type="text" name="vehicleClass" placeholder="车辆类型" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>面包车</li>
                                <li>轿车</li>
                                <li>客车</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>品牌</dt>
                    <dd>
                        <input type="text" name="vehicleBrand" placeholder="品牌" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>GMC</li>
                                <li>MG</li>
                                <li>MINI</li>
                                <li>安凯</li>
                                <li>奥驰</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>车辆颜色</dt>
                    <dd>
                        <input type="text" name="vehicleColor"  placeholder="车辆颜色" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>红色</li>
                                <li>黑色</li>
                                <li>白色</li>
                                <li>棕色</li>
                                <li>黄色</li>
                                <li>绿色</li>
                                <li>蓝色</li>
                                <li>紫色</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>运动方向</dt>
                    <dd>
                        <input type="text" name="direction"  placeholder="运动方向" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>上</li>
                                <li>下</li>
                                <li>左</li>
                                <li>右</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>运动速度</dt>
                    <dd>
                        <input type="text" name="speed"  placeholder="运动速度" autocomplete="off"/>
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">不限</li>
                                <li>慢</li>
                                <li>中</li>
                                <li>快</li>
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

            <div class="car_main_content margin-top-30 sourch_result">
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
                <div class="digg sourch_result">

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
