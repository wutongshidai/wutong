<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link href="css/iconfont.css" rel="stylesheet" type="text/css"/>
        <link href="css/fileUpload.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<form name="form" action="/tijiao.do" method="post" enctype="multipart/form-data" >
		<input type="file" name="uploada" id="" value=""   accept="image/png,image/gif" />
		<hr />
		<div id="fileUploadContent" class="fileUploadContent"></div>
		</form>
	</body>
	<script src="JS/jquery-1.11.3.js"></script>
	<script type="text/javascript" src="JS/fileUpload.js"></script>
	<script type="text/javascript">
		 //上传
				   $("#fileUploadContent").initUpload({
			        "uploadUrl":"/upload/uploadFck.do",//上传文件信息地址
			       // "progressUrl":"#",//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
			        "showSummerProgress":false,//总进度条，默认限制
			        //"size":350,//文件大小限制，单位kb,默认不限制
			        //"maxFileNumber":3,//文件个数限制，为整数
			        "filelSavePath":"E:\adaaddd",//文件上传地址，后台设置的根目录
			        //"beforeUpload":beforeUploadFun,//在上传前执行的函数
			        //"onUpload":onUploadFun，//在上传后执行的函数
			        autoCommit:true,//文件是否自动上传
			        //"fileType":['png','jpg','docx','doc']，//文件类型限制，默认不限制，注意写的是文件后缀
			    })
			    function beforeUploadFun(opt){
			        opt.otherData =[{"name":"你要上传的参数","value":"你要上传的值"}];
			    }
			    function onUploadFun(opt,data){
			        alert(data);
			        uploadTools.uploadError(opt);//显示上传错误
			    }
	</script>
</html>
