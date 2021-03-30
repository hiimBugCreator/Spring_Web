<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">    
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Thank  -->
    <title>Amado - Furniture Ecommerce Template | Home</title>

    <!-- Favicon  -->
    <link rel="icon" href="${contextPath}/resources/assets/img/core-img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/assets/css/core-style.css">
    <link rel="stylesheet" href="${contextPath}/resources/assets/style.css">

</head>    
<body>

		<tiles:insertAttribute name="header" /> 
        <tiles:insertAttribute name="body" />
		 <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
	    <script src="${contextPath}/resources/assets/js/jquery/jquery-2.2.4.min.js"></script>
	    <!-- Popper js -->
	    <script src="${contextPath}/resources/assets/js/popper.min.js"></script>
	    <!-- Bootstrap js -->
	    <script src="${contextPath}/resources/assets/js/bootstrap.min.js"></script>
	    <!-- Plugins js -->
	    <script src="${contextPath}/resources/assets/js/plugins.js"></script>
	    <!-- Active js -->
	    <script src="${contextPath}/resources/assets/js/active.js"></script>
</body>    
</html>    