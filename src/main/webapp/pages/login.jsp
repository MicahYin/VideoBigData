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
    <title>login</title>
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
        <div class="login fr">
            <span class="mr_10"> <a href="#"><img src="${pageContext.request.contextPath}/images/index_shezhi.png"></a></span>
            <span> <a href="#"><img src="${pageContext.request.contextPath}/images/index_guanji.png"></a></span>
        </div>
        <div class="clearfix">

        </div>
    </div>
    <!--main主要内容 -->
    <div class="login_main">
        <div class="login_bt">
            <img src="${pageContext.request.contextPath}/images/login_bt.png">
        </div>
        <form class="login_content" action="" method="">
            <ul>
                <li><input type="text" class="user" name="user" placeholder="用户名" value="admin" /></li>
                <li><input type="password" class="password" name="password" placeholder="密码" value="q请输入密码" /></li>
                <li class="check_style"><label><input name="Fruit" class="checkbox1" type="checkbox" value="" /> <span class="mr_10">记住我</span> </label> <a class="fr" href="#">忘记密码？</a></li>
                <li><input type="submit" class="sub" name="sub" value="登录" /></li>
            </ul>
        </form>
    </div>
</div>
</body>
</html>
