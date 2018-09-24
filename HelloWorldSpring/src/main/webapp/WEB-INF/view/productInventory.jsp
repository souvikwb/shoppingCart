<%@ page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/header.jsp" %>

    <div class="container-wrapper">
    	<div class="container">
    		<div class="page-header">
    			<h1>All Products</h1>
    			<p class="lead">This is the product inventory page</p>
    		</div>
			
			<table class="table table-stripped table-hover">
				<thead>
					<tr class="bg-success">
						<th>Photo Thumb</th>
						<th>Product Name</th>
						<th>Category</th>
						<th>Condition</th>
						<th>Price</th>
						<th></th>
					</tr>
				</thead>
				<c:forEach items="${products }" var="product">
				<tr>
					<td><img alt="image" src="#"></td>
					<td><c:out value="${product.productName }"/></td>
					<td><c:out value="${product.productCategory }"/></td>
					<td><c:out value="${product.productCondition }"/></td>
					<td><c:out value="${product.productPrice } INR"/></td>
					<td>
						<a href="<c:url value="/${product.productId}" />"> 
							 <span class="glyphicon glyphicon-info-sign"></span>
						</a>
						
						<a href="<c:url value="/deleteProduct/${product.productId}" />"> 
							 <span class="glyphicon glyphicon-remove"></span>
						</a>
						
					</td>
				</tr>
				</c:forEach>
			</table>
			
			<a href="<c:url value="/addProduct" />" class="btn btn-primary">Add Product</a>
			
     <%@include file="/WEB-INF/view/template/footer.jsp" %>