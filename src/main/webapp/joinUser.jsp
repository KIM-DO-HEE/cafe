<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertUser"method="post">
		<input type="text" name="userId" placeholder="아이디를 입력하세요">
		<input type="text" name="userPw" placeholder="비밀번호를 입력하세요">
		<input type="text" name="userName" placeholder="이름 입력하세요">
		<input type="text" name="userEmail" placeholder="이메일을 입력하세요"> 
		
		
		<input type="submit" value="회원가입">
	</form>
</body>
</html>