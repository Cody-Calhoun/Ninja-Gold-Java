<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
	<h1>Your Gold <%= session.getAttribute("pouch") %>></h1>
	<div>
		<h4>Farm</h4>
		<form action="/process_money" method="Post">
			<input type="hidden" name="place" value="farm" />
			<button type="submit">Submit</button>
		</form>
		<h4>Cave</h4>
		<form action="/process_money" method="Post">
			<input type="hidden" name="place" value="cave" />
			<button type="submit">Submit</button>
		</form>
		<h4>House</h4>
		<form action="/process_money" method="Post">
			<input type="hidden" name="place" value="house" />
			<button type="submit">Submit</button>
		</form>
		<h4>Casino</h4>
		<form action="/process_money" method="Post">
			<input type="hidden" name="place" value="casino" />
			<button type="submit">Submit</button>
		</form>
		
		
	</div>


</div>


</body>
</html>