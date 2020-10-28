<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Floral Shop, Shopping Cart, Online Store</title>
<meta name="keywords" content="free template, shopping cart, floral, ecommerce, online, store" />
<meta name="description" content="Floral, Shopping Cart, free template for ecommerce websites." />
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
    //全选功能
function checkAll(){
    //获取到全选控件
    var all = document.getElementById("all");
    //获取到所有的鲜花的组件
    var choocies = document.getElementsByName("choose");
    //
    for (var i = 0; i < choocies.length; i++) {
        choocies[i].checked = all.checked;
    }
}
//加功能
    function jia(fid){
        //alert(jia)
        //获取某个鲜花购买数量
        var count = document.getElementById("count" + fid);

        //获取鲜花库存组件
        var c = document.getElementById("c"+fid);
        if (parseInt(count.value) >= parseInt(c.value)){
            //修改数量组件的value值
            count.value = c.value;
        }else{
            count.value = parseInt(count.value) + 1;
        }
        //计算当前数量的总价钱
        //获取到单价
        var price = document.getElementById("price"+fid);
        var sum = price.value * count.value;
        //总额的显示组件
        document.getElementById("sum"+fid).value = sum;

    }
    function jian(fid){
        //获取某个鲜花购买数量
        var count = document.getElementById("count" + fid);

        if (count.value > 1 ){
            count.value = parseInt(count.value) - 1;
        }else if(count.value == 1){
            count.value = 1 ;
        }
        //计算总价钱
        var price = document.getElementById("price"+fid);
        var sum = price.value * count.value;
        //显示到网页上
        document.getElementById("sum"+fid).value = sum;
    }
    function judge(){
        // alert("judee")
        //获取到所有的选择的组件
        var choices = document.getElementsByName("choose");
        //遍历组件，获取到所有选中的值
        var str = ""; //用来存储选择的value值，ID值！
        for (var i = 0; i < choices.length; i++) {
            if (choices[i].checked) //当选中的时候将value的值添加到
            str += choices[i].value;
        }
        if (str == null || str == ""){
            //表示没有选择任何内容
            alert("不可以空着提交！")
            return;
        }else{
            //获取到表单，并且提交表单
            var myform = document.getElementById("myform");
            myform.action = "SubmitCarServlet";
            myform.method = "post";
            myform.submit(); //提交表单
        }
    }
    function clearcart(){
     // alert("aaa");
        window.location.href = "ClearCartServlet";
    }
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


</head>

<body>

<div id="templatemo_wrapper_sp">
<div id="templatemo_header_wsp">
	<div id="templatemo_header" class="header_subpage">
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
        <a href="#" title="免费的图像"  class="site_repeat" ><img src="images/top_repeat.png" title="免费的图像"  /></a><!-- end of templatemo_menu -->

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
    	<h2>购物车</h2>
        ${result}
        <form  id = "myform">
		<table width="700" border="0" cellpadding="5" cellspacing="0">
          	<tr bgcolor="#395015">
                <th width="168" align="left"><input type="checkbox" onclick="checkAll()" id="all"/>全选</th>
                <th width="168" align="left">鲜花图片</th>
                <th width="188" align="left">鲜花名称</th>
                <th width="60" align="center">购买数量</th>
                <th width="80" align="right">单价</th>
                <th width="80" align="right">总价</th>
                <th width="64"> </th>
          	</tr>
            <c:forEach var="car" items="${cars}">
<%--               获取到库存--%>
                <input type="hidden" value="${car.flower.count}" id = "c${car.flower.fid}"/>
            <tr bgcolor="#41581B">
                <td><input checked type="checkbox" name="choose" value="${car.flower.fid}"/></td>
                <td><img src="${car.flower.pic}" alt="此处是鲜花图片" /></td>
                <td>${car.flower.flowername}</td>
                <td align="center"><input name="count${car.flower.fid}" type="text" id="count${car.flower.fid}" value="1" size="6" maxlength="5" />
                    <input type = "button" value="+" onclick="jia(${car.flower.fid})"/><input type="button" value="-" onclick="jian(${car.flower.fid})"/> </td>
                <td align="right">$<input type="text" value="${car.flower.price}" id="price${car.flower.fid}" disabled="false"/></td>
                <td align="right">$<input id="sum${car.flower.fid}" name="sum${car.flower.fid}" value="${car.flower.price}" ></input></td>
                <td align="center"> <a href="DeleteOneServlet?sid=${car.sid}"><img src="images/remove.png" alt="remove" /><br />删除</a> </td>
            </tr>
            </c:forEach>
<tr bgcolor="#41581B">
                <td colspan="3">Have you modified item quantities? Please <a href="shoppingcart.jsp"><strong>Update</strong></a> the Cart.&nbsp;&nbsp;</td>
                <td align="right"><h4>All Total:</h4></td>
                <td align="right"><h4>$560</h4></td>
                <td> </td>
            </tr>
            <input type="button" value="清空购物车" onclick="clearcart()" />
        </table>
		<div class="cleaner h20"></div>
        <div class="right"><input type="button" value="提交"  onclick="judge()"/> </div>
        </form>
        <div class="cleaner h20"></div>
        <div class="blank_box">
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