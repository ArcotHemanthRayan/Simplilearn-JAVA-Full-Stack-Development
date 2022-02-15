<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Spring Security Application</title>
</head>
<body>
	<h1 style="text-align:center"><p style="color:orange">Welcome To The Spring Security Application</h1>

	<h2 style="text-align:center">
		Click <a th:href="@{/welcome}">here</a> to login
	</h2>
</body>
</html>