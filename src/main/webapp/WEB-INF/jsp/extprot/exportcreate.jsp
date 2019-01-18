<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body style="max-width: 1600px">

<div class="page-content" >
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">新增出口报运</h3>
        </div>
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12">
                    <form class="form-horizontal" role="form" action="/export/addExport" method="post">
                        <!-- #section:elements.form -->
                        <div class="col-xs-12">
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label no-padding-right" for="lcno">信用证号：</label>

                                        <div class="col-sm-9">
                                            <input type="text" id="lcno" placeholder="输入信用证号" name="lcno"
                                                   class="col-xs-10 col-sm-5"/>
                                        </div>
                                    </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="marks"> 唛头：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="marks" placeholder="输入唛头" name="marks"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="destinationPort"> 目的港：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="destinationPort" placeholder="输入目的港" name="destinationPort"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="priceCondition"> 价格条件：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="priceCondition" placeholder="输入价格条件" name="priceCondition"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="boxNums"> 总箱数：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="boxNums" placeholder="输入总箱数" name="boxNums"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="measurements"> 体积：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="measurements" placeholder="输入体积" name="measurements"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" > 收货人：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="consignee" placeholder="输入收货人" name="consignee"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="shipmentPort"> 装运港：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="shipmentPort" placeholder="输入装运港" name="shipmentPort"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="transportMode"> 运输方式：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="transportMode" placeholder="输入运输方式" name="transportMode"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="remarks"> 备注：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="remarks" placeholder="输入备注" name="remarks"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="grossWeights">总毛重：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="grossWeights" placeholder="输入总毛重" name="grossWeights"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <input type="hidden" id="ids" name="contractIds">
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

    $(".chosen-select").chosen({
        no_results_text: "没有找到结果！",//搜索无结果时显示的提示
        search_contains: true,   //关键字模糊搜索，设置为false，则只从开头开始匹配
        allow_single_deselect: true, //是否允许取消选择
        max_selected_options: 6,  //当select为多选时，最多选择个数
    });
    function getUrlParam() {
        var reg = new RegExp("(^|&)ids=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
    $(function () {
        $("#ids").val(getUrlParam());
    });

</script>

</body>
</html>
