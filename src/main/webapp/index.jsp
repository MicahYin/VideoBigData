<%--
  Created by IntelliJ IDEA.
  User: Micah
  Date: 2019/7/24
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>首页</title>
    <!--[if lt IE 9]>
    <script src="//cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="//cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <script src="//cdn.staticfile.org/es5-shim/4.5.9/es5-shim.min.js"></script>
    <script src="//cdn.staticfile.org/es5-shim/4.5.9/es5-sham.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/swiper.min.css">
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
                    <li><a href="${pageContext.request.contextPath}/pages/index.jsp" class="on">实时展示</a></li>
                    <li><a href="javascript:">流量统计</a>
                        <dl>
                            <dd><a href="${pageContext.request.contextPath}/pages/day_flow.jsp">日流量统计</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/week_flow.jsp">周流量统计</a></dd>
                        </dl>
                    </li>
                    <li><a href="javascript:">目标搜索</a>
                        <dl>
                            <dd><a href="${pageContext.request.contextPath}/pages/car_search.jsp">车辆搜索</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/pedestrian_search.jsp">行人搜索</a></dd>
                            <dd><a href="${pageContext.request.contextPath}/pages/face_search.jsp">人脸搜索</a></dd>
                        </dl>
                    </li>

                    <li><a href="#">设备管理</a></li>

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
        <div class="main_left fl">
            <div class="main_let_content">
                <div class="main_lefr_content_left fl">
                    <div class="mbjr">
                        <p class="font24"><b>目标接入</b></p>
                        <p style="text-align: center;"><span class="font42 baise">501</span><span class="font36">路</span></p>
                        <p>待机中：<span class="font36">129</span>路</p>
                        <p>运行中：<span class="font36">372</span>路</p>
                    </div>
                    <div class="mbjr2">
                        <p class="font24"><b>当天的数据量：</b></p>
                        <p style="text-align: center;"><span class="font42 baise">0</span><span class="font36">条</span></p>
                        <p>总数据量：</p>
                        <p><span class="baise font24">3828690</span>条</p>
                    </div>
                </div>
                <div class="main_lefr_content_right fr">
                    <div class="sszs_bt">
                        实时展示
                    </div>
                    <div class="sszs_dt">
                        <img src="${pageContext.request.contextPath}/images/ditu.jpg" >
                    </div>

                </div>
                <div class="clearfix"></div>
            </div>

            <div class="main_let_content1">
                <div class="fl">
                    <div class="riliuliang_bt">
                        <span class="font16" style="margin-right: 10px;"><b>日流量统计（实时）</b></span>六合路七星公园<span class="fr" style="margin-right: 2px;"><a href="#" style="margin-right: 5px;">（更换）</a><a href="#">更多</a></span>
                    </div>
                    <div class="riliuliang_content">
                        <img src="${pageContext.request.contextPath}/images/day_count_img.png" >
                    </div>
                </div>
                <div class="fr">
                    <div class="riliuliang_bt">
                        <span class="font16" style="margin-right: 10px;"><b>周流量统计（实时）</b></span>六合路七星公园<span class="fr" style="margin-right: 2px;"><a href="#" style="margin-right: 5px;">（更换）</a><a href="#">更多</a></span>
                    </div>
                    <div class="riliuliang_content">
                        <img src="${pageContext.request.contextPath}/images/week_count_img.png" >
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <!-- main右边 -->
        <div class="main_right fr">
            <!-- 行人搜索（实时） -->
            <div class="xrss_shishi">
                <div class="main_right_bt bt_16px">行人搜索（实时）</div>
                <div class="main_right_xbt">
                    <div class="fl">六合路七星公园</div>
                    <div class="fr"><a href="#" style="margin-right: 5px;">（更换）</a><a href="#">更多</a></div>
                    <div class="clearfix">
                    </div>
                </div>

                <div class=" main_right_c swiper-container">
                        <ul class="swiper-wrapper">
                            <li  class="swiper-slide">
                                <img src="${pageContext.request.contextPath}/images/01.jpg">
                                <img src="${pageContext.request.contextPath}/images/01.jpg">
                                <img src="${pageContext.request.contextPath}/images/01.jpg">
                            </li>
                            <li  class="swiper-slide">
                                <img src="${pageContext.request.contextPath}/images/02.jpg">
                                <img src="${pageContext.request.contextPath}/images/02.jpg">
                                <img src="${pageContext.request.contextPath}/images/02.jpg">
                            </li>
                            <li  class="swiper-slide">
                                <img src="${pageContext.request.contextPath}/images/03.jpg">
                                <img src="${pageContext.request.contextPath}/images/03.jpg">
                                <img src="${pageContext.request.contextPath}/images/03.jpg">
                            </li>
                        </ul>
                    <%--<div class="swiper-pagination"></div>--%>
                    <div class="main_daohan fr">
                        <a class="reset_next" href="#"> < </a>
                        <a class="reset_prev" href="#"> > </a>
                    </div>
                </div>
            </div>
            <!-- 车辆搜索（实时） -->
            <div class="xrss_shishi cheliang">
                <div class="main_right_bt bt_16px">车辆搜索（实时）</div>
                <div class="main_right_xbt">
                    <div class="fl">六合路七星公园</div>
                    <div class="fr"><a href="#" style="margin-right: 5px;">（更换）</a><a href="#">更多</a></div>
                </div>
                <div class="clearfix">
                </div>
                <div class=" main_right_c swiper-container">
                    <ul class="swiper-wrapper">
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/04.jpg">
                            <img src="${pageContext.request.contextPath}/images/04.jpg">
                            <img src="${pageContext.request.contextPath}/images/04.jpg">
                        </li>
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/05.jpg">
                            <img src="${pageContext.request.contextPath}/images/05.jpg">
                            <img src="${pageContext.request.contextPath}/images/05.jpg">
                        </li>
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/06.jpg">
                            <img src="${pageContext.request.contextPath}/images/06.jpg">
                            <img src="${pageContext.request.contextPath}/images/06.jpg">
                        </li>
                    </ul>
                    <!-- <div class="swiper-pagination"></div> -->
                    <div class="main_daohan fr">
                        <a class="reset_next" href="#"> < </a>
                        <a class="reset_prev" href="#"> > </a>
                    </div>
                </div>

            </div>
            <!-- 人脸搜索（实时） -->
            <div class="xrss_shishi">
                <div class="main_right_bt bt_16px">人脸搜索（实时）</div>
                <div class="main_right_xbt">
                    <div class="fl">六合路七星公园</div>
                    <div class="fr"><a href="#" style="margin-right: 5px;">（更换）</a><a href="#">更多</a></div>
                </div>
                <div class="clearfix"></div>
                <div class=" main_right_c swiper-container">
                    <ul class="swiper-wrapper">
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/07.jpg">
                            <img src="${pageContext.request.contextPath}/images/07.jpg">
                            <img src="${pageContext.request.contextPath}/images/07.jpg">
                        </li>
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/08.jpg">
                            <img src="${pageContext.request.contextPath}/images/08.jpg">
                            <img src="${pageContext.request.contextPath}/images/08.jpg">
                        </li>
                        <li class="swiper-slide">
                            <img src="${pageContext.request.contextPath}/images/09.jpg">
                            <img src="${pageContext.request.contextPath}/images/09.jpg">
                            <img src="${pageContext.request.contextPath}/images/09.jpg">
                        </li>
                    </ul>
                    <!-- <div class="swiper-pagination"></div> -->
                    <div class="main_daohan fr">
                        <a class="reset_next" href="#"> < </a>
                        <a class="reset_prev" href="#"> > </a>
                    </div>
                </div>
            </div>
        </div>
        <!-- 清楚浮动 -->
        <div class="clearfix"></div>
    </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
<script src="${pageContext.request.contextPath}/js/swiper.min.js"></script>

<script>
    /* 首页幻灯*/
    var swiper = new Swiper('.swiper-container', {
        slidesPerView: 3,
        spaceBetween: 30,
        navigation: {
            nextEl: '.reset_next',
            prevEl: '.reset_prev'
        }
    });
</script>
<script>
    var swiper = new Swiper('.swiper-container', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        speed: 2000,
        loop: true,//设置为true时自动播放，默认为false
        observer:true,
        observeParents:true,
        autoplayDisableOnInteraction : false,
        grabCursor:true,  //开启抓手光标
        autoplay: {
            disableOnInteraction: false
        }
    });

    //定时刷新函数
    $(document).ready(function () {
        setInterval("startRequest()", 3000);//3s一次
    });
    function startRequest(){
        $.ajax({
            url:  "${pageContext.request.contextPath}/pedestrianSearch/findPedestrianNewest.do",
            type: 'POST',
            success: function (data) {
                var realtime=JSON.parse(data);//最新的数据
                console.log(realtime);
                //如果时间时间没变，那么数据未更新
            },
            error : function(jqXHR) {
                alert("发生错误：" + jqXHR.status);
            }
        });
    }
</script>
</body>
</html>
