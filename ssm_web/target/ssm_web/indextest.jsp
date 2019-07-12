<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en-US">
<head>
    <meta charset="UTF-8">
    <meta name="keywords" content="心若向阳">
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
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="../css/responsive.css">
    <!-- Modernizr js -->
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
    <script src="../js/vendor/modernizr-2.8.3.min.js"></script>
    <script src="../js/jquery-1.7.2.js"></script>
    <title>心若向阳无谓悲伤</title>
    <style type="text/css">
        .item{
            background: #C0C0C0;
            border-radius: 20px;
            margin-bottom: 10px;
            height:40px;
            padding-left: 20px;
            color:white;
            font-family: "微软雅黑";
            text-align: center;
            padding-top: 15px;
        }
        #content{
            list-style: none;
        }
    </style>
    <%--<script type="text/javascript" src="./js/jquery.js"></script>--%>
    <script type="text/javascript">
        $ (function ()
        {
            $ ('#add').click (function ()
            {
                if($("#content").children().length >=5){
                    alert("最多允许添加5个")
                    return;
                }
                // $('#content').append('<li class="item" >'+$("#content").children().length+'</li>');

                $('#content').append(' <li>\n' +
                    '            <a href="product-details-right-sidebar.html" class="minicart-product-image">\n' +
                    '                <img src="../images/product/small-size/5.jpg" alt="cart products">\n' +
                    '                </a>\n' +
                    '                <div class="minicart-product-details">\n' +
                    '                <h6><a href="product-details-right-sidebar.html">Aenean eu tristique</a></h6>\n' +
                    '            <span>£40 x 1</span>\n' +
                    '            </div>\n' +
                    '            <button class="close" title="Remove">\n' +
                    '                <i class="fa fa-close"></i>\n' +
                    '                </button>\n' +
                    '                </li>');











            });

            $ ('#delete').click (function ()
            {
                var len = $("#content").children().length-1;
                if(len >=0){
                    $("ul li:eq("+len+")").remove();  //表示删除最后一个元素
                }else{
                    alert("还没有添加元素哦");
                }


            });
        })

    </script>
</head>
<body>
<div >
    <div class="header-middle-right" id="content">
        <ul class="hm-menu">
            <!-- Begin Header Middle Wishlist Area -->
            <li class="hm-wishlist">
                <a href="#">
                    <span class="cart-item-count wishlist-item-count">0</span>
                    <i class="fa fa-heart-o"></i>
                </a>
            </li>
            <!-- Header Middle Wishlist Area End Here -->
            <!-- Begin Header Mini Cart Area -->
            <li class="hm-minicart">
                <div class="hm-minicart-trigger">
                    <span class="item-icon"></span>
                    <span class="item-text">£80.00
                                                    <span class="cart-item-count">2</span>
                                                </span>
                </div>
                <span></span>
                <div class="minicart">
                    <ul class="minicart-product-list">
                        <li>
                            <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                <img src="../images/product/small-size/5.jpg" alt="cart products">
                            </a>
                            <div class="minicart-product-details">
                                <h6><a href="product-details-right-sidebar.html">Aenean eu tristique</a></h6>
                                <span>£40 x 1</span>
                            </div>
                            <button class="close" title="Remove">
                                <i class="fa fa-close"></i>
                            </button>
                        </li>
                        <li>
                            <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                <img src="../images/product/small-size/6.jpg" alt="cart products">
                            </a>
                            <div class="minicart-product-details">
                                <h6><a href="product-details-right-sidebar.html">Aenean eu tristique</a></h6>
                                <span>£40 x 1</span>
                            </div>
                            <button class="close" title="Remove">
                                <i class="fa fa-close"></i>
                            </button>
                        </li>
                        <li>
                            <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                <img src="../images/product/small-size/5.jpg" alt="cart products">
                            </a>
                            <div class="minicart-product-details">
                                <h6><a href="product-details-right-sidebar.html">Aenean eu tristique</a></h6>
                                <span>£40 x 1</span>
                            </div>
                            <button class="close" title="Remove">
                                <i class="fa fa-close"></i>
                            </button>
                        </li>
                    </ul>
                    <p class="minicart-total">SUBTOTAL: <span>£80.00</span></p>
                    <div class="minicart-button">
                        <a href="http://demo.hasthemes.com/limupa-v1/limupa/shopping.html" class="li-button li-button-fullwidth li-button-dark">
                            <span>View Full Cart</span>
                        </a>
                        <a href="checkout.html" class="li-button li-button-fullwidth">
                            <span>Checkout</span>
                        </a>
                    </div>
                </div>
            </li>
            <!-- Header Mini Cart Area End Here -->
        </ul>
    </div>




    <%--<ul id="content">--%>

    <%--</ul>--%>
</div>
<button id="add">添加div</button>
<button id="delete">删除div</button>
</body>
</html>
