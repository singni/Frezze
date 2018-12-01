<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" language="java" %>
<html>
<%@include file="../../common/head.jsp" %>
<body>

<div class="page-content">

    <div class="row">
        <div class="col-xs-12">
            <!-- page content begins -->
            <form class="form-horizontal" role="form" action="/customer/save" method="post">
                <!-- #section:elements.form -->
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="name"> 客户名称：</label>

                    <div class="col-sm-9">
                        <input type="text" id="name" placeholder="输入客户名称" name="name" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="level">客户级别： </label>

                    <div class="col-sm-9">
                        <select id="level" name="level">
                            <option value="">请输入客户级别</option>
                            <option value="1">重要客户</option>
                            <option value="2">成交客户</option>
                            <option value="3">机会客户</option>
                            <option value="4">签约客户</option>
                            <option value="5">潜在客户</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="source">信息来源： </label>

                    <div class="col-sm-9">
                        <select id="source" name="source">
                            <option value="">请选择信息来源</option>
                            <option value="1">电话联系</option>
                            <option value="2">代理渠道</option>
                            <option value="3">户外广告</option>
                            <option value="4">直销业务</option>
                            <option value="5">展销会议</option>
                            <option value="6">促销活动</option>
                            <option value="7">互联网'</option>
                            <option value="8">朋友介绍</option>
                            <option value="9">报刊杂志</option>
                            <option value="10">招标投标</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="tel">固定电话： </label>

                    <div class="col-sm-9">
                        <input type="text" id="tel" placeholder="输入固定电话" name="tel" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="mobile">移动电话： </label>

                    <div class="col-sm-9">
                        <input type="text" id="mobile" placeholder="输入移动电话" name="mobile" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="address">联系地址： </label>

                    <div class="col-sm-9">
                        <input type="hidden" id="address">
                        <select id="province" onchange="changeProvince(this.value)">
                            <option value="">省/直辖市</option>
                        </select>
                        <select id="crity" onchange="changeCity(this.value)">
                            <option value="">市/区</option>
                        </select>
                        <select id="area" onchange="changeArea(this.value)">
                            <option value="">区/县</option>
                        </select>
                        <select id="street">
                            <option value="">街道/乡/村</option>
                        </select>
                        <input type="text" id="Housenumber" placeholder="输入门牌号" name="zip"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="zip">邮政编码： </label>

                    <div class="col-sm-9">
                        <input type="text" id="zip" placeholder="输入邮政编码" name="zip" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="fax">传真： </label>

                    <div class="col-sm-9">
                        <input type="text" id="fax" placeholder="输入传真" name="fax" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="zip">联系人： </label>

                    <div class="col-sm-9">
                        <input type="text" id="联系人" placeholder="联系人" name="zip" class=" col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="website">客户网址： </label>

                    <div class="col-sm-9">
                        <input type="text" id="website" placeholder="输入客户网址" name="website" class="col-xs-10 col-sm-5"/>
                    </div>
                </div>
                <div class="clearfix form-actions">
                    <div class="col-md-offset-3 col-md-9">
                        <button class="btn btn-info" type="submit">
                            <i class="ace-icon fa fa-check bigger-110"></i>
                            立即提交
                        </button>

                        &nbsp; &nbsp; &nbsp;
                        <button class="btn" type="reset">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            重置
                        </button>
                    </div>
                </div>

            </form>
        </div>
    </div><!-- /.row -->
</div><!-- /.page-content -->
<script>
    var province;
    $(function () {


        $.get("../../assets/json/geoinfo-all.json", function (data) {
            province = data;
            for (var i = 0; i < data.length; i++) {
                $("#province").append('<option value=' + i + '>' + data[i].name + '</option>')
            }
        });

    });


    var districts;
    function changeProvince(value) {
        if (value !== "") {
            $('#crity option').not(":first").remove();
            districts = province[value].districts;
            for (var v = 0; v < districts.length; v++) {
                $("#crity").append('<option value=' + v + '>' + districts[v].name + '</option>')
            }
        }
    };
    var area;
    function changeCity(value) {

        if (value !== "") {
            $('#area option').not(":first").remove();
            area = districts[value].districts;
            for (var v = 0; v < area.length; v++) {
                $("#area").append('<option value=' + v + '>' + area[v].name + '</option>')
            }
        }

    }
    var street;
    function changeArea(value) {

        if (value !== "") {
            $('#street option').not(":first").remove();
            street = area[value].districts;
            for (var v = 0; v < street.length; v++) {
                $("#street").append('<option value=' + v + '>' + street[v].name + '</option>')
            }
        }

    }
</script>
</body>
</html>
