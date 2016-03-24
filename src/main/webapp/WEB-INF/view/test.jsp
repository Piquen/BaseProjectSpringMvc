<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Test detail</title>
	</head>
	<body>
		<h2>Test detail</h2>
		ID: ${testEntity.id}<br>
		Code: ${testEntity.code}
	</body>
</html>
