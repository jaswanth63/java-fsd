<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Product Details</title>
</head>
<body>
<h3>Product Details</h3>

<br/>
	Product Name:
	<c:out value="${sessionScope.productDetails.name}" />
	<br /> <br /> 
	
   Price:
	<c:out value="${sessionScope.productDetails.price}" />
	<br />
	<a href="index.jsp"> home page</a>

</body>
</html>