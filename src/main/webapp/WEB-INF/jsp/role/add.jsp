<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body >

<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <form class="form-horizontal" role="form" action="/role/addByRole" method="post">
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="name">名称 ：</label>

                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="输入名称" name="name" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <input type="hidden" id="deptId" name="deptId">
                <input type="hidden" id="state" name="state">
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="remark"> 说明：</label>

                    <div class="col-sm-9">
                        <input type="text" id="remark" placeholder="输入说明" name="remark" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>

                <div class="col-md-offset-3 col-md-9">
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
        </div>
    </div><!-- /.row -->
</div><!-- /.page-content -->

<script>



</script>
</body>
</html>
