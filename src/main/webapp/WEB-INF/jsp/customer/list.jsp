<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Index</title>

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
            url: '/customer/findCustomerByList',
            columns: [{
                field: 'id',
                title: 'ID',
            }, {
                field: 'name',
                title: '客户名称'
            }, {
                field: 'level',
                title: '客户级别'
            }, {
                field: 'tel',
                title: '固定电话'
            }, {
                field: 'mobile',
                title: '移动电话'
            }, {
                field: 'address',
                title: '联系地址'
            }, {
                field: 'operation',
                title: '操作',
                align: 'center',
                events: "operateEvents",
                formatter: operateFormatter,
            }
            ],
            onClickCell: function (field, value, row, $element) {
                $element.attr('contenteditable', true);
                $element.blur(function () {
                    var index = $element.parent().data('index');
                    var tdValue = $element.html();
                    saveData(index, field, tdValue);
                })
            }

        },
        window.operateEvents = {
            'click .talbeDelete': function (event, value, row, index) {
                var id = row.id
                $.post("/customer/delete", {id: id})

                $("#table").bootstrapTable('refresh');
            },
            'click .talbeEditor': function (event, value, row, index) {
                var id = row.id;
                var name = row.name;
                var level = row.level;
                var mobile = row.mobile;
                var tel = row.tel;
                var address = row.address;
                var zip = row.zip;
                var fax = row.fax;
                var source = row.source;
                var website = row.website;
                $.post("/customer/update", {
                    id: id,
                    name: name,
                    level: level,
                    mobile: mobile,
                    tel:tel,
                    address:address,
                    zip:zip,
                    fax:fax,
                    source:source,
                    website:website
                });

                $("#table").bootstrapTable('refresh');
            }
        }
    );
    function saveData(index, field, tdValue) {
        $("#table").bootstrapTable('updateCell', {
            index: index,       //行索引
            field: field,       //列名
            value: tdValue        //cell值
        })
    }
    function getHeight() {
        return $(window).height() - $('h1').outerHeight(true) - 70;
    }

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



</script>
</body>
</html>