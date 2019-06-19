<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h2>수정 폼</h2>
	<form action="/insertMenu" enctype="multipart/form-data" method="post">
	메뉴이름 : <input type="text" name="menuName">
	메뉴 가격: <input type="text" name="menuPrice">
	메뉴 정보: <input type="textarea" name="menuInfo">
	메뉴 이미지 : <input type="file" name="image">	
	<input type="submit" value="메뉴 등록">
	</form>
</body>
</html>