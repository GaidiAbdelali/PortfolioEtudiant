<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>just for testing</h2>

<h1>Hello <sec:authentication property="name"/> </h1>


<sec:authorize access="hasRole('ROLE_ADMIN')">>

<h2>your are a admin</h2>
</sec:authorize>
</body>
</html>