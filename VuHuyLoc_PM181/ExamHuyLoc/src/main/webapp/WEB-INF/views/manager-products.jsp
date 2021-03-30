<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <!-- Content Body Start -->
        <div class="content-body">

            <!-- Page Headings Start -->
            <div class="row justify-content-between align-items-center mb-10">

                <!-- Page Heading Start -->
                <div class="col-12 col-lg-auto mb-20">
                    <div class="page-heading">
                        <h3>eCommerce <span>/ Manage Product</span></h3>
                    </div>
                </div><!-- Page Heading End -->

            </div><!-- Page Headings End -->

            <div class="row">

                <!--Manage Product List Start-->
                <div class="col-12">
                    <div class="table-responsive">
                        <table class="table table-vertical-middle">
                            <thead>
                                <tr>
                                    <th>Product ID</th>
                                    <th>Photo</th>
                                    <th>Product Name</th>
                                    <th>Price</th>
                                    <th>Discount</th>
                                    <th>In Stock</th>
                                    <th>Type</th>
                                    <th>Status</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${product}" var="item">
	                                <tr>
	                                    <td>${item.id}</td>
	                                    
	                                    <td><img src="${contextPath}/resources/admin/assets/images/data/${item.image}" alt="" class="product-image rounded-circle" style="width: 60px; height: 60px;"></td>
	                                    <td>${item.name}</td>
	                                    <td>${item.price}</td>
	                                    <td>${item.discount}</td>
	                                    <td>${item.amount}</td>
	                                    <td>${item.type}</td>
	                                    <c:if test="${item.amount == 0}">
	                                    <td><span class="badge badge-danger">Out of stock</span></td>
	                                    </c:if>
	                                    <c:if test="${item.amount > 0}">
	                                    <td><span class="badge badge-success">Published</span></td>
	                                    </c:if>
	                                    <td>
	                                        <div class="table-action-buttons">
	                                            <a class="edit button button-box button-xs button-info" href="${contextPath}/e-${item.id}/edit-product"><i class="zmdi zmdi-edit"></i></a>
	                                            <a class="delete button button-box button-xs button-danger" href="${contextPath}/delss-${productId}/home"><i class="zmdi zmdi-delete"></i></a>
	                                        </div>
	                                    </td>
	                                </tr>
	                             </c:forEach>     
                            </tbody>
                        </table>
                    </div>
                </div>
                <!--Manage Product List End-->

            </div>

        </div><!-- Content Body End -->