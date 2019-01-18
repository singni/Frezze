<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body style="max-width: 1600px">

<div class="page-content">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">更新购销合同</h3>
        </div>
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12">
                    <form class="form-horizontal" role="form" action="/contract/updateByContract" method="post">
                        <!-- #section:elements.form -->
                        <div class="col-xs-12">
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="customName">
                                        客户名称：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="customName" placeholder="输入客户名称" id="customName" name="customName"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="contractNo">
                                        合同号：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="contractNo" placeholder="输入合同号" name="contractNo"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="inputBy"> 制单人：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="inputBy" placeholder="输入制单人" name="inputBy"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="inspector"> 验货员：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="inspector" placeholder="输入验货员" name="inspector"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"> 重要程度：</label>

                                    <div class="col-sm-9">
                                        <div class="radio">
                                            <label>
                                                <input name="importNum" type="radio" class="ace" value="1"/>
                                                <span class="lbl">一星</span>
                                            </label>
                                            <label>
                                                <input name="importNum" type="radio" class="ace" value="2"/>
                                                <span class="lbl">二星</span>
                                            </label>
                                            <label>
                                                <input name="importNum" type="radio" class="ace" value="3"/>
                                                <span class="lbl">三星</span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="tradeTerms"> 贸易条款：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="tradeTerms" placeholder="输入贸易条款" name="tradeTerms"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="crequest"> 要求：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="crequest" placeholder="输入要求" name="crequest"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"> 打印版式：</label>

                                    <div class="col-sm-9">
                                        <div class="radio">
                                            <label>
                                                <input name="printStyle" type="radio" class="ace" value="1"/>
                                                <span class="lbl">一款</span>
                                            </label>
                                            <label>
                                                <input name="printStyle" type="radio" class="ace" value="2"/>
                                                <span class="lbl">两款</span>
                                            </label>
                                        </div>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="offeror"> 收购方：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="offeror" placeholder="输入收购方" name="offeror"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="checkBy">审单人：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="checkBy" placeholder="输入审单人" name="checkBy"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"
                                           for="signingDate">签单日期：</label>

                                    <div class="col-sm-9">
                                        <div class="col-sm-5 input-group date form_datetime "
                                             data-link-field="dtp_input1">
                                            <input class="form-control" type="text" value="" readonly id="signingDate"
                                                   name="signingDate">
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="shipTime">船期：</label>

                                    <div class="col-sm-9">
                                        <div class="col-sm-5 input-group date form_datetime "
                                             data-link-field="dtp_input1">
                                            <input class="form-control" type="text" value="" readonly id="shipTime"
                                                   name="shipTime">
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"
                                           for="deliveryPeriod">交货期限：</label>

                                    <div class="col-sm-9">
                                        <div class="col-sm-5 input-group date form_datetime "
                                             data-link-field="dtp_input1">
                                            <input class="form-control" type="text" value="" readonly id="deliveryPeriod"
                                                   name="deliveryPeriod">
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="remark">说明：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="remark" placeholder="输入说明" name="remark"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <input type="hidden" id="contractId" name="contractId">
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
    function getUrlParam() {
        var reg = new RegExp("(^|&)id=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]);
        return null; //返回参数值
    };
    $(function () {
        $.post("/catract/findContractById/"+getUrlParam(),function (data) {
            $("#customName").val(data.customName);
            $("#contractId").val(data.contractId);
            $("#contractNo").val(data.contractNo);
            $("#crequest").val(data.crequest);
            $("#deliveryPeriod").val(data.deliveryPeriod);
            if(data.importNum===1){
                $("input:radio[name='importNum']").eq(0).attr("checked",'checked');
            }else if(data.importNum===2) {
                $("input:radio[name='importNum']").eq(1).attr("checked",'checked');
            }else {
                $("input:radio[name='importNum']").eq(2).attr("checked",'checked');
            }
            if(data.printStyle===1) {
                $("input:radio[name='printStyle']").eq(0).attr("checked",'checked');
            }else {
                $("input:radio[name='printStyle']").eq(1).attr("checked",'checked');
            }
            $("#checkBy").val(data.checkBy);
            $("#inputBy").val(data.inputBy);
            $("#offeror").val(data.offeror);
            $("#tradeTerms").val(data.tradeTerms);
            $("#remark").val(data.remark);
            $("#shipTime").val(data.shipTime);
            $("#signingDate").val(data.signingDate);
            $("#inspector").val(data.inspector);
        })
    })
</script>
</body>
</html>
