<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>

<link rel="stylesheet" href="../../assets/css/bootstrap.min.css">
<link rel="stylesheet" href="../../assets/css/bootstrap-table.min.css">
<script src="../../assets/js/jquery-2.1.4.min.js"></script>
<script src="../../assets/js/bootstrap.min.js"></script>
<script src="../../assets/js/bootstrap-table.min.js"></script>
<script src="../../assets/js/bootstrap-table-zh-CN.js"></script>

<link href="../../assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script src="../../assets/js/chosen.jquery.min.js"></script>
<link rel="stylesheet" href="../../assets/css/chosen.min.css">
<body style="max-width: 1470px; margin: auto">

<div class="page-content">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">修改报运单</h3>
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
                                    <label class="col-sm-3 control-label no-padding-right" for="destinationPort">
                                        目的港：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="destinationPort" placeholder="输入目的港"
                                               name="destinationPort"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="priceCondition">
                                        价格条件：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="priceCondition" placeholder="输入价格条件"
                                               name="priceCondition"
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
                                    <label class="col-sm-3 control-label no-padding-right" for="measurements">
                                        体积：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="measurements" placeholder="输入体积" name="measurements"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"> 收货人：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="consignee" placeholder="输入收货人" name="consignee"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="shipmentPort">
                                        装运港：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="shipmentPort" placeholder="输入装运港" name="shipmentPort"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="transportMode">
                                        运输方式：</label>

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
                                    <label class="col-sm-3 control-label no-padding-right"
                                           for="grossWeights">总毛重：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="grossWeights" placeholder="输入总毛重" name="grossWeights"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                            </div>

                        </div>

                        <input type="hidden" id="contractIds" name="contractIds">
                        <div class="col-md-offset-4 col-md-9">
                            <button class="btn btn-primary" type="submit">
                                <i class="ace-icon fa fa-check bigger-110"></i>
                                立即提交
                            </button>

                            &nbsp; &nbsp; &nbsp;
                            <a class="btn btn-primary" href="javascript:window.history.go(-1)">
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
    <div class="panel panel-default">

        <div class="panel-heading">
            <h3 class="panel-title">报运商品明细</h3>
        </div>
        <div class="row" style="margin: auto">

            <div class="col-xs-12">

                <table id="table" class="table-responsive"></table>
            </div>
        </div>

    </div>
</div><!-- /.page-content -->

<script type="text/javascript" src="../../assets/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
<script src="../../assets/js/bootstrap-datetimepicker.zh-CN.js"></script>

<script>


    $(function () {

        $.get("/export/findExporyById/" + getUrlParam(), function (data) {
            $("#contractIds").val(data.contractIds);
            $("#lcno").val(data.lcno);
            $("#marks").val(data.marks);
            $("#destinationPort").val(data.destinationPort);
            $("#priceCondition").val(data.priceCondition);
            $("#boxNums").val(data.boxNums);
            $("#measurements").val(data.measurements);
            $("#consignee").val(data.consignee);
            $("#shipmentPort").val(data.shipmentPort);
            $("#transportMode").val(data.transportMode);
            $("#remarks").val(data.remarks);
            $("#grossWeights").val(data.grossWeights);
        })

    });
    function getUrlParam() {
        var reg = new RegExp("(^|&)id=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]);
        return null; //返回参数值
    };

    $('.form_datetime').datetimepicker({
        //language:  'fr',
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        language: 'zh-CN',
        pickerPosition: "bottom-left",
        minView: 2,
    });
    $('#table').bootstrapTable({
            sidePagination: 'server',   //  服务器端分页
            pagination: true,
            pageNumber: 1,
            sortable: false,
            pageSize: 10,
            striped: true,
            pageList: [10, 25, 50, 100],
            url: '/export/findExportProductList',
            columns: [{
                field: 'exportId',
                title: 'id',
                visible: false
            }, {
                field: 'productNo',
                title: '货号'
            }, {
                field: 'cnumber',
                title: '数量'
            }, {
                field: 'packingUnit',
                title: '包装单位'
            }, {
                field: 'grossWeight',
                title: '毛重'
            }, {
                field: 'netWeight',
                title: '净重'
            }, {
                field: 'sizeLength',
                title: '长'
            }, {
                field: 'sizeWidth',
                title: '宽'
            }, {
                field: 'sizeHeight',
                title: '高'
            }, {
                field: 'price',
                title: '出口单价'
            }, {
                field: 'tax',
                title: '含税'
            }, {
                field: 'operation',
                title: '操作',
                align: 'center',
                events: "operateEvents",
                formatter: operateFormatter,
            }
            ],
            queryParams: function (params) {
                var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                    // limit: params.limit,   //页面大小
                    pageSize: this.pageSize,
                    pageNumber: this.pageNumber,
                    exportId: getUrlParam()

                };
                return temp;

            },
            onClickCell: function (field, value, row, $element) {
                $element.attr('contenteditable', true);
                $element.blur(function () {
                    var index = $element.parent().data('index');
                    var tdValue = $element.html();

                    saveData(index, field, tdValue);
                })

            },


        }, window.operateEvents = {
            'click .talbeDelete': function (event, value, row, index) {
                var id = row.contractProductId;

                $.post("/ContractProduce/delete/" + id)

                $("#table").bootstrapTable('refresh');
            },
            'click .tableUpdate': function (event, value, row, index) {
                $.post("/export/updateByExportProduct", {
                    exportProductId:row.exportProductId,
                    productNo:row.productNo,
                    cnumber:row.cnumber,
                    packingUnit:row.packingUnit,
                    grossWeight:row.grossWeight,
                    netWeight:row.netWeight,
                    sizeHeight:row.sizeHeight,
                    sizeWidth:row.sizeWidth,
                    sizeLength:row.sizeLength,
                    sizeHeight:row.sizeHeight,
                    price:row.price,
                    tax:row.tax,
            })
            }
        }
    );

    function saveData(index, field, value) {
        $("#table").bootstrapTable('updateCell', {
            index: index,
            field: field,
            value: value
        })
    }
    function operateFormatter(value, row, index) {
        return [
            '<button id="tableUpdate" type="button" class="tableUpdate btn bg-primary">更新</button>&nbsp;&nbsp;',
            '<button id="talbeDelete" type="button" class="talbeDelete btn btn-default">删除</button>'
        ].join("")
    };

    function search() {
        $("#table").bootstrapTable('refresh');
    };
    function reset() {
        $('#serachdept').val('')
        $("#table").bootstrapTable('refresh');
    }
</script>

</body>
</html>
