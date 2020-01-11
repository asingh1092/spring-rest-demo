
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Rest Demo</title>
</head>
<body>
<h2>Spring Rest Demo</h2>
<hr>
<a href="${pageContext.request.contextPath}/test/hello">Hello World!</a>
<br>
<a href="${pageContext.request.contextPath}/api/students">Get Students</a>
<br>
<a href="${pageContext.request.contextPath}/api/student/0">Get Student</a>

</body>
</html>