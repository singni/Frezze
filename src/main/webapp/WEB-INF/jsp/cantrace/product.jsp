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
            <h3 class="panel-title">新增货物</h3>
        </div>
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12">
                    <form class="form-horizontal" role="form" action="/ContractProduce/add" method="post">
                        <!-- #section:elements.form -->
                        <div class="col-xs-12">
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="seleName"> 生产厂家：</label>

                                    <div class="col-sm-4">
                                        <select class="col-sm-4 chosen-select form-control" id="seleName" name="factoryId">
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12">
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="cnumber"> 数量：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="cnumber" placeholder="输入数量" name="cnumber"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="productImage"> 货物照片：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="productImage" placeholder="货物照片" name="productImage"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="loadingRate"> 装率：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="loadingRate" placeholder="输入装率" name="loadingRate"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="price"> 单价：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="price" placeholder="输入单价" name="price"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="productDesc"> 货物描述：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="productDesc" placeholder="输入货物描述" name="productDesc"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>

                            </div>
                            <div class="col-xs-6">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right"> 货号：</label>
                                    <div class="col-sm-9">
                                        <input type="text" id="productNo" placeholder="输入货号" name="productNo"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" >
                                        包装单位：</label>

                                    <div class="col-sm-9">
                                        <div class="radio">
                                            <label>
                                                <input name="packingUnit" type="radio" class="ace" value="PCS"/>
                                                <span class="lbl">只</span>
                                            </label>
                                            <label>
                                                <input name="packingUnit" type="radio" class="ace" value="SETS"/>
                                                <span class="lbl">套</span>
                                            </label>
                                        </div>

                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="boxNum"> 箱数：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="boxNum" placeholder="输入箱数" name="boxNum"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label no-padding-right" for="productRequest">要求：</label>

                                    <div class="col-sm-9">
                                        <input type="text" id="productRequest" placeholder="输入要求" name="productRequest"
                                               class="col-xs-10 col-sm-5"/>
                                    </div>
                                </div>

                            </div>

                        </div>
                        <input type="hidden" id="contractId" name="contractId">
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
            <h3 class="panel-title">货物列表</h3>
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

    $(".chosen-select").chosen({
        no_results_text: "没有找到结果！",//搜索无结果时显示的提示
        search_contains: true,   //关键字模糊搜索，设置为false，则只从开头开始匹配
        allow_single_deselect: true, //是否允许取消选择
        max_selected_options: 6,  //当select为多选时，最多选择个数
    });

    $(function () {

        $.get("/factory/findAllByFactory", function (data) {
            for (var v = 0; v < data.length; v++) {

                $("#seleName").append('<option value=' + data[v].factoryId + '>' + data[v].factoryName + '</option>')
            }
            $(".chosen-select").trigger("chosen:updated");  //$(".chosen-select")为select元素
        })

        $("#contractId").val(getUrlParam())

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
            url: '/contract/findContractProduceByList',
            columns: [{
                field: 'contractProductId',
                title: 'id',
                visible: false
            }, {
                field: 'factoryName',
                title: '厂家'
            }, {
                field: 'outNumber',
                title: '货号'
            }, {
                field: 'loadingRate',
                title: '装率'
            }, {
                field: 'boxNum',
                title: '箱数'
            }, {
                field: 'packingUnit',
                title: '包装单位'
            }, {
                field: 'cnumber',
                title: '数量'
            }, {
                field: 'price',
                title: '单价'
            }, {
                field: 'amount',
                title: '总金额'
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
                    contractId: getUrlParam()

                };
                return temp;

            }

        }, window.operateEvents = {
            'click .talbeDelete': function (event, value, row, index) {
                var id = row.contractProductId;

                $.post("/ContractProduce/delete/"+id)

                $("#table").bootstrapTable('refresh');
            },
            'click .tableProduct': function (event, value, row, index) {
                window.location.href = '/cantrace/extCproduct?id=' + row.contractProductId;
            }
        }
    );


    function operateFormatter(value, row, index) {
        return [
            '<button id="tableProduct" type="button" class="tableProduct btn bg-primary">附件</button>&nbsp;&nbsp;',
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
