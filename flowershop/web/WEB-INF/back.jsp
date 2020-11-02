<%@ page import="com.etc.flower.service.UserService" %>
<%@ page import="com.etc.flower.serviceImpl.UserServiceImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.etc.flower.entity.Flower" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--因为想要使用c标签，所以需要在此使用标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Floral Shop, Ecommerce, Online Shopping, Web Store</title>
    <meta name="keywords" content="free template, floral shop, ecommerce, online shopping, store" />
    <meta name="description" content="Floral Shop is free website template for ecommerce or online shopping websites. Products, Shopping Cart, FAQs and Checkout pages are included." />
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

    </script>

    <link rel="stylesheet" href="css/slimbox2.css" type="text/css" media="screen" />
    <script type="text/JavaScript" src="js/slimbox2.js"></script>


</head>

<body>

<div id="templatemo_wrapper_h">
    <div id="templatemo_header_wh">
        <div id="templatemo_header" class="header_home">
            <div id="site_title"><a href="" title=""></a></div>
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
            <a href="#" title="visit "  class="site_repeat" target="_blank"><img src="images/top_repeat.png"  alt="visit " /></a><!-- end of templatemo_menu -->

            <div class="slider-wrapper theme-orman">
                <div class="ribbon"></div>
                <div id="slider" class="nivoSlider">
                    <img src="images/portfolio/01.jpg" alt="slider image 1" />
                    <img src="images/portfolio/02.jpg" alt="slider image 2" />
                    <img src="images/portfolio/03.jpg" alt="slider image 3" />
                    <img src="images/portfolio/04.jpg" alt="slider image 4"  />
                    <img src="images/portfolio/05.jpg" alt="slider image 5"  />
                </div>

            </div>
            <script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
            <script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
            <script type="text/javascript">
                $(window).load(function() {
                    $('#slider').nivoSlider({
                        controlNav:false
                    });
                });
            </script>
        </div> <!-- END of header -->
    </div> <!-- END of header wrapper -->

    <div align="center">
        <form action="MoreServlet" method="post">
            用户名<input type="text" name="uname"/>
            起始日期<input type="date" name="start"/>
            结束日期<input type="date" name="end"/>
            <input type="submit" value="提交"/>
        </form>
    </div>
    <div align="center">
        <table border="1">
            <tr>
<%--                page 当前页 --%>
                <c:if test="${page1>1}">
                    <a href="more.action?page1=${up1}">上一页</a>
                </c:if>
                <td>用户名</td>
                <td>购买日期</td>
                <td>支付总额</td>

                <c:if test="${page1<allpage1}">
                    <a href="MoreServlet?page1=${down1}">下一页</a>
                </c:if>
            </tr>
            <c:forEach items="${forder}" var="f">
                <tr>
                    <td><input type="text" value="${f.tuser.tuserid}"/></td>
                    <td><input type="text" value="${f.orderdate}"/></td>
                    <td><input type="text" value="${f.sum}"/></td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <!-- END of main wrapper -->
<%--    添加鲜花信息需要有图片的上传，所以需要将当前提交按照上传的要求进行设置--%>
    <div align="center">
        <form action="upload.action" method="post" enctype="multipart/form-data">
<%--            enctype="multipart/form-data" 将文件以二进制的形式上传  --%>
<%--            默认情况下，enctype的值是application/x-www-form-urlencoded，不能用于文件上传--%>
            <table border="1" align="center">
                <tr>
                    <td>鲜花名称</td>
                    <td><input type="text" name="fname"/></td>
                </tr>
                <tr>
                    <td>鲜花类型</td>
                    <td><input type="text" name="ftype"/></td>
                </tr>
                <tr>
                    <td>鲜花单价</td>
                    <td><input type="text" name="price"/></td>
                </tr>
                <tr>
                    <td>鲜花数量</td>
                    <td><input type="text" name="count"/></td>
                </tr>
            </table>
            <input type="file" name="pic"/>
            <input type="submit" value="提交"/>
        </form>
    </div>


</div>

</body>
<script type='text/javascript' src='js/logging.js'></script>
</html>