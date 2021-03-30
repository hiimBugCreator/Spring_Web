<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   
<div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>Shopping Cart</h2>
                        </div>

                        <div class="cart-table clearfix">
                            
                                        
                          <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Name</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                    </tr>
                                </thead>
                                
                                	<c:set var = "total" scope = "session" value = "0"/>
                                <tbody>
                                	<c:forEach items="${list}" var="item">
                                		
		                                    <tr>
		                                    	<td class="cart_product_img">
	                                            <a href="#"><img src="${contextPath}/resources/admin/assets/images/data/${item.image}" alt="Product" ></a>
	                                        	</td>
		                                        <td class="cart_product_desc">
		                                            <h5>${item.namep}</h5>
		                                        </td>
		                                        <td class="price">
		                                            <span>${item.total_price}</span>
		                                            <c:set var = "total" scope = "session" value = "${total+item.total_price}"/>
		                                        </td>
		                                        <td class="qty">
		                                            <div class="qty-btn d-flex">
		                                                <p>Qty: ${item.quan}</p>
		                                                <div class="quantity"> </div>
		                                            </div>
		                                        </td>
		                                    </tr>
		                                    
                                    </c:forEach>
                                 </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4">
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                <li><span>delivery:</span> <span>Free</span></li>
                                <li><span>total: ${total}</span> <span></span></li>
                            </ul>
                            <div class="cart-btn mt-100">
                                <a href="${contextPath}/checkoutsess${total}" class="btn amado-btn w-100">Checkout</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->