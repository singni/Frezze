<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body style="max-width: 1600px">

<div class="page-content">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">购销合同月统计</h3>
        </div>
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12">
                    <!-- page content begins -->
                    <form class="form-inline" action="/contract/ContractDownload" method="post">
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right"
                                   for="shipdate">船期：</label>

                            <div class="col-sm-9">
                                <div class="col-sm-20 input-group date form_datetime "
                                     data-link-field="dtp_input1">
                                    <input class="form-control" type="text" value="" readonly id="shipdate"
                                           name="date">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>

                                </div>

                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary" id="submit">打印</button>
                    </form>
                </div>

            </div><!-- /.row -->
        </div>
    </div>
</div><!-- /.page-content -->
<script src="../../assets/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="../../assets/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script src="../../assets/js/bootstrap-datetimepicker.zh-CN.js"></script>

<script>
    $('.form_datetime').datetimepicker({
        //language:  'fr',
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        language: 'zh-CN',
        pickerPosition: "bottom-left",
        minView: 2,
    });

</script>
</body>
</html>
