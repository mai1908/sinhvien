<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save </title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
	
		<form:form action="save" modelAttribute="customer" method="POST">

			<!-- need to associate this data with customer masv -->
			<form:hidden path="masv" />
					
			<table>
				<tbody>
					<tr>
						<td><label>hoten</label></td>
						<td><form:input path="hoten" /></td>
					</tr>
				
					<tr>
						<td><label>tenkhoa:</label></td>
						<td><form:input path="tenkhoa" /></td>
					</tr>

					<tr>
						<td><label>gioitinh:</label></td>
						<td><form:input path="gioitinh" /></td>
					</tr>

					<tr>
						<td><label>diemtin:</label></td>
						<td><form:input path="diemtin" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				 
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>