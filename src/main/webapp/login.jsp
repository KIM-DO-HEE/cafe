<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
		아이디 : <input type="text" name="userId" placeholder="아이디를 입력하세요">
		비밀번호 : <input type="text" name="userPw" placeholder="비밀번호를 입력하세요">
		
		<input type="submit" value="제출">
	</form>
</body>
</html>