<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">
                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>
                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Date</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                        </select>
                                    </form>
                                </div>
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="#" method="get">
                                        <select name="select" id="viewProduct">
                                            <option value="value">12</option>
                                            <option value="value">24</option>
                                            <option value="value">48</option>
                                            <option value="value">96</option>
                                        </select>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
					<c:forEach items="${product}" var="item">
	                    <!-- Single Product Area -->
	                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
	                        <div class="single-product-wrapper">
	                            <!-- Product Image -->
	                            <div class="product-img">
	                                <img src="${contextPath}/resources/admin/assets/images/data/${item.image}" alt="">
	                                <!-- Hover Thumb -->
	                                <img class="hover-img" src="${contextPath}/resources/admin/assets/images/data/${item.image}" alt="">
	                            </div>
	
	                            <!-- Product Description -->
	                            <div class="product-description d-flex align-items-center justify-content-between">
	                                <!-- Product Meta Data -->
	                                <div class="product-meta-data">
	                                    <div class="line"></div>
	                                    <c:if test="${item.discount > 0}">
	                                    <p class="product-price"><strike>${item.price*1000} VND </strike>  
		                                    <marquee direction="up" scrolldelay="150" style="height: 20px; width: 200px;">
		                                    	<span style="color: red; font-size: 20px;">  Discount ${item.discount}% &#x27A1; </span>
		                                    </marquee>${(item.price*1000)-(item.price*10*item.discount)} VND</p>
	                                    </c:if>
	                                    <c:if test="${item.discount == 0}">
	                                    <p class="product-price">${item.price*1000}VND</p>
	                                    </c:if>
	                                    <a href="${contextPath}/detail-${item.id}">
	                                        <h6>${item.name}</h6>
	                                    </a>
	                                </div>
	                                <!-- Ratings & Cart -->
	                                <div class="ratings-cart text-right">
	                                    <div class="ratings">
	                                        <i class="fa fa-star" aria-hidden="true"></i>
	                                        <i class="fa fa-star" aria-hidden="true"></i>
	                                        <i class="fa fa-star" aria-hidden="true"></i>
	                                        <i class="fa fa-star" aria-hidden="true"></i>
	                                        <i class="fa fa-star" aria-hidden="true"></i>
	                                    </div>
	                                    <div class="cart">
	                                    	<c:if test="${item.amount > 0}">
	                                        <a href="${contextPath}/add1tocart-${item.id}" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="${contextPath}/resources/assets/img/core-img/cart.png" alt=""></a>
	                                   		</c:if>
	                                    </div>
	                                </div>
	                            </div>
	                        </div>
	                    </div>
	
					</c:forEach>
                </div>

                <div class="row">
                    <div class="col-12">
                        <!-- Pagination -->
                        <nav aria-label="navigation">
                            <ul class="pagination justify-content-end mt-50">
                                <li class="page-item active"><a class="page-link" href="#">01.</a></li>
                                <li class="page-item"><a class="page-link" href="#">02.</a></li>
                                <li class="page-item"><a class="page-link" href="#">03.</a></li>
                                <li class="page-item"><a class="page-link" href="#">04.</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->