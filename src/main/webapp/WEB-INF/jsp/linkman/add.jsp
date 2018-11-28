<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body>

<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <!-- page content begins -->
            <form class="form-horizontal" role="form" action="/linkman/save" method="post">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"  for="name"> 姓名：</label>

                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="输入姓名" name="name" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="sex">性别： </label>

                    <div class="col-sm-9">
                        <input type="text" id="sex" placeholder="输入性别" name="sex" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right"  for="phone">手机： </label>

                    <div class="col-sm-9">
                        <input type="text" id="phone" placeholder="输入手机号" name="phone" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="account">社交账号： </label>

                    <div class="col-sm-9">
                        <input type="text" id="account" placeholder="输入社交账号" name="account" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="zip">邮编： </label>

                    <div class="col-sm-9">
                        <input type="text" id="zip" placeholder="输入邮编"  name="zip"  class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="job">所在职位： </label>

                    <div class="col-sm-9">
                        <input type="text" id="job" placeholder="输入所在职位" name="job" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="email">邮箱： </label>

                    <div class="col-sm-9">
                        <input type="text" id="email" placeholder="输入邮箱" name="email" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="address">联系地址： </label>

                    <div class="col-sm-9">
                        <input type="text" id="address" placeholder="输入联系地址" name="address"  class="col-xs-10 col-sm-5"/>
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
