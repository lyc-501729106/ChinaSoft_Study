<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Login & Register</title>
    <meta name="robots" content="noindex, follow" />
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Favicon -->
    

    <!-- CSS
	============================================ -->

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">
    <!-- Fontawesome -->
    <link rel="stylesheet" href="assets/css/vendor/font-awesome.css">
    <!-- Fontawesome Star -->
    <link rel="stylesheet" href="assets/css/vendor/fontawesome-stars.css">
    <!-- Ion Icon -->
    <link rel="stylesheet" href="assets/css/vendor/ion-fonts.css">
    <!-- Slick CSS -->
    <link rel="stylesheet" href="assets/css/plugins/slick.css">
    <!-- Animation -->
    <link rel="stylesheet" href="assets/css/plugins/animate.css">
    <!-- jQuery Ui -->
    <link rel="stylesheet" href="assets/css/plugins/jquery-ui.min.css">
    <!-- Venobox.css -->
    <link rel="stylesheet" href="assets/css/plugins/venobox.css">
    <!-- Nice Select -->
    <link rel="stylesheet" href="assets/css/plugins/nice-select.css">

    <!-- Vendor & Plugins CSS (Please remove the comment from below vendor.min.css & plugins.min.css for better website load performance and remove css files from the above) -->
    <!--
    <link rel="stylesheet" href="assets/css/vendor/vendor.min.css">
    <link rel="stylesheet" href="assets/css/plugins/plugins.min.css">
    -->

    <!-- Main Style CSS (Please use minify version for better website load performance) -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!--<link rel="stylesheet" href="assets/css/style.min.css">-->

</head>

<body class="template-color-1">

    <div class="main-wrapper">

        <!-- Begin Loading Area -->
        <div class="loading">
            <div class="text-center middle">
                <span class="loader">
            <span class="loader-inner"></span>
                </span>
            </div>
        </div>
        <!-- Loading Area End Here -->

        <!-- Begin Umino's Header Main Area -->
        <header class="header-main_area">
            <div class="header-top_area">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-5 col-lg-5">
                            <div class="ht-left_area">
                                <div class="header-shipping_area">
                                    <span>Free Shipping for all orders of<strong>$200</strong></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-7 col-lg-7">
                            <div class="ht-right_area">
                                <div class="ht-menu">
                                    <ul>
                                        <li><a href="#">My Account</a></li>
                                        <li><a href="cart.jsp">Cart</a></li>
                                        <li><a href="#">Wishlist</a></li>
                                        <li><a href="#">Checkout</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-middle_area">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-3 col-lg-2">
                            <div class="header-logo">
                                <a href="main.jsp">
                                    <img src="assets/images/menu/logo/1.png" alt="Umino's Header Logo">
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 d-none d-lg-block">
                            <div class="contact-info">
                                <div class="contact-info_icon">
                                    <i class="ion-android-call"></i>
                                </div>
                                <div class="contact-info_content">
                                    <span>需要帮助?</span>
                                    <a href="tel://+123123321345/">(+123) 123 321 345</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 d-none d-lg-block">
                            <div class="hm-form_area">
                                <form action="#" class="hm-searchbox">
                                    <input type="text" placeholder="Search product...">
                                    <button class="umino-search_btn" type="submit"><i class="ion-android-search"></i></button>
                                </form>
                            </div>
                        </div>
                        <div class="col-xl-2 col-lg-3 d-none d-lg-block">
                            <div class="hm-minicart_area">
                                <ul>
                                    <li>
                                        <a href="cart.jsp">
                                            <div class="minicart-icon wishlist-icon">
                                                <i class="ion-ios-heart-outline"></i>
                                                <span class="item-count">2</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="cart.jsp">
                                            <div class="minicart-icon">
                                                <i class="ion-bag"></i>
                                                <span class="item-count">2</span>
                                            </div>
                                            <div class="minicart-title">
                                                <span class="item_total">$54.90</span>
                                            </div>
                                        </a>
                                        <ul class="minicart-body">
                                            <li class="minicart-item_area">
                                                <div class="minicart-single_item">
                                                    <div class="product-item_remove">
                                                        <span class="ion-android-close" title="Remove This Item"></span>
                                                    </div>
                                                    <div class="minicart-img">
                                                        <a href="single-product.jsp">
                                                            <img src="assets/images/product/small-size/6.jpg" alt="Umino's Product Image">
                                                        </a>
                                                    </div>
                                                    <div class="minicart-content">
                                                        <div class="product-name">
                                                            <h6>
                                                                <a href="single-product.jsp">
                                                                    Vulputate justo
                                                                </a>
                                                            </h6>
                                                        </div>
                                                        <span class="product-quantity">Qty 1</span>
                                                        <div class="price-box">
                                                            <span class="new-price">$90.00</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li class="minicart-item_area">
                                                <div class="minicart-single_item">
                                                    <div class="product-item_remove">
                                                        <span class="ion-android-close" title="Remove This Item"></span>
                                                    </div>
                                                    <div class="minicart-img">
                                                        <a href="single-product.jsp">
                                                            <img src="assets/images/product/small-size/8.jpg" alt="Umino's Product Image">
                                                        </a>
                                                    </div>
                                                    <div class="minicart-content">
                                                        <div class="product-name">
                                                            <h6>
                                                                <a href="single-product.jsp">
                                                                    Phasellus vel hendrerit
                                                                </a>
                                                            </h6>
                                                        </div>
                                                        <span class="product-quantity">Qty 1</span>
                                                        <div class="price-box">
                                                            <span class="new-price">$55.00</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price_content">
                                                    <div class="cart-subtotals">
                                                        <div class="products subtotal-list">
                                                            <span class="label">Subtotal</span>
                                                            <span class="value">$145.00</span>
                                                        </div>
                                                        <div class="shipping subtotal-list">
                                                            <span class="label">Shipping</span>
                                                            <span class="value">$7.00</span>
                                                        </div>
                                                        <div class="tax subtotal-list">
                                                            <span class="label">Taxes</span>
                                                            <span class="value">$0.00</span>
                                                        </div>
                                                        <div class="cart-total subtotal-list">
                                                            <span class="label">Total</span>
                                                            <span class="value">$152.00</span>
                                                        </div>
                                                    </div>
                                                    <div class="minicart-button">
                                                        <a class="umino-btn umino-btn_fullwidth" href="#">Checkout</a>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom_area @@bgColor">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-9 col-sm-7">
                            <div class="category-menu category-menu-hidden">
                                <div class="category-heading">
                                    <h2 class="categories-toggle"><span>All Department</span></h2>
                                </div>
                                <div id="cate-toggle" class="category-menu-list">
                                    <ul>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Bed & Bath</a>
                                            <ul class="cat-mega-menu">
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Habitant Morbi</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Habitant Morbi</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Office chair</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Purus Lacus</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Sagittis Blandit</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Purus Lacus</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Magna Pellentesq</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Molestie Tortor</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Vehicula Element</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Volutpat Diam</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Office chair</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Bibendum Cursus</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Dignissim Turpis</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Dining room</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Egestas Ultricies</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Furniture</a>
                                            <ul class="cat-mega-menu cat-mega-menu-2">
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Cameras</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Cords and Cables</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">gps accessories</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Microphones</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Wireless Transmitters</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Audio</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Other Accessories</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Portable Audio</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Satellite Radio</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Visual Accessories</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Cell Phones</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Xail</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Chamcham Galaxy</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">SIM Cards</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Prepaid Cell Phones</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">TV & Video</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">4K Ultra HDTVs</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">All TVs</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Refurbished TVs</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">TV Accessories</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Home Decor</a>
                                            <ul class="cat-mega-menu cat-mega-menu-3">
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Sagittis Blandit</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">adipiscing elit</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">consectetur adip</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">erat et est</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">molestie velit</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Accessories</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Habitant Morbi</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Office chair</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Purus Lacus</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Sagittis Blandit</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Kitchen & Dining</a>
                                            <ul class="cat-mega-menu">
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Accessories</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Habitant Morbi</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Office chair</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Purus Lacus</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Sagittis Blandit</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Purus Lacus</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Magna Pellentesq</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Molestie Tortor</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Vehicula Element</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Volutpat Diam</a></li>
                                                    </ul>
                                                </li>
                                                <li class="right-menu cat-mega-title">
                                                    <a href="shop-left-sidebar.jsp">Office chair</a>
                                                    <ul>
                                                        <li><a href="shop-left-sidebar.jsp">Bibendum Cursus</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Dignissim Turpis</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Dining room</a></li>
                                                        <li><a href="shop-left-sidebar.jsp">Egestas Ultricies</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Console Tables</a>
                                            <ul class="cat-dropdown_menu">
                                                <li>
                                                    <a href="shop-left-sidebar.jsp">Daylesford</a>
                                                    <a href="shop-left-sidebar.jsp">Delaware</a>
                                                    <a href="shop-left-sidebar.jsp">Fayence</a>
                                                    <a href="shop-left-sidebar.jsp">Franzea</a>
                                                    <a href="shop-left-sidebar.jsp">Mable</a>
                                                    <a href="shop-left-sidebar.jsp">Mobo</a>
                                                    <a href="shop-left-sidebar.jsp">Pippins</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="right-menu"><a href="shop-left-sidebar.jsp">Living Room Sets</a>
                                            <ul class="cat-dropdown_menu cat-dropdown_menu-2">
                                                <li>
                                                    <a href="shop-left-sidebar.jsp">Coffee & side tables</a>
                                                    <a href="shop-left-sidebar.jsp">Living room lighting</a>
                                                    <a href="shop-left-sidebar.jsp">Living room storage</a>
                                                    <a href="shop-left-sidebar.jsp">Living room textiles & rugs</a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li><a href="shop-left-sidebar.jsp">TV Stands</a></li>
                                        <li><a href="shop-left-sidebar.jsp">Bedroom</a></li>
                                        <li><a href="shop-left-sidebar.jsp">Dining Tables</a></li>
                                        <li><a href="shop-left-sidebar.jsp">End Tables</a></li>
                                        <li class="rx-child"><a href="shop-left-sidebar.jsp">Uncategorized</a></li>
                                        <li class="rx-child"><a href="shop-left-sidebar.jsp">Shoe Organizers</a></li>
                                        <li class="rx-parent">
                                            <a class="rx-default">More Categories</a>
                                            <a class="rx-show">Collapse</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-7 d-none d-lg-block position-static">
                            <div class="main-menu_area">
                                <nav class="main_nav">
                                    <jsp:include page="topNavigation.jsp"></jsp:include>
                                </nav>
                            </div>
                        </div>
                        <div class="col-lg-2 d-none d-lg-block">
                            <div class="login-area">
                                ${tuser.uname}
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-5 d-block d-lg-none">
                            <div class="mobile-menu_area">
                                <ul>
                                    <li class="minicart-area">
                                        <a href="cart.jsp"><i class="fa fa-shopping-cart"></i><span class="item-count">2</span></a>
                                    </li>
                                    <li>
                                        <a href="#mobileMenu" class="mobile-menu_btn toolbar-btn color--white d-lg-none d-block">
                                            <i class="ion-navicon"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom_area header-sticky stick">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-2 col-md-6 col-sm-7">
                            <div class="header-logo">
                                <a href="main.jsp">
                                    <img src="assets/images/menu/logo/1.png" alt="Umino's Header Logo">
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-8 col-lg-7 d-none d-lg-block position-static">
                            <div class="main-menu_area">
                                <nav class="main_nav">
                                    <jsp:include page="topNavigation.jsp"></jsp:include>
                                </nav>
                            </div>
                        </div>
                        <div class="col-xl-2 col-lg-3 d-none d-lg-block">
                            <div class="hm-minicart_area">
                                <ul>
                                    <li>
                                        <a href="cart.jsp">
                                            <div class="minicart-icon wishlist-icon">
                                                <i class="ion-ios-heart-outline"></i>
                                                <span class="item-count">2</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="cart.jsp">
                                            <div class="minicart-icon">
                                                <i class="ion-bag"></i>
                                                <span class="item-count">2</span>
                                            </div>
                                            <div class="minicart-title">
                                                <span class="item_total">$54.90</span>
                                            </div>
                                        </a>
                                        <ul class="minicart-body">
                                            <li class="minicart-item_area">
                                                <div class="minicart-single_item">
                                                    <div class="product-item_remove">
                                                        <span class="ion-android-close" title="Remove This Item"></span>
                                                    </div>
                                                    <div class="minicart-img">
                                                        <a href="single-product.jsp">
                                                            <img src="assets/images/product/small-size/6.jpg" alt="Umino's Product Image">
                                                        </a>
                                                    </div>
                                                    <div class="minicart-content">
                                                        <div class="product-name">
                                                            <h6>
                                                                <a href="single-product.jsp">
                                                                    Vulputate justo
                                                                </a>
                                                            </h6>
                                                        </div>
                                                        <span class="product-quantity">Qty 1</span>
                                                        <div class="price-box">
                                                            <span class="new-price">$90.00</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li class="minicart-item_area">
                                                <div class="minicart-single_item">
                                                    <div class="product-item_remove">
                                                        <span class="ion-android-close" title="Remove This Item"></span>
                                                    </div>
                                                    <div class="minicart-img">
                                                        <a href="single-product.jsp">
                                                            <img src="assets/images/product/small-size/8.jpg" alt="Umino's Product Image">
                                                        </a>
                                                    </div>
                                                    <div class="minicart-content">
                                                        <div class="product-name">
                                                            <h6>
                                                                <a href="single-product.jsp">
                                                                    Phasellus vel hendrerit
                                                                </a>
                                                            </h6>
                                                        </div>
                                                        <span class="product-quantity">Qty 1</span>
                                                        <div class="price-box">
                                                            <span class="new-price">$55.00</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="price_content">
                                                    <div class="cart-subtotals">
                                                        <div class="products subtotal-list">
                                                            <span class="label">Subtotal</span>
                                                            <span class="value">$145.00</span>
                                                        </div>
                                                        <div class="shipping subtotal-list">
                                                            <span class="label">Shipping</span>
                                                            <span class="value">$7.00</span>
                                                        </div>
                                                        <div class="tax subtotal-list">
                                                            <span class="label">Taxes</span>
                                                            <span class="value">$0.00</span>
                                                        </div>
                                                        <div class="cart-total subtotal-list">
                                                            <span class="label">Total</span>
                                                            <span class="value">$152.00</span>
                                                        </div>
                                                    </div>
                                                    <div class="minicart-button">
                                                        <a class="umino-btn umino-btn_fullwidth" href="#">Checkout</a>
                                                    </div>
                                                </div>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-6 col-sm-5 d-block d-lg-none">
                            <div class="mobile-menu_area">
                                <ul>
                                    <li class="minicart-area">
                                        <a href="cart.jsp"><i class="fa fa-shopping-cart"></i><span class="item-count">2</span></a>
                                    </li>
                                    <li>
                                        <a href="#mobileMenu" class="mobile-menu_btn toolbar-btn color--white d-lg-none d-block">
                                            <i class="ion-navicon"></i>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="mobile-menu_wrapper" id="mobileMenu">
                <div class="offcanvas-menu-inner">
                    <div class="container">
                        <a href="#" class="btn-close"><i class="ion-android-close"></i></a>
                        <div class="offcanvas-inner_search">
                            <form action="#" class="hm-searchbox">
                                <input type="text" placeholder="Search for item...">
                                <button class="search_btn" type="submit"><i class="ion-ios-search-strong"></i></button>
                            </form>
                        </div>
                        <nav class="offcanvas-navigation">
                            <ul class="mobile-menu">
                                <li class="menu-item-has-children active"><a href="main.jsp"><span
                                        class="mm-text">Home</span></a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="main.jsp">
                                                <span class="mm-text">Home Shop 1</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="index-2.html">
                                                <span class="mm-text">Home Shop 2</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="index-3.html">
                                                <span class="mm-text">Home Shop 3</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="index-4.html">
                                                <span class="mm-text">Home Shop 4</span>
                                            </a>
                                        </li>
                                        <li>
                                    </ul>
                                </li>
                                <li class="menu-item-has-children">
                                    <a href="shop-left-sidebar.jsp">
                                        <span class="mm-text">Shop</span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li class="menu-item-has-children">
                                            <a href="shop-left-sidebar.jsp">
                                                <span class="mm-text">Grid View</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="shop-3-column.html">
                                                        <span class="mm-text">Grid Fullwidth</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="shop-left-sidebar.jsp">
                                                        <span class="mm-text">Left Sidebar</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="shop-right-sidebar.html">
                                                        <span class="mm-text">Right Sidebar</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="shop-list-left-sidebar.html">
                                                <span class="mm-text">Shop List</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="shop-list-fullwidth.html">
                                                        <span class="mm-text">Full Width</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="shop-list-left-sidebar.html">
                                                        <span class="mm-text">Left Sidebar</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="shop-list-right-sidebar.html">
                                                        <span class="mm-text">Right Sidebar</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="single-product-gallery-left.html">
                                                <span class="mm-text">Single Product Style</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="single-product-gallery-left.html">
                                                        <span class="mm-text">Gallery Left</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-gallery-right.html">
                                                        <span class="mm-text">Gallery Right</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-tab-style-left.html">
                                                        <span class="mm-text">Tab Style Left</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-tab-style-right.html">
                                                        <span class="mm-text">Tab Style Right</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-sticky-left.html">
                                                        <span class="mm-text">Sticky Left</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-sticky-right.html">
                                                        <span class="mm-text">Sticky Right</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="single-product.jsp">
                                                <span class="mm-text">Single Product Type</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="single-product.jsp">
                                                        <span class="mm-text">Single Product</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-sale.html">
                                                        <span class="mm-text">Single Product Sale</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-group.html">
                                                        <span class="mm-text">Single Product Group</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-variable.html">
                                                        <span class="mm-text">Single Product Variable</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-affiliate.html">
                                                        <span class="mm-text">Single Product Affiliate</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="single-product-slider.html">
                                                        <span class="mm-text">Single Product Slider</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children">
                                            <a href="single-product.jsp">
                                                <span class="mm-text">Shop Related Pages</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="#">
                                                        <span class="mm-text">My Account</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="login-register.jsp">
                                                        <span class="mm-text">Login | Register</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="mm-text">Wishlist</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="cart.jsp">
                                                        <span class="mm-text">Cart</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#">
                                                        <span class="mm-text">Checkout</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="compare.html">
                                                        <span class="mm-text">Comparer</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li class="menu-item-has-children">
                                    <a href="blog-left-sidebar.html">
                                        <span class="mm-text">Blog</span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li class="menu-item-has-children has-children">
                                            <a href="blog-left-sidebar.html">
                                                <span class="mm-text">Grid View</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="blog-2-column.html">
                                                        <span class="mm-text">Column Two</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-3-column.html">
                                                        <span class="mm-text">Column Three</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-left-sidebar.html">
                                                        <span class="mm-text">Left Sidebar</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-right-sidebar.html">
                                                        <span class="mm-text">Right Sidebar</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children has-children">
                                            <a href="blog-list-left-sidebar.html">
                                                <span class="mm-text">List View</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="blog-list-fullwidth.html">
                                                        <span class="mm-text">List Fullwidth</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-list-left-sidebar.html">
                                                        <span class="mm-text">List Left Sidebar</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-list-right-sidebar.html">
                                                        <span class="mm-text">List Right Sidebar</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children has-children">
                                            <a href="blog-details-left-sidebar.html">
                                                <span class="mm-text">Blog Details</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="blog-details-left-sidebar.html">
                                                        <span class="mm-text">Left Sidebar</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-details-right-sidebar.html">
                                                        <span class="mm-text">Right Sidebar</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li class="menu-item-has-children has-children">
                                            <a href="blog-gallery-format.html">
                                                <span class="mm-text">Blog Format</span>
                                            </a>
                                            <ul class="sub-menu">
                                                <li>
                                                    <a href="blog-gallery-format.html">
                                                        <span class="mm-text">Gallery Format</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-audio-format.html">
                                                        <span class="mm-text">Audio Format</span>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="blog-video-format.html">
                                                        <span class="mm-text">Video Format</span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <li class="menu-item-has-children">
                                    <a href="main.jsp">
                                        <span class="mm-text">Pages</span>
                                    </a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="about-us.html">
                                                <span class="mm-text">About Us</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="contact.html">
                                                <span class="mm-text">Contact</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="faq.html">
                                                <span class="mm-text">FAQ</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="404.html">
                                                <span class="mm-text">Error 404</span>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                        <nav class="offcanvas-navigation user-setting_area">
                            <ul class="mobile-menu">
                                <li class="menu-item-has-children active"><a href="javascript:void(0)"><span
                                        class="mm-text">User
                                        Setting</span></a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="#">
                                                <span class="mm-text">My Account</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="login-register.jsp">
                                                <span class="mm-text">Login | Register</span>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="menu-item-has-children"><a href="javascript:void(0)"><span
                                        class="mm-text">Currency</span></a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">EUR €</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">USD $</span>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="menu-item-has-children"><a href="javascript:void(0)"><span
                                        class="mm-text">Language</span></a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">English</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">Français</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">Romanian</span>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">
                                                <span class="mm-text">Japanese</span>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- Umino's Header Main Area End Here -->

        <!-- Begin Umino's Breadcrumb Area -->
        <div class="breadcrumb-area">
            <div class="container">
                <div class="breadcrumb-content">
                    <ul>
                        <li><a href="main.jsp">Home</a></li>
                        <li class="active">Login & Register</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Umino's Breadcrumb Area End Here -->
        <!-- Begin Umino's Login Register Area -->
        <div class="umino-login-register_area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-xs-12 col-lg-6">
                        <!-- Login Form s-->
                        <form action="UserServlet" method="post">
                            <div class="login-form">
                                <h4 class="login-title">登录</h4>
                                <div class="row">
                                    <div class="col-md-12 col-12">
                                        <label>Email 地址*</label>
                                        <input type="email" name="uname" placeholder="Email Address">
                                    </div>
                                    <div class="col-12 mb--20">
                                        <label>密码</label>
                                        <input type="password" name="pwd" placeholder="Password">
                                    </div>
                                    <div class="col-md-8">
                                        <div class="check-box">
                                            <input type="checkbox" id="remember_me">
                                            <label for="remember_me">记住我</label>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="forgotton-password_info">
                                            <a href="#"> 忘记密码?</a>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <button class="umino-login_btn" type="submit">登录</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-sm-12 col-md-12 col-lg-6 col-xs-12">
                        <form action="#">
                            <div class="login-form">
                                <h4 class="login-title">注册</h4>
                                <div class="row">
                                    <div class="col-md-6 col-12 mb--20">
                                        <label>首选名</label>
                                        <input type="text" placeholder="First Name">
                                    </div>
                                    <div class="col-md-6 col-12 mb--20">
                                        <label>备选名</label>
                                        <input type="text" placeholder="Last Name">
                                    </div>
                                    <div class="col-md-12">
                                        <label>Email 地址*</label>
                                        <input type="email" placeholder="Email Address">
                                    </div>
                                    <div class="col-md-6">
                                        <label>密码</label>
                                        <input type="password" placeholder="Password">
                                    </div>
                                    <div class="col-md-6">
                                        <label>验证密码</label>
                                        <input type="password" placeholder="Confirm Password">
                                    </div>
                                    <div class="col-12">
                                        <button class="umino-register_btn">注册</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Login Register Area  End Here -->
        <!-- Begin Umino's Footer Area -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- Umino's Footer Area End Here -->

    </div>

    <!-- JS
============================================ -->

    <!-- jQuery JS -->
    <script src="assets/js/vendor/jquery-1.12.4.min.js"></script>
    <!-- Modernizer JS -->
    <script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>
    <!-- Popper JS -->
    <script src="assets/js/vendor/popper.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="assets/js/vendor/bootstrap.min.js"></script>

    <!-- Slick Slider JS -->
    <script src="assets/js/plugins/slick.min.js"></script>
    <!-- Countdown JS -->
    <script src="assets/js/plugins/countdown.js"></script>
    <!-- Barrating JS -->
    <script src="assets/js/plugins/jquery.barrating.min.js"></script>
    <!-- Counterup JS -->
    <script src="assets/js/plugins/jquery.counterup.js"></script>
    <!-- Nice Select JS -->
    <script src="assets/js/plugins/jquery.nice-select.js"></script>
    <!-- Sticky Sidebar JS -->
    <script src="assets/js/plugins/jquery.sticky-sidebar.js"></script>
    <!-- jQuery UI -->
    <script src="assets/js/plugins/jquery-ui.min.js"></script>
    <!-- jQuery UI Touch Punch -->
    <script src="assets/js/plugins/jquery.ui.touch-punch.min.js"></script>
    <!-- Venobox JS -->
    <script src="assets/js/plugins/venobox.min.js"></script>
    <!-- Scroll Top JS -->
    <script src="assets/js/plugins/scroll-top.js"></script>
    <!-- Theia Sticky Sidebar JS -->
    <script src="assets/js/plugins/theia-sticky-sidebar.min.js"></script>
    <!-- Waypoints JS -->
    <script src="assets/js/plugins/waypoints.min.js"></script>
    <!-- ElevateZoom JS -->
    <script src="assets/js/plugins/jquery.elevateZoom-3.0.8.min.js"></script>
    <!-- Images loaded JS -->
    <script src="assets/js/plugins/imagesloaded.pkgd.min.js"></script>
    <!-- Isotope JS -->
    <script src="assets/js/plugins/isotope.pkgd.min.js"></script>
    <!-- Ajax Mail JS -->
    <script src="assets/js/ajax-mail.js"></script>

    <!-- Vendor & Plugins JS (Please remove the comment from below vendor.min.js & plugins.min.js for better website load performance and remove js files from avobe) -->
    <!--
<script src="assets/js/vendor/vendor.min.js"></script>
<script src="assets/js/plugins/plugins.min.js"></script>
-->

    <!-- Main JS -->
    <script src="assets/js/main.js"></script>

</body>

</html>

