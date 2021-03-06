<%@page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">


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
            <div class="form-group">
                <label for="serachText">请输入角色名</label>
                <input type="text" class="form-control" id="serachText" placeholder="请输入角色名">
            </div>&nbsp;&nbsp;
            <button type="submit" class="btn btn-primary" onclick="search()">搜索</button>&nbsp;&nbsp;
            <button type="reset" class="btn btn-primary" onclick="reset()">重置</button>
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
            url: '/role/findRoleByList',
            columns: [{
                field: 'roleId',
                title: 'ID'
            }, {
                field: 'name',
                title: '角色名'
            }, {
                field: 'remark',
                title: '备注'
            }, {
                field: 'orderNo',
                title: '排序号'
            },
                {
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
                    name:$('#serachText').val()
                };
                return temp;

            }

        },
        window.operateEvents = {
            'click .talbeDelete': function (event, value, row, index) {
                var id = row.roleId;
                $.get("/role/deleteByRoleId/"+id)

                $("#table").bootstrapTable('refresh');
            },
            'click .talbeEditor': function (event, value, row, index) {
                window.location.href='/role/edit?id='+row.roleId;
            },
            'click .talbePurview': function (event, value, row, index) {
                window.location.href='/role/purview?id='+row.roleId+"&name="+row.name;
            },
        }
    );
    function getHeight() {
        return $(window).height() - $('#page-content').outerHeight(true) - 45;
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
            '<button id="talbeEditor" type="button" class="talbePurview btn bg-primary">权限</button>&nbsp;&nbsp;',
            '<button id="talbeEditor" type="button" class="talbeEditor btn bg-primary">更新</button>&nbsp;&nbsp;',
            '<button id="talbeDelete" type="button" class="talbeDelete btn btn-default">删除</button>'
        ].join("")
    };

    function search() {
        $("#table").bootstrapTable('refresh');
    };
   function reset(){
       $('#serachText').val('');
        $("#table").bootstrapTable('refresh');
   }

</script>
</body>
</html>