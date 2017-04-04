<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String id=(String)session.getAttribute("id");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
	<span> {
		font-size: 17px;
		font-style: bold;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
/* 	$(function(){
		$('#notice').click(function(){
			location.href="main.jsp?mode=1";
		});
		$('#book').click(function(){
			location.href="main.jsp?mode=2";
		});
		$('#free').click(function(){
			location.href="main.jsp?mode=5";
		});
		$('#site').click(function(){
			location.href="main.jsp?mode=6";
		});
		$('#mypage').click(function(){
			location.href="main.jsp?mode=7";
		});
	}); */
</script>
</head>
<body>
	<center>
		<div style=" width:1920; height: 150px; background-image: url('image/main_image/main_top3.png');">
			<table border="0">
				<tr>
					<td width="400" height="100">
						<a href="main.jsp">
							<img src="image/main_image/main_logo.png" width="65%">
						</a>
					</td>
					<td width="110" height="100"></td>
					<td width="110" height="100"></td>
					<td width="600" height="100" align="center" valign="bottom">
						<table border="0" width="600" height="100">
							<tr>
								<td align="center" valign="middle">
									<!-- <span id="notice">공지사항</span>
									<span id="book">도감</span>
									<span id="free">게시판</span>
									<span id="site">제휴사이트</span>
									<span id="mypage">마이페이지</span> -->
									<a href="main.do">홈</a>
									<a href="book.do">도감</a>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
	</center>

</body>
</html>