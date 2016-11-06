<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customers list</title>
<!-- reference css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
	<div id="header">
		<h2>CRM- Customer Relationship Manager</h2>
	</div>
</div>
<div id="container">
	<div id="content">
		<!-- add customer button -->
		<input type="button" value="Add customer" onclick="window.location.href='showFormForAdd'; return false;" class="add-button">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
			<!-- loop over customers list -->
			<c:forEach var="customer" items="${customers}">
			
				<!-- construct an "update" link with customer id -->
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				
				<!-- construct a "delete" link with customer id -->
				<c:url var="deleteLink" value="/customer/showFormForDelete">
					<c:param name="customerId" value="${customer.id}"></c:param>
				</c:url>
				
				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					<td>${customer.email}</td>
					<td>
						<a href="${updateLink}">Update</a>
						|
						<a href="${updateLink}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>