<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.ArrayList, com.subject.SubjectVO" %>
<%
	ArrayList<SubjectVO> list = (ArrayList<SubjectVO>)request.getAttribute("list");
	int counter = list.size();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		
		<link rel="shortcut icon" href="../image/icon.png" />
		<link rel="apple-touch-icon" href="../image/icon.png" />
		
		<!--[if lt IE 9]>
		<script src="../js/html5shiv.js"></script>
		<![endif]-->
		
		<title>Subject테이블 조회</title>
		
		<style type="text/css">
			body{font:12px/2em "돋움"}
			
			div#subjectList{width: 600px; float: left;}
			div#subjectList table{border-collapse:collapse; width: 600px; margin: 0 auto; margin-top: 8px;}
			div#subjectList thead > div#subjectList tr{background-color: #ececec;}
			div#subjectList th, div#subjectList td{border: 1px solid black;}
			
			.tc{text-align: center;}
			.tl{text-align: left;}
			.tr{text-align: right;}
		</style>
	</head>
	<body>

	</body>
</html>