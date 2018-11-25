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
                <span class="menu-text">  客户 &amp; 联系人 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">

                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        客户管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="/customer/add" target="content">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                新增客户
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="/customer/list" target="content">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                客户列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        联系人管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="#">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                新增联系人
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                联系人列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        客户拜访管理
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="#">
                                <i class="menu-icon fa  fa-pencil-square-o blue"></i>
                                新增客户拜访
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                客户拜访列表
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        综合查询
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                客户信息查询
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                联系人信息查询
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  glyphicon glyphicon-list blue"></i>
                                客户拜访记录查询
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                <li class="">
                    <a href="#" class="dropdown-toggle">
                        <i class="menu-icon fa fa-caret-right"></i>
                        统计分析
                        <b class="arrow fa fa-angle-down"></b>
                    </a>

                    <b class="arrow"></b>

                    <ul class="submenu">
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  fa fa-bar-chart-o blue"></i>
                                客户行业统计
                            </a>

                            <b class="arrow"></b>
                        </li>
                        <li class="">
                            <a href="#">
                                <i class="menu-icon  fa fa-bar-chart-o blue"></i>
                                客户来源统计
                            </a>

                            <b class="arrow"></b>
                        </li>
                    </ul>
                </li>
                </li>
            </ul>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> 表格 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="tables.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        简单通用表格
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="jqgrid.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        jqGrid插件表格
                    </a>

                    <b class="arrow"></b>
                </li>
            </ul>
        </li>

        <li class="">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-pencil-square-o"></i>
                <span class="menu-text"> 表单 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">
                <li class="">
                    <a href="form-elements.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        表单组件
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="form-wizard.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        向导提示 &amp; 验证
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="wysiwyg.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        编辑器
                    </a>

                    <b class="arrow"></b>
                </li>

                <li class="">
                    <a href="dropzone.html">
                        <i class="menu-icon fa fa-caret-right"></i>
                        文件上传
                    </a>

                    <b class="arrow"></b>
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
