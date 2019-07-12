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
<div class="shop-products-wrapper">
    <div class="tab-content">
        <div id="grid-view" class="tab-pane fade active show" role="tabpanel">
            <div class="product-area shop-product-area">
                <div class="row"  >

                    <c:forEach var="item" items="${pageInfo11.list}"   step="1" >
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
                    <c:forEach var="item" items="${pageInfo11.list}"   step="1" >
                        <div class="row product-layout-list">
                            <div class="col-lg-3 col-md-5 ">
                                <div class="product-image">
                                    <a href="single-product.html">
                                        <img src="${item.cpu_img}" alt="Li's Product Image">
                                    </a>
                                    <span class="sticker">New</span>
                                </div>
                            </div>
                            <div class="col-lg-5 col-md-7">
                                <div class="product_desc">
                                    <div class="product_desc_info">
                                        <div class="product-review">
                                            <h5 class="manufacturer">
                                                <a href="http://demo.hasthemes.com/limupa-v1/limupa/product-details.html">"${item.cpu_brand}"</a>
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
                                        <h4><a class="product_name" href="single-product.html">"${item.cpu_name}"</a></h4>
                                        <div class="price-box">
                                            <span class="new-price">"${item.cpu_price}"</span>
                                        </div>
                                        <p> 系列: "${item.cpu_series}"</p>
                                        <p> 插槽类型: "${item.cpu_slotType}"</p>
                                        <p> 核心数量: "${item.cpu_coreNumber}"</p>
                                        <p> 集成显卡: "${item.cpu_integTool}"</p>
                                        <a href="${item.cpu_url}">购买链接</a>
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
                        <li><a href="${pageContext.request.contextPath}/cpu/findAllCpuInformation.do?page=${pageInfo11.pageNum-1}&size=9" class="Previous"><i class="fa fa-chevron-left"></i> Previous</a>
                        </li>

                        <c:forEach  begin="1" end="${pageInfo11.pages}" var="PageNum">
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
