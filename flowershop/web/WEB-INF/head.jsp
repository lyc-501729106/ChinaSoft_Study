<%--
  Created by IntelliJ IDEA.
  User: 译辰哥哥
  Date: 2020/9/21
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <li><a href="ShowFlowerServlet" class="selected">主页</a></li>
    <c:if test="${tuser == null}">
    <li><a href="login.jsp">登录注册</a></li>
    </c:if>
    <li><a href="products.jsp">产品</a></li>
    <li><a href="checkout.jsp">结账</a></li>

    <li><a href="shoppingcart.jsp">购物车</a> </li>

    <c:if test="${tuser.role == '管理员'}">
    <li><a href="back.jsp">后台</a></li>
    </c:if>
    <li><a href="contact.html">关于我们</a></li>
    <li><a href="faqs.html">常见问题</a></li>
    <c:if test="${tuser != null}">
        <li><a href="ExitLogin">注销登录</a></li>
    </c:if>
</ul>
</body>
</html>
