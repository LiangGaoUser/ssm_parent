<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Shop Left Sidebar || limupa - Digital Products Store eCommerce Bootstrap 4 Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="../images/favicon.png">
    <!-- Material Design Iconic Font-V2.2.0 -->
    <link rel="stylesheet" href="../css/material-design-iconic-font.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <!-- Font Awesome Stars-->
    <link rel="stylesheet" href="../css/fontawesome-stars.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="../css/meanmenu.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="../css/owl.carousel.min.css">
    <!-- Slick Carousel CSS -->
    <link rel="stylesheet" href="../css/slick.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="../css/animate.css">
    <!-- Jquery-ui CSS -->
    <link rel="stylesheet" href="../css/jquery-ui.min.css">
    <!-- Venobox CSS -->
    <link rel="stylesheet" href="../css/venobox.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="../css/nice-select.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="../css/magnific-popup.css">
    <!-- Bootstrap V4.1.3 Fremwork CSS -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="../css/helper.css">
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="../css/sty_le.css">
    <link rel="stylesheet" href="../css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="../css/responsive.css">
    <!-- Modernizr js -->

    <%--来自菜鸟教程开始--%>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%--来自菜鸟教程结束--%>



    <script src="../js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<body>


<header>
    <!-- Begin Header Top Area -->
    <div class="header-top">
        <div class="container">
            <div class="row">
                <!-- Begin Header Logo Area -->
                <div class="col-lg-3">
                    <div class="logo pb-sm-30 pb-xs-30">
                        <a href="index.html">
                            <img src="../images/menu/logo/1.jpg" alt="">
                        </a>
                    </div>
                </div>
                <!-- Header Logo Area End Here -->
                <!-- Begin Header Middle Right Area -->
                <div class="col-lg-9 pl-0 ml-sm-15 ml-xs-15">
                    <!-- Begin Header Middle Searchbox Area -->

                    <!-- Header Middle Searchbox Area End Here -->
                    <!-- Begin Header Middle Right Area -->
                    <div class="header-middle-right">
                        <ul class="hm-menu">
                            <!-- Begin Header Mini Cart Area -->
                            <li class="hm-minicart">
                                <div class="hm-minicart-trigger">
                                    <span class="item-text"  onclick="location.href='${pageContext.request.contextPath}/user/toMain.do'">返回主界面
                                        </span>
                                </div>
                                <span></span>
                            </li>
                            <!-- Header Mini Cart Area End Here -->
                        </ul>
                    </div>
                    <!-- Header Middle Right Area End Here -->
                </div>
                <!-- Header Middle Right Area End Here -->
            </div>
        </div>


    </div>
    <!-- Header Top Area End Here -->

    <!-- Begin Header Middle Area -->
    <div class="header-middle pl-sm-0 pr-sm-0 pl-xs-0 pr-xs-0">

    </div>

    <!-- Begin Header Bottom Area -->
    <div class="mobile-menu-area d-lg-none d-xl-none col-12">
        <div class="mobile-menu">
            <nav>
                <ul>
                    <li><a href="index.html">Home</a>
                        <ul class="hb-dropdown">
                            <li class="active"><a href="index.html">Home One</a></li>
                            <li><a href="index-2.html">Home Two</a></li>
                            <li><a href="index-3.html">Home Three</a></li>
                            <li><a href="index-4.html">Home Four</a></li>
                        </ul>
                    </li>
                    <li><a href="shop-left-sidebar.html">Shop</a>
                        <ul class="megamenu hb-megamenu">
                            <li><a href="shop-left-sidebar.html">Shop Page Layout</a>
                                <ul>
                                    <li><a href="shop-3-column.html">Shop 3 Column</a></li>
                                    <li><a href="shop-4-column.html">Shop 4 Column</a></li>
                                    <li><a href="shop-left-sidebar.html">Shop Left Sidebar</a></li>
                                    <li><a href="shop-right-sidebar.html">Shop Right Sidebar</a></li>
                                    <li><a href="shop-list.html">Shop List</a></li>
                                    <li><a href="shop-list-left-sidebar.html">Shop List Left Sidebar</a></li>
                                    <li><a href="shop-list-right-sidebar.html">Shop List Right Sidebar</a></li>
                                </ul>
                            </li>
                            <li><a href="shop-left-sidebar.html">Single Product Style</a>
                                <ul>
                                    <li><a href="single-product-carousel.html">Single Product Carousel</a></li>
                                    <li><a href="single-product-sticky-left.html">Single Product Sticky Left</a></li>
                                    <li><a href="single-product-sticky-right.html">Single Product Sticky Right</a></li>
                                    <li><a href="single-product-gallery-left.html">Single Product Gallery Left</a></li>
                                    <li><a href="single-product-gallery-right.html">Single Product Gallery Right</a></li>
                                    <li><a href="single-product-tab-style-top.html">Single Product Tab Style Top</a></li>
                                    <li><a href="single-product-tab-style-left.html">Single Product Tab Style Left</a></li>
                                    <li><a href="single-product-tab-style-right.html">Single Product Tab Style Right</a></li>
                                </ul>
                            </li>
                            <li><a href="single-product.html">Single Products</a>
                                <ul>
                                    <li><a href="single-product.html">Single Product</a></li>
                                    <li><a href="single-product-sale.html">Single Product Sale</a></li>
                                    <li><a href="single-product-group.html">Single Product Group</a></li>
                                    <li><a href="single-product-normal.html">Single Product Normal</a></li>
                                    <li><a href="single-product-affiliate.html">Single Product Affiliate</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a href="blog-left-sidebar.html">Blog</a>
                        <ul class="hb-dropdown">
                            <li class="sub-dropdown-holder"><a href="blog-left-sidebar.html">Blog Grid View</a>
                                <ul class="hb-dropdown hb-sub-dropdown">
                                    <li><a href="blog-2-column.html">Blog 2 Column</a></li>
                                    <li><a href="blog-3-column.html">Blog 3 Column</a></li>
                                    <li><a href="blog-left-sidebar.html">Grid Left Sidebar</a></li>
                                    <li><a href="blog-right-sidebar.html">Grid Right Sidebar</a></li>
                                </ul>
                            </li>
                            <li class="sub-dropdown-holder"><a href="blog-list-left-sidebar.html">Blog List View</a>
                                <ul class="hb-dropdown hb-sub-dropdown">
                                    <li><a href="blog-list.html">Blog List</a></li>
                                    <li><a href="blog-list-left-sidebar.html">List Left Sidebar</a></li>
                                    <li><a href="blog-list-right-sidebar.html">List Right Sidebar</a></li>
                                </ul>
                            </li>
                            <li class="sub-dropdown-holder"><a href="blog-details-left-sidebar.html">Blog Details</a>
                                <ul class="hb-dropdown hb-sub-dropdown">
                                    <li><a href="blog-details-left-sidebar.html">Left Sidebar</a></li>
                                    <li><a href="blog-details-right-sidebar.html">Right Sidebar</a></li>
                                </ul>
                            </li>
                            <li class="sub-dropdown-holder"><a href="blog-details-left-sidebar.html">Blog Format</a>
                                <ul class="hb-dropdown hb-sub-dropdown">
                                    <li><a href="blog-audio-format.html">Blog Audio Format</a></li>
                                    <li><a href="blog-video-format.html">Blog Video Format</a></li>
                                    <li><a href="blog-gallery-format.html">Blog Gallery Format</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a href="shop-left-sidebar.html">Pages</a>
                        <ul class="megamenu hb-megamenu">
                            <li><a href="blog-left-sidebar.html">Blog Layouts</a>
                                <ul>
                                    <li><a href="blog-2-column.html">Blog 2 Column</a></li>
                                    <li><a href="blog-3-column.html">Blog 3 Column</a></li>
                                    <li><a href="blog-left-sidebar.html">Grid Left Sidebar</a></li>
                                    <li><a href="blog-right-sidebar.html">Grid Right Sidebar</a></li>
                                    <li><a href="blog-list.html">Blog List</a></li>
                                    <li><a href="blog-list-left-sidebar.html">List Left Sidebar</a></li>
                                    <li><a href="blog-list-right-sidebar.html">List Right Sidebar</a></li>
                                </ul>
                            </li>
                            <li><a href="blog-details-left-sidebar.html">Blog Details Pages</a>
                                <ul>
                                    <li><a href="blog-details-left-sidebar.html">Left Sidebar</a></li>
                                    <li><a href="blog-details-right-sidebar.html">Right Sidebar</a></li>
                                    <li><a href="blog-audio-format.html">Blog Audio Format</a></li>
                                    <li><a href="blog-video-format.html">Blog Video Format</a></li>
                                    <li><a href="blog-gallery-format.html">Blog Gallery Format</a></li>
                                </ul>
                            </li>
                            <li><a href="index.html">Other Pages</a>
                                <ul>
                                    <li><a href="login-register.html">My Account</a></li>
                                    <li><a href="checkout.html">Checkout</a></li>
                                    <li><a href="compare.html">Compare</a></li>
                                    <li><a href="wishlist.html">Wishlist</a></li>
                                    <li><a href="shopping-cart.html">Shopping Cart</a></li>
                                </ul>
                            </li>
                            <li><a href="index.html">Other Pages 2</a>
                                <ul>
                                    <li><a href="contact.html">Contact</a></li>
                                    <li><a href="about-us.html">About Us</a></li>
                                    <li><a href="faq.html">FAQ</a></li>
                                    <li><a href="404.html">404 Error</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li><a href="about-us.html">About Us</a></li>
                    <li><a href="contact.html">Contact</a></li>
                    <li><a href="shop-left-sidebar.html">Smartwatch</a></li>
                    <li><a href="shop-left-sidebar.html">Accessories</a></li>
                </ul>
            </nav>
        </div>
    </div>
    <!-- Mobile Menu Area End Here -->
</header>




<div class="container">
    <h1>欢迎来到配置广场!</h1>
    <div class="row" >

            <c:forEach begin="0" end ="${graphics_list.size()-1}" var="num">
                <div class="col-md-6 col-md-offset-3"
                     style="background-color: #dedef8;height:580px;box-shadow:
                 inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
                    <p>cpu: ${cpu_list.get(num).cpu_name}</p>
                    <p>显卡: ${graphics_list.get(num).graphics_name}</p>
                    <p>硬盘: ${harddisk_list.get(num).hardDisk_name}</p>
                    <p>键盘: ${keyboard_list.get(num).keyboard_name}</p>
                    <p>鼠标: ${mouse_list.get(num).mouse_name}</p>
                    <p>内存: ${memory_list.get(num).memory_name}</p>
                    <p>网卡: ${netcard_list.get(num).netcard_name}</p>
                    <p>显示器: ${monitor_list.get(num).monitor_name}</p>
                    <p>主板: ${motherboard_list.get(num).motherboard_name}</p>
                    <p>电源: ${power_list.get(num).power_name}</p>
                    <p>声卡: ${soundcard_list.get(num).soundCard_name}</p>
                    <p>固态硬盘: ${ssd_list.get(num).ssd_name}</p>


                    <div class="product-details-left">
                        <div class="product-details-images slider-navigation-1">
                        </div>
                        <div class="product-details-thumbs slider-thumbs-1">
                            <div class="sm-image"><img src="${cpu_list.get(num).cpu_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${graphics_list.get(num).graphics_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${harddisk_list.get(num).hardDisk_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${keyboard_list.get(num).keyboard_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${mouse_list.get(num).mouse_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${memory_list.get(num).memory_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${netcard_list.get(num).netcard_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${monitor_list.get(num).monitor_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${motherboard_list.get(num).motherboard_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${power_list.get(num).power_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${soundcard_list.get(num).soundCard_img}" alt="product image thumb"></div>
                            <div class="sm-image"><img src="${ssd_list.get(num).ssd_img}" alt="product image thumb"></div>
                        </div>
                    </div>
                </div>
            </c:forEach>







</div>
</div>


<!-- Body Wrapper End Here -->
<!-- jQuery-V1.12.4 -->
<script src="../js/vendor/jquery-1.12.4.min.js"></script>
<!-- Popper js -->
<script src="../js/vendor/popper.min.js"></script>
<!-- Bootstrap V4.1.3 Fremwork js -->
<script src="../js/bootstrap.min.js"></script>
<!-- Ajax Mail js -->
<script src="../js/ajax-mail.js"></script>
<!-- Meanmenu js -->
<script src="../js/jquery.meanmenu.min.js"></script>
<!-- Wow.min js -->
<script src="../js/wow.min.js"></script>
<!-- Slick Carousel js -->
<script src="../js/slick.min.js"></script>
<!-- Owl Carousel-2 js -->
<script src="../js/owl.carousel.min.js"></script>
<!-- Magnific popup js -->
<script src="../js/jquery.magnific-popup.min.js"></script>
<!-- Isotope js -->
<script src="../js/isotope.pkgd.min.js"></script>
<!-- Imagesloaded js -->
<script src="../js/imagesloaded.pkgd.min.js"></script>
<!-- Mixitup js -->
<script src="../js/jquery.mixitup.min.js"></script>
<!-- Countdown -->
<script src="../js/jquery.countdown.min.js"></script>
<!-- Counterup -->
<script src="../js/jquery.counterup.min.js"></script>
<!-- Waypoints -->
<script src="../js/waypoints.min.js"></script>
<!-- Barrating -->
<script src="../js/jquery.barrating.min.js"></script>
<!-- Jquery-ui -->
<script src="../js/jquery-ui.min.js"></script>
<!-- Venobox -->
<script src="../js/venobox.min.js"></script>
<!-- Nice Select js -->
<script src="../js/jquery.nice-select.min.js"></script>
<!-- ScrollUp js -->
<script src="../js/scrollUp.min.js"></script>
<!-- Main/Activator js -->
<script src="../js/main.js"></script>
</body>
</html>
