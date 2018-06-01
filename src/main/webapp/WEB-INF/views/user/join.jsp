<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<div style="text-align: center;" class="container">
<form id="form_user_join" name="form_user_join">
	<div style="margin-top: 20px;">
		<h4>ID : </h4>
	</div>
	<div>
		<input style="width: 250px; height: 50px;" name="input_join_id" type="text" placeholder="ID를 입력하세요" />
	</div>
	
	<div style="margin-top: 20px;">
		<h4>Pass : </h4>
	</div>
	<div >
		<input style="width: 250px; height: 50px;" type="password" name="input_join_pass" placeholder="Pass를 입력하세요" />
	</div>
	
	<div style="margin-top: 20px;">
		<h4>Email:</h4>
	</div>
	<div  style="display: inline-block;">
		<input style="width: 200px; height: 50px;" type="email" name="input_join_email" placeholder="Email를 입력하세요" />
	</div>
	<div style="display: inline-block;">
		<select style="width: 200px; height: 50px;" name="select_user_email" id="select_user_email">
			<option  value="@naver.com">@naver.com</option>
			<option  value="@daum.com">@daum.com</option>
			<option  value="@nate.com">@nate.com</option>
		</select>
	</div>
	
	<div style="margin-top: 20px;">
		<h4>PhoneNumber</h4>
	</div>
	<div style="display: inline-block;">
		<select style="width: 200px; height: 50px;" name="select_user_phoneNum" id="select_user_phoneNum">
			<option  value="선택">선택</option>
			<option  value="010">010</option>
			<option  value="011">011</option>
			<option  value="016">016</option>
			<option  value="019">019</option>
		</select>
	</div>
	<div style="display: inline-block;">
		<input style="width: 200px; height: 50px;" type="text" placeholder="*예:1234-1234" name="input_join_phoneNum" />
	</div>
	<div style="margin-top: 40px;">
		<button id="btn_join" style="background-color:black; color: white; font-size:20px; width: 150px; height: 50px;" type="button">회원가입</button>
		<button id="btn_join_close" style="background-color:black; color: white; font-size:20px; width: 150px; height: 50px;" type="button">취소</button></div>
</form>
</div>
<script>
	$('#btn_join').on('click',function(){
		$('#form_user_join')	
		.attr('action','${path.context}/user/join/insert')
		.attr('method','post')
		.attr('enctype','multipart/form-data') 
		.submit();
	})
</script>