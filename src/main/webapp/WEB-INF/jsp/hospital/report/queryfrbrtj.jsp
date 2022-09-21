<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>发热患者明细</title>
  <style>
    .datagrid-header-row .datagrid-cell {
      height: 70px;
      word-wrap: inherit;
      white-space: inherit;
      overflow: auto;
    }
  </style>
</head>

<body>
  <!-- 查询列表 -->
  <div class="list_table list_div queryTabs" id="list_table" style="padding-top:2px;padding-left:2px">
    <table id="frlist"></table>
  </div>
  <jsp:include page="/WEB-INF/jsp/hospital/report/printFeverPatientList.jsp"></jsp:include>
  <script type="text/javascript">
    //datagrid列定义
    $(function () {
      init();
    });

    var _printTable = [];
    function init() {
      var sdate = parseInt('${startdate}');
      var edate = parseInt('${enddate}');
      var startdate = publicFun.timeFormat(sdate, "yyyy/MM/dd hh:mm:ss");
      var enddate = publicFun.timeFormat(edate, "yyyy/MM/dd hh:mm:ss");
      $('#frlist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}report/queryfrbrmx_result.do',
        idField: '1',
        loadMsg: '',
        columns: columns_v,
        toolbar: toolbar_v,
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        queryParams: {
          "startdate": startdate,
          "enddate": enddate,
          "hspemginfCustom.emgFkCod": '${emgFkCod}',
          'childFlag': '${childFlag}'
        },
        onLoadSuccess: function (data) {
          // for (var i = 0; i < data.rows.length; i++) {
          //   _printTable[i] = data.rows[i]
          //   for (var j in data.rows[i]) {
          //     if (j === 'emgDat') {
          //       if (data.rows[i][j]) {
          //         _printTable[i][j] = publicFun.timeFormat(new Date(data.rows[i][j]), 'yyyy/MM/dd hh:mm:ss')
          //       }
          //     }
          //     if (j === 'frDat') {
          //       if (data.rows[i][j]) {
          //         _printTable[i][j] = publicFun.timeFormat(new Date(data.rows[i][j]), 'yyyy/MM/dd')
          //       }
          //     }
          //     if (j === 'cstAge') {
          //       if (data.rows[i][j] !== null && data.rows[i][j] != '') {
          //         _printTable[i][j] = data.rows[i][j] + '' + data.rows[i].cstAgeCod
          //       }
          //     }
          //   }
          // }
          // printVm.msg.tdContentList = _printTable.slice()
        }
      });
    }

    var height = 0.98 * ($("#tabs", parent.document).height() - 14 - 6);
    $("#frlist").height(height);
    var columns_v = [
      [{
        field: 'emgSeq',
        title: 'id',
        hidden: true
      }, {
        field: 'emgDat',
        title: '时间',
        sortable: true,
        width: getWidth(0.08),
        formatter: function (value, row, index) {
          return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm:ss')
        }
      }, {
        field: 'cstNam',
        title: '病人姓名',
        width: getWidth(0.05)
      }, {
        field: 'cstSexCod',
        title: '性别',
        sortable: true,
        width: getWidth(0.03)
      }, {
        field: 'cstAge',
        title: '年龄',
        sortable: true,
        width: getWidth(0.03),
        formatter: function (value, row, index) {
          if (row.cstAge == null || row.cstAge == '') {
            return row.cstAge;
          }
          return row.cstAge + row.cstAgeCod;
        }
      },{
        field: 'nationality',
        title: '国籍',
        width: getWidth(0.05)
      }, {
        field: 'emgJob',
        title: '职业',
        width: getWidth(0.06)
      }, {
        field: 'tmpNbr',
        title: '体温℃',
        sortable: true,
        width: getWidth(0.03)
      }, {
        field: 'cstAdr',
        title: '详细地址',
        sortable: true,
        width: getWidth(0.1)
      }, {
        field: 'pheNbr',
        title: '电话号码',
        sortable: true,
        width: getWidth(0.07)
      }, {
        field: 'wcdyFlag',
        title: '有无蚊虫叮咬',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'ttgjcxFlag',
        title: '有无头痛、关节痛、皮疹及出血点',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'hxdzzFlag',
        title: '有无呼吸道症状',
        sortable: true,
        width: getWidth(0.04),
      }, {
        field: 'yqyqFlag',
        title: '有无疫区疫情暴露史',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'qljcFlag',
        title: '有无禽类接触史及活禽市场暴露史',
        width: getWidth(0.06)
      }, {
        field: 'infectedareaNam',
        title: '疫区名称',
        width: getWidth(0.06)
      }, {
        field: 'frDat',
        title: '发病日期',
        sortable: true,
        width: getWidth(0.1),
        formatter: function (value, row, index) {
          if (value) {
            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd')
          } else {
            return value
          }
        }
      }, {
        field: 'jbzdDes',
        title: '诊断和处理',
        width: getWidth(0.08)
      }, {
        field: 'emgFkCod',
        title: '就诊去向',
        width: getWidth(0.05)
      }]
    ];

    var toolbar_v = [{
      id: '',
      text: '修改/转归',
      iconCls: 'icon-edit',
      handler: function () {
        cmdeditjz();
      }
    }, {
      id: '',
      text: '患者详情',
      iconCls: 'icon-hzjl',
      handler: function () {
        cmdqueryhzxq();
      }
    }, {
      id: '',
      text: '打印',
      iconCls: 'icon-print',
      handler: function () {
        cmdprintTable();
      }
    }, {
      id: '',
      text: '导出',
      iconCls: 'icon-redo',
      handler: function () {
        cmdexportfrbrmx();
      }
    }];

    function getWidth(proportion) {
      var width = $("body").width() - 80;
      return Math.round(proportion * width);
    }

    //新增修改页面
    function cmdeditjz() {
      var row = $('#frlist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
      }
    }

    function cmdqueryhzxq() {
      var row = $('#frlist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
      }
    }

    function cmdexportfrbrmx() {
      var startdate = publicFun.timeFormat(parseInt('${startdate}'), "yyyy/MM/dd hh:mm:ss");
      var enddate = publicFun.timeFormat(parseInt('${enddate}'), "yyyy/MM/dd hh:mm:ss");
      var childFlag = '${childFlag}';
      _confirm('您确认导出吗？', null, function () {
        publicFun.httpServer({url: '${baseurl}report/exportFrbrmxSubmit.do'}, { startdate: startdate, enddate: enddate ,childFlag: childFlag}, function (data) {
          message_alert(data);
        })
      });
    }

  </script>
</body>

</html>