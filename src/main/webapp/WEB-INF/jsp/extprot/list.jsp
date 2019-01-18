<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">

    <link href="../../assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">

    <link rel="stylesheet" href="../../assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../assets/css/bootstrap-table.min.css">
    <script src="../../assets/js/jquery-2.1.4.min.js"></script>
    <script src="../../assets/js/bootstrap.min.js"></script>
    <script src="../../assets/js/bootstrap-table.min.js"></script>
    <script src="../../assets/js/bootstrap-table-zh-CN.js"></script>

</head>
<body>
<div class="row" style="margin: auto">

    <div class="col-xs-12">

        <table id="table" class="table-responsive"></table>
    </div>
</div>

<script type="text/javascript">

    /**
     * http://bootstrap-table.wenzhixin.net.cn/documentation/
     */
    $('#table').bootstrapTable({
            sidePagination: 'server',   //  服务器端分页
            pagination: true,
            pageNumber: 1,
            sortable: false,
            pageSize: 10,
            striped: true,
            pageList: [10, 25, 50, 100],
            url: '/export/findExportList',
            columns: [{
                field: 'exportId',
                title: '报运号',
            }, {
                field: 'lcno',
                title: '信用证号'
            }, {
                field: 'customerContract',
                title: '货物数/附件数'
            }, {
                field: 'consignee',
                title: '收货人及地址'
            }, {
                field: 'destinationPort',
                title: '目的港'
            }, {
                field: 'transportMode',
                title: '运输方式'
            }, {
                field: 'priceCondition',
                title: '价格条件'
            }, {
                field: 'inputDate',
                title: '制单日期'
            }, {
                field: 'state',
                title: '状态',
            }, {
                field: 'operation',
                title: '操作',
                align: 'center',
                events: "operateEvents",
                formatter: operateFormatter,
            }
            ],
            responseHandler: function (res) {
                for (var i = 0; i < res.rows.length; i++) {
                    if (res.rows[i].state === 1) {
                        res.rows[i].state = '已上报'
                    } else {
                        res.rows[i].state = '草稿'
                    }
                    ;
                }
                return res;
            },
            queryParams: function (params) {
                var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                    // limit: params.limit,   //页面大小
                    pageSize: this.pageSize,
                    pageNumber: this.pageNumber,
                    deptName: $('#serachdept').val()

                };
                return temp;

            }

        },
        window.operateEvents = {
            'click .talbeDelete': function (event, value, row, index) {
                var id = row.exportId;

                $.get("/contract/deleteByContract/" + id)

                $("#table").bootstrapTable('refresh');
            },
            'click .talbeEditor': function (event, value, row, index) {
                window.location.href = '/extprot/edit?id=' + row.exportId;
            },

        }
    );

    function getHeight() {
        return $(window).height() - $('#page-content').outerHeight(true) - 35;
    }
    $(window).resize(function () {
        $("#table").bootstrapTable('resetView', {
            height: getHeight()
        });
    });
    $(function () {
        $("#table").bootstrapTable('resetView', {
            height: getHeight()
        });
    });

    function operateFormatter(value, row, index) {
        return [
            '<button id="talbeEditor" type="button" class="talbeEditor btn bg-primary">更新</button>&nbsp;&nbsp;',
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