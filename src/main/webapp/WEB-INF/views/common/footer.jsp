<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>

<div style="background:black; margin-top: 100px;" class="jumbotron text-center">
	<h1 style="color:white;">MAC SHOP OPEN</h1>
	<form id="form_home" name="form_home">
	<button id="home_jsp_search" type="submit" style="background:black; color:white; width:100px; height:70px; font-size:30px;">click</button>
	</form>
</div>
<script>
	$('#home_jsp_search').on('click',function(){
		 $('#form_home')
		 	.attr('action','${path.context}/main/login')
			.attr('method','GET')
			.submit();
	})
</script>
