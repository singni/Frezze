<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<%@include file="../../common/head.jsp" %>
<body>

<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <!-- page content begins -->
            <form class="form-horizontal" role="form" action="/dept/update" method="post">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="seleName"> 上级部门：</label>

                    <div class="col-sm-9">
                        <select class="chosen-select form-control" id="seleName" name="parentId">
                        </select>
                    </div>
                </div>
                <input type="hidden" id="deptId" name="deptId">
                <input type="hidden" id="state" name="state">
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="deptName"> 部门名称：</label>

                    <div class="col-sm-9">
                        <input type="text" id="deptName" placeholder="输入部门名称" name="deptName" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>

                    <div class="col-md-offset-3 col-md-9">
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
        </div>
    </div><!-- /.row -->
</div><!-- /.page-content -->
<script src="../../assets/js/chosen.jquery.min.js"></script>
<script>

    function getUrlParam() {
        var reg = new RegExp("(^|&)id=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }

    $(".chosen-select").chosen({
        no_results_text: "没有找到结果！",//搜索无结果时显示的提示
        search_contains: true,   //关键字模糊搜索，设置为false，则只从开头开始匹配
        allow_single_deselect: true, //是否允许取消选择
        max_selected_options: 6,  //当select为多选时，最多选择个数
        width: '450px',
    });

    $(function () {
        $.get("/dept/findDeptAll", function (data) {
            for (var i = 0; i < data.length; i++) {

                $("#seleName").append('<option value=' + data[i].deptId+ '>' + data[i].deptName +'</option>')
            }
            $(".chosen-select").trigger("chosen:updated");  //$(".chosen-select")为select元素

        });
        $.get("/dept/findDeptById/"+getUrlParam(),function (data) {
            $('#deptName').val(data.deptName);
            $('#deptId').val(data.deptId);
            $('#state').val(data.state);
            $('#seleName').val(data.parentid);
            $(".chosen-select").trigger("chosen:updated");
        })
    })

</script>
</body>
</html>
