<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <base href="${baseurl}" >
    <title>值班列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="css/common/querylist.css"/>
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">

    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="lib/activetech.ztreegrid.js"></script>

</head>

<body class="compctl">

<script>
    $(document).keydown(function (event) {
        switch (event.keyCode) {
            case 13:
                return false;
        }
    });
    var tg;
    var passNode;

    function getNode() {
        return passNode;
    }

    function cmdshow() {
        tg.expandAll();
    }

    function cmdfold() {
        tg.collapseAll();
    }

    function cmdadd() {
        addExpert();
    }

    function cmdaddexpertgroup() {
        addExpertGroup();
    }

    function cmdedit() {
        edit();
    }

    function cmdremove() {
        remove();
    }


    //加载
    $(function () {
        init();
        // 当输入框获取光标后enter按键就默认触发查询事件
        $("#querycomcname").keyup(function (event) {
            if (event.keyCode == 13) {
                init();
            }
        })
    });

    function init() {
        var toolbar_v;
        var baseurl = "${baseurl}";
        var extraParms = "${moduleid}";
        var canDial = window.top.canDial;
        // var canDial = true
        var propObj = {
            iconCls: 'icon-ok',
            rownumbers: true,
            animate: true,
            collapsible: true,
            showFooter: true,
            queryParams: {},
            columns: [
                [{
                    field: "grpSeq",
                    width: getWidth(0.1),
                    title: '随访组编号/随访编号',
                    formatter: function (value, row, index) {
                        if (row["_parentId"]) {
                            return row.eptNo;
                        }
                        return value;
                    }
                }, {
                    field: 'grpNam',
                    width: getWidth(0.1),
                    align: 'left',
                    editor: 'text',
                    title: '随访组名称',
                    formatter: function (value, row, index) {
                        if (row['_parentId']) {
                            return "";
                        }
                        return row.grpNam;
                    }
                }, {
                    field: 'usrname',
                    width: getWidth(0.1),
                    align: 'left',
                    editor: 'text',
                    title: '随访名称'
                },{
                    field: 'eptTyp',
                    width: getWidth(0.1),
                    align: 'left',
                    editor: 'text',
                    title: '随访类型',
                    formatter: function (value, row, index) {
                        if (row['_parentId'] && value) {
                            var typeval = '';
                            switch (value) {
                                case '1':
                                    typeval = '组长';
                                    break;
                                case '2':
                                    typeval = '副组长';
                                    break;
                                case '9':
                                    typeval = '成员';
                                    break;
                            }
                            return typeval;
                        } else return '';
                    }
                }, {
                    field: 'movephone',
                    width: getWidth(0.15),
                    align: 'left',
                    editor: 'text',
                    title: '手机号码',
                    formatter: function (value, row, index) {
                        if (value == null) {
                            return '';
                        } else if (canDial) {
                            return value + "    <span class='url-link'><a href=javascript:dial('" + value + "_" + row.consultationRecordsSeq + "_" + row.emgSeqCr + "_" + row.dutydoct + "')>拨号</a></span>"
                        } else return value;
                    }
                }, {
                    field: 'phone',
                    width: getWidth(0.15),
                    align: 'left',
                    editor: 'text',
                    title: '办公电话',
                    formatter: function (value, row, index) {
                        if (value == null) {
                            return '';
                        } else if (canDial) {
                            return value + "    <span class='url-link'><a href=javascript:dial('" + value + "_" + row.consultationRecordsSeq + "_" + row.emgSeqCr + "_" + row.dutydoct + "')>拨号</a></span>"
                        } else return value;
                    }
                }, 
								// {
                //     field: 'wxpFlg',
                //     width: getWidth(0.1),
                //     edtor: 'text',
                //     title: '是否院前急救联系人',
                //     formatter: function (value, row, index) {
                //         if (row['_parentId']) {
                //             return value === '0' ? "否" : "是";
                //         }
                //     }
                // }
							]
            ],
            toolbar: [{
                handler: "cmdshow",
                iconCls: "icon-arrowout",
                text: "展开"
            }, {
                handler: "cmdfold",
                iconCls: "icon-arrowin",
                text: "折叠"
            }, {
                handler: "cmdaddexpertgroup",
                iconCls: "icon-add",
                text: "新增随访组"
            }, {
                handler: "cmdadd",
                iconCls: "icon-add",
                text: "新增随访"
            }, {
                handler: "cmdedit",
                iconCls: "icon-edit",
                text: "修改"
            }, {
                handler: "cmdremove",
                iconCls: "icon-cut",
                text: "删除"
            }]
        }; //添加属性
        var eventObj = {}; //添加事件
        var url = "expertGroup/getExpertGroupList.do";
        tg = new ZTREEGRID('test', url, 'grpSeq', 'grpSeq'); //目标id 远程连接 数据标识 树表格的唯一标识
        tg.ztreegridload(propObj, eventObj); //加载数据
        var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
        $("#test").height(height);
    }

    function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
    }

    //拨号功能
    function dial(allStr) {
        var allArr = allStr.split("_");
        console.log(allArr);
        var phone = allArr[0], crSeq = "#", emgSeq = "#", doctNo = allArr[3];
        window.top.dial(phone, crSeq, emgSeq, doctNo);
    }

    function remove() { ///删除节点操作
        var node = tg.getSelected();
        if (GridUtils.checkChecked(node)) {
            var s = tg.getChildren(node);
            if (s.length > 0) {
                $.messager.alert('提示信息', '该机构有子节点不允许删除', 'warning');
                return false;
            } else {
                _confirm("您确认删除吗？", null, function () {
                    var ajaxOption = new AjaxOption();
                    if (node["_parentId"]) {
                        //已经是子节点
                        ajaxOption.requestUrl = 'expertGroup/deleteExpertGroupMemberSubmit.do';
                        ajaxOption.requestData = "grpSeq=" + node.grpSeq + "&eptNo=" + node.eptNo;
                    } else {
                        //父节点
                        ajaxOption.requestUrl = 'expertGroup/deleteExpertGroupSubmit.do';
                        ajaxOption.requestData = "grpSeq=" + node.grpSeq;
                    }
                    ajaxOption.requestType = 'POST';
                    ajaxOption.requestDataType = "pame";
                    ajaxOption.asyncFlg = true;
                    // ajaxOption.returnDataType = 'json';
                    _ajaxPostRequest(ajaxOption, null, function (res) {
                        console.log("删除成功");
                        init();
                    })
                });
            }
        }
    }

    function addExpertGroup() {
        createmodalwindow("新增随访组", 300, 120, 'expertGroup/toAddExpertGroupPage.do');
    }

    function addExpert() {
        passNode = tg.getSelected();
        if (GridUtils.checkChecked(passNode)) {
            if (passNode.usrname) {
                publicFun.alert("请选择随访组新增随访");
                return;
            }
            createmodalwindow("新增随访", 400, 250, 'expertGroup/toAddExpertGroupMemberPage.do');
        }
    }

    function edit() {
        passNode = tg.getSelected();
        if (GridUtils.checkChecked(passNode)) {
            if (passNode['_parentId']) {
                createmodalwindow("修改随访信息", 400, 250, 'expertGroup/toUpdateExpertGroupMemberPage.do');
                //修改的时候需要传递的参数
            } else {
                createmodalwindow("修改随访组信息", 300, 120, 'expertGroup/toUpdateExpertGroupPage.do');
            }
        }
    }
</script>
<!-- html的静态布局 -->
<div class="list queryTabs">
    <table id="test"></table>
</div>
</body>

</html>
