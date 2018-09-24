<%@ page isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/view/template/header.jsp" %>

    <div class="container-wrapper">
    	<div class="container">
    		<div class="page-header">
    			<h1>All Products</h1>
    			<p class="lead">Checkout all the awesome products available now</p>
    		</div>
			
			<div class="container">
				<div class="row">
					<div class="col-md-5">
						<img alt="image" src="#" style="width:100%;height:300px;">
					</div class="col-md-5">
						<h3>${product.productName }</h3>
						<p>${product.productDescription }</p>
						<p>
							<strong>Manufacture</strong>${product.productManufacture }
						</p>
						<p>
							<strong>Category</strong>${product.productCategory }
						</p>
						<p>
							<strong>Condition</strong>${product.productCondition }
						</p>
						<h4>${product.productPrice } INR</h4>
					<div>
						
					</div>
				</div>
				
			</div>
     <%@include file="/WEB-INF/view/template/footer.jsp" %>