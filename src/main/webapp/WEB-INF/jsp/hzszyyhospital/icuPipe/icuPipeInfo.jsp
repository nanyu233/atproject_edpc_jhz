<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>管路信息</title>
</head>

<body class="queryjzjl">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}';
    var _emgSeq = "${emgSeq}";
    var _pipeDefList = [];
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTab();
      }
    });

    function reload() {
      $('#icuPipe').datagrid('reload');
    }

    function getWidth(proportion) {
        var width = $("body").width() * 0.29 - 4;
        return Math.round(proportion * width);
    }

    //新增/修改
    function editData(flag) {
        editFlag = flag;
        var modalTitle;
        var modalWidth = 650;
        var modalHeight = 380;
        var modalUrl = _baseUrl + 'icuPipe/toEditPipe.do';
        modalTitle = '置管';
        switch (flag) {
            case 'edit':
                modalHeight = 450;
                modalTitle = '管路信息修改';
                break;
            case 'chg':
                modalTitle = '换管';
                modalHeight = 350;
                break;
            case 'out':
                modalTitle = '拔管';
                modalHeight = 350;
                break;
        }
        if (editFlag !== 'add') {
            var checkedObj = $("#icuPipe").datagrid('getSelected');
            if (!checkedObj) {
                alert_warn("未选中记录");
                return;
            }
            if (!checkedObj.pipeSeq) {
                alert_error("数据出错，请联系管理员");
                return;
            }
            if (editFlag === 'out') {
                if (checkedObj.outTime && checkedObj.pipeStat === "30") {
                    alert_warn("该管路已拔出");
                    return;
                }
            } else if (editFlag === 'chg') {
                if (checkedObj.outTime) {
                    alert_warn("不可更换已拔出管路");
                    return;
                }
            }
        }
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
    }

    function getEditFlag() {
        return editFlag;
    }

    function getPipeInfo() {
        var daData;
        var columns_v = [
            [{
                field: 'pipeName',
                title: '管路名称',
                width: getWidth(0.25),
                align: "center"
            }, {
                field: 'bodyPart',
                title: '身体部位',
                width: getWidth(0.12),
                align: "center"
            }, {
                field: 'pipeStat',
                title: '管路状态',
                width: getWidth(0.12),
                align: "center",
                formatter: function (value, row, idx) {
                    var reVal = "";
                    switch (value) {
                        case "10":
                            reVal = "已置管";
                            break;
                        // case "11": reVal = "重新置管"; break;
                        case "20":
                            reVal = "已换管";
                            break;
                        // case "21": reVal = "二次换管"; break;
                        // case "22": reVal = "三次换管"; break;
                        case "30":
                            reVal = "已拔管";
                            break;
                    }
                    return reVal;
                }
            },{
              field: 'aeCount',
                title: '不良事件数',
                width: getWidth(0.15),
                align: "center",
                styler: function (value, row, idx) {
                    if (row.aeCount !== null && row.aeCount >= 0) {
                        return "color:red";
                    }
                },
            }, {
                field: 'vldDay',
                title: '有效天数',
                width: getWidth(0.12),
                align: "center",
                styler: function (value, row, idx) {
                    if (row.overDay !== null && row.overDay >= 0) {
                        // overday = 置管天数-有效天数
                        return "color:red";
                    }
                },
            }, {
                field: 'pipeModl',
                title: '管路型号',
                width: getWidth(0.12),
                align: "center"
            },
            // {
            //     field: 'skinSitu',
            //     title: '皮肤状况',
            //     align: "center"
            // },
            {
              field: 'inType',
              title: '置管类型',
                width: getWidth(0.2),
              align: "center",
              formatter: function (value, row, idx) {
                    var reVal = "";
                    switch (value) {
                        case "1":
                            reVal = "正常置管";
                            break;
                        case "2":
                            reVal = "非计划拔管后再置管";
                            break;
                    }
                    return reVal;
                }
            }, {
                field: 'inTimeStr',
                title: '置管时间',
                width: getWidth(0.25),
                align: "center"
            }, {
                field: 'inPipeDays',
                title: '置管天数',
                width: getWidth(0.15),
                align: "center"
            }, {
                field: 'inMemo',
                title: '置管备注',
                width: getWidth(0.2),
                align: "center"
            }, {
                field: 'chgTimeStr',
                title: '换管时间',
                width: getWidth(0.25),
                align: "center"
            }, {
                field: 'chgPipeDays',
                title: '换管天数',
                width: getWidth(0.15),
                align: "center"
            }, {
                field: 'chgMemo',
                title: '换管备注',
                width: getWidth(0.23),
                align: "center"
            }, {
                field: 'outTimeStr',
                title: '拔管时间',
                width: getWidth(0.25),
                align: "center"
            }, {
                field: 'outType',
                title: '拔管类型',
                width: getWidth(0.15),
                align: "center",
                formatter: function (value, row, idx) {
                    if (value) {
                        if (value === '1') {
                            return '计划拔管'
                        } else {
                            return '非计划拔管'
                        }
                    } else {
                        return '';
                    }
                },
                styler: function (value, row, idx) {
                    if (value !== '1') {
                        return 'color: red'
                    }
                }
            }, {
                field: 'outMemo',
                title: '拔管备注',
                width: getWidth(0.23),
                align: "center"
            }, {
                field: 'pipeLeng',
                title: '管路长度<br><span class="unit">cm</span>',
                width: getWidth(0.15),
                align: "center"
            }, {
                field: 'pipeDpth',
                title: '内置长度<br><span class="unit">cm</span>',
                width: getWidth(0.15),
                align: "center"
            }]
        ]
        var height = 0.975 * ($("#tabs",  parent.parent.parent.document).height() - 36 - 86);
        $("#icuPipe").height(height);
        //绘制datagrid
        $('#icuPipe').datagrid({
            rownumbers: true,
            nowrap: true,
            striped: true,
            singleSelect: true,
            idField: 'pipeSeq',
            columns: columns_v,
            pagination: true,
            pageList: [50, 100, 200],
            nowrap: true,
            url: '${baseurl}icuPipe/querypipe_result.do',
            loadFilter: function (data) {
                if (data.resultInfo && data.resultInfo.messageCode == '0') {
                    alert_error('数据出错,请联系管理员')
                    return;
                }
                optionListStr = ""; //清空下一页options的List
                data.rows.forEach(function (ele, idx, arr) {
                    optionListStr += "<option value=\"" + ele.pipeSeq + "\">" + ele.bodyPart +
                        "-" + ele.pipeName + "</option>"
                })
                return data;
            },
            onLoadSuccess: function (data) {
                if (data.rows[0]) {
                    //如果有数据，加载首行数据
                    $('#icuPipe').datagrid('selectRow', 0);
                }
            },
            loadMsg: "",
            queryParams: {
                "icuPipeInfoCustom.emgSeq": _emgSeq
            },
            rowStyler: function (idx, row) {
                if (row.pipeStat === "30") {
                    return "color: #999";
                }
            },
            onDblClickRow: function (idx, rowData) {
                editData('edit');
            }
        });
    }

    //管路信息查询
    function queryPipeList() {
        var formdata = $("#hzxxform").serializeJson();
        formdata["icuPipeInfoCustom.emgSeq"] = _emgSeq;
        $('#icuPipe').datagrid('load', formdata);
    }

    function getTotalDic(){
        publicFun.httpServer({url:'${baseurl}icuPipe/getPipeDictList.do'}, {}, function (res) {
            _pipeDefList = res.resultInfo.sysdata.pipeDefList;
            //增加具体管路类型
            var pipeTypeStr = '';
            _pipeDefList.forEach(function (pipeDefInfo) {
                pipeTypeStr += '<option value="' + pipeDefInfo.infocode + '">';
                pipeTypeStr += pipeDefInfo.info;
                pipeTypeStr += '</option>'
            })
            $('#paramPipeType').append(pipeTypeStr);
        })
    }

    //删除的回调函数
    function del_callback(data) {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
            $('#icuPipe').datagrid('clearSelections');
            queryPipeList();
        }
    }

    function deletePipe(){
        var node = $('#icuPipe').datagrid('getSelected');
        if (GridUtils.checkChecked(node)) {
            _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}icuPipe/delpipeSubmit.do' }, { 'pipeSeq': node.pipeSeq }, function (res) {
                    del_callback(res);
                })
            });
        }
    }

    $(function () {
      var flag = null;
      getTotalDic();
      getPipeInfo();
    })
  </script>
  <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width=0px height=0px align="center" hspace="0"
    vspace="0"></OBJECT>
  <form id="hzxxform" action="#" method="post">
    <div class="form clr queryPipe">
      
      <div class=" form clr" id="dataToolbar">
        <p class="form-text">管路类型：</p>
        <select name="paramPipeType" id="paramPipeType" class="initial">
            <option value="">全部类型</option>
        </select>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="queryPipeList()">查询</a>
        <a href="#" class="easyui-linkbutton noIcon" onclick="editData('add')">置管</a>
        <a href="#" class="easyui-linkbutton noIcon" onclick="editData('chg')">换管</a>
        <a href="#" class="easyui-linkbutton noIcon" onclick="editData('out')">拔管</a>
        <a href="#" class="easyui-linkbutton noIcon" onclick="editData('edit')">修改</a>
        <a href="#" class="easyui-linkbutton noIcon" onclick="deletePipe()">删除</a>
    </div>
    </div>
    <div class="m-l2 queryTabs">
      <table id="icuPipe"></table>
    </div>
  </form>
</body>

</html>