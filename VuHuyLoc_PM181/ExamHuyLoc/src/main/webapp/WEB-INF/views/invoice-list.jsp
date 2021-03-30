<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <!-- Content Body Start -->
        <div class="content-body">

            <!-- Page Headings Start -->
            <div class="row justify-content-between align-items-center mb-10">

                <!-- Page Heading Start -->
                <div class="col-12 col-lg-auto mb-20">
                    <div class="page-heading">
                        <h3>eCommerce <span>/ Invoice List</span></h3>
                    </div>
                </div><!-- Page Heading End -->

            </div><!-- Page Headings End -->

            <div class="row mbn-30">

                <!--Alert Start-->
                <div class="col-12 mb-30">
                    <div class="alert alert-primary">
                        <button class="close" data-dismiss="alert"><i class="zmdi zmdi-close"></i></button>
                        
                    </div>
                </div>
                <!--Alert End-->

                <!-- Invoice List Start -->
                <div class="col-12 mb-30">
                    <div class="table-responsive">
                        <table class="table table-bordered mb-0">

                            <!-- Table Head Start -->
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>Customer Name</th>
                                    <th>Address</th>
                                    <th>Phone No</th>
                                    <th>Email</th>
                                    <th>Note</th>
                                    <th>Cost</th>
                                </tr>
                            </thead><!-- Table Head End -->

                            <!-- Table Body Start -->
                            <tbody>
                            	<c:forEach items="${o}" var="item">
	                                <tr>
		                                    <td>${item.id}</td>
		                                    <td>${item.name}</td>
		                                    <td>${item.address}</td>
		                                    <td>${item.phone}</td>
		                                    <td>${item.email}</td>
		                                    <td>${item.note}</td>
		                                    <td>${item.cost}</td>
	                                    <td>
	                                        <div class="table-action-buttons">
	                                            <a class="view button button-box button-xs button-primary" href="${contextPath}/invoice-details-${item.id}"><i class="zmdi zmdi-more"></i></a>
	                                        </div>
	                                    </td>
	                                </tr>
                                </c:forEach>
                            </tbody><!-- Table Body End -->

                        </table>
                    </div>
                </div><!-- Invoice List End -->

            </div>

        </div><!-- Content Body End -->