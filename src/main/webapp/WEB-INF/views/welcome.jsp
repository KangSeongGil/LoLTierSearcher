<%--
  Created by IntelliJ IDEA.
  User: KangSeongGil
  Date: 2017. 1. 5.
  Time: PM 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HelloWorld page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="container">
            <div class="navbar-header">
                <!-- 브라우저가 좁아졋을때 나오는 버튼(클릭시 메뉴출력) -->
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">부트스트랩 테스트</a>
            </div>
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">홈으로</a></li>
                    <li><a href="#about">부트스트랩이란</a></li>
                    <li><a href="#contact">문의하기</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
Greeting : ${greeting}
</body>
</html>