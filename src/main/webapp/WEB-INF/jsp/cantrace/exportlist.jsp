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
        <div class="form-inline" style="padding: 5px;">
            <button type="submit" class="btn btn-primary" onclick="createExp()">生成报运单</button>&nbsp;&nbsp;
        </div>
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
            url: '/contract/findContractByListStatus',
            clickToSelect: true,
            columns: [{
                checkbox: true
            }, {
                field: 'contractId',
                title: 'Id',
                visible: false,

            }, {
                field: 'customName',
                title: '客户名称',

            }, {
                field: 'contractNo',
                title: '合同号'
            }, {
                field: 'extCount',
                title: '货物数/附件数'
            }, {
                field: 'inputBy',
                title: '制单人'
            }, {
                field: 'checkBy',
                title: '审单人'
            }, {
                field: 'inspector',
                title: '验货员'
            }, {
                field: 'signingDate',
                title: '签单日期'
            }, {
                field: 'deliveryPeriod',
                title: '交货期限'
            }, {
                field: 'shipTime',
                title: '船期'
            }, {
                field: 'tradeTerms',
                title: '贸易条款'
            }, {
                field: 'totalAmount',
                title: '总金额'
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
                var id = row.contractId;

                $.get("/contract/deleteByContract/" + id)

                $("#table").bootstrapTable('refresh');
            },
            'click .talbeEditor': function (event, value, row, index) {
                window.location.href = '/cantrace/edit?id=' + row.contractId;
            },
            'click .tableProduct': function (event, value, row, index) {
                window.location.href = '/cantrace/product?id=' + row.contractId;
            }
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

    function createExp() {
        var row = $.map($('#table').bootstrapTable('getSelections'),function (row) {
            return row.contractId;
        });
           window.location.href="/cantrace/exportcreate/?ids="+row;
    }

</script>
</body>
</html>