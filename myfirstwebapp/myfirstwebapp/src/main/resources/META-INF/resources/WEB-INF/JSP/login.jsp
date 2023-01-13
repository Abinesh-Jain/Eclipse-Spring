<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
<title>LOGIN</title>
</head>
<body>
	<div class="container">
	Welcome to LOGIN!
	<pre>${errormessage}</pre>
	<form action="login" method="post">
		Username : <input type="text" name="name">
		Password : <input type="password" name="password">
		<input type="submit">
	</form>
	</div>
	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>
</html>