<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<html>
<%@include file="../../common/head.jsp" %>
<body>

<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <!-- page content begins -->
            <form class="form-horizontal" role="form" action="/customer/save" method="post">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"  for="name"> 客户名称：</label>

                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="输入客户名称" name="name" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="level">客户级别： </label>

                    <div class="col-sm-9">
                        <input type="text" id="level" placeholder="输入客户级别" name="level" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"  for="source">信息来源： </label>

                    <div class="col-sm-9">
                        <input type="text" id="source" placeholder="输入信息来源" name="source" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="tel">固定电话： </label>

                    <div class="col-sm-9">
                        <input type="text" id="tel" placeholder="输入固定电话" name="tel" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="mobile">移动电话： </label>

                    <div class="col-sm-9">
                        <input type="text" id="mobile" placeholder="输入移动电话"  name="mobile"  class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="address">联系地址： </label>

                    <div class="col-sm-9">
                        <input type="text" id="address" placeholder="输入联系地址" name="address" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="zip">邮政编码： </label>

                    <div class="col-sm-9">
                        <input type="text" id="zip" placeholder="输入邮政编码" name="zip" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="fax">客户传真： </label>

                    <div class="col-sm-9">
                        <input type="text" id="fax" placeholder="输入客户传真" name="fax"  nclass=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="website">客户网址： </label>

                    <div class="col-sm-9">
                        <input type="text" id="website" placeholder="输入客户网址" name="website" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="clearfix form-actions">
                    <div class="col-md-offset-3 col-md-9">
                        <button class="btn btn-info" type="submit" >
                            <i class="ace-icon fa fa-check bigger-110"></i>
                            立即提交
                        </button>

                        &nbsp; &nbsp; &nbsp;
                        <button class="btn" type="reset">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            重置
                        </button>
                    </div>
                </div>

            </form>
        </div>
    </div><!-- /.row -->
</div><!-- /.page-content -->
<script>

</script>
</body>
</html>
