<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body style="max-width: 1600px" >

<div class="page-content">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">新增模块</h3>
        </div>
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12">
                    <form class="form-horizontal" role="form" action="/module/addByModule" method="post">
                        <!-- #section:elements.form -->
                        <div class="col-xs-12">
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="name"> 模块名：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="name" placeholder="输入模块名" name="name"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="cpermission"> 权限标识：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="cpermission" placeholder="输入权限标识" name="cpermission"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="ctype"> 类型：</label>
                                    <div class="col-sm-4">
                                        <select class="form-control" name="ctype" id="ctype">
                                            <option>---</option>
                                            <option value="1">主菜单</option>
                                            <option value="2">左侧菜单</option>
                                            <option value="3">按钮</option>
                                            <option value="4">链接</option>
                                            <option value="5">状态</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="belong"> 从属：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="belong" placeholder="输入从属" name="belong"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="remark"> 说明：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="remark" placeholder="输入说明" name="remark"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>

                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="layerNum"> 层数：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="layerNum" placeholder="输入层数" name="layerNum"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="curl"> 链接：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="curl" placeholder="输入链接" name="curl"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" > 状态：</label>

                                    <div class="col-sm-9">
                                        <div class="radio">
                                            <label>
                                                <input name="state"  type="radio" class="ace" value="1" />
                                                <span class="lbl">启用</span>
                                            </label>
                                            <label>
                                                <input name="state" type="radio" class="ace" value="0" />
                                                <span class="lbl">禁用</span>
                                            </label>
                                        </div>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="cwhich"> 复用标识：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="cwhich" placeholder="输入复用标识" name="cwhich"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="orderNo">排序号：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="orderNo" placeholder="输入排序号" name="orderNo"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <div class="col-md-offset-4 col-md-9">
                            <button class="btn btn-info" type="submit">
                                <i class="ace-icon fa fa-check bigger-110"></i>
                                立即提交
                            </button>

                            &nbsp; &nbsp; &nbsp;
                            <a class="btn" href="javascript:window.history.go(-1)">
                                <i class="ace-icon fa fa-undo bigger-110"></i>
                                返回
                            </a>
                        </div>
                    </form>

                    <!-- page content begins -->
                </div>
            </div><!-- /.row -->
        </div>
    </div>
</div><!-- /.page-content -->
<script src="../../assets/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="../../assets/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script src="../../assets/js/bootstrap-datetimepicker.zh-CN.js"></script>


</body>
</html>
