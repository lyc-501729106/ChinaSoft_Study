<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<!-- Head -->
<head>

	<title>登录表单</title>

	<!-- Meta-Tags -->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- //Meta-Tags -->

	<!-- Style --> <link rel="stylesheet" href="css/style.css" type="text/css" media="all">



</head>
<!-- //Head -->

<!-- Body -->
<body>
	<h1>登录表单</h1>

	<div class="container w3layouts agileits">

		<div class="login w3layouts agileits">
			<h2>登 录</h2>
			${result}
			<form action="login.action?type=${type}" method="get">
				<input type="text" name="username" placeholder="用户名" required="">
				<input type="password" name="Password" placeholder="密码" required="">
				<select name="role">
					<option value="管理员">管理员</option>
					<option value="VIP">VIP</option>
					<option value="普通用户">普通用户</option>
				</select>
				<div class="send-button w3layouts agileits">
				<input type="submit" value="登 录">
				</div>
			</form>
			<ul class="tick w3layouts agileits">
				<li>
					<input type="checkbox" id="brand1" value="">
				</li>
			</ul>

			<a href="ShowFlowerServlet">返回主页</a>
			
			<div class="clear"></div>
		</div><div class="copyrights">Collect from <a href="" ></a></div>
		<div class="register w3layouts agileits">
			<h2>注 册</h2>
			<form action="#" method="post">
				<input type="text" Name="Name" placeholder="用户名" required="">
				<input type="text" Name="Email" placeholder="邮箱" required="">
				<input type="password" Name="Password" placeholder="密码" required="">
				<input type="text" Name="Phone Number" placeholder="手机号码" required="">
			</form>
			<div class="send-button w3layouts agileits">
				<form>
					<input type="submit" value="免费注册">
				</form>
			</div>
			<div class="clear"></div>
		</div>

		<div class="clear"></div>

	</div>

	

</body>
<!-- //Body -->

</html>