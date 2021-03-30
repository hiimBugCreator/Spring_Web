<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   
        <!-- Product Catagories Area Start -->
		<div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">
			<c:forEach items="${cate}" var="item">
                <!-- Single Catagory -->
	                <div class="single-products-catagory clearfix">
	                    <a href="${contextPath}/product-detail-${item.id}/shop">
	                        <img src="${contextPath}/resources/admin/assets/images/data/${item.image}" alt="">
	                        <!-- Hover Content -->
	                        <div class="hover-content">
	                            <div class="line"></div>
	                            <p>From 50000 VND</p>
	                            <h4>${item.name}</h4>
	                        </div>
	                    </a>
	                </div>
                </c:forEach>
            </div>
        </div>
        <!-- Product Catagories Area End -->
    </div>
    <!-- ##### Main Content Wrapper End ##### -->