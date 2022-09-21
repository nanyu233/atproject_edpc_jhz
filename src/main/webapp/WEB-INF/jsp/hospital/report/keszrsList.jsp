<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>住院患者明细</title>
</head>

<body>
  <!-- 查询列表 -->
  <div class="list_table list_div queryTabs" id="list_table" style="padding-top:2px;padding-left:2px">
    <table id="zglist"></table>
  </div>
  <form id="hzmxform" action="${baseurl}report/exportpatients.do" method="post">
    <input id="startdate" name="startdate" type="hidden" value="${startdate}" />
    <input id="enddate" name="enddate" type="hidden" value="${enddate}" />
    <input id="querytype" name="querytype" type="hidden" value="${querytype}" />
    <input id="halfdate" name="halfdate" type="hidden" value="${halfdate}" />
  </form>
  <script type="text/javascript">
    //datagrid列定义
    $(function () {
      init();
    });

    function init() {
      var height = 0.98 * ($("#tabs", parent.document).height() - 14 - 6);
      $("#zglist").height(height);
      $('#zglist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}report/patientList_result.do',
        idField: 'emgSeq',
        loadMsg: '',
        columns: getColumn(),
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              jquerySubByFId('hzmxform', hzmxexport_callback, null, "json");
            });
          }
        }],
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        queryParams: {
          "startdate": '${startdate}',
          "enddate": '${enddate}',
          "querytype": '${querytype}',
          "halfdate": '${halfdate}'
        }
      });
    }

    function getColumn() {
      var columns_v = [
        [{
          field: 'emgSeq',
          title: 'id',
          hidden: true
        }, {
          field: 'mpi',
          title: '病历号',
          sortable: true,
          width: getWidth(0.07)
        }, {
          field: 'emgDat',
          title: '预检时间',
          sortable: true,
          width: getWidth(0.12),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
          }
        }, {
          field: 'cstNam',
          title: '患者姓名',
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
        }, {
          field: 'preDgnCod',
          title: '主诉症状',
          sortable: true,
          width: getWidth(0.15)
        }, {
          field: 'emgDepCod',
          title: '急诊分级',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'grnChl',
          title: '绿色通道',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'arvChlCod',
          title: '到院方式',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'cstDspCod',
          title: '首诊状态',
          sortable: true,
          width: getWidth(0.05),
        }/* , {
                field: 'emgFkCod',
                title: '首诊科室',
                sortable: true,
                width: getWidth(0.08)
            } */, {
          field: 'sqlDepName',
          title: '转归科室',
          width: getWidth(0.07)
        }, {
          field: 'sqlDat',
          title: '转归时间',
          sortable: true,
          width: getWidth(0.12)
        }, {
          field: 'sqlDctNam',
          title: '处置医生',
          width: getWidth(0.06)
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          sortable: true,
          width: getWidth(0.06)
        }]
      ];
      return columns_v;
    }

    function hzmxexport_callback(data) {
      message_alert(data);
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //新增修改页面
    function cmdeditjz() {
      var row = $('#zglist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '修改', "${baseurl}sql/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
      }
    }
    function cmdqueryhzxq() {
      var row = $('#zglist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
      }
    }

  </script>
</body>

</html>