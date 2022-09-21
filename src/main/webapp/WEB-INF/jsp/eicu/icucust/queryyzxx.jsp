<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>医嘱信息</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css?980">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hzszyyhems/hzszyydoctor/querycfjl.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <script type="text/javascript">
        var _baseUrl = '${baseurl}',
            _username = '${sessionScope.activeUser.usrname}',
            _userno = '${sessionScope.activeUser.usrno}',
            _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
    </script>
</head>

<body class="tabsBody queryyzxx">
    <script type="text/javascript">
        var checkstatus = 1;//1登陆角色无护士，0登陆角色有护士 -1只有查看角色 2系统管理员
        var getDatagridUrl = '${baseurl}zyylqbl/querycfxx_result.do',
            submitUrl = '${baseurl}zyylqbl/insertyzxxajax.do',
            deleUrl = '${baseurl}zyylqbl/deleteyzxx.do',
            printUseUrl = '${baseurl}zyylqbl/inseryzxxbatch.do';
        var usrname = {},
            usrno = {},
            checkName = {};

        $.extend($.fn.datagrid.methods, {
            getEditingRowIndexs: function (jq) {
                var rows = $.data(jq[0], "datagrid").panel.find('.datagrid-row-editing');
                var indexs = [];
                rows.each(function (i, row) {
                    var index = row.sectionRowIndex;
                    if (indexs.indexOf(index) == -1) {
                        indexs.push(index);
                    }
                });
                return indexs;
            }
        });

        $.extend($.fn.datagrid.defaults.editors, {
            arrivedateEdit: {
                init: function (container, options) {
                    var input = "";
                    input = $('<input type="text" onfocus="WdatePicker({dateFmt:\'yyyy/MM/dd HH:mm\'})" onchange="fillArrData(this)">').appendTo(container);
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            },
            begindateEdit: {
                init: function (container, options) {
                    var input = "";
                    input = $('<input type="text" onfocus="WdatePicker({dateFmt:\'yyyy/MM/dd HH:mm\'})" onchange="fillBeginData(this)">').appendTo(container);
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            },
            nursedateEdit: {
                init: function (container, options) {
                    // var dataRows = ($('#jcbglist').datagrid("getRows"));
                    var input = "";
                    input = $('<input type="text" onfocus="WdatePicker({dateFmt:\'yyyy/MM/dd HH:mm\'})" onchange="fillData(this)">').appendTo(container);
                    // for(var i=0;i<dataRows.length;i++){
                    //     if (dataRows[i].docadviceNuimdatString == '' || dataRows[i].docadviceNuimdatString == 'undefined' || dataRows[i].docadviceNuimdatString == null) {
                    //         dataRows[i].docadviceNuimdatString = _today;
                    //     }
                    // }
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            },
            usernameEdit: {
                init: function (container, options) {
                    // var dataRows = ($('#jcbglist').datagrid("getRows"));
                    var input = "";
                    var input = $('<input type="text" readonly/>').appendTo(container);
                    // for(var i=0;i<dataRows.length;i++){
                    //     if (dataRows[i].docadviceNuimnam == '' || dataRows[i].docadviceNuimnam == 'undefined' || dataRows[i].docadviceNuimnam == null) {
                    //         dataRows[i].docadviceNuimnam = _username;
                    //     }
                    // }
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            },
            checkNameEdit: {
                init: function (container, options) {
                    var dataRows = ($('#jcbglist').datagrid("getRows"));
                    var input = "";
                    var input = $('<input type="text" readonly/>').appendTo(container);
                    for (var i = 0; i < dataRows.length; i++) {
                        if (dataRows[i].docadviceChecknam == '' || dataRows[i].docadviceChecknam == 'undefined' || dataRows[i].docadviceChecknam == null) {
                            dataRows[i].docadviceChecknam = _username;
                        }
                    }
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            },
            operEdit: {
                init: function (container, options) {
                    var input = $('<span><a class="cancel">取消</a></span><span> | </span><span><a class="save" href="#">保存</a><span>').appendTo(container);
                    return input;
                },
                destroy: function (target) {
                    $(target).remove();
                },
                getValue: function (target) {
                    return $(target).val();
                },
                setValue: function (target, value) {
                    $(target).val(value);
                },
                resize: function (target, width) {
                    $(target)._outerWidth(width);
                }
            }
        });

        function selectUser(_thisId) {
            createmodalwindow("用户签名", 700, 385, '${baseurl}zyylqbl/zyyqueryuser.do?userid=' + _thisId);
        }

        /***
         ** 布局（datagrid 表格拉伸）
         ***/
        function setLayout() {
            var windowsWidth = parent.$('#mainIfream').width(),
                windowsHeigt = parent.$('#mainIfream').height();
            if(!windowsWidth){
            	windowsWidth = 1200,
                windowsHeigt = 600;
	        }
            $('#jcbglist').height(windowsHeigt - 87);
        }

        $(document).keydown(function (event) {
            switch (event.keyCode) {
                case 13:
                    queryjcbg();
            }
        });

        function reload() {
            $('#jcbglist').datagrid('reload');
        }

        /***
         ** 初始化并生成datagrid
         ***/
        function getDatagrid() {
            var today = $("#emg_enddate").val();
            var startdate = $("#emg_startdate").val();
            $('#jcbglist').datagrid({
                nowrap: false,
                striped: true,
                singleSelect: false,
                rownumbers: true,
                title: "医嘱信息",
                url: getDatagridUrl,
                queryParams: {
                    "hspDocadviceInfCustom.vstCad": '${vstCad}',
                    "hspDocadviceInfCustom.startdate": startdate,
                    "hspDocadviceInfCustom.enddate": today
                },
                idField: 'docadviceSeq',
                loadFilter: function (data) {
                    if (data.resultInfo && data.resultInfo.messageCode == '109') {
                        message_alert(data, function () {
                            window.location.href = "${baseurl}/first.do";
                        });
                    }
                    return data;
                },
                loadMsg: '',
                columns: [
                    [{
                        checkbox: true,
                        rowspan: 2,
                        field: 'ck'
                    }, {
                        field: 'docadviceSeq',
                        title: 'id',
                        rowspan: 2,
                        hidden: true
                    }, {
                        field: 'docadviceDatisString',
                        title: '下达时间',
                        rowspan: 2,
                        align: 'center',
                        width: getWidth(0.15),
                        editor: { type: 'arrivedateEdit', field: 'docadviceArrDat' }
                        // formatter: function (value, row, index) {
                        //     return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
                        // }
                    },
                    // {
                    //     field: 'docadviceDatbeString',
                    //     title: '开始时间',
                    //     rowspan: 2,
                    //     align: 'center',
                    //     width: getWidth(0.08),
                    //     editor: { type: 'begindateEdit', field: 'docadviceBeDat' }
                    // //formatter: function (value, row, index) {
                    // //     return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
                    // // }
                    // },
                    { title: '医嘱', colspan: 4 },
                    {
                        field: 'docadviceNam',
                        title: '医师签名',
                        rowspan: 2,
                        align: 'center',
                        width: getWidth(0.08)
                        //                     }, {
                        //                         field: 'docadviceChecknam',
                        //                         title: '核对护士签名',
                        //                         rowspan: 2,
                        //                         align: 'center',
                        //                         width: getWidth(0.08),
                        //                         editor: { type: 'checkNameEdit' }
                    }, {
                        field: 'docadviceNuimdatString',
                        title: '执行时间',
                        rowspan: 2,
                        align: 'center',
                        width: getWidth(0.15),
                        editor: { type: 'nursedateEdit', field: 'docadviceNuimdat' }
                    }, {
                        field: 'docadviceNuimnam',
                        title: '护士签名',
                        rowspan: 2,
                        align: 'center',
                        width: getWidth(0.08),
                        editor: { type: 'usernameEdit' }
                    }, {
                        field: 'oper',
                        title: '<font style="color:red">编辑时间</font>',
                        rowspan: 2,
                        align: 'center',
                        width: getWidth(0.07),
                        editor: { type: 'operEdit' },
                        formatter: function (value, row, index) {
                            return "<span class='url-link'><a href=javascript:editRow('" + index + "')>编辑</a></span> | <span class='url-link'><a href=javascript:;>保存</a></span>";
                        }
                    }
                    ],
                    [
                        {
                            field: 'docadviceContent',
                            title: '内容',
                            align: 'center',
                            rowspan: 1,
                            width: getWidth(0.20)
                        },
                        {
                            field: 'docadviceYyjl',
                            title: '剂量',
                            align: 'center',
                            rowspan: 1,
                            width: getWidth(0.05)
                        },
                        {
                            field: 'docadviceWay',
                            title: '用法',
                            align: 'center',
                            rowspan: 1,
                            width: getWidth(0.05),
                            //                         },
                            //                         {
                            //                             field: 'sl',
                            //                             title: '数量',
                            //                             align: 'center',
                            //                             rowspan: 1,
                            //                             width: getWidth(0.03),
                        },
                        {
                            field: 'docadviceOrder',
                            title: '数量',
                            align: 'center',
                            rowspan: 1,
                            width: getWidth(0),
                            hidden: true
                        }
                    ]
                ],
                pageList: [15, 30, 50],
                onLoadSuccess: function (res) {
                },
                onDblClickRow: function (rowIndex, rowData) {
                    editRow(rowIndex, 'operEdit');
                },
                // 鼠标单击某一行是开启该行的编辑状态
                onCheck: function (rowIndex, rowData) {
                    editRow(rowIndex, 'operEdit');
                },
                onUncheck: function (rowIndex, rowData) {
                    $('#jcbglist').datagrid('cancelEdit', rowIndex);
                    getDatagrid()
                },
                onCheckAll: function () {
                    var allrows = $("#jcbglist").datagrid("getRows");
                    for (var i = 0; i < allrows.length; i++) {
                        $('#jcbglist').datagrid(i, 'operEdit');
                    }
                },
                onUncheckAll: function () {
                    var allrows = $("#jcbglist").datagrid("getRows");
                    for (var i = 0; i < allrows.length; i++) {
                        $('#jcbglist').datagrid('cancelEdit', i);
                    }
                    getDatagrid()
                }
            });
            var _thisWidth = $('body').width();
            $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
        }

        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }

        //查询方法
        function queryjcbg() {
            var start = $('#emg_startdate').val();
            var end = $('#emg_enddate').val();
            if (start == null || start == '') {
                publicFun.alert("开始时间不能为空！");
                return false;
            }
            if (end == null || end == '') {
                publicFun.alert("结束时间不能为空！");
                return false;
            }
            if (start > end) {
                publicFun.alert("结束时间需大于开始时间！");
                return false;
            }
            getDatagrid()
        }

        function setTime() {
            var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
            var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
            if (_enddate == null || _enddate == '') {
                _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
            }
            $("#emg_startdate").val(_startdate);
            $("#emg_enddate").val(_enddate);
        };

        function editRow(rowIndex, edittype) {
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            $('#jcbglist').datagrid('beginEdit', rowIndex);
            var ed = $('#jcbglist').datagrid('getEditors', rowIndex);
            for (var i = 0, len = ed.length; i < len; i++) {
                (function (i) {
                    if (ed[i].type == 'usernameEdit') {
                        $(ed[i].target).unbind("click").bind("click", function () {
                            usrname = jQuery.extend(ed[i], { "rowIndex": rowIndex });
                            // usrno = ed[i - 1];
                            selectUser("usrname");
                        });
                    }
                    if (ed[i].type == 'checkNameEdit') {
                        $(ed[i].target).unbind("click").bind("click", function () {
                            checkName = jQuery.extend(ed[i], { "rowIndex": rowIndex });
                            selectUser("checkName");
                        });
                    }
                    if (ed[i].type == 'operEdit') {
                        $(".save", ed[i].target).unbind("click").bind("click", function () {
                            saveAll(rowIndex)
                        });
                        if (edittype == 'add') {
                            $(".cancel", ed[i].target).html("取消").unbind("click").bind("click", function () {
                                $("#jcbglist").datagrid('unselectRow', rowIndex);
                                getDatagrid();
                            });
                        } else {
                            $(".cancel", ed[i].target).unbind("click").bind("click", function () {
                                $("#jcbglist").datagrid('unselectRow', rowIndex);
                                getDatagrid();
                            });
                        }
                    }
                })(i);
            }
        }
        /***
        **   新增医嘱信息
        ***/
        function addNewAdvice() {
            var openModalWindowName = '新增医嘱',
                openModalWindowUrl = '${baseurl}zyylqbl/toaddyzxx.do?emgSeq=${emgSeq}';
            createmodalwindow(openModalWindowName, 720, 480, openModalWindowUrl);
        }

        /***
        **   删除医嘱信息
        ***/
        // function deletetab(){
        //     var checkedRows = $('#jcbglist').datagrid('getSelected');
        //     if (checkedRows == null) {
        //         publicFun.alert('请选择一条数据');
        //     } else {
        //         if(checkedRows['docadviceFlag'] != '0'){
        //             publicFun.alert('该信息不允许删除');
        //             return;
        //         }
        //         _confirm('您确认删除吗？', null, function() {
        //             $("#delete_id").val(checkedRows['docadviceSeq']);
        //             jquerySubByFId('deleteform', del_callback, null, "json");
        //         });
        //     }
        // }
        function deleteAll() {
            var selectRow = $('#jcbglist').datagrid('getSelected');
            if (selectRow == null) {
                publicFun.alert('请选择一条数据');
                return
            }
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            var allrows = $("#jcbglist").datagrid("getRows");
            var postList = [];
            for (var i = 0; i < editrows.length; i++) {
                postList.push((allrows)[editrows[i]]);
            }
            _confirm('您确认删除吗？', null, function () {
                for (var i = 0; i < allrows.length; i++) {
                    $('#jcbglist').datagrid('endEdit', i);
                }
                var paramsDate = new Array();
                for (var k in postList) {
                    paramsDate[k] = postList[k]
                }
                var ajaxOption = new AjaxOption();
                ajaxOption.requestType = 'POST';
                ajaxOption.requestDataType = "json";
                ajaxOption.requestData = paramsDate;
                ajaxOption.requestUrl = deleUrl;
                ajaxOption.asyncFlg = true;
                ajaxOption.returnDataType = 'json';
                _ajaxPostRequest(ajaxOption, null, function (res) {
                    message_alert(res);
                    $('#jcbglist').datagrid('clearSelections');
                    getDatagrid();
                });

            });
        }

        // //删除的回调函数
        // function del_callback(data) {
        //     message_alert(data);
        //     var type = data.resultInfo.type;
        //     if (type == 1) {
        //         window.location.reload();
        //         // getDatagrid();
        //     }
        // }

        //修改
        function editTab() {
            var checkedRows = $('#jcbglist').datagrid('getSelected');
            var rows = $('#jcbglist').datagrid('getSelections');
            if (checkedRows == null) {
                publicFun.alert('请选择一条数据');
            } else if (rows.length > 1) {
                publicFun.alert('请选择一条数据进行修改');
            } else {
                if (checkedRows['docadviceFlag'] != 0) {
                    publicFun.alert('该信息不允许修改');
                    return
                }
                var openModalWindowName = '修改医嘱',
                    openModalWindowUrl = '${baseurl}zyylqbl/toupdateyzxx.do?docadviceSeq=' + checkedRows['docadviceSeq'];
                openModalWindowUrl = encodeURI(openModalWindowUrl);
                createmodalwindow(openModalWindowName, 520, 300, openModalWindowUrl);
            }
        }
        //到达时间改变时赋值
        function fillArrData(selfVal) {
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            var arrTime;
            for (var i = 0; i < editrows.length; i++) {
                arrTime = $('#jcbglist').datagrid('getEditor', { index: editrows[i], field: 'docadviceDatisString' });
                arrTime.target.val(selfVal.value);
            }
        }
        //开始时间改变时赋值
        function fillBeginData(selfVal) {
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            var beTime;
            for (var i = 0; i < editrows.length; i++) {
                beTime = $('#jcbglist').datagrid('getEditor', { index: editrows[i], field: 'docadviceDatbeString' });
                beTime.target.val(selfVal.value);
            }
        }
        //一旦时间改变给选中的数据进行赋值
        function fillData(selfVal) {
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            var allrows = $("#jcbglist").datagrid("getRows");
            var edName, edTime;
            for (var i = 0; i < editrows.length; i++) {
                edName = $('#jcbglist').datagrid('getEditor', { index: editrows[i], field: 'docadviceNuimnam' });
                edName.target.val(_username);
                edTime = $('#jcbglist').datagrid('getEditor', { index: editrows[i], field: 'docadviceNuimdatString' });
                edTime.target.val(selfVal.value);
            }
            // for(var i=0;i< editrows.length;i++){
            //     // if ((allrows)[editrows[i]].docadviceNuimnam == '' || (allrows)[editrows[i]].docadviceNuimnam == 'undefined' || (allrows)[editrows[i]].docadviceNuimnam == null) {
            //     //     (allrows)[editrows[i]].docadviceNuimnam = _username;
            //     // }
            //     (allrows)[editrows[i]].docadviceNuimnam = _username;
            //     (allrows)[editrows[i]].docadviceNuimdatString = selfVal.value;
            //     // if ((allrows)[editrows[i]].docadviceNuimdatString == '' || (allrows)[editrows[i]].docadviceNuimdatString == 'undefined' || (allrows)[editrows[i]].docadviceNuimdatString == null) {
            //     //     (allrows)[editrows[i]].docadviceNuimdatString = _today;
            //     // }
            // }
        }
        //批量保存
        function saveAll(rowIndex) {
            var selectRow = $('#jcbglist').datagrid('getSelected');
            if (selectRow == null) {
                publicFun.alert('请选择数据');
                return
            }
            var postList = [];
            if (rowIndex != '' && rowIndex != 'undefined' && rowIndex != null) {
                $('#jcbglist').datagrid('endEdit', rowIndex);
                var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
                var allrows = $("#jcbglist").datagrid("getRows");
                // console.log(allrows,'allrows',editrows,'editrows')
                postList.push((allrows)[rowIndex]);
                saveData(postList, rowIndex)
            } else {
                _confirm('您确认保存吗？', null, function () {
                    var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
                    var allrows = $("#jcbglist").datagrid("getRows");
                    // console.log(allrows,'allrows',editrows,'editrows')
                    for (var i = 0; i < editrows.length; i++) {
                        postList.push((allrows)[editrows[i]]);
                    }
                    for (var i = 0; i < allrows.length; i++) {
                        $('#jcbglist').datagrid('endEdit', i);
                    }
                    saveData(postList);
                    setTimeout(function () {
                        $(".messager-body").window('close');
                    }, 1000);
                });
            }
            // console.log(postList,'postList')
        }

        //共用保存方法
        function saveData(postList, rowIndex) {
            var paramsDate = new Array();
            for (var k in postList) {
                paramsDate[k] = postList[k]
            }
            // console.log(paramsDate,"paramsDate")
            var ajaxOption = new AjaxOption();
            ajaxOption.requestType = 'POST';
            ajaxOption.requestDataType = "json";
            ajaxOption.requestData = paramsDate;
            ajaxOption.requestUrl = submitUrl;
            ajaxOption.asyncFlg = true;
            ajaxOption.returnDataType = 'json';
            _ajaxPostRequest(ajaxOption, null, function (res) {
                message_alert(res);
                if (rowIndex != '' && rowIndex != 'undefined' && rowIndex != null) {
                    $("#jcbglist").datagrid('unselectRow', rowIndex);
                } else {
                    $('#jcbglist').datagrid('clearSelections');
                }
                getDatagrid();
            });
        }

        function reload() {
            getDatagrid()
        }

        $(function () {
            setLayout();
            setTime();
            $(window).resize(function () {
                getDatagrid();
            });
            getDatagrid();
            // checkRole();
        });

        //初始化 判断登陆用户角色是否有权限
        function checkRole() {
            //判断是否有权限
            var ajaxOption = new AjaxOption();
            ajaxOption.requestType = 'POST';
            ajaxOption.requestDataType = "pame";
            ajaxOption.requestUrl = "${baseurl}zyylqbl/checkRoleAjax2.do";
            ajaxOption.asyncFlg = false;
            ajaxOption.returnDataType = 'json';
            _ajaxPostRequest(ajaxOption, null, function (data) {
                //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
                checkstatus = data.resultInfo.message;
                if (data.resultInfo.message == "1" || data.resultInfo.message == "2") {
                    $("#add").show();
                    $("#addAll").show();
                    $("#edit").show();
                    $("#del").show();
                } else {
                    $("#add").hide();
                    $("#addAll").hide();
                    $("#edit").hide();
                    $("#del").hide();
                }
            });
        }
    </script>
    <form id="jcbgForm">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <input type="hidden" id="kh" name="hspDocadviceInfCustom.vstCad" value="${vstCad}" />
        <div class="form clr" style="margin:1px">
            <p class="form-text" style="font-size:14px">日期：</p>
            <input class="input-date Wdate" id="emg_startdate" type="text" name="hspDocadviceInfCustom.startdate"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <p class="form-text">-</p>
            <input class="input-date Wdate" id="emg_enddate" type="text" name="hspDocadviceInfCustom.enddate"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjcbg()">查询</a>
        </div>
        <!-- 查询列表 -->
    </form>
    <div class="list_table list_div" id="check_table">
        <table id="jcbglist"></table>
    </div>
    <form id="deleteform" action="${baseurl}zyylqbl/deleteyzxx.do" method="post">
        <input type="hidden" id="delete_id" name="hspDocadviceInfCustom.docadviceSeq" />
    </form>
    <div class="btnPos">
        <a id="add" href="javascript:;" class="commonbtn" onclick="addNewAdvice()">新增医嘱</a>
        <a id="addAll" href="javascript:;" class="commonbtn leftBtn" onclick="saveAll()">批量保存</a>
        <a id="edit" href="javascript:;" class="commonbtn leftBtn" onclick="editTab()">修改</a>
        <a id="del" href="javascript:;" class="commonbtn leftBtn" onclick="deleteAll()">删除</a>
        <a id="print" href="javascript:;" class="commonbtn leftBtn" onclick="printnote()">打印</a>
        <a id="conPrint" href="javascript:;" class="commonbtn leftBtn" onclick="continuePrint()">续打</a>
    </div>
    <!-- 打印医嘱信息 -->
    <div style="display:none">
        <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
            <p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">
                湖&emsp;州&emsp;市&emsp;第&emsp;一&emsp;人&emsp;民&emsp;医&emsp;院</p>
            <p style="margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;">医嘱信息</p>
            <ul class="print-ul">
                <li class="bordered">
                    <span class="basic-span">
                        <label class="title-label">姓名：</label>
                        <span>${hspemginfCustom.cstNam}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">性别：</label>
                        <span>${hspemginfCustom.cstSexCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">年龄：</label>
                        <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">科别：</label>
                        <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">病床号：</label>
                        <span id="_emgBed">${hspemginfCustom.emgBed}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">卡号：</label>
                        <span id="_lgh">${hspemginfCustom.vstCad}</span>
                    </span>
                </li>
            </ul>
            <table class="title_table">
                <colgroup>
                    <col width="10%" />
                    <col width="10%" />
                    <!--                     <col width="0%" /> -->
                    <col width="4" />
                    <col width="4" />
                    <col width="6" />
                    <col width="4" />
                    <col width="10%" />
                    <col width="10%" />
                    <col width="10%" />
                </colgroup>
                <thead>
                    <tr>
                        <th>下达时间</th>
                        <!--                         <th>开始时间</th> -->
                        <th colspan="5">医嘱内容</th>
                        <th>医师签名</th>
                        <th>执行时间</th>
                        <th>护士签名</th>
                    </tr>
                </thead>
            </table>
        </div>
        <div id="printnoteB" class="print-body"
            style="display:block;float:left;width:210mm;font-family:'微软雅黑';font-size: 3.3mm">
            <table id="printlist" class="printable">
                <colgroup>
                    <col width="10%" />
                    <col width="10%" />
                    <!--                     <col width="0%" /> -->
                    <col width="4" />
                    <col width="4" />
                    <col width="6" />
                    <col width="4" />
                    <col width="10%" />
                    <col width="10%" />
                    <col width="10%" />
                </colgroup>

                <tbody>
                </tbody>
            </table>
        </div>
    </div>
    <script type="text/javascript">
        /*
        setTable方法根据条件生成格式化的打印医嘱
        allRows：需打印的多条医嘱记录
        printType：打印类型（1代表全打印，0代表续打）
        */
        function setTable(allRows, printType) {
            // console.log("******************");
            // console.log(allRows);
            //<td id="docadviceDatbeString"> 开始时间
            $("#printlist tbody").html("");
            //$("#printlist tbody").append('<tr id="template"><td id="docadviceDatisString"></td></td><td id="docadviceContent"  class="rightBorderNone"></td><td id="docadviceYyjl" class="borderNone"><td id="markLab" class="borderNone"></td><td id="docadviceWay" class="borderNone"></td><td id="sl" class="leftBorderNone"></td><td id="docadviceNam"></td><td id="docadviceNuimdatString"></td><td id="docadviceNuimnam"></td></tr>');
            $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
            $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
            $('span').css({ "display": "inline-block" });
            $('.title_table').css({ "font-size": "3.3mm", "width": "196mm", 'margin-left': '3.5mm', "border-collapse": "collapse", "padding": "0mm" });
            $('.title_table tr th').css({ "border": "1px solid #000", 'border-bottom': 'none' });
            $('.printable').css({ "font-size": "3.3mm", "width": "196mm", "margin-left": "3mm", "margin-top": "0mm", "border-collapse": "collapse", "padding": "0mm" });
            $(".printable tr th").css({ "border": "1px solid #000" });

            if ($('#_age').html() == '岁') {
                $('#_age').html("__/__");
            }
            if ($('#_emgFkCod').html() == '') {
                $('#_emgFkCod').html("__/__");
            }
            if ($('#_emgBed').html() == '') {
                $('#_emgBed').html("__/__");
            }
            if ($('#_lgh').html() == '') {
                $('#_lgh').html("__/__");
            }

            var group = [], group2 = [];
            var _tbody = $('#printlist tbody');
            for (var i = 0; i < allRows.length; i++) {

                var _thisRow = allRows[i];
                group2.push({ "type": _thisRow['docadviceType'], "dateStr": _thisRow['docadviceDatbeString'], "infoBz": _thisRow['docadviceBz'], "pl": _thisRow['pl'] });
                group.push([_thisRow['docadviceType'], _thisRow['docadviceDatbeString'], _thisRow['docadviceBz'], _thisRow['pl']]);

                //null属性值替换为''
                for (prop in _thisRow) {
                    if (_thisRow.hasOwnProperty(prop) && !_thisRow[prop]) {
                        _thisRow[prop] = '';
                    }
                }
                if (printType === 1) {
                    _tbody.append('<tr><td>' + _thisRow['docadviceDatisString'] + '</td><td class="rightBorderNone docadviceContent' + i + '">' + _thisRow['docadviceContent'] + '</td><td class="borderNone">' + _thisRow['docadviceYyjl'] + '</td><td class="borderNone markLab' + i + '"></td><td class="borderNone docadviceWay' + i + '">' + _thisRow['docadviceWay'] + '</td><td class="leftBorderNone"></td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
                }
                if (printType === 0) {
                    if (_thisRow['isprint'] == 1) {
                        _tbody.append('<tr class="white"><td>' + _thisRow['docadviceDatisString'] + '</td><td class="rightBorderNone docadviceContent' + i + '">' + _thisRow['docadviceContent'] + '</td><td class="borderNone">' + _thisRow['docadviceYyjl'] + '</td><td class="borderNone markLab' + i + '"></td><td class="borderNone docadviceWay' + i + '">' + _thisRow['docadviceWay'] + '</td><td class="leftBorderNone"></td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
                    }
                    if (_thisRow['isprint'] == 0) {
                        _tbody.append('<tr><td>' + _thisRow['docadviceDatisString'] + '</td><td class="rightBorderNone docadviceContent' + i + '">' + _thisRow['docadviceContent'] + '</td><td class="borderNone">' + _thisRow['docadviceYyjl'] + '</td><td class="borderNone markLab' + i + '"></td><td class="borderNone docadviceWay' + i + '">' + _thisRow['docadviceWay'] + '</td><td class="leftBorderNone"></td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
                    }
                }
            }

            $(".printable tbody tr td").css({ "border": "1px solid #000", "text-align": "center" });
            $(".printable tbody tr td.rightBorderNone").css({ "border": "1px solid #000", "text-align": "left", "border-right": "0" });
            $(".printable tbody tr td.leftBorderNone").css({ "border": "1px solid #000", "text-align": "center", "border-left": "0" });
            $(".printable tbody tr td.borderNone").css({ "border": "1px solid #000", "text-align": "center", "border-left": "0", "border-right": "0" });
            $(".printable tbody .white td").css({ "border": "1px solid #fff", "text-align": "center", 'color': '#fff' });

            var _resRepeat = [];
            var firstTitleHm = '',
                middleTitleHm = '',
                lastTitleHm = '';
            var hasTitleList = [];
            // console.log(group);
            var firstTitleArray = ['静脉滴注', '静脉注射', '肌肉注射', '接瓶', '静脉推注', '封管', '肌肉注射(皮试)'];
            for (var i = 0; i < group.length;) {
                if (group[i][2] == '*') {
                    i++;
                    continue;
                }
                var count = 0;
                for (var j = i; j < group.length; j++) {
                    if ((group[i][0] == group[j][0] && group[i][1] == group[j][1] && group[i][2] == group[j][2] && group[i][3] == group[j][3])) {
                        count++;
                    }
                }
                var _m = i + 1;
                if (count == 2) {
                    var reg = /[a-zA-Z]/g;
                    var firstStr = $('.docadviceWay' + i).html();
                    firstStr = (firstStr).replace(reg, "");
                    firstStr = firstStr.replace(/\s+/g, "");
                    if ((new RegExp(/副药/).test($('.docadviceWay' + _m).html()) == true || new RegExp(/奥美拉唑/).test($('.docadviceContent' + _m).html()) == true)) {
                        $('.markLab' + i).html('┓');
                        $('.markLab' + _m).html('┛');
                        $('.docadviceWay' + _m).html('');
                    }
                }
                if (count >= 3) {
                    var flagNum = 0;
                    var reg = /[a-zA-Z]/g;
                    var _firstStr = $('.docadviceWay' + i).html();
                    _firstStr = (_firstStr).replace(reg, "");
                    _firstStr = _firstStr.replace(/\s+/g, "");
                    for (var k = 0; k < count; k++) {
                        var _spc = i + k, _las = i + count - 1;;
                        if ($.inArray(_firstStr, firstTitleArray) > -1) {
                            if (((new RegExp(/副药/).test($('.docadviceWay' + _spc).html()) != true) && (new RegExp(/奥美拉唑/).test($('.docadviceContent' + _m).html()) != true))) {
                                if (_spc != i) {
                                    flagNum++;
                                }
                            }
                        }
                    }
                    var newCount;
                    if (flagNum == 0) {
                        newCount = count;
                    } else {
                        var _nextIsFy = flagNum + i;
                        if (new RegExp(/副药/).test($('.docadviceWay' + _nextIsFy).html()) == true) {
                            newCount = count - flagNum + 1;
                        }
                    }
                    if (newCount == count) {
                        var _last = i + count - 1;
                        $('.markLab' + i).html('┓');
                        for (var o = 1; o < count - 1; o++) {
                            var _aspc = i + o;
                            $('.markLab' + _aspc).html('┫');
                            $('.docadviceWay' + _aspc).html('');
                        }
                        $('.markLab' + _last).html('┛');
                        $('.docadviceWay' + _last).html('');
                    } else {
                        if (newCount == 2) {
                            var fistIdx = flagNum + i, lastIdx = i + flagNum + 1;
                            $('.markLab' + fistIdx).html('┓');
                            $('.markLab' + lastIdx).html('┛');
                            $('.docadviceWay' + lastIdx).html('');
                        }
                        if (newCount >= 3) {
                            var _firstIdx = flagNum + i;
                            var _n = i + count - 1;
                            $('.markLab' + _firstIdx).html('┓');
                            for (var q = 1; q < newCount - 1; q++) {
                                var _bspc = i + q + flagNum;
                                $('.markLab' + _bspc).html('┫');
                                $('.docadviceWay' + _bspc).html('');
                            }
                            $('.markLab' + _n).html('┛');
                            $('.docadviceWay' + _n).html('');
                        }
                    }
                }
                _resRepeat.push([group[i][0], group[i][1], group[i][2], count]);
                i += count;
            }
            // console.log(_resRepeat,"_resRepeat")
        }


        function batchSave() {
            var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
            if (editrows.length > 0) {
                publicFun.alert("请先完成操作");
                return;
            }
            var today = $("#emg_enddate").val();
            var startdate = $("#emg_startdate").val();
            $.ajax({
                url: printUseUrl,
                type: "POST",
                async: true,
                dataType: 'json',
                data: {
                    "hspDocadviceInfCustom.vstCad": '${vstCad}',
                    "hspDocadviceInfCustom.startdate": startdate,
                    "hspDocadviceInfCustom.enddate": today
                }
            });
        }
        /**
        * [printnote 打印记录]
        */
        function printnote() {

            _confirm('请确认核对护士是否已签名?', null, function () {

                //先进行批量保存
                batchSave();

                var allRows = $('#jcbglist').datagrid('getData')['rows'];
                if (allRows.length === 0) {
                    // publicFun.alert('数据不存在');
                    return
                }
                // try {
                setTable(allRows, 1);
                getDatagrid();
                // LODOP = window.top.getLodop();
                LODOP = getLodop();
                LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
                LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
                LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);

                LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
                LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
                LODOP.ADD_PRINT_TABLE(103, 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
                LODOP.NewPageA();
                LODOP.SET_PRINT_STYLE("FontSize", 10);
                //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
                LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
                LODOP.PREVIEW();
                if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
                    console.log("************全打印************");
                    console.log(Value);
                    if (Value == 1) {
                        getTotalPage('PRINTSETUP_PAGE_COUNT');//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
                    }
                }

                //LODOP.PRINT();
                // } catch (e) {
                //     publicFun.alert('数据存在某些问题，请刷新后重试');
                // }
            });
        }
        function getTotalPage(strType) {
            var LODOP = getLodop();
            var ajaxOption = new AjaxOption();
            ajaxOption.requestType = 'POST';
            ajaxOption.requestDataType = "pame";
            ajaxOption.requestUrl = "${baseurl}zyylqbl/afterprint.do";
            ajaxOption.asyncFlg = false;
            ajaxOption.returnDataType = 'json';
            if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
                console.log("&&&&&&& C-Lodop 页数&&&&&&&&");
                console.log(Value);
                ajaxOption.requestData = {
                    'hspemginfCustom.emgSeq': '${emgSeq}',
                    'hspDocadviceInfCustom.emgSeq': '${emgSeq}',
                    'hspemginfCustom.yzdyy': Value,
                    'hspDocadviceInfCustom.startdate': $("#emg_startdate").val() + ' 00:00:00',
                    'hspDocadviceInfCustom.enddate': $("#emg_enddate").val() + ' 23:59:59'
                };
                _ajaxPostRequest(ajaxOption, null, function (res) {
                    // console.log('发送上传页数后：');
                    // console.log(res);
                });
            };
            var stResult = LODOP.GET_VALUE(strType, "0");
            if (!LODOP.CVERSION) {
                console.log("&&&&&&& Lodop 页数&&&&&&&&");
                console.log(stResult);
                ajaxOption.requestData = {
                    'hspemginfCustom.emgSeq': '${emgSeq}',
                    'hspDocadviceInfCustom.emgSeq': '${emgSeq}',
                    'hspemginfCustom.yzdyy': stResult,
                    'hspDocadviceInfCustom.startdate': $("#emg_startdate").val() + ' 00:00:00',
                    'hspDocadviceInfCustom.enddate': $("#emg_enddate").val() + ' 23:59:59'
                };
                _ajaxPostRequest(ajaxOption, null, function (res) {
                    // console.log('发送上传页数后：');
                    // console.log(res);
                });
            }
        }
        /* 医嘱续打 */
        function continuePrint() {
            _confirm('请确认核对护士是否已签名?', null, function () {

                //先进行批量保存
                batchSave();

                var rows = $('#jcbglist').datagrid('getData')['rows'];
                console.log("*********续打**********");
                console.log(rows);
                var oldPages = 0;
                //获取旧数据总页数，赋值给oldPages
                $.ajax({
                    url: "${baseurl}zyylqbl/findyzdyy.do",
                    type: "POST",
                    async: false,
                    dataType: 'json',
                    data: {
                        'emgSeq': '${emgSeq}'
                    },
                    success: function (res) {
                        oldPages = res;
                    }
                });
                var rows_old = [];
                var rows_new = [];
                if (rows.length > 0) {
                    for (var j = 0; j < rows.length; j++) {
                        if (rows[j].isprint == 1) {
                            rows_old.push(rows[j]);
                        } else {
                            rows_new.push(rows[j]);
                        }
                    }
                }
                if (rows_old.length && rows_new.length) {

                    // if (rows.length) {

                    var oldPageRange = ''; //oldPageRange：旧数据占用的页码范围
                    var pageArr = [];
                    for (var p = 1; p <= oldPages; p++) {
                        pageArr.push(p);
                        oldPageRange = pageArr.join(',');
                    }
                    // LODOP = window.top.getLodop();
                    LODOP = getLodop();
                    LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
                    LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
                    LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);

                    //页头打印
                    LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
                    LODOP.SET_PRINT_STYLEA(1, "ItemType", 1);
                    LODOP.SET_PRINT_STYLEA(1, "PageUnIndex", oldPageRange);
                    //页尾打印
                    // LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
                    LODOP.ADD_PRINT_TEXT(1050, 344, '90%', '100%', "第#页/共&页");

                    LODOP.SET_PRINT_STYLEA(2, "ItemType", 2);
                    LODOP.SET_PRINT_STYLEA(2, "PageUnIndex", oldPageRange);
                    //中间内容打印

                    setTable(rows, 0);
                    LODOP.ADD_PRINT_TABLE(103, 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
                    LODOP.NewPageA();
                    LODOP.SET_PRINT_STYLE("FontSize", 10);
                    LODOP.SET_PRINT_MODE('PRINT_START_PAGE', oldPages); //设置打印起始页，控制打印范围
                    LODOP.PREVIEW();
                    if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
                        // console.log("************续打返回************");
                        // console.log(Value);
                        if (Value == 1) {
                            // getTotalPage('PREVIEW_PAGE_COUNT');//PREVIEW_PAGE_COUNT----打印预览时或打印后，获得总页数
                            getTotalPage('PRINTSETUP_PAGE_COUNT');//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
                        }
                    }

                } else {
                    $.messager.alert('提示信息', '当前无续打数据', 'warning');
                }
            })
        }
    </script>
</body>

</html>