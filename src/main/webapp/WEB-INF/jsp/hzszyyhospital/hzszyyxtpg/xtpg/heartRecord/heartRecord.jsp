<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?98">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>心肺复苏记录单</title>
</head>

<body class="bqhlby complexHeaderTab">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="small-date Wdate" id="start-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, maxDate:'#F{$dp.$D(\'end-date\')}'})">
    <p class="form-text">-</p>
    <input class="small-date Wdate" id="end-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, minDate:'#F{$dp.$D(\'start-date\')}'})">
    <a class="easyui-linkbutton cursor-type" iconCls="icon-search" id="btn" onclick="getTabList()">查询</a>
  </div>
  <div class="tabdataDiv xtpgxqDiv queryTabs">
    <table id="recordList"></table>
  </div>
  <form id="recordForm" name="recordForm" action="${baseurl}zjszyyhljld/exportHljldSubmit.do" method="post">
    <!-- 查询列表 -->
    <input type="hidden" name="hsphljldinfCustom.emgSeq" id="emgSeq" value="${emgSeq}" />
  </form>
  <form id="recordDeleteForm" action="${baseurl}heartRecord/deleteRecord.do" method="post">
    <input type="hidden" id="heartSeq" name="heartSeq" />
  </form>
  <!-- 打印心肺复苏记录单 -->
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/xtpg/heartRecord/printHeartRecord.jsp"></jsp:include>
  <script type="text/javascript">
    var comdata = parent.comdata;
    var _usrNo = '${sessionScope.activeUser.usrno}';
    var roleList = '${sessionScope.activeUser.dstroleList}';

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function dealDataValues(data) {
      var tkList = [{ infocode: '0', info: '灵敏' }, { infocode: '1', info: '迟钝' }, { infocode: '2', info: '消失' }, { infocode: '3', info: '白内障' }, { infocode: '4', info: '眼球缺失' }];
      for (var i = 0; i < data.rows.length; i++) {
        var _row = data.rows;
        if (_row[i].recordTime) {
          _row[i].recordTime = publicFun.timeFormat(new Date(_row[i].recordTime), 'yyyy-MM-dd hh:mm')
        }
        if (_row[i].sbpNbrFlg == '2') {
          _row[i].sbpNbrStr = '测不出'
        } else if (_row[i].sbpNbrFlg == '3') {
          _row[i].sbpNbrStr = '拒测'
        }
        if (_row[i].breNbrFlg == '2') {
          if (_row[i].breNbr !== '' && _row[i].breNbr != null) {
            _row[i].breNbr = '机械通气:' + _row[i].breNbr + '次/分';
          } else {
            _row[i].breNbr = '机械通气:';
          }
        } else if (_row[i].breNbrFlg == '3') {
          _row[i].breNbr = '拒测'
        } else {
          if (_row[i].breNbr !== '' && _row[i].breNbr != null) {
            _row[i].breNbr = _row[i].breNbr + '次/分';
          }
        }
        if (_row[i].xyFlg == '2') {
          _row[i].xy = '测不出'
        } else if (_row[i].xyFlg == '3') {
          _row[i].xy = '拒测'
        } else {
          if (_row[i].xy !== '' && _row[i].xy != null) {
            _row[i].xy = _row[i].xy + '%'
          }
        }
        if (_row[i].hrtRte !== '' && _row[i].hrtRte != null) {
          _row[i].hrtRte = _row[i].hrtRte + '次/分'
        }
        if (_row[i].senStuCod == '4') {
          _row[i].senStuCod = _row[i].senStuOther || ''
        } else {
          _row[i].senStuCod = _row[i].senStuNam
        }
        if (_row[i].intravenousBolusNam == '其他') {
          _row[i].intravenousBolusNam = _row[i].intravenousBolusOther || ''
        }
        if (_row[i].intravenousDripName == '其他') {
          _row[i].intravenousDripName = _row[i].intravenousDripOther || ''
        }
        if (_row[i].itchyFlow !== '' && _row[i].itchyFlow != null) {
          if (_row[i].oxygenType == '1') {
            _row[i].itchyFlow =  _row[i].itchyFlow + 'L/min'
          }
          if (_row[i].oxygenType == '2') {
            _row[i].itchyFlow =  _row[i].itchyFlow + '%'
          }
        }
        if(_row[i].hrtRhythmOther){
          _row[i].hrtRhythm +=  '-'+_row[i].hrtRhythmOther
        }
        for (var j = 0; j < tkList.length; j++) {
          if (_row[i].pupilLeft !== '' && _row[i].pupilLeft != null) {
            if (_row[i].pupilLeft == tkList[j].infocode) {
              _row[i].pupilLeft = tkList[j].info
            }
          }
          if (_row[i].pupilRight !== '' && _row[i].pupilRight != null) {
            if (_row[i].pupilRight == tkList[j].infocode) {
              _row[i].pupilRight = tkList[j].info
            }
          }
        }
      }
      return data;
    }

    //获取datagrid表
    function getTabList() {
      var height;
      if (parent._JJBheight) {
        height = parent._JJBheight - 27
      } else {
        height = 0.975 * ($("#tabs", parent.parent.parent.document).height() - 28 - 29) - 27 - 29;
      }
      $("#recordList").height(height);
      $('#recordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}heartRecord/queryHeartRecordList.do',
        idField: 'crtDat',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: getColumns(),
        pagination: true,
        rownumbers: true,
        pageList: [50, 70, 90],
        toolbar: getToolbars(),
        queryParams: {
          "hspHeartRecordCustom.emgSeq": comdata.emgSeq,
          "startdate": $("#start-date").val(),
          "enddate":  $("#end-date").val()
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          } else if (data.resultInfo && data.resultInfo.messageCode == '900') {
            publicFun.alert(data.resultInfo.message)
          }
          return dealDataValues(data);
        },
        onDblClickRow: function (rowIndex, rowData) {
          editRecord()
        }
      });
    }

    function getToolbars() {
      var toolbars = [
        {
          text: '新增',
          iconCls: 'icon-add',
          handler: function () { addRecord(); }
        }, {
          text: '修改',
          iconCls: 'icon-edit',
          handler: function () { editRecord(); }
        }, {
          text: '删除',
          iconCls: 'icon-cancel',
          handler: function () { delRecord(); }
        }, {
          text: '打印',
          iconCls: 'icon-print',
          handler: function () { printTable(); }
        },
        {
          text: '刷新',
          iconCls: 'icon-reload',
          handler: function () { getTabList(); }
        }
      ]
      return toolbars;
    };

    //新增
    function addRecord() {
      parent.parent.parent.opentabwindow(comdata.cstNam + "-心肺复苏记录单新增", "${baseurl}heartRecord/to_updateRecord.do?emgSeq=" + comdata.emgSeq + "&th=" + new Date().getTime(), "0");
    }

    //修改
    function editRecord() {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.parent.parent.opentabwindow(comdata.cstNam + "-心肺复苏记录单修改", "${baseurl}heartRecord/to_updateRecord.do?emgSeq=" + comdata.emgSeq + "&heartSeq=" + row.heartSeq + "&th=" + new Date().getTime(), "0");
      }
    }

    //删除
    function delRecord() {
      var row = $('#recordList').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#heartSeq").val(row.heartSeq);
          jquerySubByFId('recordDeleteForm', del_callback, null, "json");
          $('#recordList').datagrid('clearSelections');
        });
      }
    }

    //删除 回调
    function del_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          reload();
        }
      }
    }

    //查询方法
    function reload() {
      $('#recordList').datagrid('reload');
    }

    function getColumns() {
      //datagrid列定义
      var columns_v = [
        [
          { field: 'rescueTime', title: '抢救时间', width: getWidth(0.09), rowspan: 2 },
          { field: 'senStuCod', title: '意识', width: getWidth(0.025), rowspan: 2 },
          { title: '瞳孔', width: getWidth(0.08), colspan: 2 },
          { title: '瞳孔大小mm', width: getWidth(0.08), colspan: 2 },
          { field: 'hrtRte', title: '心率', width: getWidth(0.035), rowspan: 2 },
          { field: 'hrtRhythm', title: '心律', width: getWidth(0.035), rowspan: 2},
          { field: 'sbpNbrStr', title: '血压mmHg', width: getWidth(0.046), rowspan: 2 },
          { field: 'breNbr', title: '呼吸', width: getWidth(0.035), rowspan: 2 },
          { field: 'xy', title: '氧饱和度', width: getWidth(0.045), rowspan: 2 },
          { field: 'ventilation', title: '通气', width: getWidth(0.035), rowspan: 2 },
          { field: 'itchyFlow', title: '氧流量/氧浓度', width: getWidth(0.05), rowspan: 2 },
          { title: '静脉推注/泵推', width: getWidth(0.035), colspan: 2},
          { title: '静脉滴注', width: getWidth(0.035), colspan: 2},
          { field: 'rescueRecord', title: '抢救记录', width: getWidth(0.24), rowspan: 2 },
          { field: 'recordNam', title: '护士签名', width: getWidth(0.05), rowspan: 2 }
          ],
        [{
          field: 'pupilLeft',
          title: '左',
          align: 'center',
          width: getWidth(0.02)
        },
        {
          field: 'pupilRight',
          title: '右',
          align: 'center',
          width: getWidth(0.02)
        },
        {
          field: 'pupilSizeLeft',
          title: '左',
          align: 'center',
          width: getWidth(0.03)
        },
        {
          field: 'pupilSizeRight',
          title: '右',
          align: 'center',
          width: getWidth(0.03)
        },
        {
          field: 'intravenousBolusNam',
          title: '药物名称',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'intravenousBolusDose',
          title: '剂量mg',
          align: 'center',
          width: getWidth(0.04)
        },
        {
          field: 'intravenousDripName',
          title: '药物名称',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'intravenousDripDose',
          title: '剂量ml',
          align: 'center',
          width: getWidth(0.04)
        }]
      ]
      return columns_v;
    }

    function init() {
      $("#emgSeq").val(comdata.emgSeq);
      publicFun.httpServer({url: '${baseurl}zyyxtpg/findEmgInfByEmgSeq.do', isNoLoad: true}, { emgSeq: comdata.emgSeq, date: new Date().toTimeString()}, function (res) {
        var _emgObjInfo = res.resultInfo.sysdata.hspemginfCustom;
        if (_emgObjInfo.sqlStaCod == 6) {
          var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
          $("#start-date").val(_today);
          $("#end-date").val(_today);
        } else {
          $("#start-date").val(publicFun.timeFormat(new Date(_emgObjInfo.emgDat), 'yyyy/MM/dd'));
          $("#end-date").val(publicFun.timeFormat(new Date(_emgObjInfo.sqlDatNew), 'yyyy/MM/dd'));
        }
        getTabList();
      }, function (res) {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
        $("#start-date").val(_today);
        $("#end-date").val(_today);
        getTabList();
      })
    }

    $(function () {
      init();
    });
  </script>
</body>

</html>