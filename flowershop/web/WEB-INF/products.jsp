<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Floral Shop, Products, Online Shopping</title>
<meta name="keywords" content="free template, floral shop, ecommerce, online shopping, store" />
<meta name="description" content="Floral Shop, Products, free website template for ecommerce shopping websites." />
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
		<h2>产品</h2>
        <p>漂亮的花</p>
  <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/01.jpg" alt="floral set 1" /></a>
      		<h3>Ut eu feugiat</h3>
            <p class="product_price">$240</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>        	
        <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/02.jpg" alt="flowers 2" /></a>
            <h3>Donec Est Nisi</h3>
          	<p class="product_price">$160</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>        	
        <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/03.jpg" alt="floral 3" /></a>
            <h3>Tristique Vitae</h3>
          <p class="product_price">$140</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>      	
        <div class="product_box no_margin_right">
            <a href="productdetail.jsp"><img src="images/product/04.jpg" alt="flowers 4" /></a>
            <h3>Hendrerit Eu</h3>
            <p class="product_price">$320</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>
        
        <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/05.jpg" alt="floral set 5" /></a>
            <h3>Tincidunt Nisi</h3>
          	<p class="product_price">$150</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>        	
        <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/07.jpg" alt="flowers 7" /></a>
            <h3>Curabitur et turpis</h3>
            <p class="product_price">$110</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>        	
        <div class="product_box">
            <a href="productdetail.jsp"><img src="images/product/06.jpg" alt="flower set 6" /></a>
            <h3>Mauris consectetur</h3>
            <p class="product_price">$130</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>        	
        <div class="product_box no_margin_right">
            <a href="productdetail.jsp"><img src="images/product/08.jpg" alt="floral 8" /></a>
            <h3>Proin volutpat</h3>
            <p class="product_price">$170</p>
            <p class="add_to_cart">
                <a href="productdetail.jsp">Detail</a>
                <a href="shoppingcart.jsp">Add to Cart</a>
            </p>
        </div>
        <div class="blank_box">
        	<a href="#" class="button left">Previous</a> 
            <a href="#" class="button right">Next Page</a>
        </div>
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