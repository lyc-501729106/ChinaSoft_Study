﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Single Product</title>
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
                                <a href="index.jsp">
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
                                    <span>Need help?</span>
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
                                <a href="index.jsp">
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
                                <li class="menu-item-has-children active"><a href="index.jsp"><span
                                        class="mm-text">Home</span></a>
                                    <ul class="sub-menu">
                                        <li>
                                            <a href="index.jsp">
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
                                    <a href="index.jsp">
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
                        <li><a href="index.jsp">Home</a></li>
                        <li class="active">Single Product</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Umino's Breadcrumb Area End Here -->

        <!-- Begin Umino's Single Product Area -->
        <div class="sp-area">
            <div class="container">
                <div class="sp-nav">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="sp-img_area">
                                <div class="zoompro-border">
                                    <img class="zoompro" src="${detail.pic}" data-zoom-image="assets/images/product/large-size/1.jpg" alt="Umino's Product Image" />
                                </div>
                                <div id="gallery" class="sp-img_slider slider-navigation_style-4">
                                    <a class="active" data-image="assets/images/product/large-size/1.jpg" data-zoom-image="assets/images/product/large-size/1.jpg">
                                        <img src="assets/images/product/small-size/1.jpg" alt="Umino's Product Image">
                                    </a>
                                    <a data-image="assets/images/product/large-size/2.jpg" data-zoom-image="assets/images/product/large-size/2.jpg">
                                        <img src="assets/images/product/small-size/2.jpg" alt="Umino's Product Image">
                                    </a>
                                    <a data-image="assets/images/product/large-size/3.jpg" data-zoom-image="assets/images/product/large-size/3.jpg">
                                        <img src="assets/images/product/small-size/3.jpg" alt="Umino's Product Image">
                                    </a>
                                    <a data-image="assets/images/product/large-size/4.jpg" data-zoom-image="assets/images/product/large-size/4.jpg">
                                        <img src="assets/images/product/small-size/4.jpg" alt="Umino's Product Image">
                                    </a>
                                    <a data-image="assets/images/product/large-size/5.jpg" data-zoom-image="assets/images/product/large-size/5.jpg">
                                        <img src="assets/images/product/small-size/5.jpg" alt="Umino's Product Image">
                                    </a>
                                    <a data-image="assets/images/product/large-size/6.jpg" data-zoom-image="assets/images/product/large-size/6.jpg">
                                        <img src="assets/images/product/small-size/6.jpg" alt="Umino's Product Image">
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="sp-content">
                                <div class="page-navigation">
                                    <a href="javascript:void(0)" class="prev">
                                        <i class="ion-chevron-left"></i>
                                    </a>
                                    <a href="javascript:void(0)" class="next">
                                        <i class="ion-chevron-right"></i>
                                    </a>
                                </div>
                                <div class="price-box">
                                    <span class="new-price">$${detail.price}</span>
                                </div>
                                <div class="sp-heading">
                                    <h2><a href="javascript:void(0)">Faucibus A Lobortis Vitae</a></h2>
                                </div>
                                <div class="rating-box">
                                    <ul>
                                        <li><i class="ion-ios-star"></i></li>
                                        <li><i class="ion-ios-star"></i></li>
                                        <li><i class="ion-ios-star"></i></li>
                                        <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                        <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                    </ul>
                                    <div class="rating-info">
                                        <a href="javascript:void(0)">(1 customer review)</a>
                                    </div>
                                </div>
                                <div class="product-desc">
                                    <p>${detail.info}</p>
                                </div>
                                <div class="product-size_box">
                                    <span>Size</span>
                                    <select class="myniceselect nice-select">
                                        <option value="1">S</option>
                                        <option value="2">M</option>
                                        <option value="3">L</option>
                                        <option value="4">XL</option>
                                    </select>
                                </div>
                                <div class="in-stock"><i class="fa fa-check-circle"></i><span>203 In Stock</span></div>
                                <div class="quantity">
                                    <label>Quantity</label>
                                    <div class="cart-plus-minus">
                                        <input class="cart-plus-minus-box" value="1" type="text">
                                        <div class="dec qtybutton"><i class="fa fa-angle-down"></i></div>
                                        <div class="inc qtybutton"><i class="fa fa-angle-up"></i></div>
                                    </div>
                                    <div class="additional-btn_area">
                                        <a class="additional_btn" href="AddToCartServlet?detail_id=${detail.detail_id}">添加到购物车</a>
                                    </div>
                                </div>
                                <div class="qty-btn_area">
                                    <ul>
                                        <li><a class="qty-btn" href="#" data-toggle="tooltip" title="Add To Wishlist"><i
                                                class="ion-android-favorite-outline"></i>Add To Wishlist</a></li>
                                        <li><a class="qty-btn" href="compare.html" data-toggle="tooltip" title="Compare This Product"><i
                                                class="ion-ios-shuffle-strong"></i>Add To Compare</a></li>
                                    </ul>
                                </div>
                                <div class="category-list_area">
                                    <h6>Category:</h6>
                                    <ul class="tags-list">
                                        <li>
                                            <a href="javascript:void(0)">Bedroom Furniture,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">Console Tables,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">End Tables,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">Living Room Sets,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">Ottomans & Storage Ottomans,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">Sofas & Couches,</a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0)">TV Stands</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="category-list_area tag-list_area">
                                    <h6>Tags:</h6>
                                    <ul class="tags-list">
                                        <li>
                                            <a href="javascript:void(0)">Men</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="umino-social_link">
                                    <h6>Shere This product:</h6>
                                    <ul>
                                        <li class="facebook">
                                            <a href="https://www.facebook.com/" data-toggle="tooltip" target="_blank" title="Facebook">
                                                <i class="fab fa-facebook"></i>
                                            </a>
                                        </li>
                                        <li class="twitter">
                                            <a href="https://twitter.com/" data-toggle="tooltip" target="_blank" title="Twitter">
                                                <i class="fab fa-twitter-square"></i>
                                            </a>
                                        </li>
                                        <li class="youtube">
                                            <a href="https://www.youtube.com/" data-toggle="tooltip" target="_blank" title="Youtube">
                                                <i class="fab fa-youtube"></i>
                                            </a>
                                        </li>
                                        <li class="google-plus">
                                            <a href="https://www.plus.google.com/discover" data-toggle="tooltip" target="_blank" title="Google Plus">
                                                <i class="fab fa-google-plus"></i>
                                            </a>
                                        </li>
                                        <li class="instagram">
                                            <a href="https://rss.com/" data-toggle="tooltip" target="_blank" title="Instagram">
                                                <i class="fab fa-instagram"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Single Product Area End Here -->

        <!-- Begin Umino's Single Product Tab Area -->
        <div class="sp-tab_area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="sp-product-tab_nav">
                            <div class="product-tab">
                                <ul class="nav product-menu">
                                    <li><a class="active" data-toggle="tab" href="#description"><span>Description</span></a>
                                    </li>
                                    <li><a data-toggle="tab" href="#specification"><span>Specification</span></a></li>
                                    <li><a data-toggle="tab" href="#reviews"><span>Reviews (1)</span></a></li>
                                </ul>
                            </div>
                            <div class="tab-content umino-tab_content">
                                <div id="description" class="tab-pane active show" role="tabpanel">
                                    <div class="product-description">
                                        <p class="short-desc">
                                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam fringilla augue nec est tristique auctor. Donec non est at libero vulputate rutrum. Morbi ornare lectus quis justo gravida semper. Nulla tellus mi, vulputate adipiscing cursus eu, suscipit id nulla.
                                        </p>
                                        <p class="additional-desc">
                                            Pellentesque aliquet, sem eget laoreet ultrices, ipsum metus feugiat sem, quis fermentum turpis eros eget velit. Donec ac tempus ante. Fusce ultricies massa massa. Fusce aliquam, purus eget sagittis vulputate, sapien libero hendrerit est, sed commodo augue nisi non neque. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tempor, lorem et placerat vestibulum, metus nisi posuere nisl, in accumsan elit odio quis mi. Cras neque metus, consequat et blandit et, luctus a nunc. Etiam gravida vehicula tellus, in imperdiet ligula euismod eget.
                                        </p>
                                    </div>
                                </div>
                                <div id="specification" class="tab-pane" role="tabpanel">
                                    <table class="table table-bordered specification-inner_stuff">
                                        <tbody>
                                            <tr>
                                                <td colspan="2"><strong>Memory</strong></td>
                                            </tr>
                                        </tbody>
                                        <tbody>
                                            <tr>
                                                <td>test 1</td>
                                                <td>8gb</td>
                                            </tr>
                                        </tbody>
                                        <tbody>
                                            <tr>
                                                <td colspan="2"><strong>Processor</strong></td>
                                            </tr>
                                        </tbody>
                                        <tbody>
                                            <tr>
                                                <td>No. of Cores</td>
                                                <td>1</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div id="reviews" class="tab-pane" role="tabpanel">
                                    <div class="tab-pane active" id="tab-review">
                                        <form class="form-horizontal" id="form-review">
                                            <div id="review">
                                                <table class="table table-striped table-bordered">
                                                    <tbody>
                                                        <tr>
                                                            <td style="width: 50%;"><strong>Customer</strong></td>
                                                            <td class="text-right">25/04/2019</td>
                                                        </tr>
                                                        <tr>
                                                            <td colspan="2">
                                                                <p>Good product! Thank you very much</p>
                                                                <div class="rating-box">
                                                                    <ul>
                                                                        <li><i class="ion-ios-star"></i></li>
                                                                        <li><i class="ion-ios-star"></i></li>
                                                                        <li><i class="ion-ios-star"></i></li>
                                                                        <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                                        <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                                    </ul>
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                            <h2>Write a review</h2>
                                            <div class="form-group required">
                                                <div class="col-sm-12 p-0">
                                                    <label>Your Email <span class="required">*</span></label>
                                                    <input class="review-input" type="email" name="con_email" id="con_email" required>
                                                </div>
                                            </div>
                                            <div class="form-group required second-child">
                                                <div class="col-sm-12 p-0">
                                                    <label class="control-label">Share your opinion</label>
                                                    <textarea class="review-textarea" name="con_message" id="con_message"></textarea>
                                                    <div class="help-block"><span class="text-danger">Note:</span> HTML is not
                                                        translated!</div>
                                                </div>
                                            </div>
                                            <div class="form-group last-child required">
                                                <div class="col-sm-12 p-0">
                                                    <div class="your-opinion">
                                                        <label>Your Rating</label>
                                                        <span>
                                                        <select class="star-rating">
                                                            <option value="1">1</option>
                                                            <option value="2">2</option>
                                                            <option value="3">3</option>
                                                            <option value="4">4</option>
                                                            <option value="5">5</option>
                                                        </select>
                                                    </span>
                                                    </div>
                                                </div>
                                                <div class="umino-btn-ps_right">
                                                    <a href="javascript:void(0)" class="umino-btn umino-btn_dark">Continue</a>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Single Product Tab Area End Here -->

        <!-- Begin Umino's Product Area Two -->
        <div class="umino-product_area umino-product_area-2">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="umino-section_title">
                            <h3>Related Products</h3>
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="umino-product_slider-2 slider-navigation_style-1">
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/1-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$70.00</span>
                                                <span class="old-price">$80.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Aliquet auctor semali</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/2-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i
                                                        class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i
                                                        class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i
                                                        class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Auctor gravida enimuctor</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/3-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$65.00</span>
                                                <span class="old-price">$68.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Bibenm lorem coectetur</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/4-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$79.00</span>
                                                <span class="old-price">$85.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Curabitur tristique neque</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/5-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Accumsan mauris ullaat</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/7-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i
                                                        class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i
                                                        class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i
                                                        class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Accumsan mauris ullaat</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Product Area Two End Here -->

        <!-- Begin Umino's Product Area Two -->
        <div class="umino-product_area umino-product_area-3 section-space_add">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="umino-section_title">
                            <h3>Upsell Products</h3>
                        </div>
                    </div>
                    <div class="col-lg-12">
                        <div class="umino-product_slider-2 slider-navigation_style-1">
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/1-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$70.00</span>
                                                <span class="old-price">$80.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Aliquet auctor semali</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/2-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Auctor gravida enimuctor</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/3-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$65.00</span>
                                                <span class="old-price">$68.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Bibenm lorem coectetur</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/4-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$79.00</span>
                                                <span class="old-price">$85.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Curabitur tristique neque</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/5-3.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Accumsan mauris ullaat</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="slide-item">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="single-product.jsp">
                                            <img class="primary-img" src="assets/images/product/medium-size/8-2.jpg" alt="Umino's Product Image">
                                        </a>
                                        <div class="add-actions">
                                            <ul>
                                                <li><a href="cart.jsp" data-toggle="tooltip" data-placement="top" title="Add To cart"><i
                                                        class="ion-bag"></i></a>
                                                </li>
                                                <li><a href="#" data-toggle="tooltip" data-placement="top" title="Add To Wishlist"><i
                                                        class="ion-ios-heart-outline"></i></a>
                                                </li>
                                                <li><a href="compare.html" data-toggle="tooltip" data-placement="top" title="Add To Cart"><i
                                                        class="fa fa-chart-bar"></i></a>
                                                </li>
                                                <li class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><a href="javascript:void(0)" data-toggle="tooltip" data-placement="top" title="Quick View"><i
                                                        class="ion-ios-search"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <div class="product-desc_info">
                                            <div class="price-box">
                                                <span class="new-price">$95.00</span>
                                                <span class="old-price">$100.00</span>
                                            </div>
                                            <h6 class="product-name"><a href="single-product.jsp">Accumsan mauris ullaat</a>
                                            </h6>
                                            <div class="rating-box">
                                                <ul>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li><i class="ion-ios-star"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-half"></i></li>
                                                    <li class="silver-color"><i class="ion-ios-star-outline"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Product Area Two End Here -->

        <!-- Begin Umino's Brand Area -->
        <div class="umino-brand_area">
            <div class="container">
                <div class="umino-brand_nav">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="umino-brand_slider slider-navigation_style-1">
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/1.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/2.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/3.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/4.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/5.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/1.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                                <div class="slide-item">
                                    <a href="javascript:void(0)">
                                        <img src="assets/images/brand/2.jpg" alt="Umino's Brand Image">
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Brand Area End Here -->
        <!-- Begin Umino's Footer Area -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- Umino's Footer Area End Here -->
        <!-- Begin Umino's Modal Area -->
        <div class="modal fade modal-wrapper" id="exampleModalCenter">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-body">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <div class="modal-inner-area sp-area row">
                            <div class="col-lg-5">
                                <div class="sp-img_area">
                                    <div class="sp-img_slider-2 slick-img-slider umino-slick-slider arrow-type-two" data-slick-options='{
                                                        "slidesToShow": 1,
                                                        "arrows": false,
                                                        "fade": true,
                                                        "draggable": false,
                                                        "swipe": false,
                                                        "asNavFor": ".sp-img_slider-nav"
                                                        }'>
                                        <div class="single-slide red">
                                            <img src="assets/images/product/large-size/1.jpg" alt="Umino's Product Image">
                                        </div>
                                        <div class="single-slide orange">
                                            <img src="assets/images/product/large-size/2.jpg" alt="Umino's Product Image">
                                        </div>
                                        <div class="single-slide brown">
                                            <img src="assets/images/product/large-size/3.jpg" alt="Umino's Product Image">
                                        </div>
                                        <div class="single-slide umber">
                                            <img src="assets/images/product/large-size/4.jpg" alt="Umino's Product Image">
                                        </div>
                                    </div>
                                    <div class="sp-img_slider-nav slick-slider-nav umino-slick-slider arrow-type-two" data-slick-options='{
                                   "slidesToShow": 4,
                                    "asNavFor": ".sp-img_slider-2",
                                   "focusOnSelect": true
                                  }' data-slick-responsive='[
                                                        {"breakpoint":1501, "settings": {"slidesToShow": 3}},
                                                        {"breakpoint":1200, "settings": {"slidesToShow": 2}},
                                                        {"breakpoint":992, "settings": {"slidesToShow": 4}},
                                                        {"breakpoint":768, "settings": {"slidesToShow": 3}},
                                                        {"breakpoint":321, "settings": {"slidesToShow": 2}}
                                                    ]'>
                                        <div class="single-slide red">
                                            <img src="assets/images/product/small-size/1.jpg" alt="Umino's Product Thumnail">
                                        </div>
                                        <div class="single-slide orange">
                                            <img src="assets/images/product/small-size/2.jpg" alt="Umino's Product Thumnail">
                                        </div>
                                        <div class="single-slide brown">
                                            <img src="assets/images/product/small-size/3.jpg" alt="Umino's Product Thumnail">
                                        </div>
                                        <div class="single-slide umber">
                                            <img src="assets/images/product/small-size/4.jpg" alt="Umino's Product Thumnail">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xl-7 col-lg-6">
                                <div class="sp-content">
                                    <div class="sp-heading">
                                        <h5><a href="single-product.jsp">Aliquet Auctor Semali</a></h5>
                                    </div>
                                    <div class="price-box">
                                        <span class="new-price">$70.00</span>
                                        <span class="old-price">$80.00</span>
                                    </div>
                                    <div class="features">
                                        <a href="single-product.jsp">See all features</a>
                                    </div>
                                    <div class="quantity-area">
                                        <div class="quantity">
                                            <label>Quantity</label>
                                            <div class="cart-plus-minus">
                                                <input class="cart-plus-minus-box" value="1" type="text">
                                                <div class="dec qtybutton"><i class="fa fa-angle-down"></i></div>
                                                <div class="inc qtybutton"><i class="fa fa-angle-up"></i></div>
                                            </div>
                                        </div>
                                        <div class="quantity-btn">
                                            <ul>
                                                <li><a href="cart.jsp" class="add-to_cart">Add To Cart</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="short-desc">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco,Proin lectus ipsum, gravida et mattis vulputate, tristique ut lectus</p>
                                    </div>
                                    <div class="umino-social_link">
                                        <div class="social-title">
                                            <h3>Share This Product</h3>
                                        </div>
                                        <ul>
                                            <li class="facebook">
                                                <a href="https://www.facebook.com/" data-toggle="tooltip" target="_blank" title="Facebook">
                                                    <i class="fab fa-facebook"></i>
                                                </a>
                                            </li>
                                            <li class="twitter">
                                                <a href="https://twitter.com/" data-toggle="tooltip" target="_blank" title="Twitter">
                                                    <i class="fab fa-twitter-square"></i>
                                                </a>
                                            </li>
                                            <li class="youtube">
                                                <a href="https://www.youtube.com/" data-toggle="tooltip" target="_blank" title="Youtube">
                                                    <i class="fab fa-youtube"></i>
                                                </a>
                                            </li>
                                            <li class="google-plus">
                                                <a href="https://www.plus.google.com/discover" data-toggle="tooltip" target="_blank" title="Google Plus">
                                                    <i class="fab fa-google-plus"></i>
                                                </a>
                                            </li>
                                            <li class="instagram">
                                                <a href="https://rss.com/" data-toggle="tooltip" target="_blank" title="Instagram">
                                                    <i class="fab fa-instagram"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Umino's Modal Area End Here -->

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

