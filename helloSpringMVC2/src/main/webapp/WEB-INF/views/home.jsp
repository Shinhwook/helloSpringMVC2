<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 	종합 정보 시스템   </h2>

	<ul>
		<li><a href="${pageContext.request.contextPath}/semesterSearch">학기별 이수	학점 조회</a></li>
		<li><a href="${pageContext.request.contextPath}/classificationSearch">구분별	학점 조회</a></li>
		<li><a href="${pageContext.request.contextPath}/enrolment">수강 신청 하기</a></li>
		<li><a href="${pageContext.request.contextPath}/enrolmentSearch">수강	 신청 조회 메뉴</a></li>
		<li><c:if test="${pageContext.request.userPrincipal.name != null}">
			<a href="javascript:document.getElementById('logout').submit()">Logout</a>
			</c:if></li>
	</ul>

	<form id="logout" action="<c:url value="/logout" />" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>

</body>

</html>