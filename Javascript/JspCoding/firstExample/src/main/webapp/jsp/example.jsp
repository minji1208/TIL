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
		
		<title>예제 파일 - example.jsp</title>
	</head>
	<body>
		<h1>[ 파일명은 example.jsp입니다. ]</h1>
		<h3>숫자를 저장한 변수 3개(7,5,9)를 정의하고 최대값 구하기</h3>
	<%
		int x = 7;
		int y = 5;
		int z = 9;
		
		int max=0;
		
		if(x < y){
			max = y;
		} else{
			max=x;
		}
		if(max < z){
			max = z;
		}
	%>
	<p>최대값은 : <%=max %></p>
	<h3>배열의 값(12,26,68,98,76,54,8,6,4) 중 최대값과 최소값 구하기</h3>
	<%
		int[] arr = {12,26,68,98,76,54,8,6,4};
		int arrMax = arr[0];
		int arrMin = arr[0];
		
		for(int s : arr){
			if(arrMax<s){
				arrMax = s;
			}
			if(arrMin>s){
				arrMin=s;
			}
		}
	%>
	<p>최대값 : <%=arrMax %>, 최소값 : <%=arrMin %>
	
	<h3>문자열 추출하기</h3>
	<%
		String str = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int len = str.length();
		char c = '닳';
		int s=0;
		for(int i = 0; i<len; i++){
			if(str.charAt(i)==c){
				s = i;
			}
		}
	%>
	<p>"<%=str %>" => <%=len %>자이며, '<%=c %>'은 <%=s %>번째 있다.<br>
	</p>
	<%
		int s2 = 15;
		char c2 = str.charAt(s2);
		
	%> 
	<p>"<%=str %>"의 <%=s2 %>번째 문자는 '<%=c2 %>'이다.</p>
	</body>
</html>