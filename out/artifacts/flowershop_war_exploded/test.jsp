<%--
  Created by IntelliJ IDEA.
  User: 译辰哥哥
  Date: 2020/9/18
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%-- <%@ %>  此乃编译指令--%>
<%-- <jsp:include page="head.jsp"></jsp:include> 此乃动作指令--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function test() {
            location.href = "tuserServ";

        }

        var xmlhttp

        function judge(url)
        {
            xmlhttp=null
            var uname = document.getElementById("uname")

// 针对 Mozilla等浏览器的代码：
            if (window.XMLHttpRequest)
            {
                xmlhttp=new XMLHttpRequest()
            }

// 针对 IE 的代码：
            else if (window.ActiveXObject)
            {
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP")
            }
            if (xmlhttp!=null)
            {
                //规定好回调函数：即如下的回调函数名称为state_Change
                xmlhttp.onreadystatechange=state_Change
                xmlhttp.open("GET","JudgeServlet?uname="+uname.value,true)
                xmlhttp.send(null)
            }
            else
            {
                alert("您的浏览器不支持XMLHTTP")
            }
        }

        function state_Change()
        {
            var myspan = document.getElementById("myspan")
// 如果 xmlhttp 显示为 "loaded"
            if (xmlhttp.readyState==4)
            {
                // 如果为 "OK"
                if (xmlhttp.status==200)
                {
                    // 其他代码...
                    myspan.innerHTML = xmlhttp.responseText
                }
                else
                {
                    alert("Problem retrieving XML data")
                }
            }
        }

    </script>
</head>
<body>
    <%
        config.getInitParameter("");//此值调用getInitParameter方法调用的是
    %>
    <%
        session.setAttribute("state","很精神");
        session.setAttribute("state","很疲惫");
        session.removeAttribute("state");
        session.setAttribute("state","满血复活");
        request.setAttribute("state","用request试试");
    %>
    <font color="<%=config.getInitParameter("color")%>">asdfdasf</font>
<%--超链接跳到doget方法--%>
<a href="tuserServ">测试</a>
<%="测试一下"%>
<% String result = (String)request.getAttribute("result");%>
<%=result%>
<% session.getAttribute("tuser");
    System.out.println("我就是测一测");%>
<%--脚本跳到doget方法--%>
<input type="button" value="测试2" onclick="test()"/>

<form action="tuserServ" method="get">
    <input type="text" value="aaaa" name="name">
    <input type="text" value="bbbb" name="pwd">
    <div class="send-button w3layouts agileits">
        <input type="submit" value="登 录get">
    </div>
</form>
<%session.setAttribute("tt","t");%>
<form action="testServlet" method="post">
    <input type="checkbox" name="hobby" value="游戏"/>游戏
    <input type="checkbox" name="hobby" value="喝水"/>喝水
    <input type="checkbox" name="hobby" value="走路"/>走路
    <div class="send-button w3layouts agileits">
        <input type="submit" value="testServlet登 录post">
    </div>
</form>
<form>
    <input id="uname" value="" onkeyup="judge()">
    <span id="myspan"></span>
</form>
</body>
</html>
