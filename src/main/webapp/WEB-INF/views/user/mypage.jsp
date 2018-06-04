<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>


<div>
	<div style="text-align: center;">
		<h3>My Page</h3>
	</div>
	<div style="padding: 30px;">
	<div>
		<div style="display: inline-block;">
			<h3>User ID:</h3>
		</div>
		<div style="display: inline-block;">
			<h4>${user.customid}</h4>
		</div>
	</div>
	<div>
		<div style="display: inline-block;">
			<h3>User Email:</h3>
		</div>
		<div style="display: inline-block;">
			<h4>${user.email}</h4>
		</div>
	</div>
	<div>		
		<div style="display: inline-block;">
			<h3>User Name:</h3>
		</div>
		<div style="display: inline-block;">
			<h4>${user.name}</h4>
		</div>
	</div>
	<div>		
		<div style="display: inline-block;">
			<h3>User PhoneNum:</h3>
		</div>
		<div style="display: inline-block;">
			<h4>${user.phoneNum}</h4>
		</div>
	</div>
	<div>		
		<div style="display: inline-block;">
			<h3>User JoinDate:</h3>
		</div>
		<div style="display: inline-block;">
			<h4>${user.joinDate}</h4>
		</div>
	</div>		
	</div>
</div>