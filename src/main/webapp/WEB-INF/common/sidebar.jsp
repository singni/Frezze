<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<body>
<div id="sidebar" class="sidebar responsive">


    <ul class="nav nav-list">
        <li class="active">
            <a href="index.html">
                <i class="menu-icon fa fa-tachometer"></i>
                <span class="menu-text"> 总控制台 </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon glyphicon glyphicon-user blue"></i>
                <span class="menu-text"> 系统管理 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">

                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        部门管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/dept/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                部门列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="/dept/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                部门新增
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        用户管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/user/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                新增用户
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="/user/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                用户列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        角色管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/role/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                新增角色
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="/role/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                角色列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        模块管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/module/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                模块新增
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="" target="content">
                            <a href="/module/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                模块列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>

        <li class="">
            <a href="" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> 货运管理 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        购销合同
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/cantrace/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                购销合同新增
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="/cantrace/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                购销合同列表
                            </a>

                            <b class="arrow"></b>
                        </li>

                    </ul>
                </li>
                <li class="">
                    <a href="/cantrace/outProduct" target="content">
                        <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                        出货表
                    </a>

                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-pencil-square-o"></i>
                        <span class="menu-text">出口报运</span>

                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/extprot/exportlist"  target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                待出口报运列表
                            </a>

                            <b class="arrow"></b>
                        </li>

                        <li class="">
                            <a href="/extprot/list"  target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                出口报运列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>



        <li class="">
            <a href="widgets.html">
                <i class="menu-icon fa fa-list-alt"></i>
                <span class="menu-text"> 插件 </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="calendar.html">
                <i class="menu-icon fa fa-calendar"></i>

                <span class="menu-text">
								日历

                    <!-- #section:basics/sidebar.layout.badge -->
								<span class="badge badge-transparent tooltip-error" title="有2件重要事件">
									<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
								</span>

                    <!-- /section:basics/sidebar.layout.badge -->
							</span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="gallery.html">
                <i class="menu-icon fa fa-picture-o"></i>
                <span class="menu-text"> 相册 </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-tag"></i>
                <span class="menu-text"> 更多页面 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="profile.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        用户信息
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="pricing.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        售价单
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="invoice.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        购物车
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="timeline.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        时间轴
                    </a>

                    <b class="arrow"></b>
                </li>


                <li class="">
                    <a href="login.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        登录注册
                    </a>

                    <b class="arrow"></b>
                </li>
            </ul>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-file-o"></i>

                <span class="menu-text">
								其他页面

                    <!-- #section:basics/sidebar.layout.badge -->
								<span class="badge badge-primary">5</span>

                    <!-- /section:basics/sidebar.layout.badge -->
							</span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="faq.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        帮助页面
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="error-404.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        404错误页面
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="error-500.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        500错误页面
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="grid.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        网格
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="blank.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        空白页面
                    </a>

                    <b class="arrow"></b>
                </li>
                <li class="">
                    <a href="tres.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        空白页面
                    </a>

                    <b class="arrow"></b>
                </li>
            </ul>
        </li>
    </ul><!-- /.nav-list -->

    <!-- #section:basics/sidebar.layout.minimize -->
    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left"
           data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

</div>
</body>
</html>
