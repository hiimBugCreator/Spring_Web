<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <!-- Content Body Start -->
        <div class="content-body">

            <!-- Page Headings Start -->
            <div class="row justify-content-between align-items-center mb-10">

                <!-- Page Heading Start -->
                <div class="col-12 col-lg-auto mb-20">
                    <div class="page-heading">
                        <h3>eCommerce <span>/ Invoice Details</span></h3>
                    </div>
                </div><!-- Page Heading End -->

            </div><!-- Page Headings End -->

            <div class="row mbn-30">

                <!--Invoice Head Start-->
                <div class="col-12 mb-30">
                    <div class="invoice-head">
                        <h2 class="fw-700 mb-15">Invoice #${o.id}</h2>
                        <hr>
                        <div class="d-flex justify-content-between row mbn-20">
                           
                            <!--Invoice To-->
                            <div class="text-left text-sm-right col-12 col-sm-auto mb-20">
                                <h4 class="fw-600">${o.name}</h4>
                                <p>${o.address} <br>
                            ${o.phone} <br>
                            ${o.email}</p>
                            </div>
                        </div>
                    </div>
                </div>
                <!--Invoice Head End-->

                <!--Invoice Details Table Start-->
                <div class="col-12 mb-30">
                    <div class="table-responsive">
                        <table class="table table-bordered mb-0">
                            <thead>
                                <tr>
                                    <th><span>Description</span></th>
                                    <th class="text-right"><span>Quantity</span></th>
                                    <th class="text-right"><span>Unit Cost</span></th>
                                    <th class="text-right"><span>Total</span></th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${od}" var="item">
                                <tr>
                                    <td>${item.namep}</td>
                                    <td class="text-right">${item.quan}</td>
                                    <td class="text-right">${item.price}</td>
                                    <td class="text-right">${item.total_price}</td>
                                </tr>
                            </c:forEach>    
                            </tbody>
                        </table>
                    </div>
                </div>
                <!--Invoice Details Table End-->

                <!--Invoice Total Start-->
                <div class="col-12 d-flex justify-content-end mb-15">
                    <div class="text-right">
                        <h6>Sub Total: ${o.cost}</h6>
                        <h6>Ship: Free</h6>
                        <hr class="mb-10">
                        <h3 class="fw-600 mb-0">Total: ${o.cost}</h3>
                    </div>
                </div>
                <!--Invoice Total Start-->

                <div class="col-12 mb-15">
                    <hr>
                </div>


                <!--Invoice Action Button Start-->

            </div>

        </div><!-- Content Body End -->