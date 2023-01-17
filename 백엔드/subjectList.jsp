<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
		<script type="text/javascript" src="../js/jquery-3.6.2.min.js"></script>
		<script type="text/javascript">
			$(function(){
				//학과 정보 등록 버튼 제어
				$("#subjectInsert").click(function(){
					location.href="<%=request.getContextPath()%>/jdbc/subjectForm.jsp";
				});
			});
		</script>
	</head>
	<body>
		<h3>Subject 테이블 조회 프로그램</h3>
		<hr>
		<div id="subjectList">
			<div class="tr">
				<input type="button" value="학과정보등록" id="subjectInsert">
			</div>
			<table>
				<thead>
					<tr>
						<th>번호</th>
						<th>학과번호</th>
						<th>학과명</th>
					</tr>
				</thead>
			</table>
		</div>
	</body>
</html>