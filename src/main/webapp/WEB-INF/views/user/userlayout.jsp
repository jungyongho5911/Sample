<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home</title>
		<style>
	/* welcome */	
        .div-welcome-body{
			/* border: 1px solid black; */
			margin: 0 auto;
			font-size: 40px;
			text-align: center;
			margin-top: 150px;
			font-style: inherit;
		}
		.btn-welcome{
			width: 70px;
			height: 40px;
			margin: 0 auto;
			text-align: center;
			margin-top: 100px;
			margin-left: 756px;
		}
		
		
	/* welcomUpdate */
		.div-welUpdate-body{
			/* border: 1px solid black; */
			margin: 0 auto;
			font-size: 40px;
			text-align: center;
			margin-top: 150px;
			font-style: inherit;
		}
		.btn-welUpdate{
			width: 70px;
			height: 40px;
			margin: 0 auto;
			text-align: center;
			margin-top: 100px;
			margin-left: 756px;
		}
		
		
		
		
		
/* login (admin)*/	
		
		
		
		
		
	/* login */
		#tab-login-title{
			margin: 0 auto;
			margin-top: 60px;
		}
		#td-login-title{
			font-size: 40px;
		}
		#tab-login{
			border: 1px solid gray; 
			margin: 0 auto;	
			margin-top: 80px;	
		}
		#td-login-text{
			border: 1px solid gray;
			font-size: 12px;
		}
		#tab-login tr{
			border: 1px solid gray; 
			width: 320px;
			/* margin: 0 auto;	 */
			height: 50px;	
		}
		#tab-login tr td{
			border: 1px solid gray; 
			width: 320px;	
			/* margin: 0 auto;	 */
			height: 50px;
		}
		.int-login{
			width: 96%;
			height: 70%;	
		}
		#btn-login{
			width: 320px;
			height: 54px;
		}
		#a-login-searchPass{
			margin-bottom: 30px;
			font-size: 12px;
			border: 1px solid gray; 
		}
	
	.div-custMana-frame {
	  display: grid;
	  grid-template-columns: auto auto;
	  padding: 10px;
	  grid-gap: 10px;
	  background-color: #7b7b82;
	  height: 760px;
	  width: 91%;
	  margin: 0 auto;
	  font-size: 17px;
	}
	.div-custMana-frame > div {
	  background-color: rgb(222, 239, 239);
	  border: 1px solid black;
	  text-align: center; 
	  height: 100%;
	  line-height: 1.3;
	} 
	
		
	
	</style>
</head>
<body>

	<header>
		<div id ="header">
			<tiles:insertAttribute name="header"/>
		</div>
	</header>
		<article id="content">
			<tiles:insertAttribute name="content"/>
		</article>
	<div>
		<tiles:insertAttribute name="footer"/>		
	</div>	
</body>
</html>