
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="no-js" lang="zxx">
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
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="../css/responsive.css">
    <!-- Modernizr js -->
    <script src="../js/vendor/modernizr-2.8.3.min.js"></script>
    <script src="../js/jquery-1.7.2.js"></script>





    <script type="text/javascript">
        $(function () {
            $("#hup a").click(function () {
                var graphicsid = this.id;
                var graphics_id=graphicsid;
                // alert("monitor"+monitorid)
                sessionStorage.setItem("hardware",graphicsid);//将选择的硬件放入session中
                var graphicsprice=$("#"+graphicsid).attr("graphicsprice");
                var graphicsimg=$("#"+graphicsid).attr("graphicsimg");
                var graphicsname=$("#"+graphicsid).attr("graphicsname");


                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/Graphics/searchIfExistGraphics.do",
                    data:{graphics_id:graphics_id
                    },
                    dataType:"json",
                    success:function(data){
                        if(data.flag=="ok"){
                            //alert("abc"+monitorimg+monitorprice+monitorname);
                            $('#content').append(' <li>\n' +
                                '            <a href="product-details-right-sidebar.html" class="minicart-product-image">\n' +
                                '                <img src='+graphicsimg+' alt="cart products">\n' +
                                '                </a>\n' +
                                '                <div class="minicart-product-details">\n' +
                                '                <h6><a href="product-details-right-sidebar.html">'+graphicsname+'</a></h6>\n' +
                                '            <span>'+graphicsprice+'</span>\n' +
                                '            </div>\n' +
                                '            <button class="close" title="Remove">\n' +
                                '                <i class="fa fa-close"></i>\n' +
                                '                </button>\n' +
                                '                </li>');
                            alert('加入配置单成功！');
                        }else if(data.flag == "exist"){
                            alert('重复加载');//sessionmonitor_id
                            return false;
                        }else if(data.flag == "notdig"){
                            alert('电话号码非法！');
                            return false;
                        }
                    }
                })
                return false;
            });
        })
    </script>

    <!--发表配置单-->
    <script type="text/javascript">
        function publishSheet(){

            var tel_num="${selfInfo.tel_num}";

            var username="${selfInfo.username}";
            var password="${selfInfo.password}";
            alert(tel_num+username+password);
            alert("123");
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/sheet/publishSheet.do",
                data:{username:username,password:password,tel_num:tel_num
                },
                dataType:"json",
                success:function(data){
                    if(data.flag=="ok"){
                        alert('发表成功！')
                        <%--location.href="${pageContext.request.contextPath}/skip/tologinandregister.do";--%>
                    }else if(data.flag == "exist"){
                        alert('电话号码已存在！');
                    }else if(data.flag == "notdig"){
                        alert('电话号码非法！');
                    }
                }
            })
        }
    </script>


    <%-- tel_num:tel_num,cpu_id:cpu_id, graphics_id:graphics_id, harddisk_id:harddisk_id, keyboard_id:keyboard_id,
     memory_id:memory_id,monitor_id:monitor_id,motherboard_id:motherboard_id,mouse_id:mouse_id,
     netcard_id:netcard_id,power_id:power_id,soudcard_id:soudcard_id,ssd_id:ssd_id,datatime:datetime--%>


</head>
<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->


<!-- Begin Body Wrapper -->
<div class="body-wrapper">
    <!-- Begin Header Area -->
    <header>

        <!--显示配置广场和用户名开始-->
        <!-- Begin Header Top Area -->
        <div class="header-top">
            <div class="container">
                <div class="row">
                    <!-- Begin Header Top Left Area -->
                    <div class="col-lg-3 col-md-4">
                    </div>
                    <!-- Header Top Left Area End Here -->
                    <!-- Begin Header Top Right Area -->
                    <div class="col-lg-9 col-md-8">
                        <div class="header-top-right">
                            <ul class="ht-menu">
                                <!-- Begin Setting Area -->
                                <li>
                                    <div class="ht-setting-trigger"><a>配置广场</a></div>
                                </li>
                                <!-- Setting Area End Here -->
                                <!-- Begin Currency Area -->
                                <li>
                                    <span class="currency-selector-wrapper"></span>

                                    <a  href="${pageContext.request.contextPath}/user/toSelfPage.do">${selfInfo.username}</a>
                                </li>
                                <!-- Language Area End Here -->
                            </ul>
                        </div>
                    </div>
                    <!-- Header Top Right Area End Here -->
                </div>
            </div>
        </div>
        <!-- Header Top Area End Here -->
        <!--显示配置广场和用户名结束-->
        <!--显示顶部包括Logo和查看配置单按钮开始-->
        <!-- Begin Header Middle Area -->
        <div class="header-middle pl-sm-0 pr-sm-0 pl-xs-0 pr-xs-0">
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

                        <!--显示配置单按钮开始>
                        <!-- Begin Header Middle Right Area -->
                        <div class="header-middle-right">
                            <ul class="hm-menu" >
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
                                                    <span class="cart-item-count" id="hardwarenumber">0</span>
                                                </span>
                                    </div>
                                    <span></span>
                                    <div class="minicart">
                                        <ul class="minicart-product-list" id="content">


                                            <c:forEach var="item" items="${cpuList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.cpu_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.cpu_name}</a></h6>
                                                        <span>${item.cpu_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>

                                            <c:forEach var="item" items="${memoryList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.memory_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.memory_name}</a></h6>
                                                        <span>${item.memory_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>
                                            <c:forEach var="item" items="${motherboardList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.motherboard_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.motherboard_name}</a></h6>
                                                        <span>${item.motherboard_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>



                                            <c:forEach var="item" items="${harddiskList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.hardDisk_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.hardDisk_name}</a></h6>
                                                        <span>${item.hardDisk_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>
                                            <c:forEach var="item" items="${ssdList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.ssd_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.ssd_name}</a></h6>
                                                        <span>${item.ssd_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>

                                            <c:forEach var="item" items="${graphicsList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.graphics_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.graphics_name}</a></h6>
                                                        <span>${item.graphics_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>


                                            <c:forEach var="item" items="${soundcardList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.soundCard_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.soundCard_name}</a></h6>
                                                        <span>${item.soundCard_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>

                                            <c:forEach var="item" items="${netcardList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.netcard_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.netcard_name}</a></h6>
                                                        <span>${item.netcard_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>
                                            <c:forEach var="item" items="${monitorList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.monitor_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.monitor_name}</a></h6>
                                                        <span>${item.monitor_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>

                                            <c:forEach var="item" items="${powerList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.power_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.power_name}</a></h6>
                                                        <span>${item.power_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>
                                            <c:forEach var="item" items="${mouseList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.mouse_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.mouse_name}</a></h6>
                                                        <span>${item.mouse_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>
                                            <c:forEach var="item" items="${keyboardList}"   step="1" >
                                                <li>
                                                    <a href="product-details-right-sidebar.html" class="minicart-product-image">
                                                        <img src="${item.keyboard_img}" alt="cart products">
                                                    </a>
                                                    <div class="minicart-product-details">
                                                        <h6><a href="product-details-right-sidebar.html">${item.keyboard_name}</a></h6>
                                                        <span>${item.keyboard_price}</span>
                                                    </div>
                                                    <button class="close" title="Remove">
                                                        <i class="fa fa-close"></i>
                                                    </button>
                                                </li>

                                            </c:forEach>

                                        </ul>
                                        <p class="minicart-total">SUBTOTAL: <span id="totalprice"></span></p>
                                        <div class="minicart-button">
                                            <%--<a href="http://demo.hasthemes.com/limupa-v1/limupa/shopping.html" class="li-button li-button-fullwidth li-button-dark">--%>
                                            <button  onclick="location.href='${pageContext.request.contextPath}/sheet/publishSheet.do'">发表配置单</button>
                                            <%--</a>--%>
                                        </div>
                                    </div>
                                </li>
                                <!-- Header Mini Cart Area End Here -->
                            </ul>
                        </div>
                        <!-- Header Middle Right Area End Here -->
                        <!--显示配置单按钮结束-->


                    </div>
                    <!-- Header Middle Right Area End Here -->
                </div>
            </div>
        </div>
        <!-- Header Middle Area End Here -->
        <!--显示顶部包括Logo和查看配置单按钮结束-->

        <!--显示顶部筛选开始-->
        <!-- Begin Header Bottom Area -->
        <div class="header-bottom mb-0 header-sticky stick d-none d-lg-block d-xl-block">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <!-- Begin Header Bottom Menu Area -->
                        <div class="hb-menu" id="showHardWare">
                            <nav>
                                <ul>
                                    <li><a id="id1" href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=1&size=9" >cpu</a><li>
                                    <li><a id="id2" href="${pageContext.request.contextPath}/memory/findAllMemoryInformation.do?page=1&size=9"  >内存</a><li>
                                    <li><a id="id3" href="${pageContext.request.contextPath}/motherboard/findAllMotherboardInformation.do?page=1&size=9" >主板</a><li>
                                    <li><a id="id4" href="${pageContext.request.contextPath}/HardDisk/findAllHardDiskInformation.do?page=1&size=9">硬盘</a><li>
                                    <li><a id="id5" href="${pageContext.request.contextPath}/Ssd/findAllSsdInformation.do?page=1&size=9" >固态硬盘</a><li>
                                    <li><a id="id6" href="${pageContext.request.contextPath}/Graphics/findAllGraphicsInformation.do?page=1&size=9">显卡</a><li>
                                    <li><a id="id7" href="${pageContext.request.contextPath}/SoundCard/findAllSoundCardInformation.do?page=1&size=9">声卡</a><li>
                                    <li><a id="id8" href="${pageContext.request.contextPath}/NetCard/findAllNetCardInformation.do?page=1&size=9">网卡</a><li>
                                    <li><a id="id9" href="${pageContext.request.contextPath}/Monitor/findAllMonitorInformation.do?page=1&size=9">显示器</a><li>
                                    <li><a id="id10" href="${pageContext.request.contextPath}/power/findAllPowerInformation.do?page=1&size=9">电源</a><li>
                                    <li><a id="id11" href="${pageContext.request.contextPath}/mouse/findAllMouseInformation.do?page=1&size=9">鼠标</a><li>
                                    <li><a id="id12" href="${pageContext.request.contextPath}/keyboard/findAllKeyboardInformation.do?page=1&size=9">键盘</a></li>
                                </ul>





                            </nav>
                        </div>
                        <!-- Header Bottom Menu Area End Here -->
                    </div>
                </div>
            </div>
        </div>
        <!-- Header Bottom Area End Here -->
        <!--显示顶部筛选结束-->
        <!-- Begin Mobile Menu Area -->

        <!-- Mobile Menu Area End Here -->
    </header>
    <!-- Header Area End Here -->
    <!-- Begin Li's Breadcrumb Area -->
    <!-- Li's Breadcrumb Area End Here -->

    <!--右边开始-->
    <!-- Begin Li's Content Wraper Area -->
    <div class="content-wraper pt-60 pb-60 pt-sm-30" >
        <div class="container">
            <div class="row">
                <div class="col-lg-9 order-1 order-lg-2" id="content2">

                    <!--广告显示开始-->
                    <!-- Begin Li's Banner Area -->
                    <div class="single-banner shop-page-banner">
                        <a href="#">
                            <img src="../images/bg-banner/2.jpg" alt="Li's Static Banner">
                        </a>
                    </div>
                    <!-- Li's Banner Area End Here -->
                    <!-- shop-top-bar start -->
                    <div class="shop-top-bar mt-30">
                        <div class="shop-bar-inner">
                            <div class="product-view-mode">
                                <!-- shop-item-filter-list start -->
                                <ul class="nav shop-item-filter-list" role="tablist">
                                    <li class="active" role="presentation"><a aria-selected="true" class="active show" data-toggle="tab" role="tab" aria-controls="grid-view" href="#grid-view"><i class="fa fa-th"></i></a></li>
                                    <li role="presentation"><a data-toggle="tab" role="tab" aria-controls="list-view" href="#list-view"><i class="fa fa-th-list"></i></a></li>
                                </ul>
                                <!-- shop-item-filter-list end -->
                            </div>
                        </div>

                    </div>
                    <!-- shop-top-bar end -->
                    <!--广告显示开始-->

                    <!-- 九宫格显示商品开始-->
                    <!-- shop-products-wrapper start -->
                    <div class="shop-products-wrapper" >
                        <div class="tab-content">
                            <div id="grid-view" class="tab-pane fade active show" role="tabpanel">
                                <div class="product-area shop-product-area">
                                    <div class="row"  >

                                        <c:forEach var="item" items="${pageInfo.list}"   step="1" >
                                            <div class="col-lg-4 col-md-4 col-sm-6 mt-40">
                                                <!-- single-product-wrap start -->
                                                <div class="single-product-wrap">
                                                    <div class="product-image">
                                                        <a href="single-product.html">
                                                            <img src="${item.graphics_img}" alt="Li's Product Image">
                                                        </a>
                                                        <span class="sticker">第${i+1}个</span>
                                                    </div>
                                                    <div class="product_desc">
                                                        <div class="product_desc_info">
                                                            <div class="product-review">
                                                                <h5 class="manufacturer">
                                                                    <a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">${item.graphics_brand}</a>
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
                                                            <h4><a class="product_name" href="${item.graphics_url}">${item.graphics_name}</a></h4>
                                                            <div class="price-box">
                                                                <span class="new-price">${item.graphics_price}</span>
                                                            </div>
                                                        </div>
                                                        <div class="add-actions" id="hup">
                                                            <ul class="add-actions-link">
                                                                <li class="add-cart active">
                                                                    <a href="#" id="${item.graphics_id}"  graphicsprice="${item.graphics_price}" graphicsname="${item.graphics_name}" graphicsimg="${item.graphics_img}">加入配置单</a>
                                                                        <%--<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal"  data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>--%>
                                                                </li>
                                                                    <%--<li>--%>
                                                                    <%--<button href="#" title="quick view" class="quick-view-btn" data-toggle="modal" id="123" data-target="#exampleModal"  data-whatever=${item.cpu_id}><i class="fa fa-eye"></i></button>--%>
                                                                    <%--</li>--%>
                                                                <li>
                                                                    <button title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModal"  data-img="${item.graphics_img}" data-name="${item.graphics_name}" data-brand="${item.graphics_brand}" data-capacity="${item.graphics_capacity}" data-chip="${item.graphics_chip}" data-memorykind="${item.graphics_memorykind}" data-price="${item.graphics_price}" data-iointer="${item.graphics_ioInter}"><i class="fa fa-eye"></i></button>
                                                                </li>
                                                                <li>
                                                                    <input  type="hidden" id="${item.graphics_id}" value="${item.graphics_img}">


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
                                        <c:forEach var="item" items="${pageInfo.list}"   step="1" >
                                            <div class="row product-layout-list">
                                                <div class="col-lg-3 col-md-5 ">
                                                    <div class="product-image">
                                                        <a href="single-product.html">
                                                            <img src="${item.graphics_img}" alt="Li's Product Image">
                                                        </a>
                                                        <span class="sticker">New</span>
                                                    </div>
                                                </div>
                                                <div class="col-lg-5 col-md-7">
                                                    <div class="product_desc">
                                                        <div class="product_desc_info">
                                                            <div class="product-review">
                                                                <h5 class="manufacturer">
                                                                    <a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">"${item.graphics_brand}"</a>
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
                                                            <h4><a class="product_name" href="single-product.html">"${item.graphics_name}"</a></h4>
                                                            <div class="price-box">
                                                                <span class="new-price">"${item.graphics_price}"</span>
                                                            </div>
                                                            <p> 显卡品牌: "${item.graphics_brand}"</p>
                                                            <p> 显卡类型: "${item.graphics_kind}"</p>
                                                            <p> 显卡芯片: "${item.graphics_chip}"</p>
                                                            <p> 显存容量: "${item.graphics_capacity}"</p>
                                                            <a href="${item.graphics_url}">购买链接</a>
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
                                            <li><a href="${pageContext.request.contextPath}/Graphics/findAllGraphicsInformation.do?page=${pageInfo.pageNum-1}&size=9" class="Previous"><i class="fa fa-chevron-left"></i> Previous</a>
                                            </li>

                                            <c:forEach  begin="1" end="${pageInfo.pages}" var="PageNum">
                                                <li><a href="${pageContext.request.contextPath}/Graphics/findAllGraphicsInformation.do?page=${PageNum}&size=9">${PageNum}</a></li>
                                            </c:forEach>
                                            <li>
                                                <a href="${pageContext.request.contextPath}/Graphics/findAllGraphicsInformation.do?page=${pageInfo.pageNum+1}&size=9" class="Next"> Next <i class="fa fa-chevron-right"></i></a>
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

                </div>
                <!--用于显示参数-->


                <div class="col-lg-3 order-2 order-lg-1">
                    <!--sidebar-categores-box start  -->

                    <!--sidebar-categores-box end  -->
                    <!--sidebar-categores-box start  -->
                    <div class="sidebar-categores-box">
                        <div class="sidebar-title">
                            <h2>显卡</h2>
                        </div>
                        <!-- btn-clear-all start -->
                        <button class="btn-clear-all mb-sm-30 mb-xs-30">Clear all</button>
                        <!-- btn-clear-all end -->
                        <!-- filter-sub-area start -->
                        <div class="filter-sub-area">
                            <h5 class="filter-sub-titel">推荐品牌</h5>
                            <div class="categori-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">ASL翔升</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">昂达</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">北影</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">迪兰</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">EVGA</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">恩微</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">富彩</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">耕升</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">华硕</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">华擎</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">HIS</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">Intel</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">精影</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">旌宇</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">精雷</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">景钛</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">技嘉</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">蓝宝石</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">镭风</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">丽台</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">MSI微星</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">铭瑄</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">铭影</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">梅捷</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">铭鑫</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">磐镭</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">苹果</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">PNY</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">七彩虹</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">乔帝</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">祺祥</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">索泰</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">双敏</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">太阳花</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">万丽</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">小影霸</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">XFX讯景</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">小妖G</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">影驰</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">映众</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">盈通</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">映泰</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                        <!-- filter-sub-area end -->
                        <!-- filter-sub-area start -->
                        <div class="filter-sub-area pt-sm-10 pt-xs-10">
                            <h5 class="filter-sub-titel">价格区间</h5>
                            <div class="categori-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">500元以下</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">500-1000元</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">1000-1500元</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">1500-2000元</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">2000-3000元</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">3000元以上</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                        <!-- filter-sub-area end -->
                        <!-- filter-sub-area start -->
                        <div class="filter-sub-area pt-sm-10 pt-xs-10">
                            <h5 class="filter-sub-titel">显卡芯片</h5>
                            <div class="size-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA RTX 2080Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA RTX 2080</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA RTX 2070</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA RTX 2060</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1660Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1660</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1650</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1080Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1080</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1070Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1070</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1060</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1050Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 1050</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GT 1030</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 980Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 980</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 970</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 960</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 950</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX Titan</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 750Ti</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">NVIDIA GTX 750</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX Vega 64</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD Radeon VII</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX Vega 56</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 560XT</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 FURY X</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 590</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 580</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 570</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 560D</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 560</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 550</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 480</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 470</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 470D</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD RX 460</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 390X</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 390</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 380X</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 380</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 370X</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R9 370</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R7 360</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">AMD R7 350</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">其它</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                        <!-- filter-sub-area end -->
                        <!-- filter-sub-area start -->
                        <div class="filter-sub-area pt-sm-10 pb-sm-15 pb-xs-15">
                            <h5 class="filter-sub-titel">显卡容量</h5>
                            <div class="categori-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">24GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">16GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">12GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">11GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">8GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">6GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">4GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">3GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">2GB</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">1GB</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                        <!-- filter-sub-area end -->
                        <!-- filter-sub-area start -->
                        <div class="filter-sub-area pt-sm-10 pb-sm-15 pb-xs-15">
                            <h5 class="filter-sub-titel">显存类型</h5>
                            <div class="categori-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">GDDR6</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">GDDR5X</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">GDDR5</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">GDDR3</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">HBM2</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">HBM</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                        <div class="filter-sub-area pt-sm-10 pb-sm-15 pb-xs-15">
                            <h5 class="filter-sub-titel">I/O接口</h5>
                            <div class="categori-checkbox">
                                <form action="#">
                                    <ul>
                                        <li><input type="checkbox" name="product-size"><a href="#">HDMI接口</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">DisplayPort接口</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">DVI接口</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">VGA接口</a></li>
                                        <li><input type="checkbox" name="product-size"><a href="#">Mini-DP接口</a></li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                    <!--sidebar-categores-box end  -->
                    <!-- category-sub-menu start -->

                </div>

                <!--sidebar-categores-box end  -->
                <!-- category-sub-menu start -->

            </div>
        </div>
    </div>
</div>

</div>
</div>
</div>
<!-- Content Wraper Area End Here -->
<!--右边开始-->


<!--模板的弹窗开始-->
<!-- Begin Quick View | Modal Area -->
<div class="modal fade modal-wrapper" id="exampleModalCenter" >
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-body">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <div class="modal-inner-area row">
                    <div class="col-lg-5 col-md-6 col-sm-6">
                        <!-- Product Details Left -->
                        <div class="product-details-left">
                            <div class="product-details-images slider-navigation-1">

                                <c:forEach var="item" items="${pageInfo.list}"   step="1" >
                                    <div class="lg-image">
                                        <img src="${item.graphics_img}" alt="product image">
                                    </div>
                                </c:forEach>

                            </div>
                            <div class="product-details-thumbs slider-thumbs-1">
                                <c:forEach var="item" items="${pageInfo.list}"   step="1" >
                                    <div class="sm-image"><img src="${item.graphics_img}" alt="product image thumb"></div>
                                </c:forEach>
                            </div>
                        </div>
                        <!--// Product Details Left -->
                    </div>

                    <div class="col-lg-7 col-md-6 col-sm-6">
                        <div class="product-details-view-content pt-60">
                            <div class="product-info">
                                <h2>Today is a good day Framed poster</h2>
                                <span class="product-details-ref">Reference: demo_15</span>
                                <div class="rating-box pt-20">
                                    <ul class="rating rating-with-review-item">
                                        <li><i class="fa fa-star-o"></i></li>
                                        <li><i class="fa fa-star-o"></i></li>
                                        <li><i class="fa fa-star-o"></i></li>
                                        <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        <li class="no-star"><i class="fa fa-star-o"></i></li>
                                    </ul>
                                </div>
                                <div class="price-box pt-20">
                                    <span class="new-price new-price-2">${id}</span>
                                </div>
                                <div class="product-desc">
                                    <p>
                                                    <span>100% cotton double printed dress. Black and white striped top and orange high waisted skater skirt bottom. Lorem ipsum dolor sit amet, consectetur adipisicing elit. quibusdam corporis, earum facilis et nostrum dolorum accusamus similique eveniet quia pariatur.
                                                    </span>
                                    </p>
                                </div>

                                <div class="single-add-to-cart">
                                    <form action="#" class="cart-quantity">
                                        <button class="add-to-cart" type="submit">Add to cart</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Quick View | Modal Area End Here -->
<!--模板的弹窗结束-->

</div>

<%--<!--显示model模态框-->--%>
<%--<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">--%>
<%--<div class="modal-dialog" role="document">--%>
<%--<div class="modal-content">--%>
<%--<div class="modal-header">--%>
<%--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span--%>
<%--aria-hidden="true">×</span></button>--%>
<%--<h4 class="modal-title" id="exampleModalLabel">New message</h4>--%>
<%--</div>--%>
<%--<div class="modal-body">--%>
<%--<form>--%>
<%--<div class="form-group">--%>
<%--<label for="recipient-name" class="control-label">cpu名称:</label>--%>
<%--<input type="text" class="form-control" id="recipient-name">--%>
<%--<img id="image" src="#">--%>
<%--</div>--%>
<%--</form>--%>
<%--</div>--%>
<%--<div class="modal-footer">--%>
<%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
<%--<button type="button" class="btn btn-primary">Send message</button>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4>商品详情</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">×</span></button>

            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">

                        <%--<a><%=session.getAttribute("img")%></a>--%>
                        <div class="product-details-left" style="float: left; margin-right:30px; margin-right:18px">
                            <img id="image" src="#">

                        </div>
                        <div class="product-details-right" style="float: left; margin-left:48px ">
                            <p>
                                品牌：
                                <em id="modal_graphics_brand" style="color: #0b0b0b"></em>
                            </p>
                            <p>
                                名称：
                                <em id="modal_graphics_name" style="..."></em>
                            </p>
                            <p>
                                显卡容量：
                                <em id="modal_graphics_capacity" style="color: #0b0b0b"></em>
                            </p>
                            <p>
                                显卡芯片：
                                <em id="modal_graphics_chip" style="color: #0b0b0b"></em>
                            </p>
                            <p>
                                显存类型：
                                <em id="modal_graphics_memorykind" style="color: #0b0b0b"></em>
                            </p>
                            <p>
                                IO接口类型：
                                <em id="modal_graphics_ioInter" style="..."></em>
                            </p>
                            <p>
                                价格：
                                <em id="modal_graphics_price" style="color: #0b0b0b"></em>
                            </p>

                        </div>

                    </div>
                </form>
            </div>
            <!--  <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                  <button type="button" class="btn btn-primary">Send message</button>
              </div>
              -->
        </div>
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



<%--<!--显示详细信息显示-->--%>
<%--<script>--%>
<%--$('#exampleModal').on('show.bs.modal', function (event) {--%>
<%--var button = $(event.relatedTarget) // 触发事件的按钮--%>
<%--var recipient = button.data('whatever') // 解析出whatever内容--%>
<%--var modal = $(this)  //获得模态框本身--%>
<%--// window.alert(recipient)--%>
<%--var msg=document.getElementById(recipient.toString())--%>


<%--recipient=msg.value--%>
<%--document.getElementById("image").src=recipient--%>
<%--window.alert(recipient)--%>
<%--sessionStorage.setItem("img",recipient)--%>
<%--var img = sessionStorage.getItem('img')--%>
<%--alert(img)--%>



<%--modal.find('.modal-title').text('Message To ' + recipient)  // 更改将title的text--%>

<%--modal.find('.modal-body input').val(recipient)--%>

<%--})--%>
<%--</script>--%>
<script>
    //绑定模态框展示的方法
    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) ;// 触发事件的按钮
        var recipient = button.data('img') ;// 解析出imge内容

        var name=button.data('name');
        var brand=button.data('brand');
        var capacity=button.data('capacity');
        var chip=button.data('chip');
        var memorykind=button.data('memorykind');
        var ioInter=button.data('iointer');
        var price=button.data('price');

        document.getElementById("modal_graphics_name").innerHTML=name;
        document.getElementById("modal_graphics_brand").innerHTML=brand;
        document.getElementById("modal_graphics_capacity").innerHTML=capacity+"GB";
        document.getElementById("modal_graphics_chip").innerHTML=chip;
        document.getElementById("modal_graphics_memorykind").innerHTML=memorykind;
        document.getElementById("modal_graphics_ioInter").innerHTML=ioInter;
        document.getElementById("modal_graphics_price").innerHTML=price;

        var modal = $(this);  //获得模态框本身

        document.getElementById("image").src=recipient;

        // window.alert(recipient)
        modal.find('.modal-title').text('Message To ' + recipient) ; // 更改将title的text
        modal.find('.modal-body input').val(recipient);

    })
</script>
</body>
</html>
