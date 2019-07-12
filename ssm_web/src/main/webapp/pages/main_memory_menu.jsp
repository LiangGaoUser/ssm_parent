<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
         <%--pageEncoding="UTF-8" isELIgnored="false" %>--%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>

<%--<!doctype html>--%>
<%--<html class="no-js" lang="zxx">--%>
<%--<head>--%>
    <%--<meta charset="utf-8">--%>
    <%--<meta http-equiv="x-ua-compatible" content="ie=edge">--%>
    <%--<title>Shop Left Sidebar || limupa - Digital Products Store eCommerce Bootstrap 4 Template</title>--%>
    <%--<meta name="description" content="">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <%--<!-- Favicon -->--%>
    <%--<link rel="shortcut icon" type="image/x-icon" href="../images/favicon.png">--%>
    <%--<!-- Material Design Iconic Font-V2.2.0 -->--%>
    <%--<link rel="stylesheet" href="../css/material-design-iconic-font.min.css">--%>
    <%--<!-- Font Awesome -->--%>
    <%--<link rel="stylesheet" href="../css/font-awesome.min.css">--%>
    <%--<!-- Font Awesome Stars-->--%>
    <%--<link rel="stylesheet" href="../css/fontawesome-stars.css">--%>
    <%--<!-- Meanmenu CSS -->--%>
    <%--<link rel="stylesheet" href="../css/meanmenu.css">--%>
    <%--<!-- owl carousel CSS -->--%>
    <%--<link rel="stylesheet" href="../css/owl.carousel.min.css">--%>
    <%--<!-- Slick Carousel CSS -->--%>
    <%--<link rel="stylesheet" href="../css/slick.css">--%>
    <%--<!-- Animate CSS -->--%>
    <%--<link rel="stylesheet" href="../css/animate.css">--%>
    <%--<!-- Jquery-ui CSS -->--%>
    <%--<link rel="stylesheet" href="../css/jquery-ui.min.css">--%>
    <%--<!-- Venobox CSS -->--%>
    <%--<link rel="stylesheet" href="../css/venobox.css">--%>
    <%--<!-- Nice Select CSS -->--%>
    <%--<link rel="stylesheet" href="../css/nice-select.css">--%>
    <%--<!-- Magnific Popup CSS -->--%>
    <%--<link rel="stylesheet" href="../css/magnific-popup.css">--%>
    <%--<!-- Bootstrap V4.1.3 Fremwork CSS -->--%>
    <%--<link rel="stylesheet" href="../css/bootstrap.min.css">--%>
    <%--<!-- Helper CSS -->--%>
    <%--<link rel="stylesheet" href="../css/helper.css">--%>
    <%--<!-- Main Style CSS -->--%>
    <%--<link rel="stylesheet" href="../css/sty_le.css">--%>
    <%--<!-- Responsive CSS -->--%>
    <%--<link rel="stylesheet" href="../css/responsive.css">--%>
    <%--<!-- Modernizr js -->--%>
    <%--<script src="../js/vendor/modernizr-2.8.3.min.js"></script>--%>
    <%--<script src="../js/jquery-1.7.2.js"></script>--%>



    <%--<!--jquery来进行设置页面刷新-->--%>
    <%--<script type="text/javascript">--%>
        <%--$(function () {--%>
            <%--$("#showHardWare a").click(function () {--%>
                <%--var url = this.href;--%>
                <%--var id=this.id;//--%>
                <%--var url2=$("#"+id).attr("url2");--%>
                <%--alert("现在弹出"+url2);--%>
                <%--var args = {"time":new Date()};--%>
                <%--$("#details").load(url,args);--%>
                <%--return false;--%>
            <%--});--%>
        <%--})--%>
    <%--</script>--%>


    <%--<script type="text/javascript">--%>
        <%--$(function () {--%>
            <%--$("#hup a").click(function () {--%>
                <%--var url = this.id;--%>
                <%--var cpuimg=$("#"+url).attr("cpuimg");--%>
                <%--var cpuprice=$("#"+url).attr("cpuprice");--%>
                <%--var cpuname=$("#"+url).attr("cpuname")--%>
                <%--var totalnumber=sessionStorage.getItem('totalnumber');--%>
                <%--if(totalnumber==null){--%>
                    <%--totalnumber=0;--%>
                <%--}--%>
                <%--totalnumber=parseInt(totalnumber)+1;--%>
                <%--sessionStorage.setItem('totalnumber',totalnumber);--%>
                <%--document.getElementById("hardwarenumber").innerText=totalnumber.toString();--%>
                <%--var totalprice=sessionStorage.getItem('totalprice')--%>
                <%--if(totalprice==null){--%>
                    <%--totalprice=0;--%>
                <%--}--%>
                <%--var price=parseInt(cpuprice)+parseInt(totalprice)--%>
                <%--sessionStorage.setItem('totalprice',price);--%>
                <%--document.getElementById("totalprice").innerHTML=price.toString();--%>
                <%--alert(cpuimg+cpuprice+cpuname);--%>
                <%--sessionStorage.setItem('url',url);--%>
                <%--$('#content').append(' <li>\n' +--%>
                    <%--'            <a href="product-details-right-sidebar.html" class="minicart-product-image">\n' +--%>
                    <%--'                <img src='+cpuimg+' alt="cart products">\n' +--%>
                    <%--'                </a>\n' +--%>
                    <%--'                <div class="minicart-product-details">\n' +--%>
                    <%--'                <h6><a href="product-details-right-sidebar.html">'+cpuname+'</a></h6>\n' +--%>
                    <%--'            <span>'+cpuprice+'</span>\n' +--%>
                    <%--'            </div>\n' +--%>
                    <%--'            <button class="close" title="Remove">\n' +--%>
                    <%--'                <i class="fa fa-close"></i>\n' +--%>
                    <%--'                </button>\n' +--%>
                    <%--'                </li>');--%>
                <%--return false;--%>
            <%--});--%>
        <%--})--%>
    <%--</script>--%>


    <%--<script type="text/javascript">--%>
        <%--$ (function ()--%>
        <%--{--%>
            <%--$ ('#add').click (function ()--%>
            <%--{--%>
                <%--if($("#content").children().length >=5){--%>
                    <%--alert("最多允许添加5个")--%>
                    <%--return;--%>
                <%--}--%>
                <%--// $('#content').append('<li class="item" >'+$("#content").children().length+'</li>');--%>

                <%--$('#content').append(' <li>\n' +--%>
                    <%--'            <a href="product-details-right-sidebar.html" class="minicart-product-image">\n' +--%>
                    <%--'                <img src="../images/product/small-size/5.jpg" alt="cart products">\n' +--%>
                    <%--'                </a>\n' +--%>
                    <%--'                <div class="minicart-product-details">\n' +--%>
                    <%--'                <h6><a href="product-details-right-sidebar.html">Aenean eu tristique</a></h6>\n' +--%>
                    <%--'            <span>£40 x 1</span>\n' +--%>
                    <%--'            </div>\n' +--%>
                    <%--'            <button class="close" title="Remove">\n' +--%>
                    <%--'                <i class="fa fa-close"></i>\n' +--%>
                    <%--'                </button>\n' +--%>
                    <%--'                </li>');--%>

            <%--});--%>

            <%--$ ('#delete').click (function ()--%>
            <%--{--%>
                <%--var len = $("#content").children().length-1;--%>
                <%--if(len >=0){--%>
                    <%--$("ul li:eq("+len+")").remove();  //表示删除最后一个元素--%>
                <%--}else{--%>
                    <%--alert("还没有添加元素哦");--%>
                <%--}--%>


            <%--});--%>
        <%--})--%>

    <%--</script>--%>



<%--</head>--%>
<%--<body>--%>
<%--<!--[if lt IE 8]>--%>
<%--<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>--%>
<%--<![endif]-->--%>


<%--<!-- Begin Body Wrapper -->--%>
<%--<div class="body-wrapper">--%>
    <%--<!-- Begin Header Area -->--%>
    <%--<header>--%>
    <%--</header>--%>
    <%--<!-- Header Area End Here -->--%>
    <%--<!-- Begin Li's Breadcrumb Area -->--%>
    <%--<!-- Li's Breadcrumb Area End Here -->--%>

    <%--<!--右边开始-->--%>
    <%--<!-- Begin Li's Content Wraper Area -->--%>
    <%--<div class="content-wraper pt-60 pb-60 pt-sm-30">--%>
        <%--<div class="container">--%>
            <%--<div class="row">--%>
                <%--<div class="col-lg-9 order-1 order-lg-2">--%>
                    <%--<!-- 九宫格显示商品开始-->--%>
                    <%--<!-- shop-products-wrapper start -->--%>
                    <%--<div class="shop-products-wrapper">--%>
                        <%--<div class="tab-content">--%>
                            <%--<div id="grid-view" class="tab-pane fade active show" role="tabpanel">--%>
                                <%--<div class="product-area shop-product-area">--%>
                                    <%--<div class="row"  >--%>

                                        <%--<c:forEach var="item" items="${pageInfo1.list}"   step="1" >--%>
                                            <%--<div class="col-lg-4 col-md-4 col-sm-6 mt-40">--%>
                                                <%--<!-- single-product-wrap start -->--%>
                                                <%--<div class="single-product-wrap">--%>
                                                    <%--<div class="product-image">--%>
                                                        <%--<a href="single-product.html">--%>
                                                            <%--<img src="${item.hardDisk_img}" alt="Li's Product Image">--%>
                                                        <%--</a>--%>
                                                        <%--<span class="sticker">第${i+1}个</span>--%>
                                                    <%--</div>--%>
                                                    <%--<div class="product_desc">--%>
                                                        <%--<div class="product_desc_info">--%>
                                                            <%--<div class="product-review">--%>
                                                                <%--<h5 class="manufacturer">--%>
                                                                    <%--<a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">${item.hardDisk_brand}</a>--%>
                                                                <%--</h5>--%>
                                                                <%--<div class="rating-box">--%>
                                                                    <%--<ul class="rating">--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                                                    <%--</ul>--%>
                                                                <%--</div>--%>
                                                            <%--</div>--%>
                                                            <%--<h4><a class="product_name" href="${item.hardDisk_url}">${item.hardDisk_name}</a></h4>--%>
                                                            <%--<div class="price-box">--%>
                                                                <%--<span class="new-price">${item.hardDisk_price}</span>--%>
                                                            <%--</div>--%>
                                                        <%--</div>--%>
                                                        <%--<div class="add-actions" id="hup">--%>
                                                            <%--<ul class="add-actions-link">--%>
                                                                <%--<li class="add-cart active">--%>
                                                                    <%--<a href="#" id="${item.cpu_id}"  cpuprice="${item.cpu_price}" cpuname="${item.cpu_name}" cpuimg="${item.cpu_img}">加入配置单</a>--%>
                                                                        <%--&lt;%&ndash;<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal"  data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>&ndash;%&gt;--%>
                                                                <%--</li>--%>
                                                                    <%--&lt;%&ndash;<li>&ndash;%&gt;--%>
                                                                    <%--&lt;%&ndash;<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal" id="123" data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>&ndash;%&gt;--%>
                                                                    <%--&lt;%&ndash;</li>&ndash;%&gt;--%>
                                                                <%--<li>--%>
                                                                    <%--<button title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModal"  data-img="${item.cpu_img}" data-name="${item.cpu_name}" data-brand="${item.cpu_brand}" data-series="${item.cpu_series}" data-slottype="${item.cpu_slotType}" data-corenumber="${item.cpu_coreNumber}" data-price="${item.cpu_price}" data-integtool="${item.cpu_integTool}"><i class="fa fa-eye"></i></button>--%>
                                                                <%--</li>--%>
                                                                <%--<li>--%>
                                                                    <%--<input  type="hidden" id="${item.cpu_id}" value="${item.cpu_img}">--%>


                                                                <%--</li>--%>
                                                                <%--<li><a class="links-details" href="wishlist.html"><i class="fa fa-heart-o"></i></a></li>--%>
                                                            <%--</ul>--%>
                                                        <%--</div>--%>
                                                    <%--</div>--%>
                                                <%--</div>--%>
                                            <%--</div>--%>

                                        <%--</c:forEach>--%>

                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<!--列表显示开始-->--%>
                            <%--<div id="list-view" class="tab-pane fade product-list-view" role="tabpanel">--%>
                                <%--<div class="row">--%>
                                    <%--<div class="col">--%>
                                        <%--<c:forEach var="item" items="${pageInfo.list}"   step="1" >--%>
                                            <%--<div class="row product-layout-list">--%>
                                                <%--<div class="col-lg-3 col-md-5 ">--%>
                                                    <%--<div class="product-image">--%>
                                                        <%--<a href="single-product.html">--%>
                                                            <%--<img src="${item.cpu_img}" alt="Li's Product Image">--%>
                                                        <%--</a>--%>
                                                        <%--<span class="sticker">New</span>--%>
                                                    <%--</div>--%>
                                                <%--</div>--%>
                                                <%--<div class="col-lg-5 col-md-7">--%>
                                                    <%--<div class="product_desc">--%>
                                                        <%--<div class="product_desc_info">--%>
                                                            <%--<div class="product-review">--%>
                                                                <%--<h5 class="manufacturer">--%>
                                                                    <%--<a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">"${item.cpu_brand}"</a>--%>
                                                                <%--</h5>--%>
                                                                <%--<div class="rating-box">--%>
                                                                    <%--<ul class="rating">--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                                                        <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                                                    <%--</ul>--%>
                                                                <%--</div>--%>
                                                            <%--</div>--%>
                                                            <%--<h4><a class="product_name" href="single-product.html">"${item.cpu_name}"</a></h4>--%>
                                                            <%--<div class="price-box">--%>
                                                                <%--<span class="new-price">"${item.cpu_price}"</span>--%>
                                                            <%--</div>--%>
                                                            <%--<p> 系列: "${item.cpu_series}"</p>--%>
                                                            <%--<p> 插槽类型: "${item.cpu_slotType}"</p>--%>
                                                            <%--<p> 核心数量: "${item.cpu_coreNumber}"</p>--%>
                                                            <%--<p> 集成显卡: "${item.cpu_integTool}"</p>--%>
                                                            <%--<a href="${item.cpu_url}">购买链接</a>--%>
                                                        <%--</div>--%>
                                                    <%--</div>--%>
                                                <%--</div>--%>
                                                <%--<div class="col-lg-4">--%>
                                                    <%--<div class="shop-add-action mb-xs-30">--%>
                                                        <%--<ul class="add-actions-link">--%>
                                                            <%--<li class="add-cart"><a href="#">Add to cart</a></li>--%>
                                                            <%--<li class="wishlist"><a href="wishlist.html"><i class="fa fa-heart-o"></i>Add to wishlist</a></li>--%>
                                                            <%--<li><button class="quick-view" data-toggle="modal" data-target="#exampleModal"  data-whatever="333"><i class="fa fa-eye"></i>Quick view</button></li>--%>
                                                        <%--</ul>--%>
                                                    <%--</div>--%>
                                                <%--</div>--%>
                                            <%--</div>--%>

                                        <%--</c:forEach>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<!--列表显示结束-->--%>
                            <%--<!--分页开始-->--%>
                            <%--<div class="paginatoin-area">--%>
                                <%--<div class="row">--%>
                                    <%--<div class="col-lg-6 col-md-6 pt-xs-15">--%>
                                        <%--<p>Showing 1-12 of 13 item(s)</p>--%>
                                    <%--</div>--%>
                                    <%--<div class="col-lg-6 col-md-6">--%>
                                        <%--<ul class="pagination-box pt-xs-20 pb-xs-15">--%>
                                            <%--<li><a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${pageInfo1.pageNum-1}&size=9" class="Previous"><i class="fa fa-chevron-left"></i> Previous</a>--%>
                                            <%--</li>--%>

                                            <%--<c:forEach  begin="1" end="${pageInfo.pages}" var="PageNum">--%>
                                                <%--<li><a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${PageNum}&size=9">${PageNum}</a></li>--%>
                                            <%--</c:forEach>--%>
                                            <%--<li>--%>
                                                <%--<a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${pageInfo.pageNum+1}&size=9" class="Next"> Next <i class="fa fa-chevron-right"></i></a>--%>
                                            <%--</li>--%>
                                        <%--</ul>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<!--分页结束-->--%>

                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<!-- shop-products-wrapper end -->--%>
                    <%--<!-- 九宫格显示商品结束-->--%>

                <%--</div>--%>
                <%--<!--用于显示参数-->--%>
                <%--<div id="details">--%>

                <%--</div>--%>

            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<!-- Content Wraper Area End Here -->--%>
    <%--<!--右边开始-->--%>


    <%--<!--模板的弹窗开始-->--%>
    <%--<!-- Begin Quick View | Modal Area -->--%>
    <%--<div class="modal fade modal-wrapper" id="exampleModalCenter" >--%>
        <%--<div class="modal-dialog modal-dialog-centered" role="document">--%>
            <%--<div class="modal-content">--%>
                <%--<div class="modal-body">--%>
                    <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                        <%--<span aria-hidden="true">&times;</span>--%>
                    <%--</button>--%>
                    <%--<div class="modal-inner-area row">--%>
                        <%--<div class="col-lg-5 col-md-6 col-sm-6">--%>
                            <%--<!-- Product Details Left -->--%>
                            <%--<div class="product-details-left">--%>
                                <%--<div class="product-details-images slider-navigation-1">--%>

                                    <%--<c:forEach var="item" items="${pageInfo.list}"   step="1" >--%>
                                        <%--<div class="lg-image">--%>
                                            <%--<img src="${item.cpu_img}" alt="product image">--%>
                                        <%--</div>--%>
                                    <%--</c:forEach>--%>

                                <%--</div>--%>
                                <%--<div class="product-details-thumbs slider-thumbs-1">--%>
                                    <%--<c:forEach var="item" items="${pageInfo.list}"   step="1" >--%>
                                        <%--<div class="sm-image"><img src="${item.cpu_img}" alt="product image thumb"></div>--%>
                                    <%--</c:forEach>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                            <%--<!--// Product Details Left -->--%>
                        <%--</div>--%>

                        <%--<div class="col-lg-7 col-md-6 col-sm-6">--%>
                            <%--<div class="product-details-view-content pt-60">--%>
                                <%--<div class="product-info">--%>
                                    <%--<h2>Today is a good day Framed poster</h2>--%>
                                    <%--<span class="product-details-ref">Reference: demo_15</span>--%>
                                    <%--<div class="rating-box pt-20">--%>
                                        <%--<ul class="rating rating-with-review-item">--%>
                                            <%--<li><i class="fa fa-star-o"></i></li>--%>
                                            <%--<li><i class="fa fa-star-o"></i></li>--%>
                                            <%--<li><i class="fa fa-star-o"></i></li>--%>
                                            <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                            <%--<li class="no-star"><i class="fa fa-star-o"></i></li>--%>
                                        <%--</ul>--%>
                                    <%--</div>--%>
                                    <%--<div class="price-box pt-20">--%>
                                        <%--<span class="new-price new-price-2">${id}</span>--%>
                                    <%--</div>--%>
                                    <%--<div class="product-desc">--%>
                                        <%--<p>--%>
                                                    <%--<span>100% cotton double printed dress. Black and white striped top and orange high waisted skater skirt bottom. Lorem ipsum dolor sit amet, consectetur adipisicing elit. quibusdam corporis, earum facilis et nostrum dolorum accusamus similique eveniet quia pariatur.--%>
                                                    <%--</span>--%>
                                        <%--</p>--%>
                                    <%--</div>--%>

                                    <%--<div class="single-add-to-cart">--%>
                                        <%--<form action="#" class="cart-quantity">--%>
                                            <%--<button class="add-to-cart" type="submit">Add to cart</button>--%>
                                        <%--</form>--%>
                                    <%--</div>--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<!-- Quick View | Modal Area End Here -->--%>
    <%--<!--模板的弹窗结束-->--%>

<%--</div>--%>

<%--<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">--%>
    <%--<div class="modal-dialog" role="document">--%>
        <%--<div class="modal-content">--%>
            <%--<div class="modal-header">--%>
                <%--<h4>商品详情</h4>--%>
                <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span--%>
                        <%--aria-hidden="true">×</span></button>--%>

            <%--</div>--%>
            <%--<div class="modal-body">--%>
                <%--<form>--%>
                    <%--<div class="form-group">--%>

                        <%--&lt;%&ndash;<a><%=session.getAttribute("img")%></a>&ndash;%&gt;--%>
                        <%--<div class="product-details-left" style="float: left; margin-right:30px; margin-right:18px">--%>
                            <%--<img id="image" src="#">--%>

                        <%--</div>--%>
                        <%--<div class="product-details-right" style="float: left; margin-left:48px ">--%>
                            <%--<p>--%>
                                <%--<em id="modal_cpu_name" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--品牌：--%>
                                <%--<em id="modal_cpu_brand" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--类型：--%>
                                <%--<em id="modal_cpu_series" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--插槽类型：--%>
                                <%--<em id="modal_cpu_slottype" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--核心数量：--%>
                                <%--<em id="modal_cpu_corenumber" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--价格：--%>
                                <%--<em id="modal_cpu_price" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                            <%--<p>--%>
                                <%--集成显卡：--%>
                                <%--<em id="modal_cpu_integtool" style="color: #0b0b0b"></em>--%>
                            <%--</p>--%>
                        <%--</div>--%>

                    <%--</div>--%>
                <%--</form>--%>
            <%--</div>--%>
            <%--<!--  <div class="modal-footer">--%>
                  <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                  <%--<button type="button" class="btn btn-primary">Send message</button>--%>
              <%--</div>--%>
              <%---->--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

<%--<!-- Body Wrapper End Here -->--%>
<%--<!-- jQuery-V1.12.4 -->--%>
<%--<script src="../js/vendor/jquery-1.12.4.min.js"></script>--%>
<%--<!-- Popper js -->--%>
<%--<script src="../js/vendor/popper.min.js"></script>--%>
<%--<!-- Bootstrap V4.1.3 Fremwork js -->--%>
<%--<script src="../js/bootstrap.min.js"></script>--%>
<%--<!-- Ajax Mail js -->--%>
<%--<script src="../js/ajax-mail.js"></script>--%>
<%--<!-- Meanmenu js -->--%>
<%--<script src="../js/jquery.meanmenu.min.js"></script>--%>
<%--<!-- Wow.min js -->--%>
<%--<script src="../js/wow.min.js"></script>--%>
<%--<!-- Slick Carousel js -->--%>
<%--<script src="../js/slick.min.js"></script>--%>
<%--<!-- Owl Carousel-2 js -->--%>
<%--<script src="../js/owl.carousel.min.js"></script>--%>
<%--<!-- Magnific popup js -->--%>
<%--<script src="../js/jquery.magnific-popup.min.js"></script>--%>
<%--<!-- Isotope js -->--%>
<%--<script src="../js/isotope.pkgd.min.js"></script>--%>
<%--<!-- Imagesloaded js -->--%>
<%--<script src="../js/imagesloaded.pkgd.min.js"></script>--%>
<%--<!-- Mixitup js -->--%>
<%--<script src="../js/jquery.mixitup.min.js"></script>--%>
<%--<!-- Countdown -->--%>
<%--<script src="../js/jquery.countdown.min.js"></script>--%>
<%--<!-- Counterup -->--%>
<%--<script src="../js/jquery.counterup.min.js"></script>--%>
<%--<!-- Waypoints -->--%>
<%--<script src="../js/waypoints.min.js"></script>--%>
<%--<!-- Barrating -->--%>
<%--<script src="../js/jquery.barrating.min.js"></script>--%>
<%--<!-- Jquery-ui -->--%>
<%--<script src="../js/jquery-ui.min.js"></script>--%>
<%--<!-- Venobox -->--%>
<%--<script src="../js/venobox.min.js"></script>--%>
<%--<!-- Nice Select js -->--%>
<%--<script src="../js/jquery.nice-select.min.js"></script>--%>
<%--<!-- ScrollUp js -->--%>
<%--<script src="../js/scrollUp.min.js"></script>--%>
<%--<!-- Main/Activator js -->--%>
<%--<script src="../js/main.js"></script>--%>
<%--<script>--%>
    <%--//绑定模态框展示的方法--%>
    <%--$('#exampleModal').on('show.bs.modal', function (event) {--%>
        <%--var button = $(event.relatedTarget) ;// 触发事件的按钮--%>
        <%--var recipient = button.data('img') ;// 解析出imge内容--%>


        <%--var name=button.data('name');--%>
        <%--var brand=button.data('brand');--%>
        <%--var series=button.data('series');--%>
        <%--var slottype=button.data('slottype');--%>
        <%--var corenumber=button.data('corenumber');--%>
        <%--var price=button.data('price');--%>
        <%--var integtool=button.data('integtool');--%>

        <%--document.getElementById("modal_cpu_name").innerHTML=name;--%>
        <%--document.getElementById("modal_cpu_brand").innerHTML=brand;--%>
        <%--document.getElementById("modal_cpu_series").innerHTML=series;--%>
        <%--document.getElementById("modal_cpu_slottype").innerHTML=slottype;--%>
        <%--document.getElementById("modal_cpu_corenumber").innerHTML=corenumber;--%>
        <%--document.getElementById("modal_cpu_price").innerHTML=price;--%>
        <%--document.getElementById("modal_cpu_integtool").innerHTML=integtool;--%>

        <%--var modal = $(this);  //获得模态框本身--%>

        <%--document.getElementById("image").src=recipient;--%>

        <%--// window.alert(recipient)--%>
        <%--modal.find('.modal-title').text('Message To ' + recipient) ; // 更改将title的text--%>
        <%--modal.find('.modal-body input').val(recipient);--%>

    <%--})--%>
<%--</script>--%>
<%--</body>--%>
<%--</html>--%>
<%--
  Created by IntelliJ IDEA.
  User: 16348
  Date: 2019/7/6
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>

</head>
<body>
<!-- 九宫格显示商品开始-->
<!-- shop-products-wrapper start -->
<div class="shop-products-wrapper" >
    <div class="tab-content">
        <div id="grid-view" class="tab-pane fade active show" role="tabpanel">
            <div class="product-area shop-product-area">
                <div class="row"  >

                    <c:forEach var="item" items="${pageInfo1.list}"   step="1" >
                        <div class="col-lg-4 col-md-4 col-sm-6 mt-40">
                            <!-- single-product-wrap start -->
                            <div class="single-product-wrap">
                                <div class="product-image">
                                    <a href="single-product.html">
                                        <img src="${item.hardDisk_img}" alt="Li's Product Image">
                                    </a>
                                    <span class="sticker">第${i+1}个</span>
                                </div>
                                <div class="product_desc">
                                    <div class="product_desc_info">
                                        <div class="product-review">
                                            <h5 class="manufacturer">
                                                <a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">${item.hardDisk_brand}</a>
                                            </h5>
                                            <div class="rating-box">
                                                <ul class="rating">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <h4><a class="product_name" href="${item.hardDisk_url}">${item.hardDisk_name}</a></h4>
                                        <div class="price-box">
                                            <span class="new-price">${item.hardDisk_price}</span>
                                        </div>
                                    </div>
                                    <div class="add-actions" id="hup">
                                        <ul class="add-actions-link">
                                            <li class="add-cart active">
                                                <a href="#" id="${item.hardDisk_id}"  cpuprice="${item.hardDisk_price}" cpuname="${item.hardDisk_name}" cpuimg="${item.hardDisk_img}">加入配置单</a>
                                                    <%--<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal"  data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>--%>
                                            </li>
                                                <%--<li>--%>
                                                <%--<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal" id="123" data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>--%>
                                                <%--</li>--%>
                                            <li>
                                                <button title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModal"  data-img="${item.hardDisk_img}" data-name="${item.hardDisk_name}" data-brand="${item.hardDisk_brand}" data-price="${item.hardDisk_price}" data-useKind="${item.hardDisk_useKind}"
                                                        data-series="${item.cpu_series}" data-capacity="${item.hardDisk_capacity}" data-interKind="${item.hardDisk_interKind}"  data-speed="${item.hardDisk_speed}" data-sizeof="${item.hardDisk_sizeof}"data-cache="${item.hardDisk_cache}">
                                                    <i class="fa fa-eye"></i></button>
                                            </li>
                                            <li>
                                                <input  type="hidden" id="${item.hardDisk_id}" value="${item.hardDisk_img}">


                                            </li>
                                            <li><a class="links-details" href="wishlist.html"><i class="fa fa-heart-o"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </c:forEach>

                </div>
            </div>
        </div>
        <!--列表显示开始-->
        <div id="list-view" class="tab-pane fade product-list-view" role="tabpanel">
            <div class="row">
                <div class="col">
                    <c:forEach var="item" items="${pageInfo1.list}"   step="1" >
                        <div class="row product-layout-list">
                            <div class="col-lg-3 col-md-5 ">
                                <div class="product-image">
                                    <a href="single-product.html">
                                        <img src="${item.hardDisk_img}" alt="Li's Product Image">
                                    </a>
                                    <span class="sticker">New</span>
                                </div>
                            </div>
                            <div class="col-lg-5 col-md-7">
                                <div class="product_desc">
                                    <div class="product_desc_info">
                                        <div class="product-review">
                                            <h5 class="manufacturer">
                                                <a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">"${item.hardDisk_brand}"</a>
                                            </h5>
                                            <div class="rating-box">
                                                <ul class="rating">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li><i class="fa fa-star-o"></i></li>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <h4><a class="product_name" href="single-product.html">"${item.hardDisk_name}"</a></h4>
                                        <div class="price-box">
                                            <span class="new-price">"${item.hardDisk_price}"</span>
                                        </div>
                                            <%--<p> 系列: "${item.cpu_series}"</p>--%>
                                            <%--<p> 插槽类型: "${item.cpu_slotType}"</p>--%>
                                            <%--<p> 核心数量: "${item.cpu_coreNumber}"</p>--%>
                                            <%--<p> 集成显卡: "${item.cpu_integTool}"</p>--%>
                                            <%--<a href="${item.cpu_url}">购买链接</a>--%>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="shop-add-action mb-xs-30">
                                    <ul class="add-actions-link">
                                        <li class="add-cart"><a href="#">Add to cart</a></li>
                                        <li class="wishlist"><a href="wishlist.html"><i class="fa fa-heart-o"></i>Add to wishlist</a></li>
                                        <li><button class="quick-view" data-toggle="modal" data-target="#exampleModal"  data-whatever="333"><i class="fa fa-eye"></i>Quick view</button></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                    </c:forEach>
                </div>
            </div>
        </div>
        <!--列表显示结束-->
        <!--分页开始-->
        <div class="paginatoin-area">
            <div class="row">
                <div class="col-lg-6 col-md-6 pt-xs-15">
                    <p>Showing 1-12 of 13 item(s)</p>
                </div>
                <div class="col-lg-6 col-md-6">
                    <ul class="pagination-box pt-xs-20 pb-xs-15">
                        <li><a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${pageInfo.pageNum-1}&size=9" class="Previous"><i class="fa fa-chevron-left"></i> Previous</a>
                        </li>

                        <c:forEach  begin="1" end="${pageInfo1.pages}" var="PageNum">
                            <li><a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${PageNum}&size=9">${PageNum}</a></li>
                        </c:forEach>
                        <li>
                            <a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${pageInfo1.pageNum+1}&size=9" class="Next"> Next <i class="fa fa-chevron-right"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!--分页结束-->

    </div>
</div>
<!-- shop-products-wrapper end -->
<!-- 九宫格显示商品结束-->
</body>
</html>
