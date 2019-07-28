<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>周流量统计</title>
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
            <div class="sousuo">
                <a href="#"><img src="${pageContext.request.contextPath}/images/index_sousuo.png"></a>
            </div>
            <span> <a href="#"><img src="${pageContext.request.contextPath}/images/index_shezhi.png"></a></span>
            <span> <a href="#"><img src="${pageContext.request.contextPath}/images/index_guanji.png"></a></span>
        </div>
        <div class="clearfix"></div>

    </div>
    <div id="main">
        <!-- main左边 -->
        <div class="car_main">
            <div class="car_main_header">
                <div class="car_main_header_bt font16"><b>周流量统计</b></div>
            </div>
            <form action="" method="post" class="car_main_content margin-60 clearfix">

                <dl>
                    <dt>开始时间</dt>
                    <dd><input type="text" name="start_time" value="2019-02-19 00:00:00"></dd>
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


                <input type="submit" name="" style="margin:0;" class="submit_btn" value=" 查 询 ">

                <div class="clearfix"></div>



                <table cellpadding="0" cellspacing="0">
                    <tr>
                        <th>时间</th>
                        <th>02-19</th>
                        <th>02-20</th>
                        <th>02-21</th>
                        <th>02-22</th>
                        <th>02-23</th>
                        <th>02-24</th>
                        <th>02-25</th>

                    </tr>
                    <tr>
                        <td><span>人流量</span></td>
                        <td><span>233</span></td>
                        <td><span>23</span></td>
                        <td><span>2323</span></td>
                        <td><span>234</span></td>
                        <td><span>23</span></td>
                        <td><span>4343</span></td>
                        <td><span>213</span></td>


                    </tr>
                    <tr>
                        <td><span>车流量</span></td>
                        <td><span>233</span></td>
                        <td><span>23</span></td>
                        <td><span>2323</span></td>
                        <td><span>234</span></td>
                        <td><span>23</span></td>
                        <td><span>4343</span></td>
                        <td><span>213</span></td>

                    </tr>
                    <tr>
                        <td><span>人骑车流量</span></td>
                        <td><span>233</span></td>
                        <td><span>23</span></td>
                        <td><span>2323</span></td>
                        <td><span>234</span></td>
                        <td><span>23</span></td>
                        <td><span>4343</span></td>
                        <td><span>213</span></td>
                    </tr>
                </table>
                <div class="count_picurte clearfix">
                    <span class="title">周流量图</span>
                    <img src="${pageContext.request.contextPath}/images/week_flow_img.png" width="1160">
                </div>
            </form>
            <div class="car_main_footer footer_up"></div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
</body>
</html>
