<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>行人搜索</title>
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
        <div class="header_left jiabian fl">2019-03-11 10:00:30</div>
        <div class="header_middle jiabian fl">
            <div class="header_middle_img"><img src="${pageContext.request.contextPath}/images/bt.png"></div>
            <div class="nav">
                <ul>
                    <li><a href="index.html" >实时展示</a></li>
                    <li><a href="javascript:" class="on">流量统计</a>
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
                <div class="car_main_header_bt font16"><b>行人搜索</b></div>
            </div>
            <form action="" method="post" class="car_main_content clearfix">
                <dl>
                    <dt>开始时间</dt>
                    <dd><input type="text" name="start_time" value="2019-02-19 00:00:00"></dd>
                </dl>
                <dl>
                    <dt>结束时间</dt>
                    <dd><input type="text" name="end_time" value="2019-02-26 00:00:00"></dd>
                </dl>
                <dl>
                    <dt>目标年龄</dt><dd>
                    <input type="text" name="age" readonly value="请选择" />
                    <div>
                        <span class="top"></span>
                        <span class="bg_top"></span>
                        <ul>
                            <li class="selected">儿童</li>
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
                    <dt>携带物品</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="车牌" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">车牌1</li>
                                <li>车牌2</li>
                                <li>车牌3</li>
                                <li>车牌4</li>
                                <li>车牌5</li>
                                <li>车牌6</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>背包颜色</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">1年</li>
                                <li>2年</li>
                                <li>3年</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>背包类型</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">是</li>
                                <li>否</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>目标形态</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">东</li>
                                <li>南</li>
                                <li>西</li>
                                <li>北</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>上身颜色</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>上身类型</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>上身纹理</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>目标种族</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">蓝</li>
                                <li>黄</li>
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>目标性别</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">已带</li>
                                <li>未带</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>目标眼镜</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>头发类型</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>

                <dl>
                    <dt>目标朝向</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">已带</li>
                                <li>未带</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>鞋子颜色</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>鞋子类型</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>下身颜色</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>下身类型</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul>
                                <li class="selected">有</li>
                                <li>无</li>

                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font></font>
                    </dd>
                </dl>
                <dl>
                    <dt>目标点位</dt>
                    <dd>
                        <input type="text" name="plate_number" readonly value="请选择" />
                        <div>
                            <span class="top"></span>
                            <span class="bg_top"></span>
                            <ul class="address_select">
                            </ul>
                            <span class="bg_bottom"></span>
                            <span class="bottom"></span>
                        </div>
                        <font class="redio"></font>
                    </dd>
                </dl>


                <div class="clearfix"></div>
                <input type="button" name="" class="submit_btn sourch_btn" value=" 查 询 ">

            </form>


            <div class="car_main_content margin-top-30 sourch_result">
                <ul class="resuct">
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>

                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">

                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
                        <div class="wemzo">
                            <p>拍摄时间: 2019-02-19 18:30:23</p>
                        </div>
                    </li>
                    <li><a href="#"><img src="${pageContext.request.contextPath}/images/pedestrian_img.png"></a>
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
</body>
</html>
