<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>留抢病历-医生端-嵌入</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _islgbed = '${islgbed}'; // 0 不显示留观床位  1 显示留观床位
          // _islgbed = '0'
  </script>
</head>

<body class="queryjzjl">
  <form id="qjsform" action="${baseurl}hzszyyemg/delzyyemgSubmit.do" method="post">
    <input type="hidden" id="deletezyy_id" name="emgSeq" />
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="Wdate" id="emg_startdate" type="text" name="hspemginfCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="Wdate" id="emg_enddate" type="text" name="hspemginfCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" />
      <p class="form-text">姓名：</p>
      <input id="emg_cstNam" type="text" name="hspemginfCustom.cstNam">
      <p class="form-text">就诊号：</p>
      <input id="emg_cstCad" type="text" name="hspemginfCustom.vstCad" value="${vstcad}">
      <p class="otspan">
        <input class="ckbox" id="usingBed" type="checkbox" name="hspemginfCustom.usingBed" value="1">
        <label for="usingBed">已占用床位&emsp;</label>
      </p>
      <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" onclick="getPatientList()">查询</a>
      <a class="commonbtn" id="printWristbands" href="javascript:;" onclick="qjsCaseNote()">留抢病历记录</a>
    </div>
    <div class="jzjltab queryTabs">
      <div id="patientList"></div>
    </div>
  </form>

  <script type="text/javascript">
    var initBtnUrl = '${baseurl}btnload.do?moduleid=${moduleid}', // url定义，请求按钮的地址
      patientListUrl = '${baseurl}zyylqblqrb/queryqjszyy_result.do', // url定义，请求病人列表的地址
      deleteRecordUrl = '${baseurl}hzszyyemg/delzyyemgSubmit.do'; // url定义，删除指定记录的地址
    var checkedObj = {};
    var showCheckedobj = {};
    var allSickbedList; // 定义额外的变量方便使用
    var variableList = ['emgSeq', 'zgcount', 'cstNam', 'cstAge', 'cstSexCod', 'cstAgeCod', 'emgDat', 'bedid', 'bedNum', 'emgFkCod', 'pheNbr', 'preDgnCod', 'preUsrNam', 'bedPlcNam', 'vstCad']; // 定义需要的参数名字

    /**
     * [isOwnEmpty 判断是否是一个空的对象]
     * @param  {[type]}  obj [description]
     */
    function isOwnEmpty(obj) {
      for (var name in obj) {
        if (obj.hasOwnProperty(name)) {
          return false;
        }
      }
      return true;
    };
    /**
     * [initTime 初始化时间]
     */
    function initTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      $('#emg_enddate').val(_today);
      var myDate = new Date();
      var yyear = myDate.getFullYear();
      var mmonth = myDate.getMonth();
      var dday = myDate.getDate();
      var fivDat = new Date(yyear, mmonth, dday).getTime() - 5 * 60 * 60 * 1000;
      var yesterday = publicFun.timeFormat(new Date(fivDat), "yyyy/MM/dd");
      $('#emg_startdate').val(yesterday);
    }

    /**
     * [isNull 判断一个值是不是null]
     */
    function isNull(val) {
      var returnIsNull = false;
      if (!val && typeof val != 'undefined' && val != 0) {
        returnIsNull = true
      }
      return returnIsNull
    }

    function getWidth(proportion) {
      var width = $(window).width() - 10;
      if (_islgbed === '1') {
        width = width - 100;
      }
      return Math.round(proportion * width);
    }
    /**
     * [getPatientList 获取病人信息列表]
     */
    function getPatientList() {
      var windowHeight = $(window).height();
      $('#patientList').height(windowHeight - 45);
      var startdate = $('#emg_startdate').val(),
        enddate = $('#emg_enddate').val(),
        cstNam = $('#emg_cstNam').val(),
        vstCad = $('#emg_cstCad').val(),
        usingBed = $('#usingBed').is(':checked') ? 1 : '';
      $('#patientList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: patientListUrl,
        idField: 'emgSeq',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        remoteSort: true,
        nowrap: false,
        pageList: [20, 30, 50],
        queryParams: {
          'emgSeq': '',
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          'hspemginfCustom.vstCad': vstCad,
          'hspemginfCustom.usingBed': usingBed
        },
        onLoadSuccess: function () {
          checkedObj = {}; // 此处checkedObj需置空
          showCheckedobj = {};
          $('#patientList').datagrid('clearSelections'); // 清除选中
        },
        onDblClickRow: function (rowIndex, rowData) {
          var openTabNam = '';
          if (rowData.bedNum != null) {
            openTabNam = rowData.bedNum + '-';
          }
          var openTabName = openTabNam + rowData.cstNam + '-留抢病历记录',
            openTabUrl = '${baseurl}zyylqblqrb/qjscasenote.do?emgSeq=' + rowData.emgSeq + '&th=' + new Date().getTime();
          // parent.opentabwindow(openTabName, openTabUrl);
          window.open(openTabUrl, '_blank');
        },
        onClickRow: function (index, row) {
          var variableList = ['emgSeq', 'zgcount', 'cstNam', 'cstAge', 'cstSexCod', 'cstAgeCod', 'emgDat', 'bedid', 'bedNum'];
          $.each(variableList, function (index, val) {
            if (row.hasOwnProperty(val)) {
              checkedObj[val] = row[val]
            } else {
              checkedObj[val] = ''
            }
          });
        },
        columns: getCols()
      });
    }

    function getCols() {
      var col_list = [
        [{
          field: 'emgJjd',
          title: '',
          width: getWidth(0.02),
          formatter: function (value, row, index) {
            return ' '
          },
          styler: function (value, row, index) {
            if (value === 'I级') {
              return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'II级') {
              return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'III级') {
              return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'IVa级' || value == 'IVb级') {
              return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            }
          }
        }, {
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm')
          }
        }, {
          field: 'vstCad',
          title: '门诊号码',
          width: getWidth(0.08),
          sortable: true
        }, {
          field: 'cstNam',
          title: '病人姓名',
          width: getWidth(0.07),
          sortable: true
        }, {
          field: 'cstSexCod',
          title: '性别',
          width: getWidth(0.04),
          sortable: true
        }, {
          field: 'cstAge',
          title: '年龄',
          width: getWidth(0.04),
          sortable: true,
          formatter: function (value, row, index) {
            if (!isNull(value) && value != '') {
              return value + '' + row.cstAgeCod
            } else {
              return ''
            }
          }
        }, {
          field: 'emgDepCod',
          title: '分级',
          width: getWidth(0.06),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == "I级") {
              return "<div class=\"levelAbg\">I级</div>";
            } else if (value == "II级") {
              return "<div class=\"levelBbg\">II级</div>";
            } else if (value == "III级") {
              return "<div class=\"levelCbg\">III级</div>";
            } else if (value == "IVa级") {
              return "<div class=\"levelDbg\">IVa级</div>";
            } else if (value == "IVb级") {
              return "<div class=\"levelDbg\">IVb级</div>";
            }
          }
        }, {
          field: 'emgBed',
          title: '床号',
          width: getWidth(0.05),
          sortable: true
        },
        {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.09),
          sortable: true
        },
        {
          field: 'cstDspCodNameNew',
          title: '转归',
          width: getWidth(0.08),
          sortable: true,
          formatter: function (value, row, index) {
            if (row.firstsqlseq ==row.sqlSeq) {
              return ''
            } else if (row.cstDspCodNew == '2') {
              return row.cstDepCodNew
            } else if (row.cstDspCodNew == '13') {
              return row.sqlDes
            } else {
              return value
            }
          }
        }, {
          field: 'sqlDat',
          title: '转归时间',
          width: getWidth(0.08),
          sortable: true,
          formatter: function (value, row, index) {
            if (row.firstsqlseq ==row.sqlSeq) {
              return ''
            } else {
              return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm');
            }
          }
        }, {
          field: 'preDgnCod',
          title: '主诉症状',
          width: getWidth(0.18),
          sortable: true
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          width: getWidth(0.08),
          sortable: true
        }
        ]
      ];
      var col_LgList = [
        [{
          field: 'emgJjd',
          title: '',
          width: getWidth(0.02),
          formatter: function (value, row, index) {
            return ' '
          },
          styler: function (value, row, index) {
            if (value === 'I级') {
              return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'II级') {
              return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'III级') {
              return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            } else if (value === 'IVa级' || value == 'IVb级') {
              return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
            }
          }
        }, {
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm')
          }
        }, {
          field: 'vstCad',
          title: '门诊号码',
          width: getWidth(0.08),
          sortable: true
        }, {
          field: 'cstNam',
          title: '病人姓名',
          width: getWidth(0.07),
          sortable: true
        }, {
          field: 'cstSexCod',
          title: '性别',
          width: getWidth(0.03),
          sortable: true
        }, {
          field: 'cstAge',
          title: '年龄',
          width: getWidth(0.04),
          sortable: true,
          formatter: function (value, row, index) {
            if (!isNull(value) && value != '') {
              return value + '' + row.cstAgeCod
            } else {
              return ''
            }
          }
        }, {
          field: 'emgDepCod',
          title: '分级',
          width: getWidth(0.05),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == "I级") {
              return "<div class=\"levelAbg\">I级</div>";
            } else if (value == "II级") {
              return "<div class=\"levelBbg\">II级</div>";
            } else if (value == "III级") {
              return "<div class=\"levelCbg\">III级</div>";
            } else if (value == "IVa级") {
              return "<div class=\"levelDbg\">IVa级</div>";
            } else if (value == "IVb级") {
              return "<div class=\"levelDbg\">IVb级</div>";
            }
          }
        },
        {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.07),
          sortable: true
        }, {
          field: 'rqDate',
          title: '入抢时间',
          sortable: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            if (value) {
              return value.substring(5);
            }
          }
        }, {
          field: 'emgBed',
          title: '抢-床',
          width: getWidth(0.05),
          sortable: true
        }, {
          field: 'rgDate',
          title: '入观时间',
          sortable: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            if (value) {
              return value.substring(5);
            }
          }
        }, {
          field: 'bedLgs',
          title: '留-床',
          width: getWidth(0.05),
          sortable: true
        },
        {
          field: 'cstDspCodNameNew',
          title: '转归',
          width: getWidth(0.07),
          sortable: true,
          formatter: function (value, row, index) {
            if (row.firstsqlseq ==row.sqlSeq) {
              return ''
            } else if (row.cstDspCodNew == '2') {
              return row.cstDepCodNew
            } else if (row.cstDspCodNew == '13') {
              return row.sqlDes
            } else {
              return value
            }
          }
        }, {
          field: 'sqlDat',
          title: '转归时间',
          width: getWidth(0.06),
          sortable: true,
          formatter: function (value, row, index) {
            if (row.firstsqlseq ==row.sqlSeq) {
              return ''
            } else {
              return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm');
            }
          }
        }, {
          field: 'preDgnCod',
          title: '主诉症状',
          width: getWidth(0.18),
          sortable: true
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          width: getWidth(0.08),
          sortable: true
        }
        ]
      ];
      if (_islgbed == '1') {
        return col_LgList
      } else {
        return col_list
      }
    }
    /**
     * [deleteRecord 删除]
     */
    function deleteRecord() {
      if (isOwnEmpty(checkedObj)) {
        publicFun.alert('请先选择一条记录');
        return
      }
      if (checkedObj.emgSeq === '') {
        return
      }
      _confirm('确定删除该数据吗？', null, function () {
        var emgSeq = checkedObj.emgSeq,
          startdate = $('#emg_startdate').val(),
          enddate = $('#emg_enddate').val(),
          cstNam = $('#emg_cstNam').val(),
          vstCad = $('#emg_cstCad').val();
        publicFun.httpServ('post', deleteRecordUrl, {
          emgSeq: emgSeq,
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          'hspemginfCustom.vstCad': vstCad
        }, function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          } else {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type === 1) {
              getPatientList();
            }
          }
        })
      });
    }

    function qjsCaseNote() {
      if (isOwnEmpty(checkedObj)) {
        publicFun.alert('请先选择一条记录');
        return
      }
      if (checkedObj.emgSeq === '') {
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var openTabName = openTabNam + checkedObj.cstNam + '-留抢病历记录',
        openTabUrl = '${baseurl}zyylqblqrb/qjscasenote.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
      // parent.opentabwindow(openTabName, openTabUrl);
      window.open(openTabUrl, '_blank');
    }

    function reload() {
      getPatientList();
    }
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          getPatientList();
      }
    });
    $(function () {
      initTime();
      getPatientList();
    });
  </script>
</body>

</html>