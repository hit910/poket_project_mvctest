<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	request.setCharacterEncoding("EUC-KR");
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
	div {
		font-family: 고딕;
	}
	span {
		background-color: red;
		font-family: "굴림";
		font-size: 17px;
		font-weight: bold;
		color: white;
		margin: 5px;
	}
	a {
		text-decoration: none;
	}
</style> 
</head>
<body>      
	<center>
			<!-- top div -->
			<div style="width: 1920; height:150px;">
				<jsp:include page="header.jsp"></jsp:include>
			</div><!-- top div -->     
			
			<div style="width: 100%; height:1700px;">
				<jsp:include page="${jsp }"></jsp:include>
			</div>
			
			<!-- bottom div -->
			<div style="width: 1920; height: 150px;">		
				<jsp:include page="bottom.jsp"></jsp:include>
			</div>		<!-- bottom div -->
	</center>
</body>
</html>