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
		<input type="text" name="userId" placeholder="���̵� �Է��ϼ���">
		<input type="text" name="userPw" placeholder="��й�ȣ�� �Է��ϼ���">
		<input type="text" name="userName" placeholder="�̸� �Է��ϼ���">
		<input type="text" name="userEmail" placeholder="�̸����� �Է��ϼ���"> 
		
		
		<input type="submit" value="ȸ������">
	</form>
</body>
</html>