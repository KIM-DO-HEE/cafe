<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<table cellpadding="0" cellspacing="0" width="700" class="table table-borderless">
		<tr>
			<th bgcolor="gray" width="100">메뉴 이름</th>
			<th bgcolor="gray" width="200">메뉴 가격</th>
		</tr>
		<form action="/insertOrder">
			<c:forEach items="${cartList}" var="cart">
			<tr>
				<input type="hidden" name="menuId" value="${cart.menuId}"/>
				<td><input type="text" name="menuName" value="${cart.menuName}"/></td>
				<td><input type="text" name="menuPrice" value="${cart.menuPrice}"/></td>
				<td><a href="/deleteCart?menuId=${cart.menuId}">삭제하기</a></td>
			</tr>
		</c:forEach>
	</table>
		<input type="submit" value="주문하기"> 
		</form>
</body>
</html>