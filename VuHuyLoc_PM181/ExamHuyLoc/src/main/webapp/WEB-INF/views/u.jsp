<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>   

        <!-- Content Body Start -->
        <div class="content-body">

            <!-- Page Headings Start -->
            <div class="row justify-content-between align-items-center mb-10">

                <!-- Page Heading Start -->
                <div class="col-12 col-lg-auto mb-20">
                    <div class="page-heading">
                        <h3>eCommerce <span>/ Manage User</span></h3>
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
                                    <th>Email</th>
                                    <th>Username</th>
                                    <th>Password</th>
                                    <th>Role</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${u}" var="item">
	                                <tr>
	                                    <td>${item.email}</td>
	                                    <td>${item.username}</td>
	                                    <td>${item.password}</td>
	                                    <c:if test="${item.role == 0}">
	                                    	<td>Guest</td>
	                                    </c:if>
	                                    <c:if test="${item.role > 0}">
	                                    	<td>Admin</td>
	                                    </c:if>
	                                    <td>
	                                        <div class="table-action-buttons">
	                                            <a class="edit button button-box button-xs button-info" href="${contextPath}/eu${item.id}"><i class="zmdi zmdi-edit"></i></a>
	                                            <a class="delete button button-box button-xs button-danger" href="${contextPath}/delu${item.id}/u"><i class="zmdi zmdi-delete"></i></a>
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