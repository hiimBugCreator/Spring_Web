<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <!-- Content Body Start -->
        <div class="content-body">

            <!-- Page Headings Start -->
            <div class="row justify-content-between align-items-center mb-10">

                <!-- Page Heading Start -->
                <div class="col-12 col-lg-auto mb-20">
                    <div class="page-heading">
                        <h3>eCommerce <span>/ Edit Product</span></h3>
                    </div>
                </div><!-- Page Heading End -->

                <!-- Page Button Group Start -->
                <div class="col-12 col-lg-auto mb-20">
                    
                </div><!-- Page Button Group End -->

            </div><!-- Page Headings End -->

            <!-- Add or Edit Product Start -->
            <div class="add-edit-product-wrap col-12">

                <div class="add-edit-product-form">
                    <form method="post" action="${contextPath}/editss-${product.id}/home">

                        <h4 class="title">About Product</h4>

                        <div class="row">
                            <div class="col-lg-6 col-12 mb-30"><input class="form-control" type="text" value="${product.name}" name="name">Name</div>
                            <div class="col-lg-6 col-12 mb-30"><input class="form-control" type="text" value="${product.price}" name="price">Price</div>
                            <div class="col-lg-6 col-12 mb-30"><input class="form-control" type="text" value="${product.discount}" name="discount">Discount</div>
                            <div class="col-lg-6 col-12 mb-30"><input class="form-control" type="text" value="${product.amount}" name="amount">Amount</div>
                            <div class="col-12 mb-30"><textarea class="form-control" name="text">${product.description}</textarea></div>
                            <div class="col-lg-6 col-12 mb-30">
                                <select class="form-control nice-select" name="type">
                                    <option value="${product.type}">-----</option>
                                    
                                    <c:forEach items="${cate}" var="item">
                                    	<option value="${item.id}">${item.name}</option>
                                    </c:forEach>
                                    
                                </select>
                            </div>
                            <div class="col-lg-6 col-12 mb-30"><input class="form-control" type="text" value="${product.image}" name="image"></div>
                        </div>

                        <h4 class="title">Product Gallery</h4>

                        <!-- <div class="product-upload-gallery row flex-wrap">
                            <div class="col-12 mb-30">
                                <p class="form-help-text mt-0">Upload Maximum 800 x 800 px & Max size 2mb.</p>
                                <input class="file-pond" type="file" multiple>
                            </div>
                        </div> -->

                        <h4 class="title"></h4>

                        <div class="row">
                           
                        </div>

                        <!-- Button Group Start -->
                        <div class="row">
                            <div class="d-flex flex-wrap justify-content-end col mbn-10">
                                <button class="button button-outline button-primary mb-10 ml-10 mr-0">Save & Publish</button>
                                
                            </div>
                        </div><!-- Button Group End -->

                    </form>
                </div>

            </div><!-- Add or Edit Product End -->

        </div><!-- Content Body End -->