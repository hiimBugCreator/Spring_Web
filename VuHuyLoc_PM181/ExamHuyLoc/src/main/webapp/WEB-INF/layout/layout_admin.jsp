<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Adomx - Responsive Bootstrap 4 Admin Template</title>
    <meta name="robots" content="noindex, follow" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="${contextPath}/resources/admin/assets/images/favicon.ico">

    <!-- CSS
	============================================ -->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/vendor/bootstrap.min.css">

    <!-- Icon Font CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/vendor/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/vendor/font-awesome.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/vendor/themify-icons.css">
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/vendor/cryptocurrency-icons.css">

    <!-- Plugins CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/plugins/plugins.css">

    <!-- Helper CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/helper.css">

    <!-- Main Style CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/admin/assets/css/style.css">

    <!-- Custom Style CSS Only For Demo Purpose -->
    <link id="cus-style" rel="stylesheet" href="${contextPath}/resources/admin/assets/css/style-primary.css">

</head>

		<tiles:insertAttribute name="header" /> 
        <tiles:insertAttribute name="body" />
    	<tiles:insertAttribute name="footer" />   
    	
<!-- ============================================ -->

    <!-- Global Vendor, plugins & Activation JS -->
    <script src="${contextPath}/resources/admin/assets/js/vendor/modernizr-3.6.0.min.js"></script>
    <script src="${contextPath}/resources/admin/assets/js/vendor/jquery-3.3.1.min.js"></script>
    <script src="${contextPath}/resources/admin/assets/js/vendor/popper.min.js"></script>
    <script src="${contextPath}/resources/admin/assets/js/vendor/bootstrap.min.js"></script>
    <!--Plugins JS-->
    <script src="${contextPath}/resources/admin/assets/js/plugins/perfect-scrollbar.min.js"></script>
    <script src="${contextPath}/resources/admin/assets/js/plugins/tippy4.min.js.js"></script>
    <!--Main JS-->
    <script src="${contextPath}/resources/admin/assets/js/main.js"></script>

</body> 
</html>    