<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <title>护理记录单</title>
</head>

<body class="tabsBody">
  <div class="print-body">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">病情护理记录单</p>
    <ul class="print-ul">
      <li class="bordered">
        <span class="basic-span">
          <label class="title-label">姓名：</label>
          <span id="cstNam"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">性别：</label>
          <span id="cstSexCod"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">年龄：</label>
          <span id="cstAge"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">科别：</label>
          <span id="emgFkName"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">病历号：</label>
          <span id="mpi"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">留观号：</label>
          <span id="observationCode"></span>
        </span>
      </li>
    </ul>
  </div>
  <div class="list_table list_div floatLeft printTableShow">
    <table id="noteList"></table>
  </div>
  <script>
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeight = parent.$('#mainIfream').height();
      $('#noteList').height(windowsHeight - 120);
    }

    function getBasicMsg() {
      var number = (new Date()).getTime(),
        url_ajax = "${baseurl}zyylqblqrb/findPrinInf.do?emgSeq=" + '${emgSeq}' + "&version=" + number;
      publicFun.httpServer({url: url_ajax, isAsync: false}, {}, function (res) {
          var emg = res.resultInfo.sysdata.emg;
          setParam(emg);
      });
    }
    function setParam(dataMsg) {
      if (dataMsg != null && dataMsg != "") {
        if (dataMsg != null && dataMsg != "") {
          var fieldLists = ['emgFkName', 'cstNam', 'cstSexCod', 'emgBed', 'preDgnCod', 'jbzdDes', 'vstCad', 'cstAge', 'pastHisCod', 'pastHisOther', 'emgDatStr', 'observationCode', 'mpi']
          $.each(fieldLists, function (index, value) {
            if (dataMsg[value]) {
              if (value === 'cstAge') {
                $('#' + value).html(dataMsg[value] + dataMsg['cstAgeCod']);
              } else {
                $('#' + value).html(dataMsg[value]);
              }
            }
          })
        }
      }

    }
    function getPatientList() {
      $('#noteList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyylqblqrb/queryhljld_result.do?today=' + new Date().getTime(),
        idField: 'crtDat',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: getColumns(),
        nowrap: false,
        // fitColumns: true,
        rownumbers: true,
        queryParams: {
          "hsphljldinfCustom.emgSeq": '${emgSeq}'
        }
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function getColumns() {
      //datagrid列定义
      var columns_v = [
        [{ field: 'crtDateStr', title: '创建时间', width: getWidth(0.07), rowspan: 2 },
        {
          title: '体温',
          rowspan: 1
        },
        { field: 'tmpNbrFlg', title: '体温标识', hidden: 'true' },
        { field: 'bqhiSeq', title: '标识', width: getWidth(0.08), hidden: 'true', },
        /* {field: 'hrtRte', title: '脉搏(次/分)',sortable: true,width: getWidth(0.05),} ,*/
        {
          title: '心率',
          rowspan: 1
        }, {
          title: '呼吸',
          rowspan: 1
        }, {
          title: '血  压',
          rowspan: 1
        },
        { field: 'sbpNbrFlg', title: '血压标识', hidden: 'true', },
        {
          field: 'xy', title: '血氧', sortable: true, width: getWidth(0.04), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.xyFlg == "2") {
              return "测不出";
            } else if (row.xyFlg == "3") {
              return "拒测";
            } else {
              return value;
            }
          }
        },
        { field: 'xyFlg', title: '血氧标识', hidden: 'true', },
        {
          title: '血糖',
          rowspan: 1
        },
        { field: 'xtFlg', title: '血糖标识', hidden: 'true' },
        { field: 'senRctCod', title: '意识', sortable: true, width: getWidth(0.07), rowspan: 2 },
        {
          title: '入量',
          rowspan: 1
        },
        {
          title: '出量',
          rowspan: 1
        },
        {
          field: 'jchl', title: '基础护理', sortable: true, width: getWidth(0.12), rowspan: 2
        },
        {
          field: 'bqgc', title: '病情观察、护理措施和效果', sortable: true, width: getWidth(0.24), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.bqgcHex == null) {
              return value;
            } else {
              if (value.indexOf("？") > -1) {
                return hexToString(row.bqgcHex);
              } else {
                return value;
              }
            }
          }
        },
        {
          field: 'hsusrnames', title: '护士签名', sortable: true, width: getWidth(0.05), rowspan: 2
        }], [{
          field: 'tmpNbr', title: '℃', width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (row.tmpNbrFlg == "2") {
              return "不升";
            } else if (row.tmpNbrFlg == "3") {
              return "拒测";
            } else {
              return value;
            }
          }
        }, {
          field: 'hrtRte', title: '次/分', sortable: true, width: getWidth(0.04)
        }, {
          field: 'breNbr', title: '次/分', sortable: true, width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (row.breNbrFlg == "2") {
              if (value != null) {
                return "机械通气:" + value;
              } else {
                return "";
              }
            } else if (row.breNbrFlg == "3") {
              return "拒测";
            } else {
              if (value != null) {
                return value;
              } else {
                return "";
              }
            }
          }
        }, {
          field: 'sbp', title: ' mmHg', sortable: true, width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (row.xyFlg == "2") {
              return "测不出";
            } else if (row.xyFlg == "3") {
              return "拒测";
            } else {
              return value;
            }
          }
        }, {
          field: 'xt', title: 'mmol/L', sortable: true, width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (row.xtFlg == "3") {
              return "HI";
            } else if (row.xtFlg == "2") {
              return "LO";
            } else if (row.xtFlg == "4") {
              return "拒测";
            } else {
              if (row.xtFlg == "1" && value != null) {
                return parseFloat(value).toFixed(1);
              } else {
                return null;
              }
            }
          }
        }, {
          field: 'rl', title: 'ml', sortable: true, width: getWidth(0.06)
        }, {
          field: 'cl', title: 'ml', sortable: true, width: getWidth(0.06)
        }]
      ]
      return columns_v;
    }

    //utf8和16进制相互转换
    function hexToString(s1) {
      var tmp2 = '',
        res = '';
      for (i = 0; i < s1.length;) {
        tmp2 += '%' + s1.substring(i, i += 2);
      }
      res = decodeURI(tmp2);
      for (var i = 0; i < res.length / 2; i++) {
        var len = res.indexOf('%');
        if (res.indexOf('%') > -1) {
          var subStr = res.substring(len, len + 3);
          res = res.replace(subStr, ',')
        } else {
          break;
        }
      }
      return res;
    }
    $(function () {
      setLayout();
      getBasicMsg();
      $(window).resize(function () {
        getPatientList();
      });
      getPatientList();
    });
  </script>
</body>

</html>