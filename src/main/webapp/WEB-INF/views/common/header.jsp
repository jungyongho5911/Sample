<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<nav class="navbar navbar-inverse">
	<form id="form_login" name="form_login">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">GOGO</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a id="a_structure" href="#">HISTORY</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">게시판 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a id="a_board" href="#">자유게시판</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
     <c:choose>
      	<c:when test="${user eq null}">
         	<li><a id="a_join"  href="#">회원가입</a></li> 
         	<li><a data-toggle="modal" data-target="#myModal" href="#">로그인</a></li>
      	</c:when>
	  	<c:otherwise>
	  	 <li><a href="#">로그아웃</a></li>
	  	</c:otherwise>
     </c:choose>
               
    </ul>
  </div>
  <div class="container">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Login</h4>
        </div>
        <div class="modal-body">
        	<div>
        		<h4>ID : </h4>
       		</div>
			<div>
				<input id="input_login" type="text" placeholder="id를 입력해주세요" name="input_login"/>
			</div>
			<div>
				<h4>PASS :</h4>
			</div>
			<div>
				<input id="input_password" type="password" placeholder="비밀번호를 입력해주세요" name="input_password"/>
			</div>
        </div>
        <div class="modal-footer">
          <button id="btn_login" type="submit" class="btn btn-default" data-dismiss="modal">Login</button>
          <button type="button" class="btn btn-default" data-dismiss="modal">close</button>
        </div>
      </div>     
    </div>
  </div>
</div>
</form>
</nav>
<script>
	$('#btn_login').on('click',function(){
		$('#form_login')
		.attr('action','${path.context}/user/mypage')
		.attr('method','post')
		.attr('enctype','multipart/form-data')
		.submit();
	})
	$('#a_join').on('click',function(){
		$('#form_login')
		.attr('action','${path.context}/user/join')
		.attr('method','GET')
		.attr('enctype','multipart/form-data')
		.submit();
	})
		$('#a_board').on('click',function(){
		$('#form_login')
		.attr('action','${path.context}/user/board1')
		.attr('method','GET')
		.attr('enctype','multipart/form-data')
		.submit();
	})

</script>