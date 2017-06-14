<%@ page language="java" import="java.util.*" contentType="text/html; utf-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
</head>
<body>
<div class="jumbotron">
    <a href="/index.do"> <img class="img-responsive center-block" alt="" src="img/404.jpg" style="text-align:center"></a>
</div>
<script type="text/javascript" src="Js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="Js/bootstrap.min.js"></script>
</body>
</html>
