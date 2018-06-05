<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<c:set var="context" value="<%=request.getContextPath()%>"></c:set>
 <script src="${context}/resources/js/board.js"></script> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css"></link>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-daterangepicker@2.1.30/daterangepicker.css"></link>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"></link>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap-daterangepicker@2.1.30/moment.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap-daterangepicker@2.1.30/daterangepicker.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="${context}/resources/js/jquery.cookie.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAMoS2m_FtvWU_2erB5C3r-VdM8NYbfsB4"></script>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<div>
	<div style="text-align: center;">
		<h2>자유게시판</h2>
	</div>
	<div>
		<div style="display: inline-block; width: 100px;">
			<h3>글번호</h3>
		</div>
		<div style="display: inline-block; width: 600px;">
			<h3>글제목</h3>
		</div>
		<div style="display: inline-block; width: 200px;">
			<h3>작성자</h3>
		</div>
		<div style="display: inline-block; width: 150px;">
			<h3>등록일</h3>
		</div>
	</div>
	<div>
		<div style="display: inline-block; width: 100px;">
			<h4>1</h4>
		</div>
		<div style="display: inline-block; width: 600px;">
			<h4>안녕하세요 질문있습니다</h4>
		</div>
		<div style="display: inline-block; width: 200px;">
			<h4>kim</h4>
		</div>
		<div style="display: inline-block; width: 150px;">
			<h4>2018-06-05</h4>
		</div>	
	</div>
</div>
 <script>
app.init('${context}')
</script>