<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   
<div class="cart-table-area section-padding-100">
	<div class="jumbotron text-center">
	  <h1 class="display-3">Thank You!</h1>
	  <p class="lead"><strong>Please check your email</strong> for further instructions on how to complete your account setup.</p>
	  <hr>
	  <p>
	    Having trouble? <a href="">Contact us</a>
	  </p>
	  <p class="lead">
	    <a class="btn btn-primary btn-sm" href="${contextPath}/home" role="button">Continue to homepage</a>
	  </p>
	</div>
</div>
