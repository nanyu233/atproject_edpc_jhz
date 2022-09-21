<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>医嘱信息</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?90">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _username = '${sessionScope.activeUser.usrname}',
      _userno = '${sessionScope.activeUser.usrno}',
      _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
  </script>
</head>

<body class="tabsBody queryyzxx">
  <script type="text/javascript">
    var checkstatus = 1;//1登陆角色无护士，0登陆角色有护士 -1只有查看角色 2系统管理员
    var getDatagridUrl = '${baseurl}his/querycfxx_result.do',
      submitUrl = '${baseurl}zyylqbl/insertyzxxajax.do',
      deleUrl = '${baseurl}zyylqbl/deleteyzxx.do',
      printUseUrl = '${baseurl}zyylqbl/inseryzxxbatch.do';


    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
    }

    function splitYzInfo(row) {
      var objItemList = {
        highRiskList: [],
        orderStatusList: [],
        daInfoList: [],
        daDoseList: [],
        daUnitList: [],
        daWayStrList: [],
        daFreqList: []
      };
      var keySplitList = ['highRisk', 'orderStatus', 'daInfo', 'daDose', 'daUnit', 'daWayStr', 'daFreq'];
      for (var i = 0; i < keySplitList.length; i++) {
        var _item = keySplitList[i];
        if (row[_item]) {
          objItemList[_item + 'List'] = row[_item].split('|br');
        }
      }
      var rtnStr = '', _allLength = objItemList.daInfoList.length, otherRtnStr = '';
      for (var i = 0; i < _allLength; i++) {
        for (var j = 0; j < keySplitList.length; j++) {
          if (!objItemList[keySplitList[j] + 'List'][i]) {
            objItemList[keySplitList[j] + 'List'][i] = ''
          }
        }
        var _totalMsg = objItemList.daInfoList[i] + ' ' + objItemList.daDoseList[i] + objItemList.daUnitList[i] + ' ' + objItemList.daWayStrList[i] + ' ' + objItemList.daFreqList[i] + '<br/>';
        var otherRtnMsg = objItemList.daInfoList[i] + ' ' + objItemList.daFreqList[i] + '<br/>';
        var _ZfStr = '<span style=\"color: red !important; font-weight: bold;\">[作废]</span>  ', _highRiskStr = '<span style=\"color: red !important;font-weight:bold;\">(危)</span>  ';
        if (objItemList.highRiskList[i] == '高危') {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _highRiskStr + _totalMsg
            otherRtnStr += _ZfStr + _highRiskStr + otherRtnMsg
          } else {
            rtnStr += _highRiskStr + _totalMsg
            otherRtnStr += _highRiskStr + otherRtnMsg
          }
        } else {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _totalMsg
            otherRtnStr += _ZfStr + otherRtnMsg
          } else {
            rtnStr += _totalMsg
            otherRtnStr += otherRtnMsg
          }
        }
      }
      if(row.daType === '药疗') {
        return rtnStr
      } else if (row.daType == '嘱托') {
        return '<span style="color: rgb(42, 0, 255)">' + otherRtnStr + '<span>';
      } else {
        return otherRtnStr;
      }
    }

    function splitNumInfo(row) {
      var valueList = [], unitList = [], rtnStr = '';
      if (row.num) {
        valueList = row.num.split('|br');
      }
      if (row.yfdw) {
        unitList = row.yfdw.split('|br');
      }
      for (var i = 0; i < valueList.length; i++) {
        if (!valueList[i]) {
          valueList[i] = ''
        }
        if (!unitList[i]) {
          unitList[i] = ''
        }
        rtnStr += valueList[i] + unitList[i] + '<br/>'
      }
      return rtnStr
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
        singleSelect: true,
        rownumbers: true,
        title: "医嘱信息",
        url: getDatagridUrl,
        queryParams: {
          "hspCfxxInfoCustom.mpi": '${mpi}',
          // "hspDocadviceInfCustom.emgSeq": '${emgSeq}',
          "startdate": startdate,
          "enddate": today
        },
        idField: 'docadviceSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: [
          [{
            field: 'enterTime',
            title: '开立时间',
            align: 'center',
            width: getWidth(0.11),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
            }
          },
          {
            field: 'daType',
            title: '类型',
            sortable: true,
            width: getWidth(0.04)
          },
          {
            field: 'daInfo',
            title: '医嘱内容',
            sortable: true,
            width: getWidth(0.35),
            formatter: function (value, row) {
              return splitYzInfo(row);
            }
          },
          {
            field: 'drugSpec',
            title: '规格',
            sortable: true,
            width: getWidth(0.07),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'num',
            title: '总数量',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row) {
              return splitNumInfo(row)
            }
          },
          {
            field: 'startTime',
            title: '开始时间',
            sortable: true,
            width: getWidth(0.12),
            hidden: true,
            formatter: function (value, row) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'startDoct',
            title: '开立医生',
            sortable: true,
            width: getWidth(0.07)
          },
          {
            field: 'hddat',
            title: '核对时间',
            sortable: true,
            width: getWidth(0.1),
            hidden: true
          },
          {
            field: 'hdhsxm',
            title: '核对护士',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'execTime',
            title: '执行时间',
            sortable: true,
            width: getWidth(0.11),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'execUserXm',
            title: '执行护士',
            sortable: true,
            width: getWidth(0.08),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'execUserxmSecond',
            title: '执行核对',
            sortable: true,
            width: getWidth(0.05),
            hidden: true
          }
          ]
        ],
        pageList: [15, 30, 50]
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryYzList() {
      var start = $('#emg_startdate').val();
      var end = $('#emg_enddate').val();
      var rtnFlg = publicFun.searchTime(start, end);
      if (rtnFlg == false) {
        return false;
      }
      getDatagrid()
    }

    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd hh:mm");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd hh:mm");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(_enddate);
    };

    /***
     ** 布局（datagrid 表格拉伸）
     ***/
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeight = parent.$('#mainIfream').height();
      $('#jcbglist').height(windowsHeight - 87);
      // var windowsWidth = parent.$('#mainIfream').width(),
      //   windowsHeight = parent.$('#mainIfream').height() || 0.975 * ($("#tabs", parent.document).height() - 16);
      // $('#jcbglist').height(windowsHeight - 87);
    }

    /***
    **   新增医嘱信息
    ***/
    function addNewAdvice() {
      var openModalWindowName = '新增医嘱',
        openModalWindowUrl = '${baseurl}zyylqbl/toaddyzxx.do?emgSeq=${emgSeq}';
      createmodalwindow(openModalWindowName, 720, 480, openModalWindowUrl);
    }

    //修改
    function editTab() {
      var checkedRows = $('#jcbglist').datagrid('getSelected');
      var rows = $('#jcbglist').datagrid('getSelections');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else if (rows.length > 1) {
        publicFun.alert('请选择一条数据进行修改');
      } else {
        /* if(checkedRows['docadviceFlag'] != 0){
            publicFun.alert('该信息不允许修改');
            return
        } */
        var openModalWindowName = '修改医嘱',
          openModalWindowUrl = '${baseurl}zyylqbl/toupdateyzxx.do?docadviceSeq=' + checkedRows['docadviceSeq'];
        createmodalwindow(openModalWindowName, 520, 300, openModalWindowUrl);
      }
    }

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
      _confirm('确定删除该数据吗？', null, function () {
        for (var i = 0; i < allrows.length; i++) {
          $('#jcbglist').datagrid('endEdit', i);
        }
        var paramsDate = new Array();
        for (var k in postList) {
          paramsDate[k] = postList[k]
        }
        publicFun.httpServer({ url: deleUrl, requestDataType: 'json' }, paramsDate, function (res) {
          message_alert(res);
          $('#jcbglist').datagrid('clearSelections');
          getDatagrid();
        })
      });
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
        _confirm('确定保存吗？', null, function () {
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
      publicFun.httpServer({ url: submitUrl, requestDataType: 'json' }, paramsDate, function (res) {
        message_alert(res);
        if (rowIndex !== '' && rowIndex != 'undefined' && rowIndex != null) {
          $("#jcbglist").datagrid('unselectRow', rowIndex);
        } else {
          $('#jcbglist').datagrid('clearSelections');
        }
        getDatagrid();
      })
    }

    function reload() {
      getDatagrid()
    }

    $(function () {
      if ('${pageFlag}' == 1) {
        hideOrShowBtn(['add', 'addAll', 'edit', 'del'], 'none')
      }
      setLayout();
      setTime();
      $(window).resize(function () {
        getDatagrid();
      });
      getDatagrid();
      checkRole();
    });

    function hideOrShowBtn(list, showFlg) {
      for (var i = 0; i < list.length; i++) {
        $('#' + list[i]).css({ 'display': showFlg })
      }
    }

    //初始化 判断登陆用户角色是否有权限
    function checkRole() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, {"cratNbr": ''}, function (data) {
        checkstatus = data.resultInfo.message;
        if (data.resultInfo.message == "tourist") {
          hideOrShowBtn(['print'], 'none')
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
      <input class="input-min-date Wdate" id="emg_startdate" type="text" name="hspDocadviceInfCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_enddate" type="text" name="hspDocadviceInfCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryYzList()">查询</a>
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
    <!-- <a id="add" href="javascript:;" class="commonbtn" onclick="addNewAdvice()">新增医嘱</a>
    <a id="addAll" href="javascript:;" class="commonbtn leftBtn" onclick="saveAll()">批量保存</a> -->
    <!-- <a id="edit" href="javascript:;" class="commonbtn leftBtn" onclick="editTab()">修改</a>
    <a id="del" href="javascript:;" class="commonbtn leftBtn" onclick="deleteAll()">删除</a> -->
    <a id="print" href="javascript:;" class="commonbtn leftBtn" onclick="printCurrentTab('doc')">打印</a>
    <!-- <a id="conPrint" href="javascript:;" class="commonbtn leftBtn" onclick="continuePrint()">续打</a> -->
  </div>
  <!-- 打印医嘱信息 -->
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyqjs/transManager/listPrint/printAdviceQuery.jsp"></jsp:include>
  <div style="display:none">
    <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${hospitalPlatformNameGap}</p>
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
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span>
        </li>
      </ul>
    </div>
    <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <table id="printlist" class="printable">
        <colgroup>
          <col width="9%" />
          <col width="9%" />
          <col width="22%" />
          <col width="4%" />
          <col width="4%" />
          <col width="7%" />
          <col width="9%" />
          <col width="11%" />
          <col width="11%" />
          <col width="9%" />
        </colgroup>
        <thead>
          <tr>
            <th>下达时间</th>
            <th>开始时间</th>
            <th colspan="4">医嘱内容</th>
            <th>医师签名</th>
            <th>核对护士签名</th>
            <th>执行时间</th>
            <th>护士签名</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>
  </div>
  <script type="text/javascript">
    function setTableCss(allRows, printType) {
      $("#printlist tbody").html("");
      // $("#printlist tbody").append('<tr id="template"><td id="docadviceDatisString"></td><td id="docadviceDatbeString"></td><td id="docadviceContent"></td><td id="docadviceYyjl"><td id="docadviceWay"></td><td id="sl" ></td><td id="docadviceNam"></td><td id="docadviceChecknam"></td><td id="docadviceNuimdatString"></td><td id="docadviceNuimnam"></td></tr>');
      $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "0mm", "border-collapse": "collapse", "padding": "0mm" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
      $('span').css({ "display": "inline-block" });
      if ($('#_age').html() == '岁') {
        $('#_age').html("");
      }
      /////
      var _tbody = $('#printlist tbody');
      for (var i = 0; i < allRows.length; i++) {
        var _thisRow = allRows[i];
        //null属性值替换为''
        for (prop in _thisRow) {
          if (_thisRow.hasOwnProperty(prop) && !_thisRow[prop]) {
            _thisRow[prop] = '';
          }
        }
        if (printType === 1) {
          _tbody.append('<tr><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceContent'] + '</td><td>' + _thisRow['docadviceYyjl'] + '</td><td>' + _thisRow['docadviceWay'] + '</td><td>' + _thisRow['sl'] + '</td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceChecknam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
        }
        if (printType === 0) {
          if (_thisRow['isprint'] == 1) {
            _tbody.append('<tr class="white"><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceContent'] + '</td><td>' + _thisRow['docadviceYyjl'] + '</td><td>' + _thisRow['docadviceWay'] + '</td><td>' + _thisRow['sl'] + '</td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceChecknam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
          }
          if (_thisRow['isprint'] == 0) {
            _tbody.append('<tr><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceDatisString'] + '</td><td>' + _thisRow['docadviceContent'] + '</td><td>' + _thisRow['docadviceYyjl'] + '</td><td>' + _thisRow['docadviceWay'] + '</td><td>' + _thisRow['sl'] + '</td><td>' + _thisRow['docadviceNam'] + '</td><td>' + _thisRow['docadviceChecknam'] + '</td><td>' + _thisRow['docadviceNuimdatString'] + '</td><td>' + _thisRow['docadviceNuimnam'] + '</td></tr>');
          }
        }
      }

      $(".printable tbody tr td").css({ "border": "1px solid #000", "text-align": "center" });
      $(".printable tbody .white td").css({ "border": "1px solid #fff", "text-align": "center", 'color': '#fff' });



      // for (var i = 0; i < (allRows.length); i++) {
      //   var row = $("#template").clone();
      //   var _thisRow = allRows[i];
      //   var _fieldList = ['docadviceDatisString', 'docadviceBz', 'docadviceType', 'docadviceDatbeString', 'docadviceNam', 'docadviceChecknam', 'docadviceNuimdatString', 'docadviceNuimnam'];
      //   $.each(_fieldList, function (idx, val) {
      //     if (_thisRow[val] != null && _thisRow[val] != '') {
      //       row.find('#' + val).text(_thisRow[val]);
      //     }
      //   })
      //   var _htmlField = ['docadviceContent', 'docadviceYyjl', 'sl', 'docadviceWay'];
      //   $.each(_htmlField, function (idx, val) {
      //     if (_thisRow[val] != null && _thisRow[val] != '') {
      //       row.find('#' + val).html(_thisRow[val]);
      //     }
      //   })
      //   if (_thisRow['docadviceType'] != null && _thisRow['docadviceType'] != '') {
      //     row.find("#doctype").html(_thisRow['docadviceType']);
      //   }
      //   row.appendTo("#printlist");//添加到模板的容器中
      // }
      // var obj = document.getElementById("printlist");
      // obj.deleteRow(1);
    }

    function batchSave() {
      var editrows = $('#jcbglist').datagrid('getEditingRowIndexs');
      if (editrows.length > 0) {
        publicFun.alert("请先完成操作");
        return;
      }
      publicFun.httpServer({ url: printUseUrl }, {
        "hspDocadviceInfCustom.vstCad": '${vstCad}',
        "startdate": $("#emg_startdate").val(),
        "enddate": $("#emg_enddate").val()
      }, function (res) { })
    }

    /**
    * [printnote 打印记录]
    */
    function printnote() {
      _confirm('请确认核对护士是否已签名?', null, function () {
        //先进行批量保存
        batchSave();
        var allRows = $('#jcbglist').datagrid('getData')['rows'];
        var rowIds = [];
        if (allRows.length === 0) {
          // publicFun.alert('数据不存在');
          return
        } else {
          for (var i = 0; i < allRows.length; i++) {
            rowIds.push(allRows[i].docadviceSeq)
          }
        }
        // try {
        setTableCss(allRows, 1);
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
          if (Value == 1) {
            getTotalPage('PRINTSETUP_PAGE_COUNT', rowIds);//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
          }
        }
        //LODOP.PRINT();
        // } catch (e) {
        //     publicFun.alert('数据存在某些问题，请刷新后重试');
        // }
      });
    }
    function getTotalPage(strType, rowIds) {
      var LODOP = getLodop();

      var ajaxOption = new AjaxOption();
      ajaxOption.requestType = 'POST';
      ajaxOption.requestDataType = "json";
      ajaxOption.requestUrl = "${baseurl}zyylqbl/afterprint.do";
      ajaxOption.asyncFlg = false;
      ajaxOption.returnDataType = 'json';
      if (LODOP.CVERSION) CLODOP.On_Return = function (TaskID, Value) {
        console.log("&&&&&&& C-Lodop 页数&&&&&&&&");
        console.log(Value);
        ajaxOption.requestData = {
          hspemginfCustom: {
            emgSeq: '${emgSeq}',
            printPage: Value,
            printType: '1'
          },
          docadviceSeqList: rowIds
        }
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
          hspemginfCustom: {
            emgSeq: '${emgSeq}',
            printPage: stResult,
            printType: '1'
          },
          docadviceSeqList: rowIds
        }
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
        var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
        var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
        if (_enddate == null || _enddate == '') {
          _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
        }
        //获取旧数据总页数，赋值给oldPages
        $.ajax({
          url: "${baseurl}zyylqbl/findyzdyy.do",
          type: "POST",
          async: false,
          dataType: 'json',
          data: {
            'emgSeq': '${emgSeq}',
            'printType': '1',
            'startdate': _startdate,
            'enddate': _enddate
          },
          success: function (res) {
            oldPages = res;
          }
        });
        var rows_old = [];
        var rows_new = [];
        var rowIds = [];
        if (rows.length > 0) {
          for (var j = 0; j < rows.length; j++) {
            if (rows[j].isprint == 1) {
              rows_old.push(rows[j]);
            } else {
              rows_new.push(rows[j]);
              rowIds.push(rows[j].docadviceSeq)
            }
          }
        }
        if (rows_old.length && rows_new.length) {
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

          setTableCss(rows, 0);
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
              getTotalPage('PRINTSETUP_PAGE_COUNT', rowIds);//PRINTSETUP_PAGE_COUNT----打印预览时或打印后，获得总页数
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