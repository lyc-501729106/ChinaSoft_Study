<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.etc.flower.service.UserService" %>
<%@ page import="com.etc.flower.serviceImpl.UserServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Floral Shop, Check Out, Web Store</title>
<meta name="keywords" content="free template, floral shop, ecommerce, online shopping, store" />
<meta name="description" content="Floral Shop, Check Out, free template for ecommerce websites." />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="css/orman.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />

<link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddsmoothmenu.js">

/***********************************************
* Smooth Navigational Menu- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code
***********************************************/

</script>

<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "templatemo_menu", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]

})

function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
function clearAll() {
    // alert("clehfgh");
    document.getElementById("phone").value = '';
    document.getElementById("email").value = '';
    document.getElementById("country").value = '';
    document.getElementById("city").value = '';
    document.getElementById("address").value = '';
    document.getElementById("aaid").value = '';
}
function submitAddress() {
    // alert("aa")
    var myform = document.getElementById("myform");
    myform.action = "AddAddressServlet";
    myform.method = "post";
    myform.submit(); //提交表单
}
function updataAddress() {
    // alert("aa")
    var myform = document.getElementById("myform");
    myform.action = "UpdateAddressServlet";
    myform.method = "post";
    myform.submit(); //提交表单
}

function morenAddress() {
    var myform = document.getElementById("myform");
    myform.action = "UpdateAddressServlet";
    myform.method = "get";
    myform.submit();
}
function cityjiaoyan() {
    var msgSpan = document.getElementById("msgSpan");
    var city = document.getElementById("city");
    //jquery异步提交
    $.ajax({
        type: "POST",
        url: "TestAJAXServlet",
        data: "city=" + city.value,
        success: function(msg){
            if(msg == 1){
                msgSpan.innerHTML = "有该地址...";
            }else if (msg == 0){
                msgSpan.innerHTML = "城市表里没有该地址...";
            }else {
                msgSpan.innerHTML = "城市为空...";
            }
        }
    });

}

</script>

</head>

<body>

<div id="templatemo_wrapper_sp">
<div id="templatemo_header_wsp">
	<div id="templatemo_header" class="header_subpage">
    	<div id="site_title"><a href="#" title=""></a></div>
        <div id="templatemo_menu" class="ddsmoothmenu">
            <jsp:include page="head.jsp"></jsp:include>
            <div id="templatemo_search">
                <form action="#" method="get">
                  	<input type="text" value="查找" name="keyword" id="keyword" title="keyword" 
                  			onfocus="clearText(this)" onblur="clearText(this)" class="txt_field" />
                  	<input type="submit" name="Search" value="" alt="Search" id="searchbutton" title="Search" class="sub_btn" />
                </form>
            </div>
            <br style="clear: left" />
        </div> 
        <a href="#" title=""  class="site_repeat" target="_blank"><img src="images/top_repeat.png" title=""  /></a><!-- end of templatemo_menu -->

    </div> <!-- END of header -->
</div> <!-- END of header wrapper -->
<div id="templatemo_main_wrapper">
<div id="templatemo_main">
	<div id="sidebar" class="left">
    	<div class="sidebar_box"><span class="bottom"></span>
            <h3>种类</h3>   
            <div class="content"> 
                <ul class="sidebar_list">
                    <li><a href="#">玫瑰</a></li>
                    <li><a href="#">康乃馨</a></li>
                    <li><a href="#">百合</a></li>
                    <li><a href="#">满天星</a></li>
                    <li><a href="#">茉莉花</a></li>
                    <li><a href="#">薰衣草</a></li>
                    <li><a href="#">海棠</a></li>
                    <li><a href="#">月季</a></li>
                    <li><a href="#">花篮装饰</a></li>
                </ul>
            </div>
        </div>
        <div class="sidebar_box"><span class="bottom"></span>
            <h3>每周特价</h3>   
            <div class="content special"> 
                <img src="images/templatemo_image_01.jpg" alt="Flowers" />
                <a href="#">Citrus Burst Bouquet</a>
                <p>
                	Price:
                    <span class="price normal_price">$160</span>&nbsp;&nbsp;
                    <span class="price special_price">$100</span>
                </p>
            </div>
        </div>
    </div>
    
    <div id="content" class="right">
    	<h2>结账</h2>
        <form action="AllAddressServlet" method="post" >
            <input type="submit" value="所有地址" />
        </form>
        <input type="button" value="提交修改地址" onclick="updataAddress()"/>
        <input type="button" value="设为默认地址" onclick="morenAddress()"/>
        <c:forEach var="addr" items="${addressList}">
            <a href="OneAddressServlet?aid=${addr.aid}">
                <input type="button" value="地址${addr.aid}" id="${addr.aid}" />
            </a>
        </c:forEach>

		<h3>账单详情</h3>
<%--        <form action="CheckoutServlet" id="" method="post">--%>
        <form id="myform" action="checkout.action" method="post">
<%--        <form id="myform" >--%>
            <div class="content_half left form_field">
				<p>姓名</p>
                <input value="${tuser.uname}" name="fullname" type="text" id="fullname" maxlength="40" disabled="false"/>
                <input value="${address.aid}${onaddre.aid}" name="aaid" type="hidden" id="aaid" />
                <p>地址${address.aid}${onaddre.aid}</p>
      			<input value="${address.address}${onaddre.address}" name="address" type="text" id="address" maxlength="40" />
                <p>城市</p>
                <input value="${address.city}${onaddre.city}" name="city" type="text" id="city" maxlength="40" onkeyup="cityjiaoyan()"/>
                <p style="color:red;font-size:8px;" id="msgSpan"></p>
                <p>国家</p>
                <input value="${address.country}${onaddre.country}" name="country" type="text" id="country" maxlength="40" />
            </div>
            
            <div class="content_half right form_field">
            	<p>电子邮件</p>
			  <input value="${address.email}${onaddre.email}" name="email" type="text" id="email" maxlength="40" />
                <p>电话:</p>
                <input value="${address.phone}${onaddre.phone}" name="phone" type="text" id="phone" maxlength="40" />
                <span>指定您的可达电话号码，以便打电话给您进行验证。</span>
            </div>
<%--        </form>--%>
            <div class="cleaner h40"></div>
            
            <h3>购物卡</h3>
            <input type="button" value="清除各项" onclick="clearAll()"/>
            <input type="button" value="提交添加地址" onclick="submitAddress()"/>
            ${msg}
            ${msg1}
            ${msg2}
            <h4>共计: <strong>$${sum}</strong></h4>
            <input type="submit" value="结算"/>
        </form>
			<p><input name="terms" type="checkbox" id="terms" />
		            我已经阅读并接受了<a href="#">使用条款</a></p>
            
        	<a href="#"><img src="images/free_shipping.jpg" alt="Free Shipping" /></a>
        	</div>    
        
    </div>
    
    <div class="cleaner"></div>
</div> <!-- END of main -->
</div> <!-- END of main wrapper -->


</div>

</body>
<script type='text/javascript' src='js/logging.js'></script>
</html>