<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/selfimg.jpg"
					class="img-circle" alt="User Image">
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="#"><i
					class="fa fa-dashboard"></i> <span>查看配置单</span></a></li>

			<li class="treeview"><a href="${pageContext.request.contextPath}/user/findself.do"> <i class="fa fa-cogs"></i>
					<span>查看个人信息</span> <span class="pull-right-container">
				</span>
			</a>
				<%--<ul class="treeview-menu">--%>
					<%--<li id="system-setting">--%>
						<%--<a--%>
						<%--href="${pageContext.request.contextPath}/user/findAll.do?page=1&size=2"> <i--%>
							<%--class="fa fa-circle-o"></i> 修改用户名--%>
					<%--</a>--%>
					<%--</li>--%>
					<%--<li id="system-setting1"><a--%>
						<%--href="${pageContext.request.contextPath}/user/findAll.do"> <i--%>
							<%--class="fa fa-circle-o"></i> 修改密码--%>
					<%--</a></li>--%>

				<%--</ul>--%>

			</li>


		</ul>
	</section>
	<!-- /.sidebar -->
</aside>