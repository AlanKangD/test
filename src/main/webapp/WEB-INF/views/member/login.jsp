<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입  페이지 입니다. conroller 연결 성공</h1>

<table border="1">
	<form action="member/register">
		<tr>
			<td>
				아이디 : <input type="text" name="id" placeholder="아이디를 입력하세요">
			</td>
			<td>
				비밀번호 : <input type="password" name="pw" placeholder="비밀번호를 입력하세요">
			</td>
		</tr>
		<button type="submit"> 회원가입 </button>
	</form>
</table>

</body>
</html>