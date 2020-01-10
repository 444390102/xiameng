<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>Dashboard - Ace Admin</title>

    <meta name="description" content="overview &amp; stats"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>
    <jsp:include page="../template/top.jsp"/>

</head>

<body class="no-skin">
<div id="navbar" class="navbar navbar-default          ace-save-state">
    <div class="navbar-container ace-save-state" id="navbar-container">
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
            <span class="sr-only">Toggle sidebar</span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>
        </button>

        <div class="navbar-header pull-left">
            <a href="index.html" class="navbar-brand">
                <small>
                    <i class="fa fa-leaf"></i>
                    Ace Admin
                </small>
            </a>
        </div>

        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">
                <li class="grey dropdown-modal">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="ace-icon fa fa-tasks"></i>
                        <span class="badge badge-grey">4</span>
                    </a>

                    <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
                        <li class="dropdown-header">
                            <i class="ace-icon fa fa-check"></i>
                            4 Tasks to complete
                        </li>

                        <li class="dropdown-content">
                            <ul class="dropdown-menu dropdown-navbar">
                                <li>
                                    <a href="#">
                                        <div class="clearfix">
                                            <span class="pull-left">Software Update</span>
                                            <span class="pull-right">65%</span>
                                        </div>

                                        <div class="progress progress-mini">
                                            <div style="width:65%" class="progress-bar"></div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <div class="clearfix">
                                            <span class="pull-left">Hardware Upgrade</span>
                                            <span class="pull-right">35%</span>
                                        </div>

                                        <div class="progress progress-mini">
                                            <div style="width:35%" class="progress-bar progress-bar-danger"></div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <div class="clearfix">
                                            <span class="pull-left">Unit Testing</span>
                                            <span class="pull-right">15%</span>
                                        </div>

                                        <div class="progress progress-mini">
                                            <div style="width:15%" class="progress-bar progress-bar-warning"></div>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <div class="clearfix">
                                            <span class="pull-left">Bug Fixes</span>
                                            <span class="pull-right">90%</span>
                                        </div>

                                        <div class="progress progress-mini progress-striped active">
                                            <div style="width:90%" class="progress-bar progress-bar-success"></div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown-footer">
                            <a href="#">
                                See tasks with details
                                <i class="ace-icon fa fa-arrow-right"></i>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="purple dropdown-modal">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="ace-icon fa fa-bell icon-animated-bell"></i>
                        <span class="badge badge-important">8</span>
                    </a>

                    <ul class="dropdown-menu-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
                        <li class="dropdown-header">
                            <i class="ace-icon fa fa-exclamation-triangle"></i>
                            8 Notifications
                        </li>

                        <li class="dropdown-content">
                            <ul class="dropdown-menu dropdown-navbar navbar-pink">
                                <li>
                                    <a href="#">
                                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-pink fa fa-comment"></i>
														New Comments
													</span>
                                            <span class="pull-right badge badge-info">+12</span>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <i class="btn btn-xs btn-primary fa fa-user"></i>
                                        Bob just signed up as an editor ...
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-success fa fa-shopping-cart"></i>
														New Orders
													</span>
                                            <span class="pull-right badge badge-success">+8</span>
                                        </div>
                                    </a>
                                </li>

                                <li>
                                    <a href="#">
                                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-info fa fa-twitter"></i>
														Followers
													</span>
                                            <span class="pull-right badge badge-info">+11</span>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown-footer">
                            <a href="#">
                                See all notifications
                                <i class="ace-icon fa fa-arrow-right"></i>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="green dropdown-modal">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="ace-icon fa fa-envelope icon-animated-vertical"></i>
                        <span class="badge badge-success">5</span>
                    </a>

                    <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
                        <li class="dropdown-header">
                            <i class="ace-icon fa fa-envelope-o"></i>
                            5 Messages
                        </li>

                        <li class="dropdown-content">
                            <ul class="dropdown-menu dropdown-navbar">
                                <li>
                                    <a href="#" class="clearfix">
                                        <img src="assets/images/avatars/avatar.png" class="msg-photo"
                                             alt="Alex's Avatar"/>
                                        <span class="msg-body">
													<span class="msg-title">
														<span class="blue">Alex:</span>
														Ciao sociis natoque penatibus et auctor ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>a moment ago</span>
													</span>
												</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="#" class="clearfix">
                                        <img src="assets/images/avatars/avatar3.png" class="msg-photo"
                                             alt="Susan's Avatar"/>
                                        <span class="msg-body">
													<span class="msg-title">
														<span class="blue">Susan:</span>
														Vestibulum id ligula porta felis euismod ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>20 minutes ago</span>
													</span>
												</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="#" class="clearfix">
                                        <img src="assets/images/avatars/avatar4.png" class="msg-photo"
                                             alt="Bob's Avatar"/>
                                        <span class="msg-body">
													<span class="msg-title">
														<span class="blue">Bob:</span>
														Nullam quis risus eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>3:15 pm</span>
													</span>
												</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="#" class="clearfix">
                                        <img src="assets/images/avatars/avatar2.png" class="msg-photo"
                                             alt="Kate's Avatar"/>
                                        <span class="msg-body">
													<span class="msg-title">
														<span class="blue">Kate:</span>
														Ciao sociis natoque eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>1:33 pm</span>
													</span>
												</span>
                                    </a>
                                </li>

                                <li>
                                    <a href="#" class="clearfix">
                                        <img src="assets/images/avatars/avatar5.png" class="msg-photo"
                                             alt="Fred's Avatar"/>
                                        <span class="msg-body">
													<span class="msg-title">
														<span class="blue">Fred:</span>
														Vestibulum id penatibus et auctor  ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>10:09 am</span>
													</span>
												</span>
                                    </a>
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown-footer">
                            <a href="inbox.html">
                                See all messages
                                <i class="ace-icon fa fa-arrow-right"></i>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="light-blue dropdown-modal">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <img class="nav-user-photo" src="assets/images/avatars/user.jpg" alt="Jason's Photo"/>
                        <span class="user-info">
									<small>Welcome,</small>
									Jason
								</span>

                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="#">
                                <i class="ace-icon fa fa-cog"></i>
                                Settings
                            </a>
                        </li>

                        <li>
                            <a href="profile.html">
                                <i class="ace-icon fa fa-user"></i>
                                Profile
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="#">
                                <i class="ace-icon fa fa-power-off"></i>
                                Logout
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div><!-- /.navbar-container -->
</div>

<div class="main-container ace-save-state" id="main-container">
    <script type="text/javascript">
        try {
            ace.settings.loadState('main-container')
        } catch (e) {
        }
    </script>

    <div id="sidebar" class="sidebar                  responsive                    ace-save-state">
        <script type="text/javascript">
            try {
                ace.settings.loadState('sidebar')
            } catch (e) {
            }
        </script>

        <div class="sidebar-shortcuts" id="sidebar-shortcuts">
            <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                <button class="btn btn-success">
                    <i class="ace-icon fa fa-signal"></i>
                </button>

                <button class="btn btn-info">
                    <i class="ace-icon fa fa-pencil"></i>
                </button>

                <button class="btn btn-warning">
                    <i class="ace-icon fa fa-users"></i>
                </button>

                <button class="btn btn-danger">
                    <i class="ace-icon fa fa-cogs"></i>
                </button>
            </div>

            <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                <span class="btn btn-success"></span>

                <span class="btn btn-info"></span>

                <span class="btn btn-warning"></span>

                <span class="btn btn-danger"></span>
            </div>
        </div><!-- /.sidebar-shortcuts -->

        <jsp:include page="../template/left.jsp"/>
        <%-- jsp标签 --%>
        <%-- jsp指令 --%>
        <%-- 小脚本 --%>
        <%-- 表达式 --%>
        <%-- 声明 --%>


        <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
            <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state"
               data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
        </div>
    </div>

    <div class="main-content">
        <div class="main-content-inner">
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li>
                        <i class="ace-icon fa fa-home home-icon"></i>
                        <a href="javascript:void(0)">主页</a>
                    </li>
                    <li class="active">子页</li>
                </ul><!-- /.breadcrumb -->

                <div class="nav-search" id="nav-search">
                </div><!-- /.nav-search -->
            </div>

            <div class="page-content">
                <div class="ace-settings-container" id="ace-settings-container">
                    <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                        <i class="ace-icon fa fa-cog bigger-130"></i>
                    </div>

                    <div class="ace-settings-box clearfix" id="ace-settings-box">
                        <div class="pull-left width-50">
                            <div class="ace-settings-item">
                                <div class="pull-left">
                                    <select id="skin-colorpicker" class="hide">
                                        <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                                        <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                                        <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                                        <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                                    </select>
                                </div>
                                <span>&nbsp; Choose Skin</span>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2 ace-save-state"
                                       id="ace-settings-navbar" autocomplete="off"/>
                                <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2 ace-save-state"
                                       id="ace-settings-sidebar" autocomplete="off"/>
                                <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2 ace-save-state"
                                       id="ace-settings-breadcrumbs" autocomplete="off"/>
                                <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl"
                                       autocomplete="off"/>
                                <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2 ace-save-state"
                                       id="ace-settings-add-container" autocomplete="off"/>
                                <label class="lbl" for="ace-settings-add-container">
                                    Inside
                                    <b>.container</b>
                                </label>
                            </div>
                        </div><!-- /.pull-left -->

                        <div class="pull-left width-50">
                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover"
                                       autocomplete="off"/>
                                <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact"
                                       autocomplete="off"/>
                                <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                            </div>

                            <div class="ace-settings-item">
                                <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight"
                                       autocomplete="off"/>
                                <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                            </div>
                        </div><!-- /.pull-left -->
                    </div><!-- /.ace-settings-box -->
                </div><!-- /.ace-settings-container -->

                <div>
                    <div class="col-xs-12">
                        <form id="searchForm" action="materialMana.html" class="form-horizontal" role="form">
                            <input type="hidden" name="currentPage" value="1"/>
                            <input type="hidden" name="pageCount" value="20"/>
                            <div class="row">
                                <span class="lbl">物料类别:</span>
                                <div class="select-group">
                                    <input type="text" name="mm_cata" value="${param.mm_cata}" placeholder="物料类别"/>
                                    <select>
                                        <option></option>
                                        <c:forEach items="${cataList}" var="cata">
                                            <option ${param.mm_cata == cata ? "selected" : ""}>${cata}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <span class="lbl">物料代码:</span>
                                <div class="select-group">
                                    <input type="text" name="mm_code" value="${param.mm_code}" placeholder="物料代码"/>
                                    <select>
                                        <option></option>
                                    </select>
                                </div>
                                <span class="lbl">物料名称:</span> <input type="text" name="mm_name"
                                                                      value="${param.mm_name}" placeholder="物料名称"/>
                            </div>
                            <div class="row">
                                <span class="lbl">规格型号:</span> <input type="text" name="mm_spec"
                                                                      value="${param.mm_spec}" placeholder="规格型号"/>
                                <span class="lbl">供应商:</span> <input type="text" name="mm_supply"
                                                                     value="${param.mm_supply}" placeholder="供应商"/>
                                <span class="lbl">单位:</span>
                                <div class="select-group">
                                    <input type="text" name="mm_unit" value="${param.mm_unit}" placeholder="单位"/>
                                    <select>
                                        <option></option>
                                        <c:forEach items="${unitList}" var="unit">
                                            <option ${param.mm_unit == unit ? "selected" : ""}>${unit}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="row">
                                <span class="lbl">套账:</span>
                                <div class="select-group">
                                    <input type="text" name="mm_account" value="${param.mm_account}" placeholder="套账"/>
                                    <select>
                                        <option></option>
                                        <c:forEach items="${accountList}" var="account">
                                            <option ${param.mm_account == account ? "selected" : ""}>${account}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <span class="lbl">配送位置:</span> <input type="text" name="mm_location"
                                                                      value="${param.mm_location}" placeholder="配送位置"/>
                                <button type="button" id="searchBtn" class="btn btn-purple btn-sm">
                                    <span class="ace-icon fa fa-search icon-on-right bigger-110"></span>
                                    检索
                                </button>
                            </div>
                            <div class="row">
                                <button type="button" class="btn btn-info btn-sm">新增</button>
                                <button type="button" class="btn btn-info btn-sm">修改</button>
                                <button id="btn_disabled" type="button" class="btn btn-info btn-sm">禁用</button>
                                <button id="btn_enabled" type="button" class="btn btn-info btn-sm">启用</button>
                            </div>
                        </form>
                        <!-- main div start -->
                        <div class="table-header">
                            表格头部信息
                        </div>
                        <div>

                            <table id="dynamic-table" class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th title="id" class="center">
                                        <label class="pos-rel">
                                            <input type="checkbox"
                                                   onclick="$(this).parents('table').find('tr input[type=checkbox]').prop('checked',this.checked)"
                                                   class="ace"/>
                                            <span class="lbl"></span>
                                        </label>
                                    </th>
                                    <th title="Domain">序号</th>
                                    <th title="Price">物料类别</th>
                                    <th title="Clicks">物料代码</th>
                                    <th>物料名称</th>
                                    <th>规格型号</th>
                                    <th>供应商</th>
                                    <th>单位</th>
                                    <th>套账</th>
                                    <th>配送位置</th>
                                    <th>停用数量</th>
									<th class="sample">id</th>
									<th class="sample">状态</th>
                                </tr>
                                </thead>
                                <tobdy>
                                    <c:forEach items="${mlist}" var="m" varStatus="s">
                                        <tr ${m.mm_state == 0 ? "class='active'" : "" }>
                                            <td align="center">
                                                <div class="checkbox">
                                                    <label>
                                                        <input name="mm_id" type="checkbox" class="ace"
                                                               value="${m.mm_id}"/>
                                                        <span class="lbl"> </span>
                                                    </label>
                                                </div>
                                            </td>
                                            <td>${s.index + 1}</td>
                                            <td>${m.mm_cata}</td>
                                            <td>${m.mm_code}</td>
                                            <td>${m.mm_name}</td>
                                            <td>${m.mm_spec}</td>
                                            <td>${m.mm_supply} </td>
                                            <td>${m.mm_unit}</td>
                                            <td>${m.mm_account}</td>
                                            <td>${m.mm_location}</td>
                                            <td>${m.mm_stop_num == null ? 0 : m.mm_stop_num}</td>
                                            <td class="sample">${m.mm_id}</td>
                                            <td class="sample">${m.mm_state}</td>
                                        </tr>
                                    </c:forEach>

                                </tobdy>
                            </table>

                            <!-- main div end -->
                        </div>
                    </div>

                </div><!-- /.page-content -->
            </div>
        </div><!-- /.main-content -->

        <div class="footer">
            <div class="footer-inner">
                <!--
                 <div class="footer-content">
                     <span class="bigger-120">
                         <span class="blue bolder">Ace</span>
                         Application &copy; 2013-2014
                     </span>

                     &nbsp; &nbsp;
                     <span class="action-buttons">
                         <a href="#">
                             <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
                         </a>

                         <a href="#">
                             <i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
                         </a>

                         <a href="#">
                             <i class="ace-icon fa fa-rss-square orange bigger-150"></i>
                         </a>
                     </span>
                 </div>
                 -->
            </div>
        </div>

        <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
            <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
        </a>
    </div><!-- /.main-container -->

    <!-- basic scripts -->


    <!-- page specific plugin scripts -->

    <!--[if lte IE 8]>
    <script src="assets/js/excanvas.min.js"></script>
    <![endif]-->
    <script src="assets/js/jquery-ui.custom.min.js"></script>
    <script src="assets/js/jquery.ui.touch-punch.min.js"></script>
    <script src="assets/js/jquery.easypiechart.min.js"></script>
    <script src="assets/js/jquery.sparkline.index.min.js"></script>
    <script src="assets/js/jquery.flot.min.js"></script>
    <script src="assets/js/jquery.flot.pie.min.js"></script>
    <script src="assets/js/jquery.flot.resize.min.js"></script>

    <!-- ace scripts -->
    <script src="assets/js/ace-elements.min.js"></script>
    <script src="assets/js/ace.min.js"></script>


    <!-- page specific plugin scripts -->
    <script src="assets/js/jquery.dataTables.min.js"></script>
    <script src="assets/js/jquery.dataTables.bootstrap.min.js"></script>
    <script src="assets/js/dataTables.buttons.min.js"></script>
    <script src="assets/js/buttons.flash.min.js"></script>
    <script src="assets/js/buttons.html5.min.js"></script>
    <script src="assets/js/buttons.print.min.js"></script>
    <script src="assets/js/buttons.colVis.min.js"></script>
    <script src="assets/js/dataTables.select.min.js"></script>


    <jsp:include page="model.jsp"/>
    <script>
        $(function () {
            showTable("dynamic-table", "searchForm");
        });
    </script>

    <style>
        #searchForm .row .lbl {
            display: inline-block;
            width: 65px;
            text-align: right
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $("#searchBtn").click(function () {
                $("#searchForm").submit();
            });
        });
    </script>
</div>

<style>
    #searchForm input[type=text] {
        height: 30px;
    }

    body {
        font-size: 14px;
    }

    #searchForm {
        padding-left: 13px;
        line-height: 34px;
    }

    #searchForm .btn-sm {
        height: 25px;
        padding: 0px 10px;
    }

    .select-group input {
        top: 2px;
    }
</style>
<script>
    $(function () {
        $("#searchForm input[name=mm_code]").change(function () {
            var value = this.value;
            var $select = $(this).next();
            $.ajax({
                url: "materialMana.html",
                async: false,//同步方法，当服务器没有响应玩，页面会卡死状态
                type: "get",
                data: {"action": "queryCode", "value": value},
                dataType: "json",
                success: function (result) {
                    //result.data
                    //将下拉框里的内容删除只剩一个
                    $select.html("<option></option>");
                    var opStr = "";
                    for (var i = 0; i < result.data.length; i++) {
                        var code = result.data[i];
                        opStr = opStr + "<option>" + code + "</option>";
                    }
                    $select.html($select.html() + opStr);
                },

            });
        });
    });

    $(function () {
        //添加禁用按钮的事件
        $("#btn_disabled").click(function () {
            $cks = $("#dynamic-table [name=mm_id]:checked");
            if ($cks.length == 0) {
                showError("请选择您要操作的行");
                return;
            }
            var idsStr = "";
            for (var i = 0; i < $cks.length; i++) {
                var ck = $cks[i];
                idsStr = idsStr + ck.value;
                if (i != $cks.length - 1) {
                    idsStr = idsStr + ",";
                }
            }
            $.ajax({
                url: "materialMana.html",
                async: false,//同步方法，当服务器没有响应玩，页面会卡死状态
                type: "get",
                data: {"action": "queryMaterialByIds", "ids": idsStr},
                dataType: "json",
                success: function (result) {
                    var ms = result.data;
                    $("#disabled-dialog table tr:gt(0)").remove();
                    var isDisable = false;
                    for (var i = 0; i < ms.length; i++) {
                        var m = ms[i];
                        //删除除了表头以外所有行
                        $table = $("#disabled-dialog table");
                        var $tr = $("<tr></tr>");
                        if (m.mm_state == 0) { //禁用状态
                            $tr.addClass("red");
                            isDisable = true;
                        }
                        $("<td></td>").html(m.mm_cata).appendTo($tr);
                        $("<td></td>").html(m.mm_code).appendTo($tr);
                        $("<td></td>").html(m.mm_name).appendTo($tr);
                        $("<td></td>").html(m.mm_spec).appendTo($tr);
                        $("<td></td>").html(m.mm_supply).appendTo($tr);
                        $("<td></td>").html(m.mm_unit).appendTo($tr);
                        $("<td></td>").html(m.mm_account).appendTo($tr);
                        $table.append($tr);
                    }
                    //删除事件
                    $("#disabled-dialog button:eq(0)").unbind("click");
                    if (isDisable) {
                        $("#disabled-dialog button:eq(0)").addClass("disabled");
                    } else {
                        $("#disabled-dialog button:eq(0)").removeClass("disabled");
                        $("#disabled-dialog button:eq(0)").click(myDis);
                    }
                    $("#disabled-dialog [name=ids]").val(idsStr);
                    $("#disabled-dialog").dialog("open");
                },
                error: function (xhr, state, e) {
                    alert(e);
                }

            });


        });

        $("#btn_enabled").click(function () {
            function trim(str){ //删除左右两端的空格
                return str.replace(/(^\s*)|(\s*$)/g, "");
            }
            $td = $("#dynamic-table [name=mm_id]:checked").parents("td").parent();
            $("#enabled-dialog table tr:gt(0)").remove();
            var isDisable = false;
            var str = "";
            let $table = $("#enabled-dialog table");
            $td.each(function () {
                let v = trim($(this).text()).replace(/\s{2,}/g,",").split(",");
                var $tr = $("<tr></tr>");
                for (let i = 0; i < v.length - 3; i++) {
                    $("<td></td>").html(v[i]).appendTo($tr);
                }
                    if (v[v.length - 1] == 1) {
                        $tr.addClass("red");
                        isDisable = true;
                    }
                    str += v[v.length - 2] + ",";
                    $table.append($tr);
            });
            str = str.substring(0,str.length - 1);
            console.log(str);
            $("#enabled-dialog button:eq(0)").unbind("click");
            if (isDisable) {
                $("#enabled-dialog button:eq(0)").addClass("disabled");
            } else {
                $("#enabled-dialog button:eq(0)").removeClass("disabled");
                $("#enabled-dialog button:eq(0)").click(function (str) {
                    console.log(str);
                });
            }
            $("#enabled-dialog").dialog("open");
        });


    });
</script>

<div id="enabled-dialog" title="启动确认">
    <table class="table">
        <tr>
            <th>物料类别</th>
            <th>物料代码</th>
            <th>物料名称</th>
            <th>规格型号</th>
            <th>供应商</th>
            <th>单位</th>
            <th>套账</th>
            <th class='sample'>id</th>
            <th class='sample'>状态</th>
        </tr>
    </table>
    <button type="button" class="btn btn-info btn-sm">确定</button>
    <button type="button" onclick="$('#enabled-dialog').dialog('close')" class="btn btn-info btn-sm">取消</button>
</div>



<div id="disabled-dialog" title="禁用确认">
    <input type="hidden" name="ids"/>
    <table class="table">
        <tr>
            <th>物料类别</th>
            <th>物料代码</th>
            <th>物料名称</th>
            <th>规格型号</th>
            <th>供应商</th>
            <th>单位</th>
            <th>套账</th>
        </tr>
    </table>
    <button type="button" class="btn btn-info btn-sm">确定</button>
    <button type="button" onclick="$('#disabled-dialog').dialog('close')" class="btn btn-info btn-sm">取消</button>
</div>
<script>
    $("#disabled-dialog").dialog(
        {
            width: 800,
            resizable: false,
            modal: true,
            autoOpen: false,
        });
    $("#enabled-dialog").dialog(
        {
            width: 800,
            resizable: false,
            modal: true,
            autoOpen: false,
        });


    function myDis() {
        // 禁用
        location.href = "materialMana.html?action=disableMaterialMana&ids="
            + $("#disabled-dialog [name=ids]").val();
    }
</script>
</body>
<style>
	.sample {
		display: none;
	}
</style>
</html>