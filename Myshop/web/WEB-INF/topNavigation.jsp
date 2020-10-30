<%--
  Created by IntelliJ IDEA.
  User: 译辰哥哥
  Date: 2020/9/21
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="assets/js/jquery.min.js"></script>
    <script type="text/javascript">
        function exitLogin() {
            var msgSpan = document.getElementById("msgSpan");
            //jquery异步提交
            $.ajax({
                type: "GET",
                url: "ExitLoginServlet",
                success: function(msg){
                    if(msg == 1){
                        url:"main.jsp"
                    }
                }
            });

        }
    </script>
</head>
<body>
<ul>
    <li><a href="main.jsp">主页</a></li>
    <li><a href="ShowAllServlet">左侧商店</a></li>
    <li><a href="single-product.jsp">单一商品</a></li>
    <c:if test="${tuser == null}">
    <li><a href="login-register.jsp">登录 注册</a></li>
    </c:if>
    <c:if test="${tuser != null}">
    <li><a href="ExitLoginServlet" >退出登录</a></li>
    </c:if>

</ul>
</body>
</html>
