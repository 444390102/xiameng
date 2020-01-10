
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- page specific plugin styles -->
<link rel="stylesheet" href="assets/css/jquery-ui.min.css" />
<!-- page specific plugin scripts -->
<script src="assets/js/jquery-ui.min.js"></script>
<script src="assets/js/jquery.ui.touch-punch.min.js"></script>

<div id="dialog-message" >
    <div class="content"></div>
</div>
<style>
    th, td { white-space: nowrap; }
</style>
<script>
    $.widget("ui.dialog", $.extend({}, $.ui.dialog.prototype, {
        _title: function(title) {
            if (!this.options.title ) {
                title.html("&#160;");
            } else {
                title.html(this.options.title);
            }
        }
    }));
    var showMessage = function (content,innerTitle,cirmFun) {
        var $msg = $("#dialog-message" );
        if(!innerTitle){
            innerTitle = "提示信息";
        }
        if(typeof(innerTitle) == "function") {
            innerTitle = "提示信息";
            cirmFun = innerTitle;
        }
        $msg.find(".content").html(content);
        $( "#dialog-message" ).dialog({
            resizable: false,
            modal: true,
            title: "<div class='widget-header widget-header-small'><h4 class='smaller'><i class='ace-icon fa fa-exclamation-triangle'></i> "+ innerTitle + "</h4></div>",
            title_html: true,
            buttons: [
                {
                    text: "确定",
                    "class" : "btn btn-primary btn-minier",
                    click: function (){
                        if(cirmFun && typeof(cirmFun) == "function"){
                            cirmFun();
                        }
                        $( this ).dialog( "close" );
                    }
                }
            ]
        });
    }

    var showError = function (content,innerTitle,cirmFun) {
        var $msg = $("#dialog-message" );

        if(!innerTitle){
            innerTitle = "错误信息";
        }
        if(typeof(innerTitle) == "function") {
            innerTitle = "错误信息";
            cirmFun = innerTitle;
        }

        $msg.find(".content").html(content);
        $( "#dialog-message" ).dialog({
            resizable: false,
            modal: true,
            title: "<div class='widget-header widget-header-small red'><h4 class='smaller'><i class='ace-icon fa fa-exclamation-triangle'></i> "+ innerTitle + "</h4></div>",
            title_html: true,
            buttons: [
                {
                    text: "  确定  ",
                    "class" : "btn btn-danger btn-minier",
                    click: function (){
                        if(cirmFun && typeof(cirmFun) == "function"){
                            cirmFun();
                        }
                        $( this ).dialog( "close" );
                    }
                }
            ]
        });
    }

    var showConfirm = function (content,innerTitle,cirmFun,cancelFun) {
        var $msg = $("#dialog-message" );
        if(!innerTitle){
            innerTitle = "确认信息";
        } else if(typeof(innerTitle) == "function") {
            innerTitle = "确认信息";
            cirmFun = innerTitle;
            cancelFun = cirmFun;
        }
        $msg.find(".content").html(content);
        $( "#dialog-message" ).dialog({
            resizable: false,
            modal: true,
            title: "<div class='widget-header widget-header-small orange'><h4 class='smaller'><i class='ace-icon fa fa-exclamation-triangle'></i> "+ innerTitle + "</h4></div>",
            title_html: true,
            buttons: [
                {
                    text: "确定",
                    "class" : "btn btn-primary btn-minier",
                    click: function (){
                        if(cirmFun && typeof(cirmFun) == "function"){
                            cirmFun();
                        }
                        $( this ).dialog( "close" );
                    }
                },
                {
                    text: "取消",
                    "class" : "btn btn-minier",
                    click: function (){
                        if(cancelFun && typeof(cancelFun) == "function"){
                            cancelFun();
                        }
                        $( this ).dialog( "close" );
                    }
                }

            ]
        });
    }
    /*
    1 var checkStatus = table.checkStatus('表格唯一ID值');
    2 var data = checkStatus.data;
    */
    function nextPage(currentPage,formID){

    }
    function showTable(id,searchFormID){
        var page = {};
        var $searchForm = $("#" + searchFormID);
        page.currentPage = ${page != null ? page.currentPage:1};
        page.totalPage = ${page != null ? page.totalPage:1};
        page.totalCount =  ${page != null ? page.totalCount:1};
        page.pageCount = ${page != null ? page.pageCount:20};
        var myTable =
            $('#' + id)
                .DataTable( {
                    "bAutoWidth": false,
                    "aLengthMenu" : [20, 30, 50],
                    /*
                    "aoColumns": [
                        { "bSortable": false },
                        null, null,null, null, null,
                        { "bSortable": false }
                    ],*/
                    //"aaSorting": [], //排序规则
                    sPaginationType: "full_numbers",
                    "oLanguage": {
                        "sLengthMenu": "每页显示 _MENU_ 条记录",
                        "sZeroRecords": "对不起，没有匹配的数据",
                        "sInfo": "第 " + page.currentPage + " 页 - 共 " + page.totalPage + " 页 | 共 " + page.totalCount + " 条数据",
                        "sInfoEmpty": "没有匹配的数据",
                        "sInfoFiltered": "(数据表中共 " + page.totalCount + " 条记录)",
                        "sProcessing": "正在加载中...",
                        "sSearch": "全文搜索：",
                        "oPaginate": {
                            "sFirst": "第一页",
                            "sPrevious": "上一页",
                            "sNext": "下一页",
                            "sLast": "最后一页"
                        },
                    },
                    "bFilter": false,
                    //"scrollX": true, //开启横向滚动条
                    responsive: false,//关闭响应式效果,否则以上设置无效
                    "sScrollX": "100%",
                    "sScrollXInner": "110%",
                    "bScrollCollapse": true,
                    "ordering": false, // 禁止排序
                    //"bProcessing": true,
                    //"bServerSide": true,
                    //"sAjaxSource": "http://127.0.0.1/table.php",
                    //,
                    //"sScrollY": "200px",
                    //"bPaginate": false,
                    //"sScrollX": "100%",
                    //"sScrollXInner": "120%",
                    //"bScrollCollapse": true,
                    //"iDisplayLength": 50
                    /*
                    select: {
                        style: 'multi'
                    }*/
                } );
        $('#' + id).parent().parent().parent().find('[name="' + id + '_length"]').val(page.pageCount);
        $('#' + id).parent().parent().parent().find('[name="' + id + '_length"]').change();
        $('#' + id).parent().parent().parent().find(".pagination li:eq(2)").remove();
        $('#' + id).parent().parent().parent().find('[name="' + id + '_length"]').on("change", function() {
            //location.href="materialMana.html?pageCount=" + this.value;
            $searchForm.find("[name=pageCount]").val(this.value);
            $searchForm.find("[name=currentPage]").val(1);
            $searchForm.submit();
            return false;
        });
        $('#' + id).parent().parent().parent().find(".pagination li").removeClass("disabled");

        $('#' + id).parent().parent().parent().find(".pagination li").on("click", "a", function() {
            $searchForm.find("[name=pageCount]").val($('#' + id).parent().parent().parent().find('[name="' + id + '_length"]').val());
            if(this.innerHTML.indexOf("上一页") > -1){
                //点击了上一页
                $searchForm.find("[name=currentPage]").val(page.currentPage - 1 < 1 ? 1 : page.currentPage - 1);
            } else if(this.innerHTML.indexOf("下一页") > -1){
                //点击了下一页
                $searchForm.find("[name=currentPage]").val(page.currentPage + 1 > page.totalPage ? page.totalPage : page.currentPage + 1);
            } else if(this.innerHTML.indexOf("第一页") > -1){
                //点击了第一页
                $searchForm.find("[name=currentPage]").val(1);
            }  else if(this.innerHTML.indexOf("最后一页") > -1){
                //点击了最后一页
                $searchForm.find("[name=currentPage]").val(page.totalPage);
            }
            $searchForm.submit();
            return false;
        });
        $('#' + id).find("tr:gt(0)").click(function (){
            var $ck = $(this).find("input[type=checkbox]");
            if($ck.length){
                $ck.prop("checked",!$ck.prop("checked"));
                if($ck.prop("checked")){
                    $(this).addClass("selected");
                } else {
                    $(this).removeClass("selected");
                }
            }
        });
        if($('#' + id).find("input[type=checkbox]").length){
            var $ck =  $('#' + id).parent().parent().find("input[type=checkbox]:eq(0)");
            $('#' + id).find("input[type=checkbox]:gt(0)").click(function (){
                return false;
            });

            $ck.click(function (){
                if(this.checked){
                    $('#' + id).find("tr:gt(0)").addClass("selected");
                } else {
                    $('#' + id).find("tr:gt(0)").removeClass("selected");
                }
                $('#' + id).find("input[type=checkbox]:gt(0)").prop("checked",this.checked);
            });


        }

        return myTable;
    }



</script>
<style>
    .select-group{ display: inline-block;
        position: relative;}
    .select-group select{width:190px; }
    .select-group input{ width:170px; height: 30px; position: absolute; left: 0px;}
</style>
<script>
    $(function (){
        $(".select-group select").change(function (){
            $(this).prev().val(this.value);
        });
    });
</script>                              