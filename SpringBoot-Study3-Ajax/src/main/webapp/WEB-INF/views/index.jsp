<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h4>SpringBoot Ajax Study</h4>
		<script type="text/javascript">
			$(function() {
				$("#AjaxBtn1").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax1",
						data : "userId=javaking",
						success : function(result) {
							alert(result);
						}
					});//ajax
				});//click
				$("#AjaxBtn2").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax2",
						dataType : "json",
						data : "customerId=javaking",
						success : function(customer) {
							alert(customer.id+" "+customer.address);
						}
					});//ajax
				});//click
				$("#AjaxBtn3").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax3",
						dataType : "json",
						data : "id=javaking",
						success : function(result) {
							for(let i=0; i<result.length; i++){
								alert(result[i]);
							}
						}
					});//ajax
				});//click
				$("#AjaxBtn4").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax4",
						dataType : "json", //응답받을때 - 내부적으로 jsonparse 
						data : "id=javaking", //data 는 서버로 파라미터 전달받을때 사용
						success : function(result) {
							for(let i=0; i<result.length; i++){
								alert(result[i].name+" "+result[i].address);
							}
						}
					});//ajax
				});//click
				$("#AjaxBtn5").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax5",
						dataType : "json",
						data : "id=javaking",
						success : function(result) {
							alert(result.CAR_NO+" "+result.MODEL);
						}
					});//ajax
				});//click
				$("#AjaxBtn6").click(function() {
					$.ajax({
						type : "get",
						url : "testAjax6",
						data : "name=javaking&address=판교",
						success : function(result) {
							alert(result);
						}
					});//ajax
				});//click
			});//ready
		</script>
		<%-- 문자열 데이터로 응답받는 ajax 테스트--%>
		<button type="button" id="AjaxBtn1">AjaxTest1</button>
		<br>
		<%-- JSONObject (dto or vo)로 응답받는 ajax 테스트 --%>
		<button type="button" id="AjaxBtn2">AjaxTest2</button>
		<br>
		<%-- JSONArray로 응답받는 ajax 테스트 --%>
		<button type="button" id="AjaxBtn3">AjaxTest3</button>
		<br>
		<%-- JSONArray(JSONOject)로 응답받는 ajax 테스트 --%>
		<button type="button" id="AjaxBtn4">AjaxTest4</button>
		<br>
		<%-- JSONOject(Map)로 응답받는 ajax 테스트 --%>
		<button type="button" id="AjaxBtn5">AjaxTest5</button>
		<br>
		<%-- 한글로된 일반문자열 데이터 응답받는 ajax 테스트 --%>
		<button type="button" id="AjaxBtn6">AjaxTest6</button>
		<br><br>
		<a href="employeeAjaxTestView">사원검색페이지</a>
		
	</div>
</body>
</html>