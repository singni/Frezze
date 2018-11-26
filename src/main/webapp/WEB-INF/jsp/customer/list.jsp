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
        height: 700,
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
            field: 'moblie',
            title: '移动电话'
        }, {
            field: 'address',
            title: '联系地址'
        }]
    });

</script>
</body>
</html>