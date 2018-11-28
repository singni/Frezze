<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
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
        url: '/linkman/findLinkmanBylist',
        columns: [{
            field: 'id',
            title: 'ID',
        }, {
            field: 'name',
            title: '姓名'
        }, {
            field: 'sex',
            title: '性别'
        }, {
            field: 'phone',
            title: '手机'
        }, {
            field: 'account',
            title: '社交账号'
        }, {
            field: 'job',
            title: '职位'
        }, {
            field: 'email',
            title: '邮箱'
        }, {
            field: 'address',
            title: '联系地址'
        }

        ]
    });

</script>
</body>
</html>